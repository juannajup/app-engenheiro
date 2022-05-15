<%@page import="model.ModelHidrossanitario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="bootstrap-css.jsp"></jsp:include>

<title>Calcular Reservatório</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">
			Calcular Reservatório de Água Fria 
		</h3>
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/HidrossanitarioServlet?acao=reservatorio" id="form">
		
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Numero de pessoas na edificação (consultar tabela 1, abaixo)</label> 
				<input type="text" class="form-control" id="numeroDePessoas" required="required"
					aria-describedby="numeroDePessoas" name="numeroDePessoas" value="${modelHidrossanitario.numeroDePessoas}">
			</div>
			
			<div class="mb-3">
				<label for="consumoPerCapita" class="form-label">Consumo per capita (l/dia) (consultar tabela 2, abaixo)</label> 
				<input type="text" class="form-control" id="consumoPerCapita" required="required"
					aria-describedby="consumoPerCapita" name="consumoPerCapita" value="${modelHidrossanitario.consumoPerCapita}">
					
					
			</div>
			
			<div class="mb-3">
				<label for="numeroDePavimentos" class="form-label">Numero de pavimentos do prédio </label> 
				<input type="text" class="form-control" id="numeroDePavimentos" required="required" placeholder="Se for térreo, considerar 1"
					aria-describedby="numeroDePavimentos" name="numeroDePavimentos" value="${modelHidrossanitario.numeroDePavimentos}">
			</div>
			
			<div class="mb-3">
				<label for="consumoDiario" class="form-label">Consumo diário calculado (l/dia)</label> 
				<input type="text" class="form-control" id="consumoDiario" readonly="readonly"
					aria-describedby="consumoDiario" name="consumoDiario" value="${modelHidrossanitario.consumoDiario}">
			</div>
			
			<!-- Teste logico para quando o prédio tiver mais de um pavimento ou não  -->
			<c:choose>
			
				<c:when test="${modelHidrossanitario.numeroDePavimentos <= 3}">
				<div class="mb-3">
					<label for="volumeReservatorio" class="form-label">Volume do reservatório (l)</label> 
					<input type="text" class="form-control" id="volumeReservatorio" readonly="readonly"
						aria-describedby="volumeReservatorio" name="volumeReservatorio" value="${modelHidrossanitario.volumeReservatorio}">
				</div>			
				</c:when>

				<c:otherwise>
					<div class="mb-3">
						<label for="volumeReservatorioSuperior" class="form-label">Volume do reservatório superior (40% do volume calculado)</label> 
						<input type="text" class="form-control" id="volumeReservatorioSuperior" readonly="readonly"
							aria-describedby="volumeReservatorioSuperior" name="volumeReservatorioSuperior " value="${modelHidrossanitario.volumeReservatorioSuperior}">
					</div>	
					
					<div class="mb-3">
						<label for="volumeReservatorioInferior" class="form-label">Volume do reservatório inferior (60% do volume calculado)</label> 
						<input type="text" class="form-control" id="volumeReservatorioInferior" readonly="readonly"
							aria-describedby="volumeReservatorioInferior" name="volumeReservatorioInferior " value="${modelHidrossanitario.volumeReservatorioInferior}">
					</div>	
				</c:otherwise>
			</c:choose>
			
			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>

			<br>
			<jsp:include page="tabelasHelioCreder/taxaDeOcupacao/taxaDeOcupacao.jsp"></jsp:include>
			<br>
			<jsp:include page="tabelasHelioCreder/consumoDiario/consumoDiario.jsp"></jsp:include>

		</form>
	</main>
	
	<script type="text/javascript">
	function limpar() {
	    
	    var elementos = document.getElementById("form").elements; /*Retorna os elementos html dentro do form*/
	    
	    for (p = 0; p < elementos.length; p ++){
		    elementos[p].value = '';
	    }
	}
	</script>
</body>
</html>