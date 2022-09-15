package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Categoria;
import br.com.jubileu.controlejubileu.model.entidade.Fornecedor;
import br.com.jubileu.controlejubileu.model.entidade.Produto;

public class ProdutoDao extends Conexao {
	public boolean incluir (Produto produto) {
		boolean ok = false;
		String sql = "insert into produto (cod_produto, cod_categoria, cod_fornecedor, nome, descricao, detalhes, marca, imagem, miniatura, unidade, valor_unit, estoque) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, produto.getCod_produto());
			ps.setLong(2, produto.getCod_categoria().getCod_categoria());
			ps.setLong(3, produto.getCod_fornecedor().getCod_fornecedor());
			ps.setString(4, produto.getNome());
			ps.setString(5, produto.getDescricao());
			ps.setString(6, produto.getDetalhes());
			ps.setString(7, produto.getMarca());
			ps.setString(8, produto.getImagem());
			ps.setString(9, produto.getMiniatura());
			ps.setLong(10, produto.getUnidade());
			ps.setDouble(11, produto.getValor_unit());
			ps.setLong(12, produto.getEstoque());
			ok= ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Produto> listar(){
		List<Produto> produto = new ArrayList<Produto>();
		String sql = "select p.*, c.cod_categoria as cod_categoria, f.cod_fornecedor as cod_fornecedor from produto p inner join categoria c on c.cod_categoria = p.cod_categoria inner join fornecedor f on f.cod_fornecedor = p.cod_fornecedor order by p.cod_produto";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Produto p = null;
			Categoria c = null;
			Fornecedor f = null;
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
				
				c = new Categoria();
				c.setCod_categoria(rs.getLong("cod_categoria"));
				p.setCod_categoria(c);
				
				f = new Fornecedor();
				f.setCod_fornecedor(rs.getLong("cod_fornecedor"));
				p.setCod_fornecedor(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return produto;
	}
	
	public Produto buscar (long id) {
		Produto p = null;
		Categoria c = null;
		Fornecedor f = null;
		String sql = "select * from produto where cod_produto = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				p = new Produto();
				p.setCod_produto(rs.getLong("cod_produto"));
				c = new Categoria();
				c.setCod_categoria(rs.getLong("cod_categoria"));
				p.setCod_categoria(c);
				f = new Fornecedor();
				f.setCod_fornecedor(rs.getLong("cod_fornecedor"));
				p.setCod_fornecedor(f);
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
			
		} finally {
			fecharConexao();
		}
		return p;
	}
	
	public boolean alterar (Produto p) {
		boolean ok = true;
		String sql = "";
		try {
			
		} catch (Exception e) {
			
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