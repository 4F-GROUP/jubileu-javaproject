<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.jubileu.controlejubileu.model.dao.UsuarioDao" %>
<%@ page import="br.com.jubileu.controlejubileu.model.entidade.Usuario" %>
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
	<a href="incluir_usuario.jsp">Cadastro de Usuários</a>
	<h1>Consultar os Usuários</h1>
	<%
		String nomeBusca = "";
		if(request.getParameter("nomeBusca")!= null){
			nomeBusca = request.getParameter("nomeBusca");
		}
	%>
	<form method="post" action="lista_usuario.jsp">
    	<input type="text" name="nomeBusca" value="<%=nomeBusca%>"/>
    	<input type="submit" value="Buscar"/>
	</form>
	<table>
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
					<a href="IniciarAlterarUsuario?id=<%= u.getCod_usuario()%>">Alterar</a> 
					<a href="ExcluirUsuario?id=<%= u.getCod_usuario()%>" onclick="return confirm('Deseja realmente excluir esse registro?');">Excluir</a>
				</td>
			</tr>
			<% } %>
		</tbody>
	</table>
</body>
</html>