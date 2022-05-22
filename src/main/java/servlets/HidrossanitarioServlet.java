package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelHidrossanitario;

@WebServlet("/HidrossanitarioServlet")
public class HidrossanitarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HidrossanitarioServlet() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String acao  = request.getParameter("acao");
		 
		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("reservatorio")) {
			
			String numeroDePessoas = request.getParameter("numeroDePessoas");
			String consumoPerCapita = request.getParameter("consumoPerCapita");
			String numeroDePavimentos = request.getParameter("numeroDePavimentos");
			
			ModelHidrossanitario modelHidrossanitario = new ModelHidrossanitario();
			
			modelHidrossanitario.setNumeroDePessoas(Integer.parseInt(numeroDePessoas));
			modelHidrossanitario.setConsumoPerCapita(Integer.parseInt(consumoPerCapita));
			modelHidrossanitario.setNumeroDePavimentos(Integer.parseInt(numeroDePavimentos));
			
			
			//caso o numero de pavimentos seja menor do que 1, ou seja, somente pavimento térreo
			if(modelHidrossanitario.getNumeroDePavimentos() <= 3) {
				modelHidrossanitario.calcularReservatorio(modelHidrossanitario.getNumeroDePessoas(), modelHidrossanitario.getConsumoPerCapita());
						
				System.out.println("menos que 3 andares");
						
			//caso o numero de pavimentos seja maior do que 3, é necessaria a divisão do reservatorio em superior e inferior
			} else {
				
				System.out.println("mais que 3 andares");
				modelHidrossanitario.calcularReservatorioSuperior(modelHidrossanitario.getNumeroDePessoas(), modelHidrossanitario.getConsumoPerCapita());
						
				modelHidrossanitario.calcularReservatorioInferior(modelHidrossanitario.getNumeroDePessoas(), modelHidrossanitario.getConsumoPerCapita());
				
			}
					
			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelHidrossanitario", modelHidrossanitario);
			
			request.getRequestDispatcher("principal/hidraulica/calcularReservatorio.jsp").forward(request, response);		
			System.out.println(modelHidrossanitario.toString());
			
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
