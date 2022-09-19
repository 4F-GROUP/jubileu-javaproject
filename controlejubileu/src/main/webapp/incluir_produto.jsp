<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.CategoriaDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Categoria" %>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.FornecedorDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Fornecedor" %>
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
			<a href="lista_produto.jsp" class="btn btn-primary text-decoration none link-light col align-self-start">Voltar a página anterior</a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
			<a href="#" class=" col align-self-center"></a>
		</div>
		<h1 class="display-5 my-2">Formulário de Cadastro</h1>
		<form method="post" action="IncluirProduto" >
			<div class="input-group my-2">
				<span class="input-group-text">Código</span>
				<input class="form-control" type="number" name="cod_produto" placeholder="123" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Categoria</span>
				<select class="form-select" name="cod_categoria" required>
				 	<option selected>Selecione um código</option>
					 <%
					 	CategoriaDao dao = new CategoriaDao();
					 	List<Categoria> lista = dao.listar("");
					 	for(Categoria c: lista){
					 %>
					<option value="<%= c.getCod_categoria() %>"><%= c.getCod_categoria() %></option>
					<% } %>
				</select>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Fornecedor</span>
				<select class="form-select" name="cod_fornecedor" required>
				 	<option selected>Selecione um código</option>
					 <%
					 	FornecedorDao fdao = new FornecedorDao();
					 	List<Fornecedor> listar = fdao.listar("");
					 	for(Fornecedor f: listar){
					 %>
					<option value="<%= f.getCod_fornecedor() %>"><%= f.getCod_fornecedor() %></option>
					<% } %>
				</select>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Nome</span>
				<input class="form-control" type="text" name="nome" placeholder="Camisa" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Descrição</span>
				<input class="form-control" type="text" name="descricao" placeholder="Camisa oficial do Flamengo modelo azul" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Detalhes</span>
				<input class="form-control" type="text" name="detalhes" placeholder="A nova camisa 2022 azul do Flamengo" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Marca</span>
				<input class="form-control" type="text" name="marca" placeholder="CRF" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Imagem</span>
				<input class="form-control" type="text" name="imagem" placeholder="exemplo.jpg" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Miniatura</span>
				<input class="form-control" type="text" name="miniatura" placeholder="Miniatura" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Unidade</span>
				<input class="form-control" type="number" name="unidade" placeholder="1" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Valor Unitário</span>
				<input class="form-control" type="number" name="valor_unit" placeholder="120,00" step="0.01" required>
			</div>
			<div class="input-group my-2">
				<span class="input-group-text">Estoque</span>
				<input class="form-control" type="number" name="valor_unit" placeholder="100" required>
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