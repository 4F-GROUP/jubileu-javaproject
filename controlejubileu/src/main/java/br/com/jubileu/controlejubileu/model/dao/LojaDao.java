package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Loja;

public class LojaDao extends Conexao{
	
	public boolean incluir(Loja loja) {
		boolean ok = false;
		String sql = "insert into loja (cnpj, id, nome, telefone, email, endereco, numero, complemento, bairro, cidade, estado) values (?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, loja.getCnpj());
			ps.setLong(2, loja.getId());
			ps.setString(3, loja.getNome());
			ps.setString(4, loja.getTelefone());
			ps.setString(5, loja.getEmail());
			ps.setString(6, loja.getEndereco());
			ps.setLong(7, loja.getNumero());
			ps.setString(8, loja.getComplemento());
			ps.setString(9, loja.getBairro());
			ps.setString(10, loja.getCidade());
			ps.setString(11, loja.getEstado());
			ok = ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Loja> listar(String nomeBusca){
		ArrayList<Loja> lista = new ArrayList<Loja>();
		String sql = "select * from loja where cnpj like ? order by cnpj";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ResultSet rs = ps.executeQuery();
			Loja l;
			while(rs.next()) {
				l = new Loja();
				l.setCnpj(rs.getLong("cnpj"));
				l.setId(rs.getLong("id"));
				l.setNome(rs.getString("nome"));
				l.setTelefone(rs.getString("telefone"));
				l.setEmail(rs.getString("email"));
				l.setEndereco(rs.getString("endereco"));
				l.setNumero(rs.getLong("numero"));
				l.setComplemento(rs.getString("complemento"));
				l.setBairro(rs.getString("bairro"));
				l.setCidade(rs.getString("cidade"));
				l.setEstado(rs.getString("estado"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return lista;
	}
	
	public Loja buscar(long id) {
		Loja l = null;
		String sql = "select * from loja where cnpj = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				l = new Loja();
				l.setCnpj(rs.getLong("cnpj"));
				l.setId(rs.getLong("id"));
				l.setNome(rs.getString("nome"));
				l.setTelefone(rs.getString("telefone"));
				l.setEmail(rs.getString("email"));
				l.setEndereco(rs.getString("endereco"));
				l.setNumero(rs.getLong("numero"));
				l.setComplemento(rs.getString("complemento"));
				l.setBairro(rs.getString("bairro"));
				l.setCidade(rs.getString("cidade"));
				l.setEstado(rs.getString("estado"));
			}
;		} catch(Exception e){
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return l;
	}
	
	public boolean alterar(Loja l) {
		boolean ok = true;
		String sql = "update loja set cnpj = ?, nome = ?, telefone = ?, email = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, cidade = ?, estado = ? where id = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, l.getCnpj());
			ps.setLong(2, l.getId());
			ps.setString(3, l.getNome());
			ps.setString(4, l.getTelefone());
			ps.setString(5, l.getEmail());
			ps.setString(6, l.getEndereco());
			ps.setLong(7, l.getNumero());
			ps.setString(8, l.getComplemento());
			ps.setString(9, l.getBairro());
			ps.setString(10, l.getCidade());
			ps.setString(11, l.getEstado());
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
		String sql = "delete from loja where id = ?";
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
