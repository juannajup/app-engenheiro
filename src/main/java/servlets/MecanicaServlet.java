package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOGeneric;
import dao.DAOMecanica;
import model.ModelMecanica;

@WebServlet(urlPatterns = { "/MecanicaServlet" })
public class MecanicaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MecanicaServlet() {

	}

	private DAOGeneric<ModelMecanica> daoGeneric = new DAOGeneric<ModelMecanica>();
	private DAOMecanica daoMecanica = new DAOMecanica();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		// Recupera o ID do usuário logado da sessão
	    Long usuarioID = (Long) request.getSession().getAttribute("usuarioID");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarBtuh")) {

			try {
				List<ModelMecanica> mecanicas = daoMecanica.listarSplitPorUsuario(usuarioID);

				request.setAttribute("mecanicas", mecanicas);

				request.getRequestDispatcher("principal/mecanica/calcularBtuh.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarChapas")) {

			try {
				List<ModelMecanica> mecanicas = daoMecanica.listarMecanicasPorUsuario(usuarioID);

				request.setAttribute("mecanicas", mecanicas);

				request.getRequestDispatcher("principal/mecanica/chapasDutos.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (acao != null && !acao.isEmpty() && acao.equals("excluirBtuh")) {

			String id = request.getParameter("id");

			try {
				daoMecanica.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {
				List<ModelMecanica> mecanicas = daoMecanica.listarSplitPorUsuario(usuarioID);
				request.setAttribute("mecanicas", mecanicas);

				request.getRequestDispatcher("principal/mecanica/calcularBtuh.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo

			return;

		} else if (acao != null && !acao.isEmpty() && acao.equals("excluirChapas")) {

			String id = request.getParameter("id");

			try {
				daoMecanica.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {
				List<ModelMecanica> mecanicas = daoMecanica.listarMecanicasPorUsuario(usuarioID);

				request.setAttribute("mecanicas", mecanicas);

				request.getRequestDispatcher("principal/mecanica/chapasDutos.jsp").forward(request, response);
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
		Long usuarioID = (Long) request.getSession().getAttribute("usuarioID");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("calcularSplit")) {

			String areaDoAmbiente = request.getParameter("areaDoAmbiente").replace(",", ".");
			String numeroDePessoas = request.getParameter("numeroDePessoas");
			String quantidadeDeSol = request.getParameter("quantidadeDeSol");
			String numeroDeEquipamentos = request.getParameter("numeroDeEquipamentos");

			ModelMecanica modelMecanica = new ModelMecanica();

			modelMecanica.setAreaDoAmbiente(Double.parseDouble(areaDoAmbiente));
			modelMecanica.setNumeroDeEquipamentos(Integer.parseInt(numeroDeEquipamentos));
			modelMecanica.setQuantidadeDeSol(quantidadeDeSol);
			modelMecanica.setNumeroDePessoas(Integer.parseInt(numeroDePessoas));
			modelMecanica.setUsuario_id((Long) request.getSession().getAttribute("usuarioID"));

			modelMecanica.calcularSplit(modelMecanica.getAreaDoAmbiente(), modelMecanica.getNumeroDePessoas(),
					modelMecanica.getQuantidadeDeSol(), modelMecanica.getNumeroDeEquipamentos());

			daoGeneric.salvar(modelMecanica);

			try {
				List<ModelMecanica> mecanicas = daoMecanica.listarSplitPorUsuario(usuarioID);
				request.setAttribute("mecanicas", mecanicas);

			} catch (Exception e) {
				e.printStackTrace();
			}

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
			modelMecanica.setUsuario_id((Long) request.getSession().getAttribute("usuarioID"));
			
			modelMecanica.calcularPesoDeChapaDeDuto(modelMecanica.getAlturaDuto(), modelMecanica.getLarguraDuto(),
					modelMecanica.getComprimentoDuto());

			daoGeneric.salvar(modelMecanica);

			try {
				List<ModelMecanica> mecanicas = daoMecanica.listarMecanicasPorUsuario(usuarioID);
				request.setAttribute("mecanicas", mecanicas);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelMecanica", modelMecanica);

			request.getRequestDispatcher("principal/mecanica/chapasDutos.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("calcularDutosVeloc")) {

			String vazaoH = request.getParameter("vazaoH").replace(",", ".");
			String velocidade = request.getParameter("velocidade").replace(",", ".");
			String ladoA = request.getParameter("ladoA").replace(",", ".");
			String ladoB = request.getParameter("ladoB").replace(",", ".");

			ModelMecanica modelMecanica = new ModelMecanica();

			modelMecanica.setVazaoH(Double.parseDouble(vazaoH));
			modelMecanica.setVelocidade(Double.parseDouble(velocidade));
			modelMecanica.setLadoA(Double.parseDouble(ladoA));
			modelMecanica.setLadoB(Double.parseDouble(ladoB));
			modelMecanica.setUsuario_id((Long) request.getSession().getAttribute("usuarioID"));

			modelMecanica.calcularDutoVazaoS(modelMecanica.getVazaoH());
			
			modelMecanica.calcularDutoArea(modelMecanica.getVelocidade());
			
			modelMecanica.calcularDutoAreaRes(modelMecanica.getLadoA(), modelMecanica.getLadoB());
			
			modelMecanica.calcularDutoVelocRes(modelMecanica.getVazaoS(), modelMecanica.getLadoA(), modelMecanica.getLadoB());
			
			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelMecanica", modelMecanica);

			request.getRequestDispatcher("principal/mecanica/calcularDutos.jsp").forward(request, response);

		} else {

			try {
				List<ModelMecanica> mecanicas = daoMecanica.listarMecanicasPorUsuario(usuarioID);
				request.setAttribute("mecanicas", mecanicas);

			} catch (Exception e) {
				e.printStackTrace();
			}
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}
