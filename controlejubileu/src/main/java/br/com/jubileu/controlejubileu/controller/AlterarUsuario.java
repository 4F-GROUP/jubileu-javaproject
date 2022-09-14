package br.com.jubileu.controlejubileu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.UsuarioDao;
import br.com.jubileu.controlejubileu.model.entidade.Usuario;

/**
 * Servlet implementation class AlterarUsuario
 */
public class AlterarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long cod_usuario = Long.parseLong(request.getParameter("id"));
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		
		Usuario u = new Usuario();
		u.setCod_usuario(cod_usuario);
		u.setLogin(login);
		u.setSenha(senha);
		u.setNome(nome);
		u.setEmail(email);
		
		UsuarioDao dao = new UsuarioDao();
		boolean retorno = dao.alterar(u);
		response.sendRedirect("lista_usuario.jsp");
	}

}
