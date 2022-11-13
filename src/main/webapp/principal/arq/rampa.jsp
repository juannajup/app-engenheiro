<%@page import="model.ModelObra"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Calcular Inclinação Rampa</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Calcular Inclinação Rampa</h3>
		<form class="form-control" method="post"
			style="align-content: center;"
			action="<%=request.getContextPath()%>/ArqServlet?acao=rampa"
			id="form">

			<div class="col-md-12" style="padding-bottom: 16px;">
				<label for="altura" class="form-label">Altura (m)</label>
				<input type="text" class="form-control" id="altura"
					required="required" aria-describedby="altura" name="altura"
					value="${modelArq.altura}">
			</div>
			<div class="col-md-12" style="padding-bottom: 16px;">
				<label for="comprimento" class="form-label">Comprimento (m)</label>
				<input type="text" class="form-control" id="comprimento"
					required="required" aria-describedby="comprimento"
					name="comprimento" value="${modelArq.comprimento}">
			</div>
			<div class="col-md-12" style="padding-bottom: 16px;">
				<label for="inclinacao" class="form-label">Inclinação
					calculada (%)</label>
				<input type="text" class="form-control" id="inclinacao"
					readonly="readonly" aria-describedby="inclinacao" name="inclinacao"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelArq.inclinacao}" />">
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

		function blondel() {
			var espelho = document.getElementById("espelho").value;
			if ((espelho >= 16) && (espelho <= 18)) {
				return true;
			} else {
				alert('A altura do espelho precisa ser entre 16 e 18cm');
				espelho.value = '';
				return false;
			}
		}
	</script>
</body>
</html>