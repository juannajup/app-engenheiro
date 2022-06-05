<%@page import="model.ModelObra"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Calcular Traço</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Calcular Traço de Concreto
			Armado</h3>
		<form class="form-control" method="post"
			style="align-content: center;"
			action="<%=request.getContextPath()%>/ObraServlet?acao=calcularTraco"
			id="form">


			
				<div class="col-md-12" style="padding-bottom: 16px;">
					<label for=fck class="form-label">Fck (MPa)</label>
					<input type="text" class="form-control" id="fck"
						required="required" aria-describedby="fck" name="fck"
						value="${modelObra.fck}">
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
						(Consultar tabela X, abaixo)</label>
					<input type="text" class="form-control" id="desvioPadrao"
						required="required" aria-describedby="desvioPadrao"
						name="desvioPadrao" value="${modelObra.desvioPadrao}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=fatorAguaCimento class="form-label">Fator
						água/cimento (Consultar tabela X, abaixo)</label>
					<input type="text" class="form-control" id="fatorAguaCimento"
						required="required" aria-describedby="fatorAguaCimento"
						name="fatorAguaCimento" value="${modelObra.fatorAguaCimento}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=volumeDeBrita class="form-label">Volume de brita
						(Consultar tabela X, abaixo)</label>
					<input type="text" class="form-control" id="volumeDeBrita"
						required="required" aria-describedby="volumeDeBrita"
						name="volumeDeBrita" value="${modelObra.volumeDeBrita}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeAgua class="form-label">Consumo de agua
						(Consultar tabela X, abaixo)</label>
					<input type="text" class="form-control" id="consumoDeAgua"
						required="required" aria-describedby="consumoDeAgua"
						name="consumoDeAgua" value="${modelObra.consumoDeAgua}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaEspCimento class="form-label">Massa
						especifica do cimento (kg/m³)</label>
					<input type="text" class="form-control" id="massaEspCimento"
						required="required" aria-describedby="massaEspCimento"
						name="massaEspCimento" value="${modelObra.massaEspCimento}">
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=moduloDeFinuraAreia class="form-label">Modulo de
						finura da areia</label>
					<input type="text" class="form-control" id="moduloDeFinuraAreia"
						required="required" aria-describedby="moduloDeFinuraAreia"
						name="moduloDeFinuraAreia"
						value="${modelObra.moduloDeFinuraAreia}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaEspAreia class="form-label">Massa
						especifica da areia (kg/m³)</label>
					<input type="text" class="form-control" id="massaEspAreia"
						required="required" aria-describedby="massaEspAreia"
						name="massaEspAreia" value="${modelObra.massaEspAreia}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaUniAreia class="form-label">Massa unitaria
						da areia (kg/m³)</label>
					<input type="text" class="form-control" id="massaUniAreia"
						required="required" aria-describedby="massaUniAreia"
						name="massaUniAreia" value="${modelObra.massaUniAreia}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaEspBrita class="form-label">Massa
						especifica da brita (kg/m³)</label>
					<input type="text" class="form-control" id="massaEspBrita"
						required="required" aria-describedby="massaEspBrita"
						name="massaEspBrita" value="${modelObra.massaEspBrita}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=massaUniBrita class="form-label">Massa unitaria
						da brita (kg/m³)</label>
					<input type="text" class="form-control" id="massaUniBrita"
						required="required" aria-describedby="massaUniBrita"
						name="massaUniBrita" value="${modelObra.massaUniBrita}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=diametroMaxBrita class="form-label">Diametro
						maximo do agregado (mm)</label>
					<input type="text" class="form-control" id="diametroMaxBrita"
						required="required" aria-describedby="diametroMaxBrita"
						name="diametroMaxBrita" value="${modelObra.diametroMaxBrita}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeCimento class="form-label">Consumo de
						cimento calculado (kg/m³)</label>
					<input type="text" class="form-control" id="consumoDeCimento"
						readonly="readonly" aria-describedby="consumoDeCimento"
						name="consumoDeCimento" value="${modelObra.consumoDeCimento}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeBrita class="form-label">Consumo de
						brita calculado (kg/m³)</label>
					<input type="text" class="form-control" id="consumoDeBrita"
						readonly="readonly" aria-describedby="consumoDeBrita"
						name="consumoDeBrita" value="${modelObra.consumoDeBrita}">
				</div>
			</div>

			<div class="row">
				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=consumoDeAreia class="form-label">Consumo de
						areia calculado (kg/m³)</label>
					<input type="text" class="form-control" id="consumoDeAreia"
						readonly="readonly" aria-describedby="consumoDeAreia"
						name="consumoDeAreia" value="${modelObra.consumoDeAreia}">
				</div>

				<div class="col-md-6" style="padding-bottom: 16px;">
					<label for=volumeDeAreia class="form-label">Volume de areia
						calculado (m³)</label>
					<input type="text" class="form-control" id="volumeDeAreia"
						readonly="readonly" aria-describedby="volumeDeAreia"
						name="volumeDeAreia" value="${modelObra.volumeDeAreia}">
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
							name="tracoAreia" value="${modelObra.tracoAreia}">
					</div>

					<div class="col-sm" style="padding-bottom: 16px;">
						<label for=traco class="form-label">Brita</label>
						<input type="text" class="form-control" id="tracoBrita"
							readonly="readonly" aria-describedby="tracoBrita"
							name="tracoBrita" value="${modelObra.tracoBrita}">
					</div>

					<div class="col-sm" style="padding-bottom: 16px;">
						<label for=traco class="form-label">Agua</label>
						<input type="text" class="form-control" id="tracoAgua"
							readonly="readonly" aria-describedby="tracoAgua" name="tracoAgua"
							value="${modelObra.tracoAgua}">
					</div>
				</div>
			</div>



			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
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