package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Categoria;

public class CategoriaDao extends Conexao{
	
	public boolean incluir(Categoria categoria) {
		boolean ok = false;
		String sql = "insert into categoria (cod_categoria, nome, cod_categoriapai) values (?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, categoria.getCod_categoria());
			ps.setString(2, categoria.getNome());
			ps.setLong(3, categoria.getCod_categoriapai());
			ok = ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Categoria> listar(String nomeBusca){
		ArrayList<Categoria> lista = new ArrayList<Categoria>();
		String sql = "select * from categoria where cod_categoria like ? order by cod_categoria";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ResultSet rs = ps.executeQuery();
			Categoria c;
			while(rs.next()) {
				c = new Categoria();
				c.setCod_categoria(rs.getLong("cod_categoria"));
				c.setNome(rs.getString("login"));
				c.setCod_categoriapai(rs.getLong("cod_categoriapai"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return lista;
	}
	
	public Categoria buscar(long id) {
		Categoria c = null;
		String sql = "select * from categoria where cod_categoria = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				c = new Categoria();
				c.setCod_categoria(rs.getLong("cod_categoria"));
				c.setNome(rs.getString("nome"));
				c.setCod_categoriapai(rs.getLong("cod_categoriapai"));
			}
;		} catch(Exception e){
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return c;
	}
	
	public boolean alterar(Categoria c) {
		boolean ok = true;
		String sql = "update categoria set nome = ?, cod_categoriapai = ?  where cod_categoriapai = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, c.getCod_categoria());
			ps.setString(4, c.getNome());
			ps.setLong(5, c.getCod_categoriapai());
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
		String sql = "delete from categoria where cod_categoria = ?";
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
