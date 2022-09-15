package br.com.jubileu.controlejubileu.controller;

import java.io.IOException;

import br.com.jubileu.controlejubileu.model.dao.ClienteDao;
import br.com.jubileu.controlejubileu.model.entidade.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IncluirCliente
 */
public class IncluirCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IncluirCliente() {
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
		Long cod_cliente = Long.parseLong(request.getParameter("cod_cliente"));
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		Long numero = Long.parseLong(request.getParameter("numero"));
		String complemento = request.getParameter("complemento");
		String bairro = request.getParameter("bairro");
		Long cep = Long.parseLong(request.getParameter("cep"));
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String telefone = request.getParameter("telefone");
		String email = request.getParameter("email");
		Long cpf = Long.parseLong(request.getParameter("cpf"));
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Cliente c = new Cliente();
		c.setCod_cliente(cod_cliente);
		c.setNome(nome);
		c.setEndereco(endereco);
		c.setNumero(numero);
		c.setComplemento(complemento);
		c.setBairro(bairro);
		c.setCep(cep);
		c.setCidade(cidade);
		c.setEstado(estado);
		c.setTelefone(telefone);
		c.setEmail(email);
		c.setCpf(cpf);
		c.setLogin(login);
		c.setSenha(senha);
		
		ClienteDao dao = new ClienteDao();
		boolean retorno = dao.incluir(c);
		response.sendRedirect("lista_cliente.jsp");
	}

}
