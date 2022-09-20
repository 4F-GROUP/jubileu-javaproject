package br.com.jubileu.controlejubileu.controller;

import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.ProdutoDao;
import br.com.jubileu.controlejubileu.model.entidade.Produto;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlterarProduto
 */
public class AlterarProduto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarProduto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Long cod_produto = Long.parseLong(request.getParameter("id")); 
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		String detalhes = request.getParameter("detalhes");
		String marca = request.getParameter("marca");
		String imagem = request.getParameter("imagem");
		String miniatura = request.getParameter("miniatura");
		Long unidade = Long.parseLong(request.getParameter("unidade"));
		Double valor_unit = Double.parseDouble(request.getParameter("valor_unit"));
		Long estoque = Long.parseLong(request.getParameter("estoque"));
		
		Produto p = new Produto();
		p.setCod_produto(cod_produto);
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
		boolean retorn = dao.alterar(p);
		response.sendRedirect("lista_produto.jsp");
	}

}
