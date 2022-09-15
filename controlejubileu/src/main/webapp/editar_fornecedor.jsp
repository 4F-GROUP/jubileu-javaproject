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
			<input type="hidden" name="id" value="<%= fornecedor.getCod_fornecedor() %>">
			<br>
			<input type="text" name="razao_social" value="<%= fornecedor.getRazao_social() %>" placeholder="Razao Social" required>
			<br>
			<input type="text" name="nome_fantasia" value="<%= fornecedor.getNome_fantasia() %>" placeholder="Nome Fantasia" required>
			<br>
			<input type="number" name="cnpj" value="<%= fornecedor.getCnpj() %>" placeholder="CNPJ" required>
			<br>
			<input type="text" name="endereco" value="<%= fornecedor.getEndereco() %>" placeholder="Endere�o" required>
			<br>
			<input type="number" name="numero" value="<%= fornecedor.getNumero() %>" placeholder="N�mero" required>
			<br>
			<input type="text" name="complemento" value="<%= fornecedor.getComplemento() %>" placeholder="Complemento" required>
			<br>
			<input type="text" name="bairro" value="<%= fornecedor.getBairro() %>" placeholder="Bairro" required>
			<br>
			<input type="number" name="cep" value="<%= fornecedor.getCep() %>" placeholder="CEP" required>
			<br>
			<input type="text" name="cidade" value="<%= fornecedor.getCidade() %>" placeholder="Cidade" required>
			<br>
			<input type="text" name="estado" value="<%= fornecedor.getEstado() %>" placeholder="Estado" required>
			<br>
			<input type="text" name="telefone" value="<%= fornecedor.getEstado() %>" placeholder="Telefone" required>
			<br>
			<input type="submit" value="Ok">
			<input type="reset" value="Limpar">
		</form>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>