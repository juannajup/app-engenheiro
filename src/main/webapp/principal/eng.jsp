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
<jsp:include page="/principal/menu.jsp"></jsp:include>

	<main>

		<h3 id="titulo" class="form-control">
			Cadastrar Usuario
		</h3>
		<form class="form-control" method="post" action="<%=request.getContextPath()%>/UsuarioServlet?acao=cadastrar" id="form">
			<div class="mb-3">
				<label for="nome" class="form-label">Nome</label> 
				<input type="text" class="form-control" id="nome" required="required"
					aria-describedby="nome" name="nome" value="${modelLogin.nome}">
			</div>
			<div class="mb-3">
				<label for="email" class="form-label">Email</label> 
				<input type="text" class="form-control" id="email" required="required"
					aria-describedby="email" name="email" value="${modelLogin.email}">
			</div>
			<div class="mb-3">
				<label for="senha" class="form-label">Senha</label> 
				<input type="text" class="form-control" id="senha" required="required"
					aria-describedby="senha" name="senha" value="${modelLogin.senha}">
			</div>

			<button type="submit" class="btn btn-success">Cadastrar</button>
			<button type="submit" class="btn btn-secondary" onclick="limpar();">Limpar</button>
			</form>
		
		<br>
		<div style="height: 700px; overflow: scroll;text-align: -webkit-center;">
			<table class=" tabelas-usuarios table table-bordered form-control"
				id="tabelaEletricas">

				<thead>
					<tr class="captionRow">
						<th colspan="4"><h3>Usuarios cadastrados</h3></th>
					</tr>
					<tr style="text-align: center">
						<th class="cabecalho" scope="col">ID</th>
						<th class="cabecalho" scope="col">Nome</th>
						<th class="cabecalho" scope="col">Email</th>
						<th class="cabecalho" scope="col">Excluir</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items='${logins}' var='m'>
						<tr>
							<td><c:out value="${m.id}"></c:out></td>
							<td><c:out value="${m.nome}"></c:out></td>
							<td><c:out value="${m.email}"></c:out></td>
							<td><a class="btn btn-success"
									href="<%= request.getContextPath() %>/UsuarioServlet?acao=excluirUsuario&id=${m.id}">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</main>
	
	
	<script type="text/javascript">
	
	function limpar() {
	    
	    var elementos = document.getElementById("form").elements; /*Retorna os elementos html dentro do form*/
	    
	    for (p = 0; p < elementos.length; p ++){
		    elementos[p].value = '';
	    }
	}
	</script>
</body>
</html>