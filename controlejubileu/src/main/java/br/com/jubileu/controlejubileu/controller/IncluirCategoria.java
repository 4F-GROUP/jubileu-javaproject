package br.com.jubileu.controlejubileu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.CategoriaDao;
import br.com.jubileu.controlejubileu.model.entidade.Categoria;

/**
 * Servlet implementation class IncluirCategoria
 */
public class IncluirCategoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirCategoria() {
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
		Long cod_categoria = Long.parseLong(request.getParameter("cod_categoria"));
		String nome = request.getParameter("nome");
		Long cod_categoriapai = Long.parseLong(request.getParameter("cod_categoriapai"));
		
		Categoria c =  new Categoria();
		c.setCod_categoria(cod_categoria);
		c.setNome(nome);
		c.setCod_categoriapai(cod_categoriapai);
		
		CategoriaDao dao = new CategoriaDao();
		boolean retorno = dao.incluir(c);
		response.sendRedirect("lista_categoria.jsp");
	}

}
