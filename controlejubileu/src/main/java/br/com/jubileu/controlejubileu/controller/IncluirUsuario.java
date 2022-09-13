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
 * Servlet implementation class IncluirUsuario
 */
public class IncluirUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirUsuario() {
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
		String login = request.getParameter("login_usuario");
		String senha = request.getParameter("senha_usuario");
		String nome = request.getParameter("nome_usuario");
		String email = request.getParameter("email_usuario");
		
		Usuario u = new Usuario();
		u.setLogin(login);
		u.setSenha(senha);
		u.setNome(nome);
		u.setEmail(email);
		
		UsuarioDao dao = new UsuarioDao();
		boolean retorno = dao.incluir(u);
		response.sendRedirect("lista_usuario.jsp");
	}

}
