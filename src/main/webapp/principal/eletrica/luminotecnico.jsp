<%@page import="model.ModelEletrica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>
<style type="text/css">
.xl67{
text-align: left;
}
</style>

<title>Calculo Luminotécnico</title>
</head>
<body>
<jsp:include page="/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">
			Calculo Luminotécnico - Método dos Lumens
		</h3>
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/EletricaServlet?acao=corrente" id="form">
		<h4>1° Etapa - Calcular indice do local (k)</h4>
			<div class="mb-3">
				<label for="tensao" class="form-label">Comprimento do ambiente (m)</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="tensao" class="form-label">Largura do ambiente (m)</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="tensao" class="form-label">Pé direito (m)</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="tensao" class="form-label">Altura de montagem da luminaria (m)</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" 
					placeholder=" distância da fonte de luz ao plano de trabalho em metros">
			</div>
			<div class="mb-3">
				<label for="tensao" class="form-label">Indice k calculado</label> 
				<input type="number" class="form-control" id="tensao" readonly="readonly"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}">
			</div>
			<button type="submit" class="btn btn-success">Calcular indice k</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			<br>
			
			<br>
			<h4>2° Etapa - Calcular fluxo luminoso total e quantidade minima de luminarias</h4>
			<div class="mb-3">
				<label for="tensao" class="form-label">Fluxo luminoso total da luminaria (lm)</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="tensao" class="form-label">Nivel de luminancia (Em) - Consultar tabela 1</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="tensao" class="form-label">Fator de depreciação - Consultar tabela 2</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="tensao" class="form-label">Fator de utilização - Consultar tabela do fabricante da luminaria e tabela 3</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
					
			</div>

			<button type="submit" class="btn btn-success">Calcular luminiarias</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			
			<br>
			<jsp:include page="luminotecnico/nivel_luminancia.jsp"></jsp:include>
			<br>
			<jsp:include page="luminotecnico/fator_depreciacao.jsp"></jsp:include>
			<br>
			<jsp:include page="luminotecnico/indice_reflexao.jsp"></jsp:include>
			<br>
			
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