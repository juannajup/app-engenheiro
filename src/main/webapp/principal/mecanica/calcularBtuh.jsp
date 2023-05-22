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
		<h3 id="titulo" class="form-control">Calcular BTU/h Para Ar
			Condicionado Tipo Split</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/MecanicaServlet?acao=calcularSplit"
			id="form">
			
			<div class="mb-3">
				<label for="areaDoAmbiente" class="form-label">Área do
					ambiente (m²)</label>
				<input type="text" class="form-control" id="areaDoAmbiente"
					required="required" aria-describedby="areaDoAmbiente"
					name="areaDoAmbiente"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.areaDoAmbiente}" />">
			</div>
			<div class="mb-3">
				<label for="rede" class="form-label">Incidencia direta de
					Sol</label>
				<br>

				<!-- Codigo java inline para retornar à tela, após a requisição, o valor marcado no input type radio -->
				<input type="radio" id="quantidadeDeSol"
					aria-describedby="quantidadeDeSol" name="quantidadeDeSol"
					value="sim" required="required"
					<%ModelMecanica modelMecanica = (ModelMecanica) request.getAttribute("modelMecanica");
			if (modelMecanica != null && modelMecanica.getQuantidadeDeSol().equalsIgnoreCase("sim")) {
				out.print(" ");
				out.print("checked=\"checked\"");
				out.print(" ");
			}%>>
				<label for="quantidadeDeSol" class="form-label">Sim</label>
				<input type="radio" id="quantidadeDeSol"
					aria-describedby="quantidadeDeSol" name="quantidadeDeSol"
					value="não" required="required"
					<%if (modelMecanica != null && modelMecanica.getQuantidadeDeSol().equalsIgnoreCase("não")) {
				out.print(" ");
				out.print("checked=\"checked\"");
				out.print(" ");
			}%>>
				<label for="quantidadeDeSol" class="form-label">Não</label>

			</div>
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Numero de
					pessoas no ambiente</label>
				<input type="number" class="form-control" id="numeroDePessoas"
					required="required" aria-describedby="numeroDePessoas"
					name="numeroDePessoas"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.numeroDePessoas}" />">
			</div>
			<div class="mb-3">
				<label for="numeroDeEquipamentos" class="form-label">Numero
					de equipamentos no ambiente</label>
				<input type="number" class="form-control" id="numeroDeEquipamentos"
					required="required" aria-describedby="numeroDeEquipamentos"
					name="numeroDeEquipamentos"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.numeroDeEquipamentos}" />">
			</div>

			<div class="mb-3">
				<label for="amper" class="form-label">Btu/h Calculado</label>
				<input type="text" class="form-control" id="btuh"
					aria-describedby="btuh" name="btuh"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.btuh}" />"
					readonly="readonly">
			</div>

			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>

		</form>
		<br>
		<div style="height: 300px; overflow: scroll;">
			<table class="table table-bordered tabelas-mecanicas form-control"
				id="tabelaMecanicas">
				
				<thead>
					<tr class="captionRow">
						<th colspan="7"><h3>Resultados anteriores</h3></th>
					</tr>
					<tr style="text-align: center">
						<th class="cabecalho" scope="col">ID</th>
						<th class="cabecalho" scope="col">Area do ambiente</th>
						<th class="cabecalho" scope="col">Incidencia de sol</th>
						<th class="cabecalho" scope="col">Numero de pessoas</th>
						<th class="cabecalho" scope="col">Numero de pessoas</th>
						<th class="cabecalho" scope="col">Btu/h calculado</th>
						<th class="cabecalho" scope="col">Excluir</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items='${mecanicas}' var='m'>
						<tr>
							<td><c:out value="${m.id}"></c:out></td>
							<td><c:out value="${m.areaDoAmbiente}"></c:out></td>
							<td><c:out value="${m.quantidadeDeSol}"></c:out></td>
							<td><c:out value="${m.numeroDePessoas}"></c:out></td>
							<td><c:out value="${m.numeroDeEquipamentos}"></c:out></td>
							<td><c:out value="${m.btuh}"></c:out></td>
							<td><a class="btn btn-success"
									href="<%= request.getContextPath() %>/MecanicaServlet?acao=excluirBtuh&id=${m.id}">Excluir</a></td>
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