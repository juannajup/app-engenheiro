<%@page import="model.ModelObra"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Fórmula de Blondel</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Calcular Escada - Fórmula de Blondel</h3>
		<form class="form-control" method="post"
			style="align-content: center;"
			action="<%=request.getContextPath()%>/ArqServlet?acao=blondel"
			id="form">


			
				<div class="col-md-12" style="padding-bottom: 16px;">
					<label for="espelho" class="form-label">Altura espelho (entre 16 e 18cm)</label>
					<input type="text" class="form-control" id="espelho" onchange="blondel();"
						required="required" aria-describedby="espelho" name="espelho"
						value="<fmt:formatNumber pattern = "#"  value = "${modelArq.espelho}" />">
				</div>
				<div class="col-md-12" style="padding-bottom: 16px;">
					<label for="pisoPiso" class="form-label">Altura piso a piso (cm)</label>
					<input type="text" class="form-control" id="pisoPiso"
						required="required" aria-describedby="pisoPiso" name="pisoPiso"
						value="<fmt:formatNumber pattern = "#"  value = "${modelArq.pisoPiso}" />">
				</div>
				<div class="col-md-12" style="padding-bottom: 16px;">
					<label for="piso" class="form-label">Piso calculado (cm)</label>
					<input type="text" class="form-control" id="piso"
						readonly="readonly" aria-describedby="piso" name="piso"
						value="<fmt:formatNumber pattern = "#"  value = "${modelArq.piso}" />">
				</div>
				<div class="col-md-12" style="padding-bottom: 16px;">
					<label for="quantDegraus" class="form-label">Quantidade de degraus calculado</label>
					<input type="text" class="form-control" id="quantDegraus"
						readonly="readonly" aria-describedby="quantDegraus" name="quantDegraus"
						value="<fmt:formatNumber pattern = "#.##"  value = "${modelArq.quantDegraus}" />">
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
		
		function blondel(){
			var espelho = document.getElementById("espelho").value;
		    if ((espelho >= 16) && (espelho <= 18)) {
		        return true;
		    }
		    else{
		    alert('A altura do espelho precisa ser entre 16 e 18cm');
		    espelho.value = '';
		    return false;
		    }
		}
	</script>
</body>
</html>