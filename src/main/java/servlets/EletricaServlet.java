package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelEletrica;

@WebServlet("/EletricaServlet")
public class EletricaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EletricaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String acao  = request.getParameter("acao");
		 
		if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("corrente")) {
		
		String tensao = request.getParameter("tensao");
		String potencia = request.getParameter("potencia");
		String fatorDePotencia = request.getParameter("fatorDePotencia").replace(",", ".");
		String rede = request.getParameter("rede");
		
		ModelEletrica modelEletrica = new ModelEletrica();
		
		modelEletrica.setTensao(Integer.parseInt(tensao));
		modelEletrica.setPotencia(Double.parseDouble(potencia));
		modelEletrica.setFatorDePotencia(Double.parseDouble(fatorDePotencia));
		modelEletrica.setRede(rede);
		
		//verifica se a tensï¿½o ï¿½ 220V ou 380V antes de calcular a corrente
		if(modelEletrica.getTensao() == 110 && rede.equals("monofasico")) {
			modelEletrica.calcularCorrenteMonofasica(modelEletrica.getTensao(), modelEletrica.getPotencia(), modelEletrica.getFatorDePotencia());
			
		} else if (modelEletrica.getTensao() == 220 && rede.equals("monofasico")){
			modelEletrica.calcularCorrenteMonofasica(modelEletrica.getTensao(), modelEletrica.getPotencia(), modelEletrica.getFatorDePotencia());
			
		} else if (modelEletrica.getTensao() == 220 && rede.equals("trifasico")) {
			modelEletrica.calcularCorrenteTrifasica(modelEletrica.getTensao(), modelEletrica.getPotencia(), modelEletrica.getFatorDePotencia());
			
		} else {
			//calcular corrente trifasica 380V
			modelEletrica.calcularCorrenteTrifasica(modelEletrica.getTensao(), modelEletrica.getPotencia(), modelEletrica.getFatorDePotencia());
		}
		
		//calcula a corrente do disjuntor
		modelEletrica.calcularCorrenteDisjuntor(modelEletrica.getCorrente());
		
		//calcular a corrente minima para o condutor nao entrar no calculo da taxa de ocupação
		modelEletrica.calcularCorrenteFatorDeAgrupamento(modelEletrica.getCorrente());
		
		//retorna a tela os dados enviados para o calculo
		request.setAttribute("modelEletrica", modelEletrica);
		
			
		request.getRequestDispatcher("principal/eletrica/correnteEletrica.jsp").forward(request, response);
		
		//if the choice is to calculate the voltage drop
		} else if(acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("quedaDeTensao")) {

			String tensao = request.getParameter("tensao");
			String corrente = request.getParameter("corrente");
			String comprimento = request.getParameter("comprimento").replace(",", ".");
			String quedaPermitida = request.getParameter("quedaPermitida").replace(",", ".");
			String caboTeste = request.getParameter("caboTeste").replace(",", ".");
			String condutor = request.getParameter("condutor");
			
			ModelEletrica modelEletrica = new ModelEletrica();
			
			modelEletrica.setTensao(Integer.parseInt(tensao));
			modelEletrica.setCorrente(Double.parseDouble(corrente));
			modelEletrica.setComprimento(Double.parseDouble(comprimento));
			modelEletrica.setQuedaPermitida(Double.parseDouble(quedaPermitida));
			modelEletrica.setCaboTeste(Double.parseDouble(caboTeste));
			modelEletrica.setCondutor(condutor);
			
			
			
			modelEletrica.calcularQuedaDeTensao(modelEletrica.getCorrente(), modelEletrica.getComprimento(), modelEletrica.getCaboTeste(), modelEletrica.getCondutor());
			modelEletrica.calcularEspessuraCabo(modelEletrica.getCorrente(), 
					modelEletrica.getComprimento(), modelEletrica.getCaboTeste(), modelEletrica.getCondutor(), modelEletrica.getQuedaPermitida());
			
			//retorna a tela os dados enviados para o calculo
			request.setAttribute("modelEletrica", modelEletrica);
			
				
			request.getRequestDispatcher("principal/eletrica/quedaDeTensao.jsp").forward(request, response);
			
			
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}
	

	

}
