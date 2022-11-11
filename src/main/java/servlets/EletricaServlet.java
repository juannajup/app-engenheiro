package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelCabosDados;
import model.ModelCabosEletricos;
import model.ModelEletrica;
import model.ModelInfraDados;
import model.ModelInfraEletrica;
import model.ModelLum;

@WebServlet("/EletricaServlet")
public class EletricaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EletricaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");

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

			// verifica se a tensao é 220V ou 380V antes de calcular a corrente
			if (modelEletrica.getTensao() == 110 && rede.equals("monofasico")) {
				modelEletrica.calcularCorrenteMonofasica(modelEletrica.getTensao(), modelEletrica.getPotencia(),
						modelEletrica.getFatorDePotencia());

			} else if (modelEletrica.getTensao() == 220 && rede.equals("monofasico")) {
				modelEletrica.calcularCorrenteMonofasica(modelEletrica.getTensao(), modelEletrica.getPotencia(),
						modelEletrica.getFatorDePotencia());

			} else if (modelEletrica.getTensao() == 220 && rede.equals("trifasico")) {
				modelEletrica.calcularCorrenteTrifasica(modelEletrica.getTensao(), modelEletrica.getPotencia(),
						modelEletrica.getFatorDePotencia());

			} else {
				// calcular corrente trifasica 380V
				modelEletrica.calcularCorrenteTrifasica(modelEletrica.getTensao(), modelEletrica.getPotencia(),
						modelEletrica.getFatorDePotencia());
			}

			// calcula a corrente do disjuntor
			modelEletrica.calcularCorrenteDisjuntor(modelEletrica.getCorrente());

			// calcular a corrente minima para o condutor nao entrar no calculo da taxa de
			// ocupação
			modelEletrica.calcularCorrenteFatorDeAgrupamento(modelEletrica.getCorrente());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelEletrica", modelEletrica);

			request.getRequestDispatcher("principal/eletrica/correnteEletrica.jsp").forward(request, response);

			// if the choice is to calculate the voltage drop
		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("quedaDeTensao")) {

			String tensao = request.getParameter("tensao");
			String corrente = request.getParameter("corrente").replace(",", ".");
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

			modelEletrica.calcularQuedaDeTensao(modelEletrica.getCorrente(), modelEletrica.getComprimento(),
					modelEletrica.getCaboTeste(), modelEletrica.getCondutor());
			modelEletrica.calcularEspessuraCabo(modelEletrica.getCorrente(), modelEletrica.getComprimento(),
					modelEletrica.getCaboTeste(), modelEletrica.getCondutor(), modelEletrica.getQuedaPermitida());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelEletrica", modelEletrica);

			request.getRequestDispatcher("principal/eletrica/quedaDeTensao.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("luminotecnico")) {

			String comprimento = request.getParameter("comprimento").replace(",", ".");
			String largura = request.getParameter("largura").replace(",", ".");
			String alturaInstalacao = request.getParameter("alturaInstalacao").replace(",", ".");

			ModelLum modelLum = new ModelLum();

			modelLum.setComprimento(Double.parseDouble(comprimento));
			modelLum.setLargura(Double.parseDouble(largura));
			modelLum.setAlturaInstalacao(Double.parseDouble(alturaInstalacao));

			modelLum.calcularIndiceK(modelLum.getComprimento(), modelLum.getLargura(), modelLum.getAlturaInstalacao());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelLum", modelLum);

			request.getRequestDispatcher("principal/eletrica/luminotecnico2.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("luminotecnico2")) {

			String comprimento = request.getParameter("comprimento").replace(",", ".");
			String largura = request.getParameter("largura").replace(",", ".");
			String alturaInstalacao = request.getParameter("alturaInstalacao").replace(",", ".");
			String fluxoLuminoso = request.getParameter("fluxoLuminoso").replace(",", ".");
			String nivelLuminancia = request.getParameter("nivelLuminancia").replace(",", ".");
			String depreciacao = request.getParameter("depreciacao").replace(",", ".");
			String fatorUtilizacao = request.getParameter("fatorUtilizacao").replace(",", ".");
			String indiceK = request.getParameter("indiceK").replace(",", ".");

			ModelLum modelLum = new ModelLum();

			modelLum.setComprimento(Double.parseDouble(comprimento));
			modelLum.setLargura(Double.parseDouble(largura));
			modelLum.setAlturaInstalacao(Double.parseDouble(alturaInstalacao));
			modelLum.setFluxoLuminoso(Double.parseDouble(fluxoLuminoso));
			modelLum.setNivelLuminancia(Double.parseDouble(nivelLuminancia));
			modelLum.setDepreciacao(Double.parseDouble(depreciacao));
			modelLum.setFatorUtilizacao(Double.parseDouble(fatorUtilizacao));
			modelLum.setIndiceK(Double.parseDouble(indiceK));

			modelLum.calcularFluxoLuminosoTotal(modelLum.getComprimento(), modelLum.getLargura(),
					modelLum.getNivelLuminancia(), modelLum.getDepreciacao(), modelLum.getFatorUtilizacao());
			modelLum.calcularNumeroDeLuminarias(modelLum.getFluxoLuminosoTotal(), modelLum.getFluxoLuminoso());
			modelLum.mostrarIndiceK(modelLum.getIndiceK());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelLum", modelLum);

			request.getRequestDispatcher("principal/eletrica/luminotecnico2.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("condutoEletrico")) {

			String pirastic_15 = request.getParameter("pirastic_15");
			String pirastic_25 = request.getParameter("pirastic_25");
			String pirastic_40 = request.getParameter("pirastic_40");
			String pirastic_60 = request.getParameter("pirastic_60");
			String pirastic_100 = request.getParameter("pirastic_100");
			String pirastic_160 = request.getParameter("pirastic_160");
			String pirastic_250 = request.getParameter("pirastic_250");
			String pirastic_350 = request.getParameter("pirastic_350");
			String pirastic_500 = request.getParameter("pirastic_500");
			String pirastic_700 = request.getParameter("pirastic_700");
			String pirastic_950 = request.getParameter("pirastic_950");
			String pirastic_1200 = request.getParameter("pirastic_1200");
			String pirastic_1500 = request.getParameter("pirastic_1500");
			String pirastic_1850 = request.getParameter("pirastic_1850");
			String pirastic_2400 = request.getParameter("pirastic_2400");

			String sintenax_15 = request.getParameter("sintenax_15");
			String sintenax_25 = request.getParameter("sintenax_25");
			String sintenax_40 = request.getParameter("sintenax_40");
			String sintenax_60 = request.getParameter("sintenax_60");
			String sintenax_100 = request.getParameter("sintenax_100");
			String sintenax_160 = request.getParameter("sintenax_160");
			String sintenax_250 = request.getParameter("sintenax_250");
			String sintenax_350 = request.getParameter("sintenax_350");
			String sintenax_500 = request.getParameter("sintenax_500");
			String sintenax_700 = request.getParameter("sintenax_700");
			String sintenax_950 = request.getParameter("sintenax_950");
			String sintenax_1200 = request.getParameter("sintenax_1200");
			String sintenax_1500 = request.getParameter("sintenax_1500");
			String sintenax_1850 = request.getParameter("sintenax_1850");
			String sintenax_2400 = request.getParameter("sintenax_2400");

			String eprotenax_15 = request.getParameter("eprotenax_15");
			String eprotenax_25 = request.getParameter("eprotenax_25");
			String eprotenax_40 = request.getParameter("eprotenax_40");
			String eprotenax_60 = request.getParameter("eprotenax_60");
			String eprotenax_100 = request.getParameter("eprotenax_100");
			String eprotenax_160 = request.getParameter("eprotenax_160");
			String eprotenax_250 = request.getParameter("eprotenax_250");
			String eprotenax_350 = request.getParameter("eprotenax_350");
			String eprotenax_500 = request.getParameter("eprotenax_500");
			String eprotenax_700 = request.getParameter("eprotenax_700");
			String eprotenax_950 = request.getParameter("eprotenax_950");
			String eprotenax_1200 = request.getParameter("eprotenax_1200");
			String eprotenax_1500 = request.getParameter("eprotenax_1500");
			String eprotenax_1850 = request.getParameter("eprotenax_1850");
			String eprotenax_2400 = request.getParameter("eprotenax_2400");

			String eletrocalhaLarg = request.getParameter("eletrocalhaLarg");
			String eletrocalhaAlt = request.getParameter("eletrocalhaAlt");

			ModelCabosEletricos modelCabosEletricos = new ModelCabosEletricos();
			ModelInfraEletrica modelInfraEletrica = new ModelInfraEletrica();

			modelCabosEletricos.setPirastic_15((pirastic_15));
			modelCabosEletricos.setPirastic_25((pirastic_25));
			modelCabosEletricos.setPirastic_40((pirastic_40));
			modelCabosEletricos.setPirastic_60((pirastic_60));
			modelCabosEletricos.setPirastic_100((pirastic_100));
			modelCabosEletricos.setPirastic_160((pirastic_160));
			modelCabosEletricos.setPirastic_250((pirastic_250));
			modelCabosEletricos.setPirastic_350((pirastic_350));
			modelCabosEletricos.setPirastic_500((pirastic_500));
			modelCabosEletricos.setPirastic_700((pirastic_700));
			modelCabosEletricos.setPirastic_950((pirastic_950));
			modelCabosEletricos.setPirastic_1200((pirastic_1200));
			modelCabosEletricos.setPirastic_1500((pirastic_1500));
			modelCabosEletricos.setPirastic_1850((pirastic_1850));
			modelCabosEletricos.setPirastic_2400((pirastic_2400));

			modelCabosEletricos.setSintenax_15((sintenax_15));
			modelCabosEletricos.setSintenax_25((sintenax_25));
			modelCabosEletricos.setSintenax_40((sintenax_40));
			modelCabosEletricos.setSintenax_60((sintenax_60));
			modelCabosEletricos.setSintenax_100((sintenax_100));
			modelCabosEletricos.setSintenax_160((sintenax_160));
			modelCabosEletricos.setSintenax_250((sintenax_250));
			modelCabosEletricos.setSintenax_350((sintenax_350));
			modelCabosEletricos.setSintenax_500((sintenax_500));
			modelCabosEletricos.setSintenax_700((sintenax_700));
			modelCabosEletricos.setSintenax_950((sintenax_950));
			modelCabosEletricos.setSintenax_1200((sintenax_1200));
			modelCabosEletricos.setSintenax_1500((sintenax_1500));
			modelCabosEletricos.setSintenax_1850((sintenax_1850));
			modelCabosEletricos.setSintenax_2400((sintenax_2400));

			modelCabosEletricos.setEprotenax_15((eprotenax_15));
			modelCabosEletricos.setEprotenax_25((eprotenax_25));
			modelCabosEletricos.setEprotenax_40((eprotenax_40));
			modelCabosEletricos.setEprotenax_60((eprotenax_60));
			modelCabosEletricos.setEprotenax_100((eprotenax_100));
			modelCabosEletricos.setEprotenax_160((eprotenax_160));
			modelCabosEletricos.setEprotenax_250((eprotenax_250));
			modelCabosEletricos.setEprotenax_350((eprotenax_350));
			modelCabosEletricos.setEprotenax_500((eprotenax_500));
			modelCabosEletricos.setEprotenax_700((eprotenax_700));
			modelCabosEletricos.setEprotenax_950((eprotenax_950));
			modelCabosEletricos.setEprotenax_1200((eprotenax_1200));
			modelCabosEletricos.setEprotenax_1500((eprotenax_1500));
			modelCabosEletricos.setEprotenax_1850((eprotenax_1850));
			modelCabosEletricos.setEprotenax_2400((eprotenax_2400));

			modelInfraEletrica.setEletrocalhaLarg((eletrocalhaLarg));
			modelInfraEletrica.setEletrocalhaAlt((eletrocalhaAlt));

			modelInfraEletrica.CalcAco15mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco20mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco25mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco32mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco40mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco50mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco65mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco80mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcAco100mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc20mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc25mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc32mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc40mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc50mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc60mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc75mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc85mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPvc100mm(modelCabosEletricos.getPirastic_15(), modelCabosEletricos.getPirastic_25(),
					modelCabosEletricos.getPirastic_40(), modelCabosEletricos.getPirastic_60(),
					modelCabosEletricos.getPirastic_100(), modelCabosEletricos.getPirastic_160(),
					modelCabosEletricos.getPirastic_250(), modelCabosEletricos.getPirastic_350(),
					modelCabosEletricos.getPirastic_500(), modelCabosEletricos.getPirastic_700(),
					modelCabosEletricos.getPirastic_950(), modelCabosEletricos.getPirastic_1200(),
					modelCabosEletricos.getPirastic_1500(), modelCabosEletricos.getPirastic_1850(),
					modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha50_50mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha100_50mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha100_100mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha150_50mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha150_100mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha200_50mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha200_100mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha300_100mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha400_100mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalha500_100mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcEletrocalhaCustomArea(eletrocalhaLarg, eletrocalhaAlt);

			modelInfraEletrica.CalcEletrocalhaOcupMax(eletrocalhaLarg, eletrocalhaAlt);

			modelInfraEletrica.CalcEletrocalhaCustom(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400(),

					eletrocalhaLarg, eletrocalhaAlt);

			modelInfraEletrica.CalcPerf38_38mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			modelInfraEletrica.CalcPerf200_70mm(modelCabosEletricos.getPirastic_15(),
					modelCabosEletricos.getPirastic_25(), modelCabosEletricos.getPirastic_40(),
					modelCabosEletricos.getPirastic_60(), modelCabosEletricos.getPirastic_100(),
					modelCabosEletricos.getPirastic_160(), modelCabosEletricos.getPirastic_250(),
					modelCabosEletricos.getPirastic_350(), modelCabosEletricos.getPirastic_500(),
					modelCabosEletricos.getPirastic_700(), modelCabosEletricos.getPirastic_950(),
					modelCabosEletricos.getPirastic_1200(), modelCabosEletricos.getPirastic_1500(),
					modelCabosEletricos.getPirastic_1850(), modelCabosEletricos.getPirastic_2400(),

					modelCabosEletricos.getSintenax_15(), modelCabosEletricos.getSintenax_25(),
					modelCabosEletricos.getSintenax_40(), modelCabosEletricos.getSintenax_60(),
					modelCabosEletricos.getSintenax_100(), modelCabosEletricos.getSintenax_160(),
					modelCabosEletricos.getSintenax_250(), modelCabosEletricos.getSintenax_350(),
					modelCabosEletricos.getSintenax_500(), modelCabosEletricos.getSintenax_700(),
					modelCabosEletricos.getSintenax_950(), modelCabosEletricos.getSintenax_1200(),
					modelCabosEletricos.getSintenax_1500(), modelCabosEletricos.getSintenax_1850(),
					modelCabosEletricos.getSintenax_2400(),

					modelCabosEletricos.getEprotenax_15(), modelCabosEletricos.getEprotenax_25(),
					modelCabosEletricos.getEprotenax_40(), modelCabosEletricos.getEprotenax_60(),
					modelCabosEletricos.getEprotenax_100(), modelCabosEletricos.getEprotenax_160(),
					modelCabosEletricos.getEprotenax_250(), modelCabosEletricos.getEprotenax_350(),
					modelCabosEletricos.getEprotenax_500(), modelCabosEletricos.getEprotenax_700(),
					modelCabosEletricos.getEprotenax_950(), modelCabosEletricos.getEprotenax_1200(),
					modelCabosEletricos.getEprotenax_1500(), modelCabosEletricos.getEprotenax_1850(),
					modelCabosEletricos.getEprotenax_2400());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelInfraEletrica", modelInfraEletrica);
			request.setAttribute("modelCabosEletricos", modelCabosEletricos);

			request.getRequestDispatcher("principal/eletrica/ocupacaoEletrica.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("condutoDados")) {

			String fibras2 = request.getParameter("fibras2");
			String fibras4 = request.getParameter("fibras4");
			String fibras6 = request.getParameter("fibras6");
			String fibras8 = request.getParameter("fibras8");
			String fibras10 = request.getParameter("fibras10");
			String fibras12 = request.getParameter("fibras12");
			String fibras16 = request.getParameter("fibras16");
			String fibras24 = request.getParameter("fibras24");
			String fibras36 = request.getParameter("fibras36");
			String fibras48 = request.getParameter("fibras48");
			String fibras72 = request.getParameter("fibras72");

			String cat5 = request.getParameter("cat5");
			String cat5e = request.getParameter("cat5e");
			String cat6 = request.getParameter("cat6");
			String cat6a = request.getParameter("cat6a");
			String cat7 = request.getParameter("cat7");

			String rg11 = request.getParameter("rg11");
			String rg59 = request.getParameter("rg59");

			String eletrocalhaLarg = request.getParameter("eletrocalhaLarg");
			String eletrocalhaAlt = request.getParameter("eletrocalhaAlt");

			ModelCabosDados modelCabosDados = new ModelCabosDados();
			ModelInfraDados modelInfraDados = new ModelInfraDados();

			modelCabosDados.setFibras2((fibras2));
			modelCabosDados.setFibras4((fibras4));
			modelCabosDados.setFibras6((fibras6));
			modelCabosDados.setFibras8((fibras8));
			modelCabosDados.setFibras10((fibras10));
			modelCabosDados.setFibras12((fibras12));
			modelCabosDados.setFibras16((fibras16));
			modelCabosDados.setFibras24((fibras24));
			modelCabosDados.setFibras36((fibras36));
			modelCabosDados.setFibras48((fibras48));
			modelCabosDados.setFibras72((fibras72));

			modelCabosDados.setCat5((cat5));
			modelCabosDados.setCat5e((cat5e));
			modelCabosDados.setCat6((cat6));
			modelCabosDados.setCat6a((cat6a));
			modelCabosDados.setCat7((cat7));

			modelCabosDados.setRg11((rg11));
			modelCabosDados.setRg59((rg59));

			modelInfraDados.setEletrocalhaLarg((eletrocalhaLarg));
			modelInfraDados.setEletrocalhaAlt((eletrocalhaAlt));

			modelInfraDados.CalcAco15mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco20mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco25mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco32mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco40mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco50mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco65mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco80mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcAco100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc20mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc25mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc32mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc40mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc50mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc60mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc75mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc85mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPvc100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha50_50mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha100_50mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha100_100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha150_50mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha150_100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha200_50mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha200_100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha300_100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha400_100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalha500_100mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcEletrocalhaCustomArea(eletrocalhaLarg, eletrocalhaAlt);

			modelInfraDados.CalcEletrocalhaOcupMax(eletrocalhaLarg, eletrocalhaAlt);

			modelInfraDados.CalcEletrocalhaCustom(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59(),

					eletrocalhaLarg, eletrocalhaAlt);

			modelInfraDados.CalcPerf38_38mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			modelInfraDados.CalcPerf200_70mm(modelCabosDados.getFibras2(), modelCabosDados.getFibras4(),
					modelCabosDados.getFibras6(), modelCabosDados.getFibras8(), modelCabosDados.getFibras10(),
					modelCabosDados.getFibras12(), modelCabosDados.getFibras16(), modelCabosDados.getFibras24(),
					modelCabosDados.getFibras36(), modelCabosDados.getFibras48(), modelCabosDados.getFibras72(),

					modelCabosDados.getCat5(), modelCabosDados.getCat5e(), modelCabosDados.getCat6(),
					modelCabosDados.getCat6a(), modelCabosDados.getCat7(),

					modelCabosDados.getRg11(), modelCabosDados.getRg59());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelInfraDados", modelInfraDados);
			request.setAttribute("modelCabosDados", modelCabosDados);

			request.getRequestDispatcher("principal/eletrica/ocupacaoDados.jsp").forward(request, response);

		}

		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
