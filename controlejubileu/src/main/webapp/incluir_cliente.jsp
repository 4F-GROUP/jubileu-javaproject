<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body>
	<a href="lista_cliente.jsp">Voltar a página anterior</a>
	<h1>Formulário de Cadastro</h1>
	<form method="post" action="IncluirCliente">
		<input type="number" name="cod_cliente" placeholder="Código" required>
		<br>
		<input type="text" name="nome" placeholder="Nome Completo" required>
		<br>
		<input type="text" name="endereco" placeholder="Endereço" required>
		<br>
		<input type="number" name="numero" placeholder="Numero" required>
		<br>
		<input type="text" name="complemento" placeholder="Complemento" required>
		<br>
		<input type="text" name="bairro" placeholder="Bairro" required>
		<br>
		<input type="number" name="cep" placeholder="CEP" required>
		<br>
		<input type="text" name="cidade" placeholder="Cidade" required>
		<br>
		<input type="text" name="estado" placeholder="Estado" required>
		<br>
		<input type="text" name="telefone" placeholder="Telefone" required>
		<br>
		<input type="text" name="email" placeholder="Email" required>
		<br>
		<input type="number" name="cpf" placeholder="CPF" required>
		<br>
		<input type="text" name="login" placeholder="Login" required>
		<br>
		<input type="password" name="senha" placeholder="Senha" required>
		<br>
		<input type="submit" value="Ok">
		<input type="reset" value="Limpar">
	</form>
</body>
</html>