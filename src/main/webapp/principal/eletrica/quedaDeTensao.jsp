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

<title>Calcular Queda de Tensão</title>
</head>
<body>
<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">
			Calcular Queda de Tensão no Condutor 
		</h3>
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/EletricaServlet?acao=quedaDeTensao" id="form">
			<div class="mb-3">
				<label for="tensao" class="form-label">Tensão (V)</label> 
				<input type="number" class="form-control" id="tensao" required="required"
					aria-describedby="tensao" name="tensao" value="${modelEletrica.tensao}" placeholder="110, 220 ou 380">
			</div>
			<div class="mb-3">
				<label for="corrente" class="form-label">Corrente (A)</label> 
				<input type="text" class="form-control" id="corrente" required="required"
					aria-describedby="corrente" name="corrente" value="<fmt:formatNumber pattern = "#.##"  value = "${modelEletrica.corrente}" />">
			</div>
			<div class="mb-3">
				<label for="comprimento" class="form-label">Comprimento (m)</label> 
				<input type="text" class="form-control" id="comprimento" required="required"
					aria-describedby="comprimento" name="comprimento" value="${modelEletrica.comprimento}">
			</div>
			<div class="mb-3">
				<label for="quedaPermitida" class="form-label">Queda de tensão permitida (%)</label> 
				<input type="number" class="form-control" id="quedaPermitida" required="required"
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
				<input type="radio" id="condutor" aria-describedby="condutor" name="condutor" value="cobre" required="required" 
				<%ModelEletrica modelEletrica = (ModelEletrica) request.getAttribute("modelEletrica");
					if (modelEletrica != null && modelEletrica.getCondutor().equalsIgnoreCase("cobre")) {
					out.print(" ");
					out.print("checked=\"checked\"");
					out.print(" ");
				}%>>
				<label for="condutor" class="form-label">Cobre</label> 
				<input type="radio" id="condutor" aria-describedby="condutor" name="condutor" value="aluminio" required="required"
				<% if (modelEletrica != null && modelEletrica.getCondutor().equalsIgnoreCase("aluminio")) {
					out.print(" ");
					out.print("checked=\"checked\"");
					out.print(" ");
				}%>>
				<label for="condutor" class="form-label">Aluminio</label>
			</div>
			<div class="mb-3">
				<label for="quedaCalculada" class="form-label">Queda de tensão calculada (%)</label> 
				<input type="text" class="form-control" id="quedaCalculada" readonly="readonly"
					aria-describedby="quedaCalculada" name="quedaCalculada" value="<fmt:formatNumber pattern = "#.##"  value = "${modelEletrica.quedaCalculada}" />">
			</div>
			
			<div class="mb-3">
				<label for="caboCalc" class="form-label">Espessura calculada (mm²)</label> 
				<input type="text" class="form-control" id="caboCalc" readonly="readonly"
					aria-describedby="caboCalc" name="caboCalc" value="<fmt:formatNumber pattern = "#.##"  value = "${modelEletrica.caboCalc}" />">
			</div>
			
			

			<button type="submit" class="btn btn-success">Calcular</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			</form>
			
			<br>
		<div style="height: 700px; overflow: scroll;text-align: -webkit-center;">
			<table class=" tabelas-usuarios table table-bordered form-control"
				id="tabelaEletricas">

				<thead>
					<tr class="captionRow">
						<th colspan="10"><h3>Resultados anteriores</h3></th>
					</tr>
					<tr style="text-align: center">
						<th class="cabecalho" scope="col">ID</th>
						<th class="cabecalho" scope="col">Tensão</th>
						<th class="cabecalho" scope="col">Corrente</th>
						<th class="cabecalho" scope="col">Comprimento</th>
						<th class="cabecalho" scope="col">Queda permitida</th>
						<th class="cabecalho" scope="col">Espessura-teste</th>
						<th class="cabecalho" scope="col">Condutor</th>
						<th class="cabecalho" scope="col">Queda calculada</th>
						<th class="cabecalho" scope="col">Espessura calculada</th>
						<th class="cabecalho" scope="col">Excluir</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items='${eletricas}' var='m'>
						<tr>
							<td><c:out value="${m.id}"></c:out></td>
							<td><c:out value="${m.tensao}"></c:out></td>
							<td><c:out value="${m.corrente}"></c:out></td>
							<td><c:out value="${m.comprimento}"></c:out></td>
							<td><c:out value="${m.quedaPermitida}"></c:out></td>
							<td><c:out value="${m.caboTeste}"></c:out></td>
							<td><c:out value="${m.condutor}"></c:out></td>
							<td><c:out value="${m.quedaCalculada}"></c:out></td>
							<td><c:out value="${m.caboCalc}"></c:out></td>
							<td><a class="btn btn-success"
									href="<%= request.getContextPath() %>/EletricaServlet?acao=excluirQueda&id=${m.id}">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
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