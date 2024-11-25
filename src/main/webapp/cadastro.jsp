<%@page import="model.ModelLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Cadastrar Usuario</title>
</head>
<body>

	<main>

		<h3 id="titulo" class="form-control">
			Cadastrar Usuario
		</h3>
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/UsuarioServlet?acao=cadastrarNovo" id="form">
			<div class="mb-3">
				<label for="nome" class="form-label">Nome</label> 
				<input type="text" class="form-control" id="nome" required="required"
					aria-describedby="nome" name="nome" value="${modelLogin.nome}">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email</label> 
				<input type="email" class="form-control" id="email" required="required"
					aria-describedby="email" name="email" value="${modelLogin.email}">
			</div>
			<div class="mb-3">
				<label for="senha" class="form-label">Senha</label> 
				<input type="password" class="form-control" id="senha" required="required"
					aria-describedby="senha" name="senha" value="${modelLogin.senha}">
			</div>
				<!-- Campo oculto para enviar o valor real -->
				<input type="hidden" name="tipoUsuario"
					value="usuario">
			

			<button type="submit" class="btn btn-success">Cadastrar</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			<a href="index.jsp" class="btn btn-warning">Voltar</a>
			<br>
             <span style="color: red;">${mensagem}</span>
			</form>
		
	</main>
	
	
	<script type="text/javascript">
	
	function limpar() {
	    
	    var elementos = document.getElementById("form").elements; /*Retorna os elementos html dentro do form*/
	    
	    for (p = 0; p < elementos.length; p ++){
		    elementos[p].value = '';
	    }
	}
	
	
	function alerta() {
	    // Exibe o diálogo de confirmação
	    var confirmacao = confirm("Tem certeza que deseja excluir esse usuário?");

	    // Verifica se o usuário confirmou a exclusão
	    if (confirmacao) {
	        // Se confirmado, retorna true para permitir a exclusão
	        return true;
	    } else {
	        // Se cancelado, retorna false para cancelar a exclusão
	        return false;
	    }
	}
	</script>
</body>
</html>