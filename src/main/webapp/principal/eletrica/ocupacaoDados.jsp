<%@page import="model.ModelInfraDados"%>
<%@page import="model.ModelCabosDados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Calcular ocupação de conduto - Dados e Voz</title>
</head>
<body>
<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">
			Calcular Ocupação de Conduto - Dadoz e Voz
		</h3>
		<form class="form-control" method="post"
			style="align-content: center;"
			action="<%=request.getContextPath()%>/EletricaServlet?acao=condutoDados"
			id="form">
		
		<jsp:include page="cabos/cabos_fibra.jsp"></jsp:include>
		<br>
		<jsp:include page="cabos/cabos_utp.jsp"></jsp:include>
		<br>
		<jsp:include page="cabos/cabos_coaxial.jsp"></jsp:include>
		<br>
		<div style="text-align: center;">	
		<button type="submit" class="btn btn-success">Calcular</button>
		<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
		</div>
		<h3 id="titulo" class="form-control" style="text-align: center;">
			Resultado
		</h3>
		<br>
		<jsp:include page="condutos/eletroduto_aco_dados.jsp"></jsp:include>
		<br>
		<jsp:include page="condutos/eletroduto_pvc_dados.jsp"></jsp:include>
		<br>
		<jsp:include page="condutos/eletrocalha_dados.jsp"></jsp:include>
		<br>
		<jsp:include page="condutos/perfilado_dados.jsp"></jsp:include>
		<br>
		
		</form>
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