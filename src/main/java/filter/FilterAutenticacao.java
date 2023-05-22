package filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import javax.servlet.RequestDispatcher;

@WebFilter(urlPatterns = { "/principal/*" }) // interceptará todas as requisições que ocorrem antes da pasta "principal"
public class FilterAutenticacao implements javax.servlet.Filter {

	public FilterAutenticacao() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();

		String usuarioLogado = (String) session.getAttribute("usuario");

		String urlParaAutenticar = req.getServletPath(); // url que esta sendo acessada

		// validar se o usuario esta logado
		if (usuarioLogado == null || (usuarioLogado != null && usuarioLogado.isEmpty())
				&& !urlParaAutenticar.equalsIgnoreCase("/principal/LoginServlet")
				&& !urlParaAutenticar.equalsIgnoreCase("/LoginServlet")) {

			RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
			request.setAttribute("msg", "Realize o login!");
			redirecionar.forward(request, response);
			return;

		} else {
			chain.doFilter(request, response);

		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
