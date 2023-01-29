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

<title>Calcular Volume Tanque Septico</title>
</head>
<body>

	<jsp:include page="/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">Calcular Volume Tanque Septico Prismatico e Cilindrico (NBR 7229)</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/HidrossanitarioServlet?acao=inspecao"
			id="form">

			<div class="mb-3">
				<label for="altura1" class="form-label">N° de pessoas ou unidades de contribuição</label>
				<input type="text" class="form-control" id="numeroDePessoas"
					aria-describedby="numeroDePessoas" name="numeroDePessoas"
					value="<fmt:formatNumber pattern = "#"  value = "${modelHidrossanitario.numeroDePessoas}" />">
			</div>
			<div class="mb-3">
				<label for="altura1" class="form-label">Contribuição de
					despejos (C, ver Tabela 1)</label>
				<input type="text" class="form-control" id="contribuicao"
					aria-describedby="contribuicao" name="contribuicao" 
					value="<fmt:formatNumber pattern = "#"  value = "${modelHidrossanitario.contribuicao}" />">
			</div>
			
			<div class="mb-3">
				<label for="altura1" class="form-label">Contribuição de lodo
					fresco (Lf, ver Tabela 1)</label>
				<input type="text" class="form-control" id="lodoFresco"
					aria-describedby="lodoFresco" name="lodoFresco"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.lodoFresco}" />">
			</div>
						
			<div class="mb-3">
				<label for="altura1" class="form-label">Taxa de acumulação
					de lodo digerido em dias (K, ver Tabela 2)</label>
				<input type="text" class="form-control" id="taxaAcumulacao"
					aria-describedby="taxaAcumulacao" name="taxaAcumulacao" onfocus="contribuicao();"
					value="<fmt:formatNumber pattern = "#"  value = "${modelHidrossanitario.taxaAcumulacao}" />">
			</div>
			
			<div class="mb-3">
				<label for="altura1" class="form-label">Altura adotada (m) (Ver tabela 3)</label>
				<input type="text" class="form-control" id="altura" 
					aria-describedby="altura" name="altura" placeholder="altura minima = 1,20m"
					value="<fmt:formatNumber pattern = "#"  value = "${modelHidrossanitario.altura}" />">
			</div>
			
			<div class="mb-3">
				<label for="altura1" class="form-label">Contribuição diária (L)</label>
				<input type="text" class="form-control" id="contribuicaoDiaria" 
					readonly="readonly" aria-describedby="contribuicaoDiaria" name="contribuicaoDiaria"
					value="<fmt:formatNumber pattern = "#"  value = "${modelHidrossanitario.contribuicaoDiaria}" />">
			</div>
			
			<div class="mb-3">
				<label for="altura1" class="form-label">Volume calculado (m³)</label>
				<input type="text" class="form-control" id="volumeReservatorio" 
					readonly="readonly" aria-describedby="volumeReservatorio" name="volumeReservatorio"
					value="<fmt:formatNumber pattern = "#"  value = "${modelHidrossanitario.volumeReservatorio}" />">
			</div>
			
			<div class="mb-3">
				<label for="altura1" class="form-label">Largura calculada tanque prismatico (m)</label>
				<input type="text" class="form-control" id="larguraPrismatico" 
					readonly="readonly" aria-describedby="larguraPrismatico" name="larguraPrismatico"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.larguraPrismatico}" />">
			</div>
			
			<div class="mb-3">Comprimento calculado tanque prismatico (m)</label>
				<input type="text" class="form-control" id="comprimentoPrismatico" 
					readonly="readonly" aria-describedby="comprimentoPrismatico" name="comprimentoPrismatico"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.comprimentoPrismatico}" />">
			</div>
			
			<div class="mb-3">Altura total tanque prismatico (m)</label>
				<input type="text" class="form-control" id="alturaTotal" 
					readonly="readonly" aria-describedby="alturaTotalPrismatico" name="alturaTotal"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.alturaTotal}" />">
			</div>
			
			<div class="mb-3">
				<label for="altura1" class="form-label">Largura calculada tanque cilindrico (m)</label>
				<input type="text" class="form-control" id="larguraCilindrico" 
					readonly="readonly" aria-describedby="larguraCilindrico" name="larguraCilindrico"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.larguraCilindrico}" />">
			</div>
			
			<div class="mb-3">Altura total tanque cilindrico (m)</label>
				<input type="text" class="form-control" id="alturaTotalCilindrico" 
					readonly="readonly" aria-describedby="alturaTotalCilindrico" name="alturaTotalCilindrico"
					value="<fmt:formatNumber pattern = "#.##"  value = "${modelHidrossanitario.alturaTotalCilindrico}" />">
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

		
	</script>


</body>
</html>;