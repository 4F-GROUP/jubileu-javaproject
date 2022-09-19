<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.ProdutoDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Produto" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.text.SimpleDateFormat" %> 
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
			<a href="incluir_produto.jsp" class="btn btn-primary text-decoration none link-light col align-self-end">Cadastro de Produtos</a>
		</div>
		<h1 class="display-5 my-2">Consultar os Produtos</h1>
		<%
			String nomeBusca = "";
			if(request.getParameter("nomeBusca")!= null){
				nomeBusca = request.getParameter("nomeBusca");
			}
		%>
		<div class="my-3">
			<form method="post" action="lista_produto.jsp" class="row g-3">
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
					<th>Categoria</th>
					<th>Fornecedor</th>
					<th>Nome</th>
					<th>Descrição</th>
					<th>Detalhes</th>
					<th>Marca</th>
					<th>Imagem</th>
					<th>Miniatura</th>
					<th>Unidade</th>
					<th>Valor Unitário</th>
					<th>Estoque</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
			<%
				ProdutoDao dao = new ProdutoDao();
				List<Produto> produto = dao.listar(nomeBusca);
				for (Produto p: produto){
			%>
				<tr>
					<td><%= p.getCod_produto() %></td>
					<td><%= p.getCod_categoria().getCod_categoria() %></td>
					<td><%= p.getCod_fornecedor().getCod_fornecedor() %></td>
					<td><%= p.getNome() %></td>
					<td><%= p.getDescricao() %></td>
					<td><%= p.getDetalhes() %></td>
					<td><%= p.getMarca() %></td>
					<td><%= p.getImagem() %></td>
					<td><%= p.getMiniatura() %></td>
					<td><%= p.getUnidade() %></td>
					<td><%= p.getValor_unit() %></td>
					<td><%= p.getEstoque() %></td>
					<td>
						<a  class="btn btn-primary btn-sm text-decoration none link-light" href="IniciarAlterarProduto?id=<%= p.getCod_produto()%>">Alterar</a> 
						<a   class="btn btn-primary btn-sm text-decoration none link-light" href="ExcluirProduto?id=<%= p.getCod_produto()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
					</td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>