<%@page import="model.ModelObra"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Calcular Traço</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Calcular Traço de Concreto
			Armado (Método ABCP)</h3>
		<form class="form-control" method="post"
			style="align-content: center;"
			action="<%=request.getContextPath()%>/ObraServlet?acao=calcularTraco"
			id="form">


			
				<div class="col-md-12" style="padding-bottom: 16px;">
					<label for=fck class="form-label">Fck Pretendido (MPa)</label>
					<input type="text" class="form-control" id="fck"
						required="required" aria-describedby="fck" name="fck"
						value="<fmt:formatNumber pattern = "#"  value = "${modelObra.fck}" />">
				</div>
			

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=fcj class="form-label">Fcj calculado</label>
					<input type="text" class="form-control" id="fcj"
						readonly="readonly" aria-describedby="fcj" name="fcj"
						value="${modelObra.fcj}">
				</div>
				
				<div class="col-md-6">
					<label for=desvioPadrao class="form-label">Desvio padrão Sd
						(Consultar tabela 1, abaixo)</label>
					<input type="text" class="form-control" id="desvioPadrao"
						required="required" aria-describedby="desvioPadrao"
						name="desvioPadrao" value="${modelObra.desvioPadrao}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=fatorAguaCimento class="form-label">Fator
						água/cimento (Consultar tabela 2, abaixo)</label>
					<input type="text" class="form-control" id="fatorAguaCimento"
						required="required" aria-describedby="fatorAguaCimento"
						name="fatorAguaCimento" value="${modelObra.fatorAguaCimento}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=volumeDeBrita class="form-label">Volume de brita
						(Consultar tabela 3, abaixo)</label>
					<input type="text" class="form-control" id="volumeDeBrita"
						required="required" aria-describedby="volumeDeBrita"
						name="volumeDeBrita" value="${modelObra.volumeDeBrita}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeAgua class="form-label">Consumo de agua
						(Consultar tabela 4, abaixo)</label>
					<input type="text" class="form-control" id="consumoDeAgua"
						required="required" aria-describedby="consumoDeAgua"
						name="consumoDeAgua" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.consumoDeAgua}" />">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaEspCimento class="form-label">Massa
						especifica do cimento (kg/m³)</label>
					<input type="text" class="form-control" id="massaEspCimento"
						required="required" aria-describedby="massaEspCimento"
						name="massaEspCimento" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.massaEspCimento}" />">
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaUniBrita class="form-label">Massa unitaria
						da brita (kg/m³)</label>
					<input type="text" class="form-control" id="massaUniBrita"
						required="required" aria-describedby="massaUniBrita"
						name="massaUniBrita" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.massaUniBrita}" />">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaEspBrita class="form-label">Massa
						especifica da brita (kg/m³)</label>
					<input type="text" class="form-control" id="massaEspBrita"
						required="required" aria-describedby="massaEspBrita"
						name="massaEspBrita" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.massaEspBrita}" />">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaUniAreia class="form-label">Massa unitaria
						da areia (kg/m³)</label>
					<input type="text" class="form-control" id="massaUniAreia"
						required="required" aria-describedby="massaUniAreia"
						name="massaUniAreia" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.massaUniAreia}" />">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaEspAreia class="form-label">Massa
						especifica da areia (kg/m³)</label>
					<input type="text" class="form-control" id="massaEspAreia"
						required="required" aria-describedby="massaEspAreia"
						name="massaEspAreia" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.massaEspAreia}" />">
				</div>
				
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeCimento class="form-label">Consumo de
						cimento calculado (kg/m³)</label>
					<input type="text" class="form-control" id="consumoDeCimento"
						readonly="readonly" aria-describedby="consumoDeCimento"
						name="consumoDeCimento" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.consumoDeCimento}" />">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeBrita class="form-label">Consumo de
						brita calculado (kg/m³)</label>
					<input type="text" class="form-control" id="consumoDeBrita"
						readonly="readonly" aria-describedby="consumoDeBrita"
						name="consumoDeBrita" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.consumoDeBrita}" />">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeAreia class="form-label">Consumo de
						areia calculado (kg/m³)</label>
					<input type="text" class="form-control" id="consumoDeAreia"
						readonly="readonly" aria-describedby="consumoDeAreia"
						name="consumoDeAreia" value="<fmt:formatNumber pattern = "#"  value = "${modelObra.consumoDeAreia}" />">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=volumeDeAreia class="form-label">Volume de areia
						calculado (m³)</label>
					<input type="text" class="form-control" id="volumeDeAreia"
						readonly="readonly" aria-describedby="volumeDeAreia"
						name="volumeDeAreia" value="<fmt:formatNumber pattern = "#.###"  value = "${modelObra.volumeDeAreia}" />">
				</div>
			</div>

			<div>
				<h4>Traço Calculado</h4>
				<div class="row">
					<div class="col-sm" style="padding-bottom: 16px;">
						<label for=cimento class="form-label">Cimento</label>
						<input type="text" class="form-control" id="cimento"
							readonly="readonly" aria-describedby="cimento" name="cimento"
							value="1">
					</div>

					<div class="col-sm" style="padding-bottom: 16px;">
						<label for=traco class="form-label">Areia</label>
						<input type="text" class="form-control" id="tracoAreia"
							readonly="readonly" aria-describedby="tracoAreia"
							name="tracoAreia" value="<fmt:formatNumber pattern = "#.##"  value = "${modelObra.tracoAreia}" />">
					</div>

					<div class="col-sm" style="padding-bottom: 16px;">
						<label for=traco class="form-label">Brita</label>
						<input type="text" class="form-control" id="tracoBrita"
							readonly="readonly" aria-describedby="tracoBrita"
							name="tracoBrita" value="<fmt:formatNumber pattern = "#.##"  value = "${modelObra.tracoBrita}" />">
					</div>

					<div class="col-sm" style="padding-bottom: 16px;">
						<label for=traco class="form-label">Agua</label>
						<input type="text" class="form-control" id="tracoAgua"
							readonly="readonly" aria-describedby="tracoAgua" name="tracoAgua"
							value="<fmt:formatNumber pattern = "#.###"  value = "${modelObra.tracoAgua}" />">
					</div>
				</div>
			</div>



			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			
			<jsp:include page="tabelas-abcp/desvio-padrao.jsp"></jsp:include>
			<br>
			<div class="div-imagem">
			<h5 style="font-size: 16px;">Tabela 2 - Fator Agua Cimento</h5>
			<img alt="fator água cimento" src="tabelas-abcp/fator-agua-cimento.png"></img>
			</div>
			<br>
			<jsp:include page="tabelas-abcp/consumo-de-materiais.jsp"></jsp:include>
			<br>
			<jsp:include page="tabelas-abcp/consumo-de-agua.jsp"></jsp:include>
			
		</form>



	</main>

	<script type="text/javascript">
		function limpar() {

			var elementos = document.getElementById("form").elements; /*Retorna os elementos html dentro do form*/

			for (p = 0; p < elementos.length; p++) {
				elementos[p].value = '';
			}
		}
	</script>
</body>
</html>