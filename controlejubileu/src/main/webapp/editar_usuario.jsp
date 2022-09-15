<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Usuario" %>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.UsuarioDao" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body class="bg-light">
	<div class="container my-2">
		<div class="row ">
			<a href="lista_usuario.jsp" class="btn btn-primary text-decoration none link-light col align-self-start">Voltar a página anterior</a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-end"></a>
		</div>
		<h1 class="display-5 my-2">Formulário de Edição</h1>
		<% 
			Usuario usuario = (Usuario) request.getAttribute("usuario");
		%>
		<form method="post" action="AlterarUsuario" >
			<input type="hidden" name="id" value="<%= usuario.getCod_usuario() %>">
			<br>
			<input type="text" name="login" value="<%= usuario.getLogin() %>" placeholder="Login" required>
			<br>
			<input type="password" name="senha" value="<%= usuario.getSenha() %>" placeholder="Senha" required>
			<br>
			<input type="text" name="nome" value="<%= usuario.getNome() %>" placeholder="Nome" required>
			<br>
			<input type="text" name="email" value="<%= usuario.getEmail() %>" placeholder="Email" required>
			<br>
			<input type="submit" value="Editar">
			<input type="reset"  value="Limpar">
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>