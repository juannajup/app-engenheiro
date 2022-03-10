<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="bootstrap-css.jsp"></jsp:include>

<title>Calcular corrente</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">
			Calcular Queda de Tensão no Condutor 
		</h3>
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/EletricaServlet?acao=quedaDeTensao" id="form">
			<div class="mb-3">
				<label for="tensao" class="form-label">Tensão (V)</label> 
				<input type="text" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="corrente" class="form-label">Corrente (A)</label> 
				<input type="text" class="form-control" id="corrente" required="required"
					aria-describedby="corrente" name="corrente" value="${modelEletrica.corrente}">
			</div>
			<div class="mb-3">
				<label for="comprimento" class="form-label">Comprimento (m)</label> 
				<input type="text" class="form-control" id="comprimento" required="required"
					aria-describedby="comprimento" name="comprimento" value="${modelEletrica.comprimento}">
			</div>
			<div class="mb-3">
				<label for="quedaPermitida" class="form-label">Queda de tensão permitida (%)</label> 
				<input type="text" class="form-control" id="quedaPermitida" required="required"
					aria-describedby="quedaPermitida" name="quedaPermitida" value="${modelEletrica.quedaPermitida}">
			</div>
			<div class="mb-3">
				<label for="caboTeste" class="form-label">Espessura do cabo para teste (mm²)</label> 
				<input type="text" class="form-control" id="caboTeste" required="required"
					aria-describedby="caboTeste" name="caboTeste" value="${modelEletrica.caboTeste}">
			</div>
			<div class="mb-3">
				<label for="rede" class="form-label">Selecione o condutor</label> 
				<br>
				<input type="radio" id="condutor" aria-describedby="condutor" name="condutor" value="cobre" required="required">
				<label for="condutor" class="form-label">Cobre</label> 
				<input type="radio" id="condutor" aria-describedby="condutor" name="condutor" value="aluminio" required="required">
				<label for="condutor" class="form-label">Aluminio</label>
			</div>
			<div class="mb-3">
				<label for="quedaCalculada" class="form-label">Queda de tensão calculada (%)</label> 
				<input type="text" class="form-control" id="quedaCalculada" readonly="readonly"
					aria-describedby="quedaCalculada" name="quedaCalculada" value="${modelEletrica.quedaCalculada}">
			</div>
			
			<div class="mb-3">
				<label for="caboCalc" class="form-label">Espessura calculada (mm²)</label> 
				<input type="text" class="form-control" id="caboCalc" readonly="readonly"
					aria-describedby="caboCalc" name="caboCalc" value="${modelEletrica.caboCalc}">
			</div>
			
			

			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
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