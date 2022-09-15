package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Cliente;
import br.com.jubileu.controlejubileu.model.entidade.Pedido;

public class PedidoDao extends Conexao{
	public boolean incluir(Pedido pedido) {
		boolean ok = false;
		String sql = "insert into pedido (cod_pedido, cod_cliente, data, qtd_itens, valor_total, valor_frete, status) values (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, pedido.getCod_pedido());
			ps.setLong(2,pedido.getCod_cliente().getCod_cliente());
			ps.setDate(3, new java.sql.Date(pedido.getData().getTime()));
			ps.setLong(4, pedido.getQtd_itens());
			ps.setDouble(5, pedido.getValor_total());
			ps.setDouble(6, pedido.getValor_frete());
			ps.setString(7, pedido.getStatus());
		} catch(Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Pedido> listar() {
		List<Pedido> pedido = new ArrayList<Pedido>();
		String sql = "select p.*, c.cod_cliente as cod_cliente from pedido p inner join cliente c on c.cod_cliente = p.cod_cliente order by p.cod_pedido";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			Pedido p = null;
			Cliente c = null;
			while(rs.next()) {
				p = new Pedido();
				p.setCod_pedido(rs.getLong("pedido"));
				c = new Cliente();
				c.setCod_cliente(rs.getLong("cod_cliente"));
				p.setCod_cliente(c);
				p.setData(rs.getDate("data"));
				p.setQtd_itens(rs.getLong("qtd_itens"));
				p.setValor_total(rs.getDouble("valor_total"));
				p.setValor_frete(rs.getDouble("valor_frete"));
				p.setStatus(rs.getString("status"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fecharConexao();
		}
		return pedido;
	}
	
	public Pedido buscar(long id) {
		Pedido p = null;
		Cliente c = null;
		String sql = "select * from pedido  where cod_pedido = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1,id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				 p= new Pedido();
				 p.setCod_pedido(rs.getLong("cod_pedido"));
				 c = new Cliente();
				 c.setCod_cliente(rs.getLong("cod_cliente"));
				 p.setCod_cliente(c);
				 p.setData(rs.getDate("data"));
				 p.setQtd_itens(rs.getLong("qtd_itens"));
				 p.setValor_total(rs.getDouble("valor_total"));
				 p.setValor_frete(rs.getDouble("valor_frete"));
				 p.setStatus(rs.getString("status"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return p;
	}
	
	public boolean excluir(long id) {
		boolean ok = true;
		String sql = "delete from pedido where cod_pedido = ?";
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
