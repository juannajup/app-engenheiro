<%@page import="model.ModelMecanica"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Peso de Chapa de Dutos</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>


	<main>
		<h3 id="titulo" class="form-control">Calcular peso de chapas de
			dutos</h3>

		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/MecanicaServlet?acao=chapasDuto"
			id="form">

			<div class="mb-3">
				<label for="larguraDuto" class="form-label">Largura do duto
					(mm)</label>
				<input type="number" class="form-control" id="larguraDuto"
					required="required" aria-describedby="larguraDuto"
					name="larguraDuto"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelMecanica.larguraDuto}"/>">
			</div>

			<div class="mb-3">
				<label for="alturaDuto" class="form-label">Altura do duto
					(mm)</label>
				<input type="number" class="form-control" id="alturaDuto"
					required="required" aria-describedby="alturaDuto" name="alturaDuto"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelMecanica.alturaDuto}"/>">
			</div>

			<div class="mb-3">
				<label for="comprimentoDuto" class="form-label">Comprimento
					do duto (m)</label>
				<input type="number" class="form-control" id="comprimentoDuto"
					required="required" aria-describedby="comprimentoDuto"
					name="comprimentoDuto" value="${modelMecanica.comprimentoDuto}">
			</div>

			<div class="mb-3">
				<label for="areaChapa" class="form-label">Área de chapa
					calculada (m²)</label>
				<input type="text" class="form-control" id="areaChapa"
					aria-describedby="areaChapa" name="areaChapa"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelMecanica.areaChapa}"/>"
					readonly="readonly">
			</div>

			<div class="mb-3">
				<label for="chapaSelecionada" class="form-label">Chapa
					selecionada (N°)</label>
				<input type="text" class="form-control" id="chapaSelecionada"
					aria-describedby="chapaSelecionada" name="chapaSelecionada"
					value="${modelMecanica.chapaSelecionada}" readonly="readonly">
			</div>

			<div class="mb-3">
				<label for="pesoChapa" class="form-label">Peso calculado
					(kg)</label>
				<input type="text" class="form-control" id="pesoChapa"
					aria-describedby="pesoChapa" name="pesoChapa"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelMecanica.pesoChapa}"/>"
					readonly="readonly">
			</div>

			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			<jsp:include page="tabela-chapas-dutos/tabelaChapasDutos.jsp"></jsp:include>


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
