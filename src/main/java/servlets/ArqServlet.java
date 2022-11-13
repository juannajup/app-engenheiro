package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelArq;

@WebServlet("/ArqServlet")
public class ArqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ArqServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("blondel")) {

			String espelho = request.getParameter("espelho");
			String pisoPiso = request.getParameter("pisoPiso");

			ModelArq modelArq = new ModelArq();

			modelArq.setEspelho(Double.parseDouble(espelho));
			modelArq.setPisoPiso(Double.parseDouble(pisoPiso));

			modelArq.calcularPiso(modelArq.getEspelho());
			modelArq.calcularDegrau(modelArq.getPisoPiso(), modelArq.getEspelho());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelArq", modelArq);

			request.getRequestDispatcher("principal/arq/blondel.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("rampa")) {

			String comprimento = request.getParameter("comprimento").replace(",", ".");
			String altura = request.getParameter("altura").replace(",", ".");

			ModelArq modelArq = new ModelArq();

			modelArq.setComprimento(Double.parseDouble(comprimento));
			modelArq.setAltura(Double.parseDouble(altura));

			modelArq.calcularInclinacaoRampa(modelArq.getComprimento(), modelArq.getAltura());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelArq", modelArq);

			request.getRequestDispatcher("principal/arq/rampa.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}
