<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Usuario" %>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.UsuarioDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body>
	<a href="lista_usuario.jsp">Voltar a página anterior</a>
	<h1>Formulário de Edição</h1>
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
</body>
</html>