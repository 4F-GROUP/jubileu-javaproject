<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="br.com.jubileu.controlejubileu.model.dao.ClienteDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Cliente" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body>
	<a href="index.jsp">Voltar a página anterior</a>
	<a href="incluir_cliente.jsp">Cadastro de Clientes</a>
	<%
		String nomeBusca = "";
		if(request.getParameter("nomeBusca")!= null){
			nomeBusca = request.getParameter("nomeBusca");
		}
	%>
	<form method="post" action="lista_cliente.jsp">
    	<input type="text" name="nomeBusca" value="<%=nomeBusca%>"/>
    	<input type="submit" value="Buscar"/>
	</form>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Endereço</th>
				<th>Número</th>
				<th>Complemento</th>
				<th>Bairro</th>
				<th>CEP</th>
				<th>Cidade</th>
				<th>Estado</th>
				<th>Telefone</th>
				<th>Email</th>
				<th>CPF</th>
				<th>Login</th>
				<th>Senha</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
		<%
			ClienteDao dao = new ClienteDao();
			List<Cliente> cliente = dao.listar(nomeBusca);
			for (Cliente c: cliente){
		%>
			<tr>
				<td><%= c.getCod_cliente() %></td>
				<td><%= c.getNome() %></td> 
				<td><%= c.getEndereco() %></td> 
				<td><%= c.getNumero() %></td> 
				<td><%= c.getComplemento() %></td>
				<td><%= c.getBairro() %></td> 
				<td><%= c.getCep() %></td>
				<td><%= c.getCidade() %></td>
				<td><%= c.getEstado() %></td>
				<td><%= c.getTelefone() %></td>
				<td><%= c.getEmail() %></td>
				<td><%= c.getCpf() %></td>
				<td><%= c.getLogin() %></td>
				<td><%= c.getSenha() %></td>
				<td>
					<a href="IniciarAlterarCliente?id=<%= c.getCod_cliente()%>">Alterar</a> 
					<a href="ExcluirCliente?id=<%= c.getCod_cliente()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
				</td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>