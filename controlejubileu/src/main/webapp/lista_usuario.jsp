<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.UsuarioDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Usuario" %>
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
				<a href="index.jsp" class="btn btn-danger text-decoration none link-light col align-self-start">Voltar a página anterior</a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="#" class=" col align-self-center"></a>
				<a href="incluir_usuario.jsp" class="btn btn-danger text-decoration none link-light col align-self-end">Cadastro de Usuários</a>
			</div>
		<h1 class="display-5 my-2">Consultar os Usuários</h1>
		<%
			String nomeBusca = "";
			if(request.getParameter("nomeBusca")!= null){
				nomeBusca = request.getParameter("nomeBusca");
			}
		%>
		<div class="my-3">
			<form method="post" action="lista_usuario.jsp" class="row g-3">
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
					<th>Login</th>
					<th>Senha</th>
					<th>Nome</th>
					<th>Email</th>
					<th>Ações</th>
				</tr>
			</thead>
			<tbody>
			<%
				UsuarioDao dao = new UsuarioDao();
				List<Usuario> usuario = dao.listar(nomeBusca);
				for (Usuario u: usuario){
			%>
				<tr>
					<td><%= u.getCod_usuario() %></td>
					<td><%= u.getLogin() %></td>
					<td><%= u.getSenha() %></td>
					<td><%= u.getNome() %></td>
					<td><%= u.getEmail() %></td>
					<td>
						<a  class="btn btn-danger btn-sm text-decoration none link-light" href="IniciarAlterarUsuario?id=<%= u.getCod_usuario()%>">Alterar</a> 
						<a   class="btn btn-danger btn-sm text-decoration none link-light" href="ExcluirUsuario?id=<%= u.getCod_usuario()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
					</td>
				</tr>
				<% } %>
			</tbody>
		</table>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>