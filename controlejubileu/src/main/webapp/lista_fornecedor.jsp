<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.FornecedorDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Fornecedor" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.DecimalFormat" %>
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
				<a href="index.jsp" class="btn btn-danger text-decoration none link-light col align-self-start">Voltar a página anterior</a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="incluir_fornecedor.jsp" class="btn btn-danger text-decoration none link-light col align-self-end">Cadastro de Fornecedores</a>
			</div>
		<h1 class="display-5 my-2">Consultar os Fornecedores</h1>
		<%
			String nomeBusca = "";
			if(request.getParameter("nomeBusca")!= null){
				nomeBusca = request.getParameter("nomeBusca");
			}
		%>
		<div class="my-3">
				<form method="post" action="lista_fornecedor.jsp" class="row g-3">
					<div class="col-auto">
						<input type="text" class="form-control " placeholder="Pesquise um código" name="nomeBusca" value="<%=nomeBusca%>"/>
					</div>
					<div class="col-auto">
						<input type="submit" value="Buscar" class="btn btn-danger link-light"/>
					</div>
				</form>
			</div>
		<table class="table table-hover">
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
						<a class="btn btn-danger btn-sm text-decoration none link-light" href="IniciarAlterarFornecedor?id=<%= f.getCod_fornecedor()%>">Alterar</a> 
						<a class="btn btn-danger btn-sm text-decoration none link-light" href="ExcluirFornecedor?id=<%= f.getCod_fornecedor()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
					</td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>