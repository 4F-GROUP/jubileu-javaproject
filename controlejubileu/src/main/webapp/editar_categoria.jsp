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
			<a href="lista_categoria.jsp" class="btn btn-primary text-decoration none link-light col align-self-end">Voltar a página anterior</a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
		</div>
		<h1 class="display-5 my-2">Formulário de Edição</h1>
		<%
			Categoria categoria = (Categoria) request.getAttribute("categoria");
		%>
		<form method="post" action="AlterarCategoria" >
			<input type="hidden" name="id" value="<%= categoria.getCod_categoria() %>">
			<div class="input-group my-2">
				<span class="input-group-text">Nome</span>
				<input class="form-control"type="text" name="nome" value="<%= categoria.getNome() %>" placeholder="Flamengo" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Sub Categoria</span>
				<input class="form-control" type="number" name="cod_categoriapai" value="<%= categoria.getCod_categoriapai() %>" placeholder="Jaquetas" required>
			</div>
			<div class="my-2">
				<input class="btn btn-primary  text-decoration none link-light" type="submit" value="Ok">
				<input class="btn btn-primary  text-decoration none link-light" type="reset" value="Limpar">
			</div>
		</form>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>