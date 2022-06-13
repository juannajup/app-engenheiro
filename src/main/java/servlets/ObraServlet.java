package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelObra;

@WebServlet("/ObraServlet")
public class ObraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ObraServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("calcularTraco")) {

			String fck = request.getParameter("fck");
			String desvioPadrao = request.getParameter("desvioPadrao").replace(",", ".");
			String fatorAguaCimento = request.getParameter("fatorAguaCimento").replace(",", ".");
			String volumeDeBrita = request.getParameter("volumeDeBrita").replace(",", ".");
			String consumoDeAgua = request.getParameter("consumoDeAgua").replace(",", ".");
			String massaEspCimento = request.getParameter("massaEspCimento").replace(",", ".");
			String massaEspAreia = request.getParameter("massaEspAreia").replace(",", ".");
			String massaUniAreia = request.getParameter("massaUniAreia").replace(",", ".");
			String massaEspBrita = request.getParameter("massaEspBrita").replace(",", ".");
			String massaUniBrita = request.getParameter("massaUniBrita").replace(",", ".");

			ModelObra modelObra = new ModelObra();

			modelObra.setFck(Double.parseDouble(fck));
			modelObra.setDesvioPadrao(Double.parseDouble(desvioPadrao));
			modelObra.setFatorAguaCimento(Double.parseDouble(fatorAguaCimento));
			modelObra.setVolumeDeBrita(Double.parseDouble(volumeDeBrita));
			modelObra.setConsumoDeAgua(Double.parseDouble(consumoDeAgua));
			modelObra.setMassaEspCimento(Double.parseDouble(massaEspCimento));
			modelObra.setMassaEspAreia(Double.parseDouble(massaEspAreia));
			modelObra.setMassaUniAreia(Double.parseDouble(massaUniAreia));
			modelObra.setMassaEspBrita(Double.parseDouble(massaEspBrita));
			modelObra.setMassaUniBrita(Double.parseDouble(massaUniBrita));

			modelObra.calcularConsumoAreia(modelObra.getConsumoDeAgua(), modelObra.getVolumeDeBrita(),
					modelObra.getMassaUniBrita(), modelObra.getMassaEspBrita(), modelObra.getFatorAguaCimento(),
					modelObra.getMassaEspCimento(), modelObra.getMassaEspAreia());
			
			modelObra.calcularVolumeAreia(modelObra.getConsumoDeAgua(), modelObra.getVolumeDeBrita(),
					modelObra.getMassaUniBrita(), modelObra.getMassaEspBrita(), modelObra.getFatorAguaCimento(),
					modelObra.getMassaEspCimento());

			modelObra.calcularConsumoBrita(modelObra.getVolumeDeBrita(), modelObra.getMassaUniBrita());

			modelObra.calcularConsumoCimento(modelObra.getConsumoDeAgua(), modelObra.getFatorAguaCimento());

			modelObra.calcularFcj(modelObra.getFck(), modelObra.getDesvioPadrao());
			
			modelObra.tracoAgua(modelObra.getConsumoDeAgua());
			
			modelObra.tracoAreia();
			
			modelObra.tracoBrita();
			
			
			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelObra", modelObra);

			request.getRequestDispatcher("principal/obra/traco-concreto.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}
