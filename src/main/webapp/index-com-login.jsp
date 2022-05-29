<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<link rel="stylesheet" type="text/css" href="principal/estilo.css">

<link rel="icon" type="image/x-icon" href="./img/favicon.ico">

<title>Home</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<nav class="navbar navbar-expand-lg navbar-light bg-light form-control">
			<div class="container-fluid">
				<h1 class="titulo">Bem-vindo ao App do Engenheiro!</h1>
			</div>
	</nav>
	
	<div class="container-fluid list-group form-control" style="width: 20%; border: none; padding=10 px;">
	<h2 class="titulo">Faça seu login</h2>
	<!-- <form method="post" action="<%=request.getContextPath()%>/ServletLogin" id="form"> -->
	<form method="post" id="form">
	
		<input type="hidden" value="<%=request.getParameter("url")%>" name="url">

		<div class="mb-3">
			<label class="form-label" for="login">Login</label> 
			<input class="form-control" id="login" name="login" type="text" required>
		</div>

		<div class="mb-3">
			<label class="form-label" for="senha">Senha</label> 
			<input class="form-control" id="senha" name="senha" type="password" required>
		</div>

		<input type="submit" value="Acessar" class="btn btn-primary">
		<input type="submit" value="Registrar" class="btn btn-primary">

	</form>
	</div>

	<div class="container-fluid list-group form-control">
		<ul>
			<h2>Proximas implementações:</h2>

			<li><h3>Implementar Iz no calculo da corrente eletrica</h3></li>
			<li><h3>Implementar o Login de usuario</h3></li>
			<li><h3>Lista com os ultimos calculos da sessão com hora do calculo e botao de excluir</h3></li>
			<li><h3>Calculo de ocupação de eletroduto</h3></li>
			<li><h3>Integração com banco de dados postgresql</h3></li>
			<li><h3>Implementar botão de busca</h3></li>
		</ul>
	</div>
	
<script type="text/javascript">
//Example starter JavaScript for disabling form submissions if there are invalid fields
(function () {
  'use strict'

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  var forms = document.querySelectorAll('.needs-validation')

  // Loop over them and prevent submission
  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }

        form.classList.add('was-validated')
      }, false)
    })
})()

</script>	
	
</body>
</html>