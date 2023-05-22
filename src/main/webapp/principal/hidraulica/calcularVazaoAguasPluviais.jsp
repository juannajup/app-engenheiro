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

<title>Calcular Vazão de Projeto Aguas Pluviais</title>
</head>
<body>
	<jsp:include page="/principal/menu.jsp"></jsp:include>
	<h3 id="titulo" class="form-control">Tubos verticais e horizontais</h3>
	<form class="form-control" method="post"
		action="<%=request.getContextPath()%>/HidrossanitarioServlet?acao=calcularVazaoAguasPluviais"
		id="form">
		<div class="mb-3">
			<label class="form-label">Informe a intensidade pluviometrica
				da região (mm/h)</label>
			<input class="form-control" id="intensidadePluviometrica"
				name="intensidadePluviometrica"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.intensidadePluviometrica}"/>"
				placeholder="Para construção até 100m², pode-se considerar 150mm/h" />
		</div>
		<div class="mb-3">
			<label class="form-label">Informe a area da superficie
				molhada (m²)</label>
			<input class="form-control" id="areaMolhada" name="areaMolhada"
				required="required" value="${modelHidrossanitario.areaMolhada}" />
		</div>
		<div class="mb-3">
			<label class="form-label">Vazão calculada (L/min)</label>
			<input class="form-control" id="vazaoDeProjeto" name="vazaoDeProjeto"
				readonly="readonly"
				value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.vazaoDeProjeto}"/>" />

		</div>

		<button type="submit" class="btn btn-success">Calcular</button>
		<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>

		<br>
		<br>
		<jsp:include page="tabelasAguasPluviais/coeficiente_rugosidade.jsp"></jsp:include>
		<br>
		<jsp:include page="tabelasAguasPluviais/conduto_vertical.jsp"></jsp:include>
		<br>
		<jsp:include page="tabelasAguasPluviais/conduto_horizontal.jsp"></jsp:include>
	</form>

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
