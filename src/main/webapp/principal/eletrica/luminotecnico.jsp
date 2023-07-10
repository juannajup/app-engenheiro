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
	<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">Calculo Luminotécnico -
			Método dos Lumens</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/EletricaServlet?acao=luminotecnico"
			id="form">
			<h4>1° Etapa - Calcular indice do local (k)</h4>
			<div class="mb-3">
				<label for="comprimento" class="form-label">Comprimento do
					ambiente (m)</label>
				<input type="text" class="form-control" id="comprimento"
					required="required" aria-describedby="comprimento"
					name="comprimento" value="${modelLum.comprimento}">
			</div>
			<div class="mb-3">
				<label for="largura" class="form-label">Largura do ambiente
					(m)</label>
				<input type="text" class="form-control" id="largura"
					required="required" aria-describedby="largura" name="largura"
					value="${modelLum.largura}">
			</div>
			<div class="mb-3">
				<label for="alturaInstalacao" class="form-label">Altura de
					montagem da luminaria (m)</label>
				<input type="text" class="form-control" id="alturaInstalacao"
					required="required" aria-describedby="alturaInstalacao"
					name="alturaInstalacao" value="${modelLum.alturaInstalacao}"
					placeholder="distância da fonte de luz ao plano de trabalho em metros">
			</div>
			<div class="mb-3">
				<label for="indiceK" class="form-label">Indice k calculado</label>
				<input type="text" class="form-control" id="indiceK"
					readonly="readonly" aria-describedby="indiceK" name="indiceK"
					value="<fmt:formatNumber pattern = "#"  value = "${modelLum.indiceK}"/>">
			</div>
			<button type="submit" class="btn btn-success">Calcular
				indice k</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			<br>
		</form>
		
		<br>
		<div style="height: 300px; overflow: scroll;">
			<table class="table table-bordered tabelas-mecanicas form-control"
				id="tabelaLum" style="width: 70%;">

				<thead>
					<tr class="captionRow">
						<th colspan="12"><h3>Resultados anteriores</h3></th>
					</tr>
					<tr style="text-align: center">
						<th class="cabecalho" scope="col">ID</th>
						<th class="cabecalho" scope="col">Comprimento</th>
						<th class="cabecalho" scope="col">Largura</th>
						<th class="cabecalho" scope="col">Altura</th>
						<th class="cabecalho" scope="col">Indice k</th>
						<th class="cabecalho" scope="col">Fluxo luminoso</th>
						<th class="cabecalho" scope="col">Fluxo luminoso total</th>
						<th class="cabecalho" scope="col">Em</th>
						<th class="cabecalho" scope="col">Fator Deprec.</th>
						<th class="cabecalho" scope="col">Fator Util.</th>
						<th class="cabecalho" scope="col">Numero Luminarias</th>
						<th class="cabecalho" scope="col">Excluir</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items='${lum}' var='m'>
						<tr>
							<td><c:out value="${m.id}"></c:out></td>
							<td><c:out value="${m.comprimento}"></c:out></td>
							<td><c:out value="${m.largura}"></c:out></td>
							<td><c:out value="${m.alturaInstalacao}"></c:out></td>
							<td><c:out value="${m.indiceK}"></c:out></td>
							<td><c:out value="${m.fluxoLuminoso}"></c:out></td>
							<td><c:out value="${m.fluxoLuminosoTotal}"></c:out></td>
							<td><c:out value="${m.nivelLuminancia}"></c:out></td>
							<td><c:out value="${m.depreciacao}"></c:out></td>
							<td><c:out value="${m.fatorUtilizacao}"></c:out></td>
							<td><c:out value="${m.numeroDeLuminarias}"></c:out></td>
							<td><a class="btn btn-success"
									href="<%= request.getContextPath() %>/EletricaServlet?acao=excluirLum1&id=${m.id}">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
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