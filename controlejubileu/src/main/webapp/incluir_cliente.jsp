<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<a href="lista_cliente.jsp" class="btn btn-primary text-decoration none link-light col align-self-start">Voltar a página anterior</a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-end"></a>
			</div>
			<h1 class="display-5 my-2">Formulário de Cadastro</h1>
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
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>