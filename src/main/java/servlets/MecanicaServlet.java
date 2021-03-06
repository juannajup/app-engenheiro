package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelMecanica;

@WebServlet("/MecanicaServlet")
public class MecanicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MecanicaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doPost(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("calcularSplit")) {

			String nomeDoAmbiente = request.getParameter("nomeDoAmbiente");
			String areaDoAmbiente = request.getParameter("areaDoAmbiente").replace(",", ".");
			String numeroDePessoas = request.getParameter("numeroDePessoas");
			String quantidadeDeSol = request.getParameter("quantidadeDeSol");
			String numeroDeEquipamentos = request.getParameter("numeroDeEquipamentos");

			ModelMecanica modelMecanica = new ModelMecanica();

			modelMecanica.setNomeDoAmbiente(nomeDoAmbiente);
			modelMecanica.setAreaDoAmbiente(Double.parseDouble(areaDoAmbiente));
			modelMecanica.setNumeroDeEquipamentos(Integer.parseInt(numeroDeEquipamentos));
			modelMecanica.setQuantidadeDeSol(quantidadeDeSol);
			modelMecanica.setNumeroDePessoas(Integer.parseInt(numeroDePessoas));

			modelMecanica.calcularSplit(modelMecanica.getAreaDoAmbiente(), modelMecanica.getNumeroDePessoas(),
					modelMecanica.getQuantidadeDeSol(), modelMecanica.getNumeroDeEquipamentos());
			
					
			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelMecanica", modelMecanica);

			request.getRequestDispatcher("principal/mecanica/calcularBtuh.jsp").forward(request, response);
			
			
		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("chapasDuto")) {
			
			String larguraDuto = request.getParameter("larguraDuto");
			String alturaDuto = request.getParameter("alturaDuto");
			String comprimentoDuto = request.getParameter("comprimentoDuto").replace(",", ".");
			
			ModelMecanica modelMecanica = new ModelMecanica();
			
			modelMecanica.setLarguraDuto(Double.parseDouble(larguraDuto));
			modelMecanica.setAlturaDuto(Double.parseDouble(alturaDuto));
			modelMecanica.setComprimentoDuto(Double.parseDouble(comprimentoDuto));
			
			modelMecanica.calcularPesoDeChapaDeDuto(modelMecanica.getAlturaDuto(), modelMecanica.getLarguraDuto(), modelMecanica.getComprimentoDuto());
			
			
			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelMecanica", modelMecanica);

			request.getRequestDispatcher("principal/mecanica/chapasDutos.jsp").forward(request, response);
			
			
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}
}
