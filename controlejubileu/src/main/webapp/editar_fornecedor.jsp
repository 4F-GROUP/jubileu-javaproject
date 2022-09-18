<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.FornecedorDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Fornecedor" %>
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
			<a href="lista_fornecedor.jsp" class="btn btn-primary text-decoration none link-light col align-self-start">Voltar a p�gina anterior</a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-end"></a>
		</div>
		<h1 class="display-5 my-2">Formul�rio de Edi��o</h1>
		<% 
			Fornecedor fornecedor = (Fornecedor) request.getAttribute("fornecedor");
		%>
		<form method="post" action="AlterarFornecedor">
			<input type="text" name="id" value="<%= fornecedor.getCod_fornecedor() %>" readonly>
			<div class="input-group my-2">
				<span class="input-group-text">Raz�o Social</span>
				<input class="form-control" type="text" name="razao_social" value="<%= fornecedor.getRazao_social() %>" placeholder="Raz�o Social" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Nome Fantasia</span>
				<input class="form-control" type="text" name="nome_fantasia" value="<%= fornecedor.getNome_fantasia() %>"  placeholder="Nome Fantasia" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">CNPJ</span>
				<input class="form-control" type="number" name="cnpj" value="<%= fornecedor.getCnpj() %>" placeholder="CNPJ" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Endere�o</span>
				<input class="form-control" type="text" name="endereco" value="<%= fornecedor.getEndereco() %>" placeholder="Endere�o" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">N�mero</span>
				<input class="form-control" type="number" name="numero"  value="<%= fornecedor.getNumero() %>"placeholder="N�mero" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Complemento</span>
				<input class="form-control" type="text" name="complemento" value="<%= fornecedor.getComplemento() %>" placeholder="Complemento" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Bairro</span>
				<input class="form-control" type="text" name="bairro"  value="<%= fornecedor.getBairro() %>" placeholder="Bairro" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">CEP</span>
				<input class="form-control" type="number" name="cep" value="<%= fornecedor.getCep() %>" placeholder="CEP" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Cidade</span>
				<input class="form-control" type="text" name="cidade" value="<%= fornecedor.getCidade() %>" placeholder="Cidade" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Estado</span>
				<input class="form-control" type="text" name="estado"  value="<%= fornecedor.getEstado() %>" placeholder="Estado" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Telefone</span>
				<input class="form-control" type="text" name="telefone" value="<%= fornecedor.getTelefone() %>" placeholder="Telefone" required>
			</div>
			<div class="my-2">
				<input class="btn btn-primary  text-decoration none link-light" type="submit" value="Editar">
				<input class="btn btn-primary  text-decoration none link-light" type="reset" value="Limpar">
			</div>
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>