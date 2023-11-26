<%@page import="model.ModelMecanica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"><jsp:include
	page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Calcular Split</title>
</head>
<body>
	<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Calcular Dutos - Velocidade
			Constante</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/MecanicaServlet?acao=calcularDutosVeloc"
			id="form">

			<div class="mb-3">
				<label for="areaDoAmbiente" class="form-label">Vazão (m³/h)</label>
				<input type="text" class="form-control" id="vazaoH"
					required="required" aria-describedby="vazaoH" name="vazaoH"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.vazaoH}" />">
			</div>
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Velocidade
					(m/s)</label>
				<input type="text" class="form-control" id="velocidade"
					required="required" aria-describedby="velocidade" name="velocidade"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelMecanica.velocidade}" />">
			</div>
			
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Largura horizontal do duto (mm)</label>
				<input type="text" class="form-control" id="ladoA"
					required="required" aria-describedby="ladoA" name="ladoA"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.ladoA}" />">
			</div>
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Largura vertical do duto (mm)</label>
				<input type="text" class="form-control" id="ladoB"
					required="required" aria-describedby="ladoB" name="ladoB"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.ladoB}" />">
			</div>
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Velocidade
					Resultante (m/s) - Vazão / (Largura duto * Altura duto)</label>
				<input type="text" class="form-control" id="velocRes"
					readonly="readonly" aria-describedby="velocRes" name="velocRes"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelMecanica.velocRes}" />">
			</div>
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Area Necessaria (m²) - Vazão / Velocidade</label>
				<input type="text" class="form-control" id="area"
					readonly="readonly" aria-describedby="area" name="area"
					value="<fmt:formatNumber pattern = "#.####"  value = "${modelMecanica.area}" />">
			</div>
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Area
					Resultante (m²) - Largura duto * Altura duto</label>
				<input type="text" class="form-control" id="areaRes"
					readonly="readonly" aria-describedby="areaRes" name="areaRes"
					value="<fmt:formatNumber pattern = "#.####"  value = "${modelMecanica.areaRes}" />">
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