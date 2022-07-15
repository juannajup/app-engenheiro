<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Tabela Conversão Cobre pol x mm</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>

	<h3 id="titulo" class="form-control">Tabela de conversão de cobre</h3>

	<form class="form-control">
		
		<jsp:include page="tubos-cobre/tubos-cobre.jsp"></jsp:include>
		
	</form>
</body>