package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
			
			List<ModelMecanica> listaCalculada = new ArrayList<ModelMecanica>();
			
				listaCalculada.add(modelMecanica);
				
			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelMecanica", modelMecanica);
			request.setAttribute("listaCalculada", listaCalculada);

			request.getRequestDispatcher("principal/mecanica/calcularBtuh.jsp").forward(request, response);
			
			
		}

	}
}
