<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="bootstrap-css.jsp"></jsp:include>

<title>Tabelas NBR 5410</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Tabelas NBR 5410</h3>

		<form class="form-control">
		<jsp:include page="tabelas5410/tabela36/tabela36.jsp"></jsp:include>
		<br>	
		<jsp:include page="tabelas5410/tabela37/tabela37.jsp"></jsp:include>
		<br>	
		<jsp:include page="tabelas5410/tabela42/tabela42.jsp"></jsp:include>
		<br>	
		<jsp:include page="tabelas5410/tabela59/tabela59.jsp"></jsp:include>
		
		
		
		
		
		</form>
		
		
		
		
	</main>
</body>
</html>