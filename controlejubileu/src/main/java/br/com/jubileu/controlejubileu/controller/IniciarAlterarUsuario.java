package br.com.jubileu.controlejubileu.controller;

import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.UsuarioDao;
import br.com.jubileu.controlejubileu.model.entidade.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IniciarAlterarUsuario
 */
public class IniciarAlterarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarAlterarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		long id = 0;
		try {
			id = Long.parseLong(request.getParameter("id"));
		} catch (Exception e) {
			
		}
		
		UsuarioDao dao = new UsuarioDao();
		Usuario u = dao.buscar(id);
		request.setAttribute("usuario", u);
		RequestDispatcher rd = request.getRequestDispatcher("editar_usuario.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
