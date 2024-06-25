<%@page import="model.ModelLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="/principal/bootstrap-css.jsp"></jsp:include>

<title>Editar Informações</title>
</head>
<body>
	<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">Editar Informações</h3>
		<form class="form-control" method="post"
			action="<%=request.getContextPath()%>/UsuarioServlet?acao=atualizarUsuarioEspecifico"
			id="form">
			<div class="mb-3">
				<label for="nome" class="form-label">Nome</label> <input type="text"
					class="form-control" id="nome" required="required" maxlength="100"
					aria-describedby="nome" name="nome" value="${usuario.nome}">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email</label> <input
					type="text" class="form-control" id="email" readonly="readonly"
					aria-describedby="email" name="email" value="${usuario.email}">
			</div>
			<div class="mb-3">
				<label for="senha" class="form-label">Senha</label> <input
					type="text" class="form-control" id="senha" required="required"
					aria-describedby="senha" name="senha" value="${usuario.senha}">
			</div>

			<div class="mb-3 form-check">
				<label for="rede" class="form-label">Tipo de usuário</label> <br>

				<input type="radio" id="tipoUsuarioAdmin" disabled="disabled"
					aria-describedby="tipoUsuario" name="tipoUsuarioDisabled"
					value="administrador"
					${usuario.tipoUsuario == 'administrador' ? 'checked="checked"' : ''}>
				<label for="tipoUsuarioAdmin" class="form-label">Administrador</label>

				<input type="radio" id="tipoUsuarioUsuario" disabled="disabled"
					aria-describedby="tipoUsuario" name="tipoUsuarioDisabled"
					value="usuario"
					${usuario.tipoUsuario == 'usuario' ? 'checked="checked"' : ''}>
				<label for="tipoUsuarioUsuario" class="form-label">Usuário</label>

				<!-- Campo oculto para enviar o valor real -->
				<input type="hidden" name="tipoUsuario"
					value="${usuario.tipoUsuario}">
			</div>


			<br> <input type="hidden" name="id" value="${usuario.id}">
			<!-- Adicione um campo oculto para armazenar o ID do usuário -->

			<button type="submit" class="btn btn-success">Atualizar</button>
			<a href="<%=request.getContextPath() %>/UsuarioServlet?acao=listarUsuarios" class="btn btn-secondary">Voltar</a>
		</form>

	</main>

</body>
</html>