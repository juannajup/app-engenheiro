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
					<button class="btn btn-warning">Instalações Elétricas</button>
					<div class="dropdown-content">
						<a href="correnteEletrica.jsp">Calculo de corrente elétrica</a> 
						<a href="quedaDeTensao.jsp">Calcular queda de tensão</a>
						<a href="ocupação.jsp">Calcular ocupação de conduto</a>
					</div>
				</div>
				<div class="dropdown">
					<button class="btn btn-primary">Instalações Hidráulicas</button>
					<div class="dropdown-content">
						<a href="#">Em desenvolvimento</a> 
					</div>
				</div>
				<div class="dropdown">
					<button class="btn btn-secondary">Instalações Mecânicas</button>
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