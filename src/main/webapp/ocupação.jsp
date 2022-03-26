<%@page import="model.ModelEletrica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="bootstrap-css.jsp"></jsp:include>

<title>Calcular ocupação de conduto</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">
			Calcular Ocupação de Conduto
		</h3>
		
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/EletricaServlet?acao=quedaDeTensao" id="form">
		<h3 id="titulo" class="form-control">
			Em desenvolvimento
		</h3>
			
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