package servlets;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.DAOLoginRepository;

public class ServletGenericUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	DAOLoginRepository daoLoginRepository = new DAOLoginRepository();
	
	//metodo para retornar o ID do usuario logado
	public Long getUserLogado(HttpServletRequest request) throws Exception {
		
		HttpSession session = request.getSession();

		String usuarioLogado = (String) session.getAttribute("usuario");
		
		return daoLoginRepository.consultaUsuario(usuarioLogado).getId();
	}

}
