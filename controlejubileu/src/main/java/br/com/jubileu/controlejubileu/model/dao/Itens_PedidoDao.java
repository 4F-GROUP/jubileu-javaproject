package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;

public class Itens_PedidoDao extends Conexao{
	
	public boolean excluir(long id) {
		boolean ok = true;
		String sql = "delete from pedido_itens where cod_pedido = ?";
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
