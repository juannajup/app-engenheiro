package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOGeneric;
import dao.DAOLoginRepository;
import model.ModelLogin;

@WebServlet(urlPatterns = { "/UsuarioServlet", "/principal/UsuarioServlet" })
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DAOLoginRepository daoLoginRepository = new DAOLoginRepository();
	private DAOGeneric<ModelLogin> daoGeneric = new DAOGeneric<ModelLogin>();

	public UsuarioServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String acao = request.getParameter("acao");

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("listarUsuarios")) {

			try {
				List<ModelLogin> usuario = daoLoginRepository.listarUsuarios();
				request.setAttribute("logins", usuario);

				request.getRequestDispatcher("principal/eng.jsp").forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} else if (acao != null && !acao.isEmpty() && acao.equals("excluirUsuario")) {

			String id = request.getParameter("id");

			try {
				daoLoginRepository.deletePorId(Long.parseLong(id));
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			// recarrega na tela os calculos restantes apos excluir
			try {
				List<ModelLogin> usuario = daoLoginRepository.listarUsuarios();
				request.setAttribute("logins", usuario);

				request.getRequestDispatcher("principal/eng.jsp").forward(request, response);
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

		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("cadastrar")) {

			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");

			ModelLogin modelLogin = new ModelLogin();

			modelLogin.setNome(nome);
			modelLogin.setEmail(email);
			modelLogin.setSenha(senha);

			daoGeneric.salvar(modelLogin);

			try {
				List<ModelLogin> login = daoLoginRepository.listarUsuarios();
				request.setAttribute("logins", login);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelLogin", modelLogin);

			request.getRequestDispatcher("principal/eng.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
	}

}
