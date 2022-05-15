<%@page import="model.ModelMecanica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="bootstrap-css.jsp"></jsp:include>

<title>Calcular Split</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">
			Calcular BTU/h Para Ar Condicionado Tipo Split 
		</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/MecanicaServlet?acao=calcularSplit"
			id="form">
			<div class="mb-3">
				<label for="nomeDoAmbiente" class="form-label">Nome do
					ambiente</label> <input type="text" class="form-control"
					id="nomeDoAmbiente" required="required"
					aria-describedby="nomeDoAmbiente" name="nomeDoAmbiente"
					value="${modelMecanica.nomeDoAmbiente}">
			</div>
			<div class="mb-3">
				<label for="areaDoAmbiente" class="form-label">Área do
					ambiente (m²)</label> <input type="text" class="form-control"
					id="areaDoAmbiente" required="required"
					aria-describedby="areaDoAmbiente" name="areaDoAmbiente"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.areaDoAmbiente}" />">
			</div>
			<div class="mb-3">
				<label for="rede" class="form-label">Incidencia direta de
					Sol</label> <br>

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
				<label for="quantidadeDeSol" class="form-label">Sim</label> <input
					type="radio" id="quantidadeDeSol"
					aria-describedby="quantidadeDeSol" name="quantidadeDeSol"
					value="não" required="required"
					<% if (modelMecanica != null && modelMecanica.getQuantidadeDeSol().equalsIgnoreCase("não")) {
					out.print(" ");
					out.print("checked=\"checked\"");
					out.print(" ");
					}%>>
				<label for="quantidadeDeSol" class="form-label">Não</label>

			</div>
			<div class="mb-3">
				<label for="numeroDePessoas" class="form-label">Numero de
					pessoas no ambiente</label> <input type="text" class="form-control"
					id="numeroDePessoas" required="required"
					aria-describedby="numeroDePessoas" name="numeroDePessoas"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.numeroDePessoas}" />">
			</div>
			<div class="mb-3">
				<label for="numeroDeEquipamentos" class="form-label">Numero
					de equipamentos no ambiente</label> <input type="text" class="form-control"
					id="numeroDeEquipamentos" required="required"
					aria-describedby="numeroDeEquipamentos" name="numeroDeEquipamentos"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.numeroDeEquipamentos}" />">
			</div>

			<div class="mb-3">
				<label for="amper" class="form-label">Btu/h Calculado</label> <input
					type="text" class="form-control" id="btuh" aria-describedby="btuh"
					name="btuh"
					value="<fmt:formatNumber pattern = "#"  value = "${modelMecanica.btuh}" />"
					readonly="readonly">
			</div>

			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
	
			<!-- Tabela com os resultados anteriores -->
			<c:if test="${modelMecanica.nomeDoAmbiente != null && modelMecanica.nomeDoAmbiente != ''}">
				<div style="height: 300px; margin-top: 10px;">
					<table class="table" id="tabelaresultadosview">
						<thead>
							<tr>
								<th scope="col">Nome</th>
								<th scope="col">Area do ambiente</th>
								<th scope="col">Btu/h calculado</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items='${listaCalculada}' var='mm'>
								<tr>
									<td><c:out value="${mm.nomeDoAmbiente}"></c:out></td>
									<td><fmt:formatNumber pattern = "#"  value = "${mm.areaDoAmbiente}" /></td>
									<td><fmt:formatNumber pattern = "#"  value = "${mm.btuh}" /></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</c:if>
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