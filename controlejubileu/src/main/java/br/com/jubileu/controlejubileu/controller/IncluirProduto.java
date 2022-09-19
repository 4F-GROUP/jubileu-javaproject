package br.com.jubileu.controlejubileu.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.ProdutoDao;
import br.com.jubileu.controlejubileu.model.entidade.Categoria;
import br.com.jubileu.controlejubileu.model.entidade.Fornecedor;
import br.com.jubileu.controlejubileu.model.entidade.Produto;

/**
 * Servlet implementation class IncluirProduto
 */
public class IncluirProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirProduto() {
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
		Long cod_produto = Long.parseLong(request.getParameter("cod_produto")); 
		String cod_categoria = request.getParameter("cod_categoria");
		String cod_fornecedor = request.getParameter("cod_fornecedor");
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String detalhes = request.getParameter("detalhes");
		String marca = request.getParameter("detalhes");
		String imagem = request.getParameter("imagem");
		String miniatura = request.getParameter("miniatura");
		Long unidade = Long.parseLong(request.getParameter("unidade"));
		Double valor_unit = Double.parseDouble(request.getParameter("valor_unit"));
		Long estoque = Long.parseLong(request.getParameter("estoque"));
		
		Categoria c = new Categoria();
		try {
			c.setCod_categoria(Long.parseLong(cod_categoria));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Fornecedor f = new Fornecedor();
		try {
			f.setCod_fornecedor(Long.parseLong(cod_fornecedor));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Produto p = new Produto();
		p.setCod_produto(cod_produto);
		p.setCod_categoria(c);
		p.setCod_fornecedor(f);
		p.setNome(nome);
		p.setDescricao(descricao);
		p.setDetalhes(detalhes);
		p.setMarca(marca);
		p.setImagem(imagem);
		p.setMiniatura(miniatura);
		p.setUnidade(unidade);
		p.setValor_unit(valor_unit);
		p.setEstoque(estoque);
		
		ProdutoDao dao = new ProdutoDao();
		boolean retorno = dao.incluir(p);
		response.sendRedirect("lista_produto.jsp");
	}

}
