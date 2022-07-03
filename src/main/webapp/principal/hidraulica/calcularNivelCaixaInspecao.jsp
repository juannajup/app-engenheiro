<%@page import="model.ModelHidrossanitario"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>Calcular Nivel Caixas de Inspeção</title>
</head>
<body>

	<jsp:include page="/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">Calcular Calcular Nivel das
			Caixas de Inspeção</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/HidrossanitarioServlet?acao=inspecao"
			id="form">

			<div class="mb-3">
				<label for="cotaTopo1" class="form-label">1° caixa - Cota de
					topo (m)</label>
				<input type="number" class="form-control" id="cotaTopo1"
					required="required" aria-describedby="cotaTopo1" name="cotaTopo1"
					value="${modelHidrossanitario.cotaTopo1}">
			</div>

			<div class="mb-3">
				<label for="cotaFundo1" class="form-label">1° caixa - Cota
					de fundo (m)</label>
				<input type="number" class="form-control" id="cotaFundo1"
					required="required" aria-describedby="cotaFundo1" name="cotaFundo1"
					value="${modelHidrossanitario.cotaFundo1}">
			</div>

			<div class="mb-3">
				<label for="altura1" class="form-label">1° caixa - Altura
					calculada (m)</label>
				<input type="text" class="form-control" id="altura1"
					readonly="readonly" aria-describedby="altura1" name="altura1"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.altura1}" />">
			</div>
			
			<div class="mb-3">
				<label for="inclinacaoTubo" class="form-label">Inclinação do tubo (%)</label>
				<input type="number" class="form-control" id="inclinacaoTubo"
					required="required" aria-describedby="inclinacaoTubo" name="inclinacaoTubo"
					value="${modelHidrossanitario.inclinacaoTubo}">
			</div>
	
			<div class="mb-3">
				<label for="distanciaCaixas" class="form-label">Distancia entre as caixas de inspeção (m)</label>
				<input type="number" class="form-control" id="distanciaCaixas"
					required="required" aria-describedby="distanciaCaixas" name="distanciaCaixas"
					value="${modelHidrossanitario.distanciaCaixas}">
			</div>

			<div class="mb-3">
				<label for="cotaTopo2" class="form-label">2° caixa - Cota de
					topo (m)</label>
				<input type="number" class="form-control" id="cotaTopo2"
					required="required" aria-describedby="cotaTopo2" name="cotaTopo2"
					value="${modelHidrossanitario.cotaTopo2}">
			</div>

			<div class="mb-3">
				<label for="cotaFundo2" class="form-label">2° caixa - Cota
					de fundo calculada (m)</label>
				<input type="text" class="form-control" id="cotaFundo2"
					readonly="readonly" aria-describedby="cotaFundo2" name="cotaFundo2"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.cotaFundo2}" />">
			</div>

			<div class="mb-3">
				<label for="altura2" class="form-label">2° caixa - Altura
					calculada</label>
				<input type="text" class="form-control" id="altura2"
					readonly="readonly" aria-describedby="altura2" name="altura2"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.altura2}" />">
			</div>

			<button type="submit" class="btn btn-success">Calcular 1° caixa</button>
			<button type="submit" class="btn btn-warning" onclick="inspecao();">Calcular próxima
				caixa</button>
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

		function inspecao() {
			
			var cotaTopo1 = document.getElementById("cotaTopo1").value;
			var cotaTopo2 = document.getElementById("cotaTopo2").value;
			var cotaFundo1 = document.getElementById("cotaFundo1").value;
			var cotaFundo2 = document.getElementById("cotaFundo2").value;
			var altura1 = document.getElementById("altura1").value;
			var altura2 = document.getElementById("altura2").value;
			
			//ajax para setar o valor que veio da tela de volta para o input
			$('#cotaTopo1').val(cotaTopo2);
			$('#cotaFundo1').val(cotaFundo2);
			$('#altura1').val(altura2);
			$('#altura2').val("");
			$('#cotaTopo2').val("");
			$('#cotaFundo2').val("");
			$('#distanciaCaixas').val("");
			
		}
	</script>


</body>
</html>;