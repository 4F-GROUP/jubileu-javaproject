<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="br.com.jubileu.controlejubileu.model.dao.ClienteDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Cliente" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.DecimalFormat" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body class ="bg-light">
	<div class="container my-2"> 
		<div class="row ">
			<a href="index.jsp" class="btn btn-primary text-decoration none link-light col align-self-start">Voltar a página anterior</a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="incluir_cliente.jsp" class="btn btn-primary text-decoration none link-light col align-self-end">Cadastro de Clientes</a>
		</div>
		<h1 class="display-5 my-2">Consultar os Clientes</h1>
		<%
			String nomeBusca = "";
			if(request.getParameter("nomeBusca")!= null){
				nomeBusca = request.getParameter("nomeBusca");
			}
		%>
		<div class="my-3">
			<form method="post" action="lista_cliente.jsp" class="row g-3">
				<div class="col-auto">
					<input type="text" class="form-control " placeholder="Pesquise um código" name="nomeBusca" value="<%=nomeBusca%>"/>
				</div>
				<div class="col-auto">
					<input type="submit" value="Buscar" class="btn btn-primary link-light"/>
				</div>
			</form>
		</div>
		<table class="table table-hover">
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
						<a class="btn btn-primary btn-sm text-decoration none link-light" href="IniciarAlterarCliente?id=<%= c.getCod_cliente()%>">Alterar</a> 
						<a class="btn btn-primary btn-sm text-decoration none link-light" href="ExcluirCliente?id=<%= c.getCod_cliente()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
					</td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>