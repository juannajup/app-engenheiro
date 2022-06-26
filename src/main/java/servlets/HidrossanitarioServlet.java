package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelHidrossanitario;

@WebServlet("/HidrossanitarioServlet")
public class HidrossanitarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HidrossanitarioServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("reservatorio")) {

			String numeroDePessoas = request.getParameter("numeroDePessoas");
			String consumoPerCapita = request.getParameter("consumoPerCapita");
			String numeroDePavimentos = request.getParameter("numeroDePavimentos");
			String diasSemAgua = request.getParameter("diasSemAgua");

			ModelHidrossanitario modelHidrossanitario = new ModelHidrossanitario();

			modelHidrossanitario.setNumeroDePessoas(Integer.parseInt(numeroDePessoas));
			modelHidrossanitario.setConsumoPerCapita(Integer.parseInt(consumoPerCapita));
			modelHidrossanitario.setNumeroDePavimentos(Integer.parseInt(numeroDePavimentos));
			modelHidrossanitario.setDiasSemAgua(Integer.parseInt(diasSemAgua));

			// caso o numero de pavimentos seja menor do que 1, ou seja, somente pavimento
			// térreo
			if (modelHidrossanitario.getNumeroDePavimentos() <= 3) {
				modelHidrossanitario.calcularReservatorio(modelHidrossanitario.getNumeroDePessoas(),
						modelHidrossanitario.getConsumoPerCapita(), modelHidrossanitario.getDiasSemAgua());

				// caso o numero de pavimentos seja maior do que 3, é necessaria a divisão do
				// reservatorio em superior e inferior
			} else {

				modelHidrossanitario.calcularReservatorioSuperior(modelHidrossanitario.getNumeroDePessoas(),
						modelHidrossanitario.getConsumoPerCapita(), modelHidrossanitario.getDiasSemAgua());

				modelHidrossanitario.calcularReservatorioInferior(modelHidrossanitario.getNumeroDePessoas(),
						modelHidrossanitario.getConsumoPerCapita(), modelHidrossanitario.getDiasSemAgua());

			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelHidrossanitario", modelHidrossanitario);

			request.getRequestDispatcher("principal/hidraulica/calcularReservatorio.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("inspecao")) {

			String cotaTopo1 = request.getParameter("cotaTopo1").replace(",", ".");
			String cotaFundo1 = request.getParameter("cotaFundo1").replace(",", ".");
			String cotaTopo2 = request.getParameter("cotaTopo2").replace(",", ".");
			String distanciaCaixas = request.getParameter("distanciaCaixas").replace(",", ".");
			String inclinacaoTubo = request.getParameter("inclinacaoTubo").replace(",", ".");

			ModelHidrossanitario modelHidrossanitario = new ModelHidrossanitario();

			modelHidrossanitario.setCotaTopo1(Double.parseDouble(cotaTopo1));
			modelHidrossanitario.setCotaTopo2(Double.parseDouble(cotaTopo2));
			modelHidrossanitario.setCotaFundo1(Double.parseDouble(cotaFundo1));
			modelHidrossanitario.setDistanciaCaixas(Double.parseDouble(distanciaCaixas));
			modelHidrossanitario.setInclinacaoTubo(Double.parseDouble(inclinacaoTubo));

			modelHidrossanitario.calcularCotaCaixaInsp(modelHidrossanitario.getCotaFundo1(),
					modelHidrossanitario.getDistanciaCaixas(), modelHidrossanitario.getInclinacaoTubo());
			
			modelHidrossanitario.alturaCaixaInsp1(modelHidrossanitario.getCotaTopo1(), modelHidrossanitario.getCotaFundo1());

			modelHidrossanitario.alturaCaixaInsp2(modelHidrossanitario.getCotaTopo2());
			
			
			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelHidrossanitario", modelHidrossanitario);

			request.getRequestDispatcher("principal/hidraulica/calcularNivelCaixaInspecao.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
