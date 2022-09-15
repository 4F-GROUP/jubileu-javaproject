<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body>
	<a href="lista_fornecedor.jsp">Voltar a p�gina anterior</a>
	<h1>Formul�rio de Cadastro</h1>
	<form method="post" action="IncluirFornecedor">
		<input type="number" name="cod_fornecedor" placeholder="C�digo" required>
		<br>
		<input type="text" name="razao_social" placeholder="Razao Social" required>
		<br>
		<input type="text" name="nome_fantasia" placeholder="Nome Fantasia" required>
		<br>
		<input type="number" name="cnpj" placeholder="CNPJ" required>
		<br>
		<input type="text" name="endereco" placeholder="Endere�o" required>
		<br>
		<input type="number" name="numero" placeholder="N�mero" required>
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
		<input type="submit" value="Ok">
		<input type="reset" value="Limpar">
	</form>
</body>
</html>