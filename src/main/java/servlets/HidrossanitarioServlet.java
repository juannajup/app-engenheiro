package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOGeneric;
import dao.DAOHidrossanitario;
import model.ModelHidrossanitario;

@WebServlet(urlPatterns = { "/HidrossanitarioServlet" })
public class HidrossanitarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HidrossanitarioServlet() {

	}

	private DAOGeneric<ModelHidrossanitario> daoGeneric = new DAOGeneric<ModelHidrossanitario>();
	private DAOHidrossanitario daoHidrossanitario = new DAOHidrossanitario();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarCalhas")) {

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularCalha.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarInspecao")) {

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularNivelCaixaInspecao.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarReservatorio")) {

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularReservatorio.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarTanqueSeptico")) {

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularTanqueSeptico.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarAguasPluviais")) {

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularVazaoAguasPluviais.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}else if (acao != null && !acao.isEmpty() && acao.equals("excluirCalha")) {

			String id = request.getParameter("id");

			try {
				daoHidrossanitario.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {

				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularCalha.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo

			return;

		} else if (acao != null && !acao.isEmpty() && acao.equals("excluirInspecao")) {

			String id = request.getParameter("id");

			try {
				daoHidrossanitario.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {

				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularNivelCaixaInspecao.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo

			return;

		} else if (acao != null && !acao.isEmpty() && acao.equals("excluirReservatorio")) {

			String id = request.getParameter("id");

			try {
				daoHidrossanitario.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {

				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularReservatorio.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo

			return;

		} else if (acao != null && !acao.isEmpty() && acao.equals("excluirAguasPluviais")) {

			String id = request.getParameter("id");

			try {
				daoHidrossanitario.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {

				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularVazaoAguasPluviais.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo

			return;

		} else if (acao != null && !acao.isEmpty() && acao.equals("excluirTanqueSeptico")) {

			String id = request.getParameter("id");

			try {
				daoHidrossanitario.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {

				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

				request.getRequestDispatcher("principal/hidraulica/calcularTanqueSeptico.jsp").forward(request,
						response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo

			return;

		} else {

			request.getRequestDispatcher("index.jsp").forward(request, response);

		}
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

			daoGeneric.salvar(modelHidrossanitario);

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

			} catch (Exception e) {
				e.printStackTrace();
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

			modelHidrossanitario.alturaCaixaInsp1(modelHidrossanitario.getCotaTopo1(),
					modelHidrossanitario.getCotaFundo1());

			modelHidrossanitario.alturaCaixaInsp2(modelHidrossanitario.getCotaTopo2());

			daoGeneric.salvar(modelHidrossanitario);

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelHidrossanitario", modelHidrossanitario);

			request.getRequestDispatcher("principal/hidraulica/calcularNivelCaixaInspecao.jsp").forward(request,
					response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("calcularVazaoAguasPluviais")) {

			String areaMolhada = request.getParameter("areaMolhada").replace(",", ".");
			String intensidadePluviometrica = request.getParameter("intensidadePluviometrica").replace(",", ".");

			ModelHidrossanitario modelHidrossanitario = new ModelHidrossanitario();

			modelHidrossanitario.setAreaMolhada(Double.parseDouble(areaMolhada));
			modelHidrossanitario.setIntensidadePluviometrica(Double.parseDouble(intensidadePluviometrica));

			modelHidrossanitario.calcularVazao(modelHidrossanitario.getAreaMolhada(),
					modelHidrossanitario.getIntensidadePluviometrica());

			daoGeneric.salvar(modelHidrossanitario);

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelHidrossanitario", modelHidrossanitario);

			request.getRequestDispatcher("principal/hidraulica/calcularVazaoAguasPluviais.jsp").forward(request,
					response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("calha")) {

			String areaMolhada = request.getParameter("areaMolhada").replace(",", ".");
			String perimetroMolhado = request.getParameter("perimetroMolhado").replace(",", ".");
			String rugosidade = request.getParameter("rugosidade").replace(",", ".");
			String declividade = request.getParameter("declividade").replace(",", ".");

			ModelHidrossanitario modelHidrossanitario = new ModelHidrossanitario();

			modelHidrossanitario.setAreaMolhada(Double.parseDouble(areaMolhada));
			modelHidrossanitario.setPerimetroMolhado(Double.parseDouble(perimetroMolhado));
			modelHidrossanitario.setRugosidade(Double.parseDouble(rugosidade));
			modelHidrossanitario.setDeclividade(Double.parseDouble(declividade));

			modelHidrossanitario.calcularCapacidadeDeCalha(modelHidrossanitario.getAreaMolhada(),
					modelHidrossanitario.getPerimetroMolhado(), modelHidrossanitario.getRugosidade(),
					modelHidrossanitario.getDeclividade());

			daoGeneric.salvar(modelHidrossanitario);

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelHidrossanitario", modelHidrossanitario);

			request.getRequestDispatcher("principal/hidraulica/calcularCalha.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("tanqueSeptico")) {

			String numeroDePessoas = request.getParameter("numeroDePessoas").replace(",", ".");
			String contribuicao = request.getParameter("contribuicao").replace(",", ".");
			String lodoFresco = request.getParameter("lodoFresco").replace(",", ".");
			String taxaAcumulacao = request.getParameter("taxaAcumulacao").replace(",", ".");
			String altura = request.getParameter("altura").replace(",", ".");

			ModelHidrossanitario modelHidrossanitario = new ModelHidrossanitario();

			modelHidrossanitario.setNumeroDePessoas(Integer.parseInt(numeroDePessoas));
			modelHidrossanitario.setContribuicao(Double.parseDouble(contribuicao));
			modelHidrossanitario.setLodoFresco(Double.parseDouble(lodoFresco));
			modelHidrossanitario.setTaxaAcumulacao(Double.parseDouble(taxaAcumulacao));
			modelHidrossanitario.setAltura(Double.parseDouble(altura));

			modelHidrossanitario.calcularContribuicaoDiaria(modelHidrossanitario.getNumeroDePessoas(),
					modelHidrossanitario.getContribuicao());

			modelHidrossanitario.volumeTanqueSeptico(modelHidrossanitario.getTaxaAcumulacao(),
					modelHidrossanitario.getLodoFresco());

			modelHidrossanitario.calcularLarguraTanquePrismatico(modelHidrossanitario.getAltura());
			modelHidrossanitario.calcularComprimentoTanquePrismatico();
			modelHidrossanitario.calcularAlturaTotalTanquePrismatico();
			modelHidrossanitario.calcularLarguraTanqueCilindrico();
			modelHidrossanitario.calcularAlturaTotalTanqueCilindrico();

			daoGeneric.salvar(modelHidrossanitario);

			try {
				List<ModelHidrossanitario> hidrossanitario = daoHidrossanitario.listarHidrossanitarios();
				request.setAttribute("hidrossanitarios", hidrossanitario);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelHidrossanitario", modelHidrossanitario);

			request.getRequestDispatcher("principal/hidraulica/calcularTanqueSeptico.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
