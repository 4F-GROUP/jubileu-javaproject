package br.com.jubileu.controlejubileu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.FornecedorDao;
import br.com.jubileu.controlejubileu.model.entidade.Fornecedor;

/**
 * Servlet implementation class AlterarFornecedor
 */
public class AlterarFornecedor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarFornecedor() {
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
		Long cod_fornecedor= Long.parseLong(request.getParameter("id"));
		String razaoSocial = request.getParameter("razao_social");
		String nomeFantasia = request.getParameter("nome_fantasia");
		Long cnpj = Long.parseLong(request.getParameter("cnpj"));
		String endereco = request.getParameter("endereco");
		Long numero = Long.parseLong(request.getParameter("numero"));
		String complemento = request.getParameter("complemento");
		String bairro = request.getParameter("bairro");
		Long cep = Long.parseLong(request.getParameter("cep"));
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String telefone = request.getParameter("telefone");
		
		
		Fornecedor f = new Fornecedor();
		f.setCod_fornecedor(cod_fornecedor);
		f.setRazao_social(razaoSocial);
		f.setNome_fantasia(nomeFantasia);
		f.setCnpj(cnpj);
		f.setEndereco(endereco);
		f.setNumero(numero);
		f.setComplemento(complemento);
		f.setBairro(bairro);
		f.setCep(cep);
		f.setCidade(cidade);
		f.setEstado(estado);
		f.setTelefone(telefone);
		
		FornecedorDao dao = new FornecedorDao();
		boolean retorno = dao.alterar(f);
		response.sendRedirect("lista_fornecedor.jsp");
	}

}
