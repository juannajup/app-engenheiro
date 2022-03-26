<%@page import="model.ModelEletrica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="bootstrap-css.jsp"></jsp:include>

<title>Calcular Corrente</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">
			Calcular Corrente Eletrica no Condutor 
		</h3>
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/EletricaServlet?acao=corrente" id="form">
			<div class="mb-3">
				<label for="tensao" class="form-label">Tensão (V)</label> 
				<input type="text" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="rede" class="form-label">Tipo de rede*</label> 
				<br> 
				
				<!-- Codigo java inline para retornar à tela, após a requisição, o valor marcado no input type radio -->
				<input type="radio" id="rede" aria-describedby="rede" name="rede"
					value="monofasico" required="required"
					<%ModelEletrica modelEletrica = (ModelEletrica) request.getAttribute("modelEletrica");
					if (modelEletrica != null && modelEletrica.getRede().equalsIgnoreCase("monofasico")) {
					out.print(" ");
					out.print("checked=\"checked\"");
					out.print(" ");
					}%>>
				<label for="rede" class="form-label">Monofasico</label> 
				
				<input type="radio" id="rede" aria-describedby="rede" name="rede" value="trifasico" required="required"
				<% if (modelEletrica != null && modelEletrica.getRede().equalsIgnoreCase("trifasico")) {
					out.print(" ");
					out.print("checked=\"checked\"");
					out.print(" ");
					}%>
				>
				<label for="rede" class="form-label">Trifasico</label>
				
			</div>
			<div class="mb-3">
				<label for="potencia" class="form-label">Potência (W)</label> 
				<input type="text" class="form-control" id="potencia" required="required"
					aria-describedby="potencia" name="potencia" value="<fmt:formatNumber pattern = "#"  value = "${modelEletrica.potencia}" />">
			</div>
			<div class="mb-3">
				<label for="fatorDePotencia" class="form-label">Fator de Potência</label> 
				<input type="text" class="form-control" required="required" id="fatorDePotencia" 
				aria-describedby="fatorDePotencia" name="fatorDePotencia" value="${modelEletrica.fatorDePotencia}">
			</div>
			<div class="mb-3">
				<label for="voltAmper" class="form-label">Volt-Amper (VA)</label> <input
					type="text" class="form-control" id="voltAmper"
					aria-describedby="voltAmper" readonly="readonly" name="voltAmper" value="<fmt:formatNumber pattern = "#"  value = "${modelEletrica.voltAmper}" />">
			</div>
			<div class="mb-3">
				<label for="amper" class="form-label">Corrente Calculada (A)</label> 
				<input type="text" class="form-control" id="corrente" aria-describedby="corrente" name="corrente" 
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelEletrica.corrente}" />" readonly="readonly">
			</div>

			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			</form>
		<small>*Caso seja bifasico 220V, marcar monofasico 220V</small>
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