<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<jsp:include page="principal/bootstrap-css.jsp"></jsp:include>

<title>Inicio</title>
</head>
<body>
	<jsp:include page="/menu.jsp"></jsp:include>
	<nav class="navbar navbar-expand-lg navbar-light bg-light form-control">
			<div class="container-fluid">
				<h1 class="titulo">Bem-vindo ao App do Engenheiro!</h1>
			</div>
	</nav>
	
	<div class="container-fluid list-group form-control">
		<ul>
			<h2>Proximas implementa��es:</h2>

			<li><h3>Calculo de tra�o de concreto</h3></li>
			<li><h3>Inserir tabela de calculo de peso de chapa de dutos</h3></li>
			<li><h3>Implementar o Login de usuario</h3></li>
			<li><h3>Lista com os ultimos calculos da sess�o com hora do calculo e botao de excluir</h3></li>
			<li><h3>Calculo de ocupa��o de eletroduto</h3></li>
			<li><h3>Integra��o com banco de dados postgresql</h3></li>
			<li><h3>Implementar bot�o de busca</h3></li>
		</ul>
	</div>
</body>
</html>