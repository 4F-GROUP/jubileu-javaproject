package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Usuario;

public class UsuarioDao extends Conexao{
	
	public boolean incluir(Usuario usuario) {
		boolean ok = false;
		String sql = "insert into usuario (login, senha, nome, email) values (?,?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, usuario.getCod_usuario());
			ps.setString(2, usuario.getLogin());
			ps.setString(3, usuario.getSenha());
			ps.setString(4, usuario.getNome());
			ps.setString(5, usuario.getEmail());
			ok = ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Usuario> listar(String nomeBusca){
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		String sql = "select * from usuario where nome like ? order by nome";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ResultSet rs = ps.executeQuery();
			Usuario u;
			while(rs.next()) {
				u = new Usuario();
				u.setCod_usuario(rs.getLong("cod_usuario"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setNome(rs.getString("nome"));
				u.setEmail(rs.getString("email"));
				lista.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return lista;
	}
	
	public Usuario buscar(long cod_usuario) {
		Usuario u = null;
		String sql = "select * from usuario where cod_usuario = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, cod_usuario);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				u = new Usuario();
				u.setCod_usuario(rs.getLong("cod_usuario"));
				u.setLogin(rs.getString("login"));
				u.setSenha(rs.getString("senha"));
				u.setNome(rs.getString("nome"));
				u.setEmail(rs.getString("email"));
			}
;		} catch(Exception e){
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return u;
	}
	
	public boolean alterar(Usuario u) {
		boolean ok = true;
		String sql = "update usuario set login = ?, senha = ?, nome = ? , email = ? where cod_usuario = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, u.getCod_usuario());
			ps.setString(2, u.getLogin());
			ps.setString(3, u.getSenha());
			ps.setString(4, u.getNome());
			ps.setString(5, u.getEmail());
			ps.execute();
		} catch(Exception e) {
			e.printStackTrace();
			ok = false;
		}finally {
			fecharConexao();
		}
		return ok;
	}
	
	public boolean excluir(long cod_usuario) {
		boolean ok = true;
		String sql = "delete from usuario where cod_usuario = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, cod_usuario);
			ok = ps.execute();
		} catch(Exception e) {
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
}