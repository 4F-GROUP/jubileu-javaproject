<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.FornecedorDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Fornecedor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body>
	<a href="lista_fornecedor.jsp">Voltar a página anterior</a>
	<h1>Formulário de Edição</h1>
	<% 
		Fornecedor fornecedor = (Fornecedor) request.getAttribute("fornecedor");
	%>
	<form method="post" action="AlterarFornecedor">
		<input type="hidden" name="cod_fornecedor" value="<%= fornecedor.getCod_fornecedor() %>" placeholder="Código" required>
		<br>
		<input type="text" name="razao_social" value="<%= fornecedor.getRazao_social() %>" placeholder="Razao Social" required>
		<br>
		<input type="text" name="nome_fantasia" value="<%= fornecedor.getNome_fantasia() %>" placeholder="Nome Fantasia" required>
		<br>
		<input type="number" name="cnpj" value="<%= fornecedor.getCnpj() %>" placeholder="CNPJ" required>
		<br>
		<input type="text" name="endereco" value="<%= fornecedor.getEndereco() %>" placeholder="Endereço" required>
		<br>
		<input type="number" name="numero" value="<%= fornecedor.getNumero() %>" placeholder="Número" required>
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
</body>
</html>