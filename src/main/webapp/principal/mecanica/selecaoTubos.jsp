<%@page import="model.ModelMecanica"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Água Gelada</title>
</head>
<body>
		<jsp:include page="/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Tabela de seleção de tubos de água gelada</h3>
		<form class="form-control">
		<jsp:include page="tabela-selecao-tubos/selecao-tubos.jsp"></jsp:include>
		</form>
		<small>
		*Perda em % do comprimento equivalente.
		<br>
		- Para diâmetro acima de 150mm a velocidade de água limita-se em 3,3 m/s.
		</small>
	</main>

</body>
</html>
