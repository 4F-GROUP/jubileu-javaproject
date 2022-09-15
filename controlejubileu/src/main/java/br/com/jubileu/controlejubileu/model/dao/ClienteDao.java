package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Cliente;
import br.com.jubileu.controlejubileu.model.entidade.Usuario;

public class ClienteDao extends Conexao{
	
	public boolean incluir(Cliente cliente) {
		boolean ok = false;
		String sql = "insert into cliente (cod_cliente, nome, endereco, numero, complemento, bairro, cep, cidade, estado, telefone, email, cpf, login, senha) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, cliente.getCod_cliente());
			ps.setString(2, cliente.getNome());
			ps.setString(3, cliente.getEndereco());
			ps.setLong(4, cliente.getNumero());
			ps.setString(5, cliente.getComplemento()); 
			ps.setString(6, cliente.getBairro()); 
			ps.setLong(7, cliente.getCep()); 
			ps.setString(8, cliente.getCidade()); 
			ps.setString(9, cliente.getEstado()); 
			ps.setString(10, cliente.getTelefone()); 
			ps.setString(11, cliente.getEmail());
			ps.setLong(12, cliente.getCpf()); 
			ps.setString(13, cliente.getLogin());
			ps.setString(14, cliente.getSenha());
			ok = ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Cliente> listar(String nomeBusca){
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		String sql = "select * from cliente where cod_cliente like ? order by cod_cliente";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ResultSet rs = ps.executeQuery();
			Cliente c;
			while(rs.next()) {
				c = new Cliente();
				c.setCod_cliente(rs.getLong("cod_cliente"));
				c.setNome(rs.getString("nome"));
				c.setEndereco(rs.getString("endereco"));
				c.setNumero(rs.getLong("numero"));
				c.setComplemento(rs.getString("complemento"));
				c.setBairro(rs.getString("bairro"));
				c.setCep(rs.getLong("cep"));
				c.setCidade(rs.getString("cidade"));
				c.setEstado(rs.getString("estado"));
				c.setTelefone(rs.getString("telefone"));
				c.setEmail(rs.getString("email"));
				c.setCpf(rs.getLong("cpf"));
				c.setLogin(rs.getString("login"));
				c.setSenha(rs.getString("senha"));
				lista.add(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return lista;
	}
	
	public Cliente buscar(long id) {
		Cliente c = null;
		String sql = "select * from cliente where cod_cliente = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				c = new Cliente();
				c.setCod_cliente(rs.getLong("cod_cliente"));
				c.setNome(rs.getString("nome"));
				c.setEndereco(rs.getString("endereco"));
				c.setNumero(rs.getLong("numero"));
				c.setComplemento(rs.getString("complemento"));
				c.setBairro(rs.getString("bairro"));
				c.setCep(rs.getLong("cep"));
				c.setCidade(rs.getString("cidade"));
				c.setEstado(rs.getString("estado"));
				c.setTelefone(rs.getString("telefone"));
				c.setEmail(rs.getString("email"));
				c.setCpf(rs.getLong("cpf"));
				c.setLogin(rs.getString("login"));
				c.setSenha(rs.getString("senha"));
			}
;		} catch(Exception e){
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return c;
	}
	
	public boolean alterar(Cliente c) {
		boolean ok = true;
		String sql = "update cliente set nome = ?, endereco =?, numero =?, complemento = ?, bairro = ?, cep =?, cidade = ?, estado = ?, telefone = ?, email = ?, cpf = ?, login = ?, senha = ? where cod_cliente = ?"; 
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, c.getCod_cliente());
			ps.setString(2, c.getNome());
			ps.setString(3, c.getEndereco());
			ps.setLong(4, c.getNumero());
			ps.setString(5, c.getComplemento()); 
			ps.setString(6, c.getBairro()); 
			ps.setLong(7, c.getCep()); 
			ps.setString(8, c.getCidade()); 
			ps.setString(9, c.getEstado()); 
			ps.setString(10, c.getTelefone()); 
			ps.setString(11, c.getEmail());
			ps.setLong(12, c.getCpf()); 
			ps.setString(13, c.getLogin());
			ps.setString(14, c.getSenha());
			ps.execute();
		} catch(Exception e) {
			e.printStackTrace();
			ok = false;
		}finally {
			fecharConexao();
		}
		return ok;
	}
	
	public boolean excluir(long id) {
		boolean ok = true;
		String sql = "delete from cliente where cod_cliente = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, id);
			ok = ps.execute();
		} catch(Exception e) {
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
}
