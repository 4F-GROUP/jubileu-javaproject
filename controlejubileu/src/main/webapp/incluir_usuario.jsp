<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body>
	<a href="lista_usuario.jsp">Voltar a página anterior</a>
	<h1>Formulário de Cadastro</h1>
	<form method="post" action="IncluirUsuario">
		<input type="number" name="cod_usuario" placeholder="Código" required>
		<br>
		<input type="text" name="login" placeholder="Login" required>
		<br>
		<input type="password" name="senha" placeholder="Senha" required>
		<br>
		<input type="text" name="nome" placeholder="Nome Completo" required>
		<br>
		<input type="email" name="email" placeholder="Email" required>
		<br>
		<input type="submit" value="Ok">
		<input type="reset" value="Limpar">
	</form>
</body>
</html>