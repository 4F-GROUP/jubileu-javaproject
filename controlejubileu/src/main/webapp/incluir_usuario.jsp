<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body  class="bg-light">
	<div class="container my-2">
			<div class="row ">
				<a href="lista_usuario.jsp" class="btn btn-danger text-decoration none link-light col align-self-start">Voltar a p?gina anterior</a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-end"></a>
			</div>
			<h1 class="display-5 my-2">Formul?rio de Cadastro</h1>
			<form method="post" action="IncluirUsuario" >
				<div class="input-group my-2">
					<span class="input-group-text">123</span>
					<input class="form-control" type="number" name="cod_usuario" placeholder="C?digo" required>
				</div>
				<div class="input-group my-2">
					<span class="input-group-text">admin</span>
					<input class="form-control"type="text" name="login" placeholder="Login" required>
				</div>
				<div class="input-group my-2">
					<span class="input-group-text">******</span>
					<input class="form-control" type="password" name="senha" placeholder="Senha" required>
				</div>
				<div class="input-group my-2">
					<span class="input-group-text">Jo?o Silva</span>
					<input class="form-control" type="text" name="nome" placeholder="Nome " required>
				</div>
				<div class="input-group my-2">
					<span class="input-group-text">j@gmail.com</span>
					<input class="form-control" type="email" name="email" placeholder="Email" required>
				</div>
				<div class="my-2">
					<input class="btn btn-danger  text-decoration none link-light" type="submit" value="Ok">
					<input class="btn btn-danger  text-decoration none link-light" type="reset" value="Limpar">
				</div>
			</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>