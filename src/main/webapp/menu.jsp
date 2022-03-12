<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light form-control">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.jsp">App do Engenheiro</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="navbar" id="navbarSupportedContent">
				<div class="dropdown">
					<button class="btn btn-warning">Instala��es El�tricas</button>
					<div class="dropdown-content">
						<a href="correnteEletrica.jsp">Calculo de corrente el�trica</a> 
						<a href="quedaDeTensao.jsp">Calcular queda de tens�o</a>
						<a href="ocupa��o.jsp">Calcular ocupa��o de conduto</a>
					</div>
				</div>
				<div class="dropdown">
					<button class="btn btn-primary">Instala��es Hidr�ulicas</button>
					<div class="dropdown-content">
						<a href="#">Em desenvolvimento</a> 
					</div>
				</div>
				<div class="dropdown">
					<button class="btn btn-secondary">Instala��es Mec�nicas</button>
					<div class="dropdown-content">
						<a href="#">Em desenvolvimento</a> 
					</div>
				</div>

				<div>
					<form class="d-flex">
						<input class="form-control me-2" type="search"
							placeholder="Palavra-chave" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Procurar</button>
					</form>
				</div>
			</div>
		</div>
	</nav>
</header>