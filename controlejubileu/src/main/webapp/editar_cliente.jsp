<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Cliente" %>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.ClienteDao" %>
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
				<a href="lista_cliente.jsp" class="btn btn-danger text-decoration none link-light col align-self-start">Voltar a página anterior</a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-end"></a>
		</div>
		<h1 class="display-5 my-2">Formulário de Edição</h1>
		<% 
			Cliente cliente = (Cliente) request.getAttribute("cliente");
		%>
		<form method="post" action="AlterarCliente" >
			<input class="form-control" type="hidden" name="id" value="<%= cliente.getCod_cliente() %>">
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="nome" value="<%= cliente.getNome() %>" placeholder="Nome" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="endereco" value="<%= cliente.getEndereco() %>" placeholder="Endereço" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="number" name="numero" value="<%= cliente.getNumero() %>" placeholder="Número" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="complemento" value="<%= cliente.getComplemento() %>" placeholder="Complemento" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="bairro" value="<%= cliente.getBairro() %>" placeholder="Bairro" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="number" name="cep" value="<%= cliente.getCep() %>" placeholder="CEP" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="cidade" value="<%= cliente.getCidade() %>" placeholder="Cidade" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="estado" value="<%= cliente.getEstado() %>" placeholder="Estado" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="telefone" value="<%= cliente.getTelefone() %>" placeholder="Telefone" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="email" value="<%= cliente.getEmail() %>" placeholder="Email" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="number" name="cpf" value="<%= cliente.getCpf() %>" placeholder="CPF" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="text" name="login" value="<%= cliente.getLogin() %>" placeholder="Login" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text"></span>
				<input class="form-control" type="password" name="senha" value="<%= cliente.getSenha() %>" placeholder="Senha" required>
			</div>
			<div class="my-2">
				<input class="btn btn-danger  text-decoration none link-light" type="submit" value="Editar">
				<input class="btn btn-danger  text-decoration none link-light" type="reset" value="Limpar">
			</div>
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>