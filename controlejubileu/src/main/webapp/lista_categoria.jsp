<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.CategoriaDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Categoria" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Jubileu</title>
</head>
<body class="bg-light">
	<div class = "container my-2">
		<div class="row ">
			<a href="index.jsp" class="btn btn-primary text-decoration none link-light col align-self-start">Voltar a página anterior</a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="incluir_categoria.jsp" class="btn btn-primary text-decoration none link-light col align-self-end">Cadastro de Categorias</a>
		</div>
		<h1 class="display-5 my-2">Consultar as Categorias</h1>
		<%
			String nomeBusca = "";
			if(request.getParameter("nomeBusca")!= null){
				nomeBusca = request.getParameter("nomeBusca");
			}
		%>
		<div class="my-3">
			<form method="post" action="lista_categoria.jsp" class="row g-3">
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
					<th>Código Subcategoria</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
			<%
				CategoriaDao dao = new CategoriaDao();
				List<Categoria> categoria = dao.listar(nomeBusca);
				for (Categoria c: categoria){
			%>
				<tr>
					<td><%= c.getCod_categoria() %></td>
					<td><%= c.getNome() %></td>
					<td><%= c.getCod_categoriapai() %></td>
					<td>
						<a  class="btn btn-primary btn-sm text-decoration none link-light" href="IniciarAlterarCategoria?id=<%= c.getCod_categoria()%>">Alterar</a> 
						<a   class="btn btn-primary btn-sm text-decoration none link-light" href="ExcluirCategoria?id=<%= c.getCod_categoria()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
					</td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>