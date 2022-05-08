<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
	<nav class="navbar navbar-expand-lg navbar-light bg-light form-control">
	
	<div id="container-menu" class="container-fluid">
	
		<div class="navbar" id="navbarSupportedContent">
		
			
			<a class="navbar-brand" href="index.jsp"><img id="iconemenu"
				alt="Icone" src="img/icone.png">App do Engenheiro</a>
				
				
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
				
					<ul class="navbar navbar-nav mr-auto">
						
							<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle btn btn-warning" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Instalações Elétricas </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
																
								<a class="dropdown-item" href="correnteEletrica.jsp">Calculo de corrente elétrica</a> 
								<a class="dropdown-item" href="quedaDeTensao.jsp">Calcular queda de tensão</a>
								<a class="dropdown-item" href="ocupação.jsp">Calcular ocupação de conduto</a>
								<a class="dropdown-item" href="tabelas5410.jsp">Tabelas NBR 5410</a>
							</div></li>
							
							<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle btn btn-primary" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" style="color: white;"> Instalações Hidráulicas </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="calcularReservatorio.jsp">Calcular reseratório de água fria</a> 					
							</div></li>
							
							<li class="nav-item dropdown"> 
							<a id="navbarDropdown" class="nav-link dropdown-toggle btn button-mecanicas" href="#"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" style="background-color: purple; color: white;"> Instalações Mecânicas </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="calcularBtuh.jsp">Calcular ar condicionado split</a> 
							</div></li>
						
					</ul>
					
					<form class="d-flex">
						<input class="form-control mr-sm-2" type="search"
							placeholder="Buscar" aria-label="Search">
						<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
					</form>
					 
				</div>
			</div>

			<!-- 
			<div class="navbar" id="navbarSupportedContent">
				<div class="dropdown">
					<button class="btn btn-warning">Instalações Elétricas</button>
					<div class="dropdown-content">
						<a href="correnteEletrica.jsp">Calculo de corrente elétrica</a> 
						<a href="quedaDeTensao.jsp">Calcular queda de tensão</a>
						<a href="ocupação.jsp">Calcular ocupação de conduto</a>
						<a href="tabelas5410.jsp">Tabelas NBR 5410</a>
					</div>
				</div>
				<div class="dropdown">
					<button class="btn btn-primary">Instalações Hidráulicas</button>
					<div class="dropdown-content">
						<a href="calcularReservatorio.jsp">Calcular reseratório de água fria</a> 
					</div>
				</div>
				<div class="dropdown">
					<button id="button-mecanicas" class="btn btn-secondary">Instalações Mecânicas</button>
					<div class="dropdown-content">
						<a href="calcularBtuh.jsp">Calcular ar condicionado split</a> 
					</div>
				</div>
			</div>
		 -->
		</div>
	</nav>

	

</header>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
