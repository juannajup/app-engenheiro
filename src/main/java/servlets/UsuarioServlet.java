package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.metamodel.source.annotations.xml.mocker.MockHelper;

import dao.DAOGeneric;
import dao.DAOLoginRepository;
import model.ModelLogin;

@WebServlet(urlPatterns = { "/UsuarioServlet", "/principal/UsuarioServlet" })
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private DAOLoginRepository daoLoginRepository = new DAOLoginRepository();
	private DAOGeneric<ModelLogin> daoGeneric = new DAOGeneric<ModelLogin>();
	ModelLogin modelLogin = new ModelLogin();

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

		} else if (acao != null && !acao.isEmpty() && acao.equals("editarUsuario")) {

			String idUsuario = request.getParameter("id");
			ModelLogin usuario = null;
			try {
				usuario = daoLoginRepository.consultaUsuarioID(idUsuario);
			} catch (Exception e) {
				e.printStackTrace();
			} // Substitua 'daoUsuario' pelo seu objeto de acesso a dados
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("principal/editarUsuario.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equals("editarUsuarioEspecifico")) {
	        Long usuarioID = (Long) request.getSession().getAttribute("usuarioID");
	        
	        if (usuarioID != null) {
	            ModelLogin usuario = null;
	            try {
	                usuario = daoLoginRepository.consultaUsuarioID(usuarioID.toString());
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	            request.setAttribute("usuario", usuario);
	            request.getRequestDispatcher("principal/usuarioEdit.jsp").forward(request, response);
	        } else {
	            response.sendRedirect("index.jsp"); // ou qualquer outra página de erro
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
			String tipoUsuario = request.getParameter("tipoUsuario");

			ModelLogin modelLogin = new ModelLogin();

			modelLogin.setNome(nome);
			modelLogin.setEmail(email);
			modelLogin.setSenha(senha);
			modelLogin.setTipoUsuario(tipoUsuario);

			try {
				// Verifica se o email já existe
				if (daoLoginRepository.emailExiste(email)) {
					request.setAttribute("mensagemErro", "O email já está cadastrado.");
				} else {
					// Salva o novo usuário
					daoGeneric.salvar(modelLogin);

					// Lista os usuários atualizados
					List<ModelLogin> login = daoLoginRepository.listarUsuarios();
					request.setAttribute("logins", login);
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("mensagemErro", "Ocorreu um erro ao tentar cadastrar o usuário.");
			}

			try {
				List<ModelLogin> login = daoLoginRepository.listarUsuarios();
				request.setAttribute("logins", login);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelLogin", modelLogin);

			request.getRequestDispatcher("principal/eng.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("cadastrarNovo")) {

			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			String tipoUsuario = request.getParameter("tipoUsuario");

			ModelLogin modelLogin = new ModelLogin();

			modelLogin.setNome(nome);
			modelLogin.setEmail(email);
			modelLogin.setSenha(senha);
			modelLogin.setTipoUsuario(tipoUsuario);

			try {
				// Verifica se o email já existe
				if (daoLoginRepository.emailExiste(email)) {
					request.setAttribute("mensagem", "O email já está cadastrado.");
				} else {
					// Salva o novo usuário
					daoGeneric.salvar(modelLogin);

					// Lista os usuários atualizados
					List<ModelLogin> login = daoLoginRepository.listarUsuarios();
					request.setAttribute("logins", login);
				}
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("mensagem", "Ocorreu um erro ao tentar cadastrar o usuário.");
			}

			try {
				List<ModelLogin> login = daoLoginRepository.listarUsuarios();
				request.setAttribute("logins", login);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelLogin", modelLogin);

			request.getRequestDispatcher("cadastrado.jsp").forward(request, response);

		}
		
		else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("atualizarUsuario")) {

			int idUsuario = Integer.parseInt(request.getParameter("id"));
			String nome = request.getParameter("nome");
			String email = request.getParameter("email");
			String senha = request.getParameter("senha");
			String tipoUsuario = request.getParameter("tipoUsuario");

			// Aqui você deve atualizar o usuário no banco de dados com os novos dados
			DAOLoginRepository usuarioDAO = new DAOLoginRepository();
			boolean sucesso = usuarioDAO.atualizarUsuario(idUsuario, nome, email, senha, tipoUsuario);

			if (sucesso) {

				// Após atualizar o usuário com sucesso, carrega novamente a lista de usuários
				List<ModelLogin> usuarios = null;
				try {
					usuarios = daoLoginRepository.listarUsuarios();
				} catch (Exception e) {
					e.printStackTrace();
				}
				request.setAttribute("logins", usuarios);

				request.getRequestDispatcher("principal/eng.jsp").forward(request, response);

			} else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}

		else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("atualizarUsuarioEspecifico")) {

			Long usuarioID = (Long) request.getSession().getAttribute("usuarioID");
	        
	        if (usuarioID != null) {
	            String nome = request.getParameter("nome");
	            String email = request.getParameter("email");
	            String senha = request.getParameter("senha");
	            String tipoUsuario = request.getParameter("tipoUsuario");

	            boolean sucesso = daoLoginRepository.atualizarUsuario(usuarioID.intValue(), nome, email, senha, tipoUsuario);

	            if (sucesso) {
	                ModelLogin usuario = null;
					try {
						usuario = daoLoginRepository.consultaUsuarioID(usuarioID.toString());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	                request.setAttribute("usuario", usuario);
	                request.getRequestDispatcher("principal/principal.jsp").forward(request, response);
	            } else {
	                request.setAttribute("mensagemErro", "Erro ao atualizar usuário.");
	                request.getRequestDispatcher("principal/usuarioEdit.jsp").forward(request, response);
	            }

			} else {
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}

}
