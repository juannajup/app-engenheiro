<%@page import="model.ModelLum"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>
<style type="text/css">
.xl67 {
	text-align: left;
}
</style>

<title>Calculo Luminotécnico</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">Calculo Luminotécnico -
			Método dos Lumens</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/EletricaServlet?acao=luminotecnico2"
			id="form">
			<h4>1° Etapa - Calcular indice do local (k)</h4>
			<div class="mb-3">
				<label for="comprimento" class="form-label">Comprimento do
					ambiente (m)</label>
				<input type="text" class="form-control" id="comprimento"
					readonly="readonly" aria-describedby="comprimento"
					name="comprimento" value="${modelLum.comprimento}">
			</div>
			<div class="mb-3">
				<label for="largura" class="form-label">Largura do ambiente
					(m)</label>
				<input type="text" class="form-control" id="largura"
					readonly="readonly" aria-describedby="largura" name="largura"
					value="${modelLum.largura}">
			</div>
			<div class="mb-3">
				<label for="alturaInstalacao" class="form-label">Altura de
					montagem da luminaria (m)</label>
				<input type="text" class="form-control" id="alturaInstalacao"
					readonly="readonly" aria-describedby="alturaInstalacao"
					name="alturaInstalacao" value="${modelLum.alturaInstalacao}"
					placeholder="distância da fonte de luz ao plano de trabalho em metros">
			</div>
			<div class="mb-3">
				<label for="indiceK" class="form-label">Indice k calculado</label>
				<input type="text" class="form-control" id="indiceK"
					readonly="readonly" aria-describedby="indiceK" name="indiceK"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelLum.indiceK}"/>">
			</div>
			<a type="submit" class="btn btn-success"
				href="<%=request.getContextPath()%>/principal/eletrica/luminotecnico.jsp">Recalcular
				1° etapa</a>
			<br>
			<br>
			<h4>2° Etapa - Calcular fluxo luminoso total e quantidade minima
				de luminarias</h4>
			<div class="mb-3">
				<label for="fluxoLuminoso" class="form-label">Fluxo luminoso
					total da luminaria (lm)</label>
				<input type="text" class="form-control" id="fluxoLuminoso"
					aria-describedby="fluxoLuminoso" name="fluxoLuminoso"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelLum.fluxoLuminoso}"/>">
			</div>
			<div class="mb-3">
				<label for="nivelLuminancia" class="form-label">Nivel de
					iluminancia (Em) - Consultar tabela 1</label>
				<input type="text" class="form-control" id="nivelLuminancia"
					aria-describedby="nivelLuminancia" name="nivelLuminancia"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelLum.nivelLuminancia}"/>">
			</div>
			<div class="mb-3">
				<label for="depreciacao" class="form-label">Fator de
					depreciação - Consultar tabela 2</label>
				<input type="text" class="form-control" id="depreciacao"
					aria-describedby="depreciacao" name="depreciacao"
					value="${modelLum.depreciacao}">
			</div>
			<div class="mb-3">
				<label for="fatorUtilizacao" class="form-label">Fator de
					utilização - Consultar tabela do fabricante da luminaria e tabela 3</label>
				<input type="text" class="form-control" id="fatorUtilizacao"
					aria-describedby="fatorUtilizacao" name="fatorUtilizacao"
					value="${modelLum.fatorUtilizacao}">

			</div>
			<div class="mb-3">
				<label for="numeroDeLuminarias" class="form-label">Numero de
					luminarias necessarias</label>
				<input type="text" class="form-control" id="numeroDeLuminarias"
					readonly="readonly" aria-describedby="numeroDeLuminarias"
					name="numeroDeLuminarias" value="<fmt:formatNumber pattern = "#"  value = "${modelLum.numeroDeLuminarias}"/>">

			</div>

			<button type="submit" class="btn btn-success">Calcular
				luminarias</button>
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

			for (p = 0; p < elementos.length; p++) {
				elementos[p].value = '';
			}
		}
	</script>
</body>
</html>