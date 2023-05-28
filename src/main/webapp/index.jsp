<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<jsp:include page="principal/bootstrap-css.jsp"></jsp:include>
<style type="text/css">
body{
	 background-color: #2B577A;
	 background-image: none;
}
</style>

<title>Home</title>
</head>
<body>
	<section class="vh-100 gradient-custom">
  <div class="container py-5 h-100">
    <div class="row d-flex justify-content-center align-items-center h-100">
      <div class="col-12 col-md-8 col-lg-6 col-xl-5">
        <div class="card bg-dark text-white" style="border-radius: 1rem;">
          <div class="card-body p-5 text-center">

            <div class="mb-md-5 mt-md-4 pb-5">

              <h2 class="fw-bold mb-2 text-uppercase">Bem-vindo!</h2>
              <p class="text-white-50 mb-5">Por favor digite seu email e sua senha</p>

			  <form method="post"
				action="<%=request.getContextPath()%>/LoginServlet?acao=login" id="form">
				<input type="hidden" value="<%=  request.getParameter("url")%>" name="url">
              <div class="form-outline form-white mb-4">
                <input type="text" name="email" id="email" class="form-control form-control-lg" />
                <label class="form-label" for="typeEmailX">Email</label>
              </div>

              <div class="form-outline form-white mb-4">
                <input type="password" name="senha" id="senha" class="form-control form-control-lg" />
                <label class="form-label" for="typePasswordX">Senha</label>
              </div>

              <button class="btn btn-outline-light btn-lg px-5" type="submit">Login</button>
              <br>
              <span style="color: red;">${msg}</span>
			</form>
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
</section>
	<footer id="rodape">
		<a href="https://github.com/juannajup" target="_blank">Desenvolvido
			por Juan Pablo - https://github.com/juannajup</a>
	</footer>
</body>
</html>