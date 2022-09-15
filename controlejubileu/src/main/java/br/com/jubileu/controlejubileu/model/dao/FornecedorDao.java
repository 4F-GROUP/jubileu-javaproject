package br.com.jubileu.controlejubileu.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.jubileu.controlejubileu.model.entidade.Fornecedor;

public class FornecedorDao extends Conexao{
	public boolean incluir(Fornecedor fornecedor) {
		boolean ok = false;
		String sql = "insert into fornecedor (cod_fornecedor, razao_social, nome_fantasia, cnpj, endereco, numero, complemento, bairro, cep, cidade, estado, telefone) values (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, fornecedor.getCod_fornecedor());
			ps.setString(2, fornecedor.getRazao_social());
			ps.setString(3, fornecedor.getNome_fantasia());
			ps.setLong(4, fornecedor.getCnpj());
			ps.setString(5, fornecedor.getEndereco());
			ps.setLong(6, fornecedor.getNumero());
			ps.setString(7, fornecedor.getComplemento());
			ps.setString(8, fornecedor.getBairro());
			ps.setLong(9, fornecedor.getCep());
			ps.setString(10, fornecedor.getCidade());
			ps.setString(11, fornecedor.getEstado());
			ps.setString(12, fornecedor.getTelefone());
			ok = ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
			ok = false;
		} finally {
			fecharConexao();
		}
		return ok;
	}
	
	public List<Fornecedor> listar(String nomeBusca){
		ArrayList<Fornecedor> lista = new ArrayList<Fornecedor>();
		String sql = "select * from fornecedor where cod_fornecedor like ? order by cod_fornecedor";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, "%"+nomeBusca+"%");
			ResultSet rs = ps.executeQuery();
			Fornecedor f;
			while(rs.next()) {
				f = new Fornecedor();
				f.setCod_fornecedor(rs.getLong("cod_fornecedor"));
				f.setRazao_social(rs.getString("razao_social"));
				f.setNome_fantasia(rs.getString("nome_fantasia"));;
				f.setCnpj(rs.getLong("cnpj"));
				f.setEndereco(rs.getString("endereco"));
				f.setNumero(rs.getLong("numero"));
				f.setComplemento(rs.getString("complemento"));
				f.setBairro(rs.getString("bairro"));
				f.setCep(rs.getLong("cep"));
				f.setCidade(rs.getString("cidade"));
				f.setEstado(rs.getString("estado"));
				f.setTelefone(rs.getString("telefone"));
				lista.add(f);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return lista;
	}
	
	public Fornecedor buscar(long id) {
		Fornecedor f = null;
		String sql = "select * from fornecedor where cod_fornecedor = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				f = new Fornecedor();
				f.setCod_fornecedor(rs.getLong("cod_fornecedor"));
				f.setRazao_social(rs.getString("razao_social"));
				f.setNome_fantasia(rs.getString("nome_fantasia"));;
				f.setCnpj(rs.getLong("cnpj"));
				f.setEndereco(rs.getString("endereco"));
				f.setNumero(rs.getLong("numero"));
				f.setComplemento(rs.getString("complemento"));
				f.setBairro(rs.getString("bairro"));
				f.setCep(rs.getLong("cep"));
				f.setCidade(rs.getString("cidade"));
				f.setEstado(rs.getString("estado"));
				f.setTelefone(rs.getString("telefone"));
			}
;		} catch(Exception e){
			e.printStackTrace();
		} finally {
			fecharConexao();
		}
		return f;
	}
	
	public boolean alterar(Fornecedor f) {
		boolean ok = true;
		String sql = "update loja set razao_social = ?, nome_fantasia = ?, cnpj = ?, endereco = ?, numero = ?, complemento = ?, bairro = ?, cep = ?, cidade = ?, estado = ? where cod_fornecedor = ?";
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setLong(1, f.getCod_fornecedor());
			ps.setString(2, f.getRazao_social());
			ps.setString(3, f.getNome_fantasia());
			ps.setLong(4, f.getCnpj());
			ps.setString(5, f.getEndereco());
			ps.setLong(6, f.getNumero());
			ps.setString(7, f.getComplemento());
			ps.setString(8, f.getBairro());
			ps.setLong(9, f.getCep());
			ps.setString(10, f.getCidade());
			ps.setString(11, f.getEstado());
			ps.setString(12, f.getTelefone());
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
		String sql = "delete from fornecedor where cod_fornecedor = ?";
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
