package br.com.jubileu.controlejubileu.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.FornecedorDao;
import br.com.jubileu.controlejubileu.model.entidade.Fornecedor;

/**
 * Servlet implementation class IniciarAlterarFornecedor
 */
public class IniciarAlterarFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarAlterarFornecedor() {
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
		
		FornecedorDao dao = new FornecedorDao();
		Fornecedor f = dao.buscar(id);
		request.setAttribute("fornecedor", f);
		RequestDispatcher rd = request.getRequestDispatcher("editar_fornecedor.jsp");
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
