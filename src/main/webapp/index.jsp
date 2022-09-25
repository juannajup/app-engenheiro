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
			<h2>Novas funcionalidades:</h2>
			<li>
				<h3>
					<a class="dropdown-item"
						href="<%=request.getContextPath()%>/principal/eletrica/ocupacaoDados.jsp">Calcular
						ocupação de conduto - dados e voz</a>
				</h3>
			</li>
			<li>
				<h3>
					<a class="dropdown-item"
						href="<%=request.getContextPath()%>/principal/eletrica/ocupacaoEletrica.jsp">Calcular
						ocupação de conduto - eletrica</a>
				</h3>
			</li>
		</ul>
		<ul>
			<h2>Proximas implementações:</h2>
			<li><h3>Ajuste da tabela de cabos de fibra otica</h3></li>
			<li><h3>Calculo luminotecnico</h3></li>
			<li><h3>Dimensionamento de dutos</h3></li>
		</ul>
	</div>
	<footer id="rodape">
		<a href="https://github.com/juannajup" target="_blank">Desenvolvido
			por Juan Pablo - https://github.com/juannajup</a>
	</footer>
</body>
</html>