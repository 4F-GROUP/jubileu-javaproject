<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Cliente" %>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.ClienteDao" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body>
	<a href="lista_cliente.jsp">Voltar a página anterior</a>
	<h1>Formulário de Edição</h1>
	<% 
		Cliente cliente = (Cliente) request.getAttribute("cliente");
	%>
	<form method="post" action="AlterarCliente" >
		<input type="hidden" name="id" value="<%= cliente.getCod_cliente() %>">
		<br>
		<input type="text" name="nome" value="<%= cliente.getNome() %>" placeholder="Nome Completo" required>
		<br>
		<input type="text" name="endereco" value="<%= cliente.getEndereco() %>" placeholder="Endereço" required>
		<br>
		<input type="number" name="numero" value="<%= cliente.getNumero() %>" placeholder="Número" required>
		<br>
		<input type="text" name="complemento" value="<%= cliente.getComplemento() %>" placeholder="Complemento" required>
		<br>
		<input type="text" name="bairro" value="<%= cliente.getBairro() %>" placeholder="Bairro" required>
		<br>
		<input type="number" name="cep" value="<%= cliente.getCep() %>" placeholder="CEP" required>
		<br>
		<input type="text" name="cidade" value="<%= cliente.getCidade() %>" placeholder="Cidade" required>
		<br>
		<input type="text" name="estado" value="<%= cliente.getEstado() %>" placeholder="Estado" required>
		<br>
		<input type="text" name="telefone" value="<%= cliente.getTelefone() %>" placeholder="Telefone" required>
		<br>
		<input type="text" name="email" value="<%= cliente.getEmail() %>" placeholder="Email" required>
		<br>
		<input type="number" name="cpf" value="<%= cliente.getCpf() %>" placeholder="CPF" required>
		<br>
		<input type="text" name="login" value="<%= cliente.getLogin() %>" placeholder="Login" required>
		<br>
		<input type="password" name="senha" value="<%= cliente.getSenha() %>" placeholder="Senha" required>
		<br>
		<input type="submit" value="Editar">
		<input type="reset"  value="Limpar">
	</form>
</body>
</html>