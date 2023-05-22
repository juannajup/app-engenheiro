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

<title>Dimensionamento de Tubos de Esgoto</title>
</head>
<body>

	<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Dimensionamento de Tubos de Esgoto (NBR 8160/99)</h3>

		<form class="form-control">
		<jsp:include page="tabelas8160/tabela3.jsp"></jsp:include>
		<br>	
		<jsp:include page="tabelas8160/tabela4.jsp"></jsp:include>
		<br>	
		<jsp:include page="tabelas8160/tabela5.jsp"></jsp:include>
		<br>	
		<jsp:include page="tabelas8160/tabela6.jsp"></jsp:include>
		<br>	
		<jsp:include page="tabelas8160/tabela7.jsp"></jsp:include>
		<br>	
		</form>
		
	</main>
</body>
</html>