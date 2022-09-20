package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Produto;

public class ProdutoDao extends Conexao {
	
	public boolean incluir (Produto produto) {
		boolean ok = false;
		String sql = "insert into produto (cod_produto, nome, descricao, detalhes, marca, imagem, miniatura, unidade, valor_unit, estoque) values (?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, produto.getCod_produto());
			ps.setString(2, produto.getNome());
			ps.setString(3, produto.getDescricao());
			ps.setString(4, produto.getDetalhes());
			ps.setString(5, produto.getMarca());
			ps.setString(6, produto.getImagem());
			ps.setString(7, produto.getMiniatura());
			ps.setLong(8, produto.getUnidade());
			ps.setDouble(9, produto.getValor_unit());
			ps.setLong(10, produto.getEstoque());
			ok= ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Produto> listar(String nomeBusca){
		List<Produto> lista = new ArrayList<Produto>();
		String sql = "select * from produto where cod_produto like ? order by cod_produto";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ResultSet rs = ps.executeQuery();
			Produto p;
			while(rs.next()) {
				p = new Produto();
				p.setCod_produto(rs.getLong("cod_produto"));
				p.setNome(rs.getString("nome"));
				p.setDescricao(rs.getString("descricao"));
				p.setDetalhes(rs.getString("detalhes"));
				p.setMarca(rs.getString("marca"));
				p.setImagem(rs.getString("imagem"));
				p.setMiniatura(rs.getString("miniatura"));
				p.setUnidade(rs.getLong("unidade"));
				p.setValor_unit(rs.getDouble("valor_unit"));
				p.setEstoque(rs.getLong("estoque"));
				lista.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return lista;
	}
	
	public Produto buscar (long id) {
		Produto p = null;
		String sql = "select * from produto where cod_produto = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p = new Produto();
				p.setCod_produto(rs.getLong("cod_produto"));
				p.setNome(rs.getString("nome"));
				p.setDescricao(rs.getString("descricao"));
				p.setDetalhes(rs.getString("detalhes"));
				p.setMarca(rs.getString("marca"));
				p.setImagem(rs.getString("imagem"));
				p.setMiniatura(rs.getString("miniatura"));
				p.setUnidade(rs.getLong("unidade"));
				p.setValor_unit(rs.getDouble("valor_unit"));
				p.setEstoque(rs.getLong("estoque"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return p;
	}
	
	public boolean alterar (Produto p) {
		boolean ok = true;
		String sql = "update produto set nome = ?, descricao = ?, detalhes = ?, marca = ?, imagem = ?, miniatura = ?, unidade = ?, valor_unit = ?, estoque = ? where cod_produto = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, p.getNome());
			ps.setString(2, p.getDescricao());
			ps.setString(3, p.getDetalhes());
			ps.setString(4, p.getMarca());
			ps.setString(5, p.getImagem());
			ps.setString(6, p.getMiniatura());
			ps.setLong(7, p.getUnidade());
			ps.setDouble(8, p.getValor_unit());
			ps.setLong(9, p.getEstoque());
			ps.setLong(10, p.getCod_produto());
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public boolean excluir(long id) {
		boolean ok = true;
		String sql = "delete from produto where cod_produto = ?";
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