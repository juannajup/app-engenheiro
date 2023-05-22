<%@page import="model.ModelMecanica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"><jsp:include
	page="/principal/bootstrap-css.jsp"></jsp:include><script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Calcular Capacidade de Calha</title>
</head>
<body>
	<jsp:include page="/principal/menu.jsp"></jsp:include>
	<h3 id="titulo" class="form-control">Calcular vazão de projeto para calhas</h3>
	<form class="form-control" method="post"
		action="<%=request.getContextPath()%>/HidrossanitarioServlet?acao=calha"
		id="form">
		<div class="mb-3">
			<label class="form-label">Informe a area da seção molhada (m²)</label>
			<input class="form-control" id="areaMolhada"
				name="areaMolhada"
				value="<fmt:formatNumber pattern = "#.####"  value = "${modelHidrossanitario.areaMolhada}"/>" />
		</div>
		<div class="mb-3">
			<label class="form-label">Informe o perimetro molhado (m)</label>
			<input class="form-control" id="perimetroMolhado"
				name="perimetroMolhado"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.perimetroMolhado}"/>" />
		</div>
		<div class="mb-3">
			<label class="form-label">Coeficiente de rugosidade (Ver tabela 1 abaixo)</label>
			<input class="form-control" id="rugosidade"
				name="rugosidade"
				value="<fmt:formatNumber pattern = "#.###"  value = "${modelHidrossanitario.rugosidade}"/>" />
		</div>
		<div class="mb-3">
			<label class="form-label">Informe a declividade da calha (%)</label>
			<input class="form-control" id="declividade"
				name="declividade"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.declividade}"/>" />
		</div>
		<div class="mb-3">
			<label class="form-label">Capacidade de calha calculada (L/min)</label>
			<input class="form-control" id="capacidadeCalha"
				name="capacidadeCalha" readonly="readonly"
				value="<fmt:formatNumber pattern = "#"  value = "${modelHidrossanitario.capacidadeCalha}"/>" />
		</div>
		

		<button type="submit" class="btn btn-success">Calcular</button>
		<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>

		<br>
		<br>
		<jsp:include page="tabelasAguasPluviais/materiais_calhas.jsp"></jsp:include>
		<br>
		<jsp:include page="tabelasAguasPluviais/capacidade_calhas.jsp"></jsp:include>
		
	</form>
	
	<br>
	<div style="height: 300px; overflow: scroll;">
		<table class="table table-bordered tabelas-mecanicas form-control"
			id="tabelaHidrossanitarios">

			<thead>
				<tr class="captionRow">
					<th colspan="7"><h3>Resultados anteriores</h3></th>
				</tr>
				<tr style="text-align: center">
					<th class="cabecalho" scope="col">ID</th>
					<th class="cabecalho" scope="col">Seção molhada</th>
					<th class="cabecalho" scope="col">Perimetro molhado</th>
					<th class="cabecalho" scope="col">Coeficiente de Rugosidade</th>
					<th class="cabecalho" scope="col">Declividade</th>
					<th class="cabecalho" scope="col">Capacidade de calha</th>
					<th class="cabecalho" scope="col">Excluir</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items='${hidrossanitarios}' var='m'>
					<tr>
						<td><c:out value="${m.id}"></c:out></td>
						<td><c:out value="${m.areaMolhada}"></c:out></td>
						<td><c:out value="${m.perimetroMolhado}"></c:out></td>
						<td><c:out value="${m.rugosidade}"></c:out></td>
						<td><c:out value="${m.declividade}"></c:out></td>
						<td><c:out value="${m.capacidadeCalha}"></c:out></td>
						<td><a class="btn btn-success"
								href="<%= request.getContextPath() %>/HidrossanitarioServlet?acao=excluirCalha&id=${m.id}">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

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
