package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ModelCabos;
import model.ModelEletrica;
import model.ModelInfra;

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

			// verifica se a tensï¿½o ï¿½ 220V ou 380V antes de calcular a corrente
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

			modelEletrica.calcularQuedaDeTensao(modelEletrica.getCorrente(), modelEletrica.getComprimento(),
					modelEletrica.getCaboTeste(), modelEletrica.getCondutor());
			modelEletrica.calcularEspessuraCabo(modelEletrica.getCorrente(), modelEletrica.getComprimento(),
					modelEletrica.getCaboTeste(), modelEletrica.getCondutor(), modelEletrica.getQuedaPermitida());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelEletrica", modelEletrica);

			request.getRequestDispatcher("principal/eletrica/quedaDeTensao.jsp").forward(request, response);

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

			ModelCabos modelCabos = new ModelCabos();
			ModelInfra modelInfra = new ModelInfra();

			modelCabos.setPirastic_15((pirastic_15));
			modelCabos.setPirastic_25((pirastic_25));
			modelCabos.setPirastic_40((pirastic_40));
			modelCabos.setPirastic_60((pirastic_60));
			modelCabos.setPirastic_100((pirastic_100));
			modelCabos.setPirastic_160((pirastic_160));
			modelCabos.setPirastic_250((pirastic_250));
			modelCabos.setPirastic_350((pirastic_350));
			modelCabos.setPirastic_500((pirastic_500));
			modelCabos.setPirastic_700((pirastic_700));
			modelCabos.setPirastic_950((pirastic_950));
			modelCabos.setPirastic_1200((pirastic_1200));
			modelCabos.setPirastic_1500((pirastic_1500));
			modelCabos.setPirastic_1850((pirastic_1850));
			modelCabos.setPirastic_2400((pirastic_2400));

			modelCabos.setSintenax_15((sintenax_15));
			modelCabos.setSintenax_25((sintenax_25));
			modelCabos.setSintenax_40((sintenax_40));
			modelCabos.setSintenax_60((sintenax_60));
			modelCabos.setSintenax_100((sintenax_100));
			modelCabos.setSintenax_160((sintenax_160));
			modelCabos.setSintenax_250((sintenax_250));
			modelCabos.setSintenax_350((sintenax_350));
			modelCabos.setSintenax_500((sintenax_500));
			modelCabos.setSintenax_700((sintenax_700));
			modelCabos.setSintenax_950((sintenax_950));
			modelCabos.setSintenax_1200((sintenax_1200));
			modelCabos.setSintenax_1500((sintenax_1500));
			modelCabos.setSintenax_1850((sintenax_1850));
			modelCabos.setSintenax_2400((sintenax_2400));

			modelCabos.setEprotenax_15((eprotenax_15));
			modelCabos.setEprotenax_25((eprotenax_25));
			modelCabos.setEprotenax_40((eprotenax_40));
			modelCabos.setEprotenax_60((eprotenax_60));
			modelCabos.setEprotenax_100((eprotenax_100));
			modelCabos.setEprotenax_160((eprotenax_160));
			modelCabos.setEprotenax_250((eprotenax_250));
			modelCabos.setEprotenax_350((eprotenax_350));
			modelCabos.setEprotenax_500((eprotenax_500));
			modelCabos.setEprotenax_700((eprotenax_700));
			modelCabos.setEprotenax_950((eprotenax_950));
			modelCabos.setEprotenax_1200((eprotenax_1200));
			modelCabos.setEprotenax_1500((eprotenax_1500));
			modelCabos.setEprotenax_1850((eprotenax_1850));
			modelCabos.setEprotenax_2400((eprotenax_2400));

			modelCabos.setFibras2((fibras2));
			modelCabos.setFibras4((fibras4));
			modelCabos.setFibras6((fibras6));
			modelCabos.setFibras8((fibras8));
			modelCabos.setFibras10((fibras10));
			modelCabos.setFibras12((fibras12));
			modelCabos.setFibras16((fibras16));
			modelCabos.setFibras24((fibras24));
			modelCabos.setFibras36((fibras36));
			modelCabos.setFibras48((fibras48));
			modelCabos.setFibras72((fibras72));

			modelCabos.setCat5((cat5));
			modelCabos.setCat5e((cat5e));
			modelCabos.setCat6((cat6));
			modelCabos.setCat6a((cat6a));
			modelCabos.setCat7((cat7));

			modelCabos.setRg11((rg11));
			modelCabos.setRg59((rg59));

			modelInfra.setEletrocalhaLarg((eletrocalhaLarg));
			modelInfra.setEletrocalhaAlt((eletrocalhaAlt));

			modelInfra.CalcAco15mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco20mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco25mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco32mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco40mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco65mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco80mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc20mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc25mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc32mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc40mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc60mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc75mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc85mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha50_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha100_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha100_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha150_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha150_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha200_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha200_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha300_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha400_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha500_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalhaCustomArea(eletrocalhaLarg, eletrocalhaAlt);

			modelInfra.CalcEletrocalhaOcupMax(eletrocalhaLarg, eletrocalhaAlt);

			modelInfra.CalcEletrocalhaCustom(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),

					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59(),

					eletrocalhaLarg, eletrocalhaAlt);

			modelInfra.CalcPerf38_38mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPerf200_70mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelInfra", modelInfra);
			request.setAttribute("modelCabos", modelCabos);

			request.getRequestDispatcher("principal/eletrica/ocupacaoEletrica.jsp").forward(request, response);

		} else if (acao != null && !acao.isEmpty() && acao.equalsIgnoreCase("condutoDados")) {

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

			ModelCabos modelCabos = new ModelCabos();
			ModelInfra modelInfra = new ModelInfra();

			modelCabos.setPirastic_15((pirastic_15));
			modelCabos.setPirastic_25((pirastic_25));
			modelCabos.setPirastic_40((pirastic_40));
			modelCabos.setPirastic_60((pirastic_60));
			modelCabos.setPirastic_100((pirastic_100));
			modelCabos.setPirastic_160((pirastic_160));
			modelCabos.setPirastic_250((pirastic_250));
			modelCabos.setPirastic_350((pirastic_350));
			modelCabos.setPirastic_500((pirastic_500));
			modelCabos.setPirastic_700((pirastic_700));
			modelCabos.setPirastic_950((pirastic_950));
			modelCabos.setPirastic_1200((pirastic_1200));
			modelCabos.setPirastic_1500((pirastic_1500));
			modelCabos.setPirastic_1850((pirastic_1850));
			modelCabos.setPirastic_2400((pirastic_2400));

			modelCabos.setSintenax_15((sintenax_15));
			modelCabos.setSintenax_25((sintenax_25));
			modelCabos.setSintenax_40((sintenax_40));
			modelCabos.setSintenax_60((sintenax_60));
			modelCabos.setSintenax_100((sintenax_100));
			modelCabos.setSintenax_160((sintenax_160));
			modelCabos.setSintenax_250((sintenax_250));
			modelCabos.setSintenax_350((sintenax_350));
			modelCabos.setSintenax_500((sintenax_500));
			modelCabos.setSintenax_700((sintenax_700));
			modelCabos.setSintenax_950((sintenax_950));
			modelCabos.setSintenax_1200((sintenax_1200));
			modelCabos.setSintenax_1500((sintenax_1500));
			modelCabos.setSintenax_1850((sintenax_1850));
			modelCabos.setSintenax_2400((sintenax_2400));

			modelCabos.setEprotenax_15((eprotenax_15));
			modelCabos.setEprotenax_25((eprotenax_25));
			modelCabos.setEprotenax_40((eprotenax_40));
			modelCabos.setEprotenax_60((eprotenax_60));
			modelCabos.setEprotenax_100((eprotenax_100));
			modelCabos.setEprotenax_160((eprotenax_160));
			modelCabos.setEprotenax_250((eprotenax_250));
			modelCabos.setEprotenax_350((eprotenax_350));
			modelCabos.setEprotenax_500((eprotenax_500));
			modelCabos.setEprotenax_700((eprotenax_700));
			modelCabos.setEprotenax_950((eprotenax_950));
			modelCabos.setEprotenax_1200((eprotenax_1200));
			modelCabos.setEprotenax_1500((eprotenax_1500));
			modelCabos.setEprotenax_1850((eprotenax_1850));
			modelCabos.setEprotenax_2400((eprotenax_2400));

			modelCabos.setFibras2((fibras2));
			modelCabos.setFibras4((fibras4));
			modelCabos.setFibras6((fibras6));
			modelCabos.setFibras8((fibras8));
			modelCabos.setFibras10((fibras10));
			modelCabos.setFibras12((fibras12));
			modelCabos.setFibras16((fibras16));
			modelCabos.setFibras24((fibras24));
			modelCabos.setFibras36((fibras36));
			modelCabos.setFibras48((fibras48));
			modelCabos.setFibras72((fibras72));

			modelCabos.setCat5((cat5));
			modelCabos.setCat5e((cat5e));
			modelCabos.setCat6((cat6));
			modelCabos.setCat6a((cat6a));
			modelCabos.setCat7((cat7));

			modelCabos.setRg11((rg11));
			modelCabos.setRg59((rg59));

			modelInfra.setEletrocalhaLarg((eletrocalhaLarg));
			modelInfra.setEletrocalhaAlt((eletrocalhaAlt));

			modelInfra.CalcAco15mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco20mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco25mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco32mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco40mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco65mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco80mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcAco100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc20mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc25mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc32mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc40mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc60mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc75mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc85mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPvc100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha50_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha100_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha100_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha150_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha150_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha200_50mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha200_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha300_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha400_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalha500_100mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcEletrocalhaCustomArea(eletrocalhaLarg, eletrocalhaAlt);

			modelInfra.CalcEletrocalhaOcupMax(eletrocalhaLarg, eletrocalhaAlt);

			modelInfra.CalcEletrocalhaCustom(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),

					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59(),

					eletrocalhaLarg, eletrocalhaAlt);

			modelInfra.CalcPerf38_38mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			modelInfra.CalcPerf200_70mm(modelCabos.getPirastic_15(), modelCabos.getPirastic_25(),
					modelCabos.getPirastic_40(), modelCabos.getPirastic_60(), modelCabos.getPirastic_100(),
					modelCabos.getPirastic_160(), modelCabos.getPirastic_250(), modelCabos.getPirastic_350(),
					modelCabos.getPirastic_500(), modelCabos.getPirastic_700(), modelCabos.getPirastic_950(),
					modelCabos.getPirastic_1200(), modelCabos.getPirastic_1500(), modelCabos.getPirastic_1850(),
					modelCabos.getPirastic_2400(),

					modelCabos.getSintenax_15(), modelCabos.getSintenax_25(), modelCabos.getSintenax_40(),
					modelCabos.getSintenax_60(), modelCabos.getSintenax_100(), modelCabos.getSintenax_160(),
					modelCabos.getSintenax_250(), modelCabos.getSintenax_350(), modelCabos.getSintenax_500(),
					modelCabos.getSintenax_700(), modelCabos.getSintenax_950(), modelCabos.getSintenax_1200(),
					modelCabos.getSintenax_1500(), modelCabos.getSintenax_1850(), modelCabos.getSintenax_2400(),

					modelCabos.getEprotenax_15(), modelCabos.getEprotenax_25(), modelCabos.getEprotenax_40(),
					modelCabos.getEprotenax_60(), modelCabos.getEprotenax_100(), modelCabos.getEprotenax_160(),
					modelCabos.getEprotenax_250(), modelCabos.getEprotenax_350(), modelCabos.getEprotenax_500(),
					modelCabos.getEprotenax_700(), modelCabos.getEprotenax_950(), modelCabos.getEprotenax_1200(),
					modelCabos.getEprotenax_1500(), modelCabos.getEprotenax_1850(), modelCabos.getEprotenax_2400(),

					modelCabos.getFibras2(), modelCabos.getFibras4(), modelCabos.getFibras6(), modelCabos.getFibras8(),
					modelCabos.getFibras10(), modelCabos.getFibras12(), modelCabos.getFibras16(),
					modelCabos.getFibras24(), modelCabos.getFibras36(), modelCabos.getFibras48(),
					modelCabos.getFibras72(),

					modelCabos.getCat5(), modelCabos.getCat5e(), modelCabos.getCat6(), modelCabos.getCat6a(),
					modelCabos.getCat7(),

					modelCabos.getRg11(), modelCabos.getRg59());

			// retorna a tela os dados enviados para o calculo
			request.setAttribute("modelInfra", modelInfra);
			request.setAttribute("modelCabos", modelCabos);

			request.getRequestDispatcher("principal/eletrica/ocupacaoDados.jsp").forward(request, response);

		} 
		
		else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
