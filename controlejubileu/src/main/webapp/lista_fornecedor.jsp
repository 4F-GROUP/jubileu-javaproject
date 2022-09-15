<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.FornecedorDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Fornecedor" %>
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
	<a href="incluir_fornecedor.jsp">Cadastro de Fornecedores</a>
	<h1>Consultar os Fornecedores</h1>
	<%
		String nomeBusca = "";
		if(request.getParameter("nomeBusca")!= null){
			nomeBusca = request.getParameter("nomeBusca");
		}
	%>
	<form method="post" action="lista_fornecedor.jsp">
    	<input type="text" name="nomeBusca" value="<%=nomeBusca%>"/>
    	<input type="submit" value="Buscar"/>
	</form>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Razão Social</th>
				<th>Nome Fantasia</th>
				<th>CNPJ</th>
				<th>Endereço</th>
				<th>Número</th>
				<th>Complemento</th>
				<th>Bairro</th>
				<th>CEP</th>
				<th>Cidade</th>
				<th>Estado</th>
				<th>Telefone</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
		<%
			FornecedorDao dao = new FornecedorDao();
			List<Fornecedor> fornecedor = dao.listar(nomeBusca);
			for (Fornecedor f: fornecedor){
		%>
			<tr>
				<td><%= f.getCod_fornecedor() %></td>
				<td><%= f.getRazao_social() %></td>
				<td><%= f.getNome_fantasia() %></td> 
				<td><%= f.getCnpj() %></td> 
				<td><%= f.getEndereco() %></td> 
				<td><%= f.getNumero() %></td> 
				<td><%= f.getComplemento() %></td>
				<td><%= f.getBairro() %></td> 
				<td><%= f.getCep() %></td>
				<td><%= f.getCidade() %></td>
				<td><%= f.getEstado() %></td>
				<td><%= f.getTelefone() %></td>
				<td>
					<a href="IniciarAlterarFornecedor?id=<%= f.getCod_fornecedor()%>">Alterar</a> 
					<a href="ExcluirFornecedor?id=<%= f.getCod_fornecedor()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
				</td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>