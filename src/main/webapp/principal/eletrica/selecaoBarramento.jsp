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

<title>Seleção de Barramentos de cobre</title>
</head>
<body>
		<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>
		<h3 id="titulo" class="form-control">Tabela de seleção de barramento de cobre</h3>
		<form class="form-control">
		<jsp:include page="barramento/selecaoBarramentoCobre.jsp"></jsp:include>
		</form>
		<small>
		*Considerar corrente 50% acima do disjuntor selecionado.
		
		
		</small>
	</main>

</body>
</html>
