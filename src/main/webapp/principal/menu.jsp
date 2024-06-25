<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    String admin = (String) request.getSession().getAttribute("administrador");
%>

<header>

	<nav class="navbar navbar-expand-lg navbar-light bg-light form-control">
	
	<div id="container-menu" class="container-fluid">
	
		<div class="navbar" id="navbarSupportedContent">
		
			
			<a class="navbar-brand" href="<%=request.getContextPath() %>/principal/principal.jsp"><img id="iconemenu"
				alt="Icone" src="<%=request.getContextPath() %>/img/icone.png">App do Engenheiro</a>
				
				
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
																
								<a class="dropdown-item" href="<%=request.getContextPath() %>/EletricaServlet?acao=listarCorrente">Calculo de corrente elétrica</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/EletricaServlet?acao=listarLum">Calculo luminotécnico</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/eletrica/ocupacaoDados.jsp">Calcular ocupação de conduto - dados e voz</a>
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/eletrica/ocupacaoEletrica.jsp">Calcular ocupação de conduto - eletrica</a>
								<a class="dropdown-item" href="<%=request.getContextPath() %>/EletricaServlet?acao=listarQueda">Calcular queda de tensão</a>
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/eletrica/tabelas5410.jsp">Tabelas NBR 5410</a>
							</div></li>
							
							<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle btn btn-primary" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" style="color: white;"> Instalações Hidráulicas </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="<%=request.getContextPath() %>/HidrossanitarioServlet?acao=listarCalhas">Calcular capacidade de calha</a> 					
								<a class="dropdown-item" href="<%=request.getContextPath() %>/HidrossanitarioServlet?acao=listarInspecao">Calcular niveis das caixas de inspeção</a> 					
								<a class="dropdown-item" href="<%=request.getContextPath() %>/HidrossanitarioServlet?acao=listarReservatorio">Calcular reservatório de água fria</a> 					
								<a class="dropdown-item" href="<%=request.getContextPath() %>/HidrossanitarioServlet?acao=listarAguasPluviais">Calcular vazão de projeto - águas pluviais</a> 					
								<a class="dropdown-item" href="<%=request.getContextPath() %>/HidrossanitarioServlet?acao=listarTanqueSeptico">Calcular volume tanque septico</a> 					
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/hidraulica/dimTubosEsgoto.jsp">Dimensionamento de tubos de esgoto</a> 					
							</div></li>
							
							<li class="nav-item dropdown"> 
							<a id="navbarDropdown" class="nav-link dropdown-toggle button-mecanicas btn" href="#"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" style="color:white;"> Instalações Mecânicas </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="<%=request.getContextPath() %>/MecanicaServlet?acao=listarBtuh">Calcular ar condicionado split</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/mecanica/calcularDutos.jsp">Calcular dutos - velocidade constante</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/MecanicaServlet?acao=listarChapas">Calcular peso de chapa de dutos</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/mecanica/isolamento_tubulacoes.jsp">Isolamento tubulações frigorigenas</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/mecanica/conversao.jsp">Tabela de conversão de tubos de cobre</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/mecanica/frigorigenas.jsp">Tabela de seleção de tubulações frigorigenas</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/mecanica/selecaoTubos.jsp">Tabela de seleção de tubulações de água gelada</a> 
							</div></li>
							
							<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle btn btn-dark" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" style="color: white;"> Arquitetura/Civil </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/obra/traco-concreto.jsp">Calcular traço de concreto armado</a> 					
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/arq/blondel.jsp">Calcular escada - Formula de Blondel</a>
								<a class="dropdown-item" href="<%=request.getContextPath() %>/principal/arq/rampa.jsp">Calcular inclinação rampa</a>
							</div></li>
							
							<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle btn btn-info" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false" style="color: white;">Bem-vindo <%= session.getAttribute("usuario") %></a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								
								 <% if (admin != null && admin.equalsIgnoreCase("administrador")) { %>
								<a class="dropdown-item" href="<%=request.getContextPath() %>/UsuarioServlet?acao=listarUsuarios">Usuarios</a> 
								 <% } %>

								<%
								// Recupera o ID do usuário da sessão
									Long usuarioIDLong = (Long) session.getAttribute("usuarioID");
									String usuarioID = usuarioIDLong != null ? usuarioIDLong.toString() : null;
								%>
								<a class="dropdown-item"
									href="<%=request.getContextPath()%>/UsuarioServlet?acao=editarUsuarioEspecifico&usuarioID=<%=usuarioID%>">Editar
									Perfil</a> 
								<a class="dropdown-item" href="<%=request.getContextPath() %>/LoginServlet?acao=sair">Sair</a>
							</div></li>
						
					</ul>
					
					
					 
				</div>
			</div>
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
