package br.com.jubileu.controlejubileu.model.entidade;

public class Pedido_End {
	private long cod_pedido;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private  long cep;
	private String cidade;
	private String estado;
	private String contato;
	private String telefone;
	
	public Pedido_End() {
		super();
		this.cod_pedido = 0;
		this.endereco = "";
		this.numero = "";
		this.complemento = "";
		this.bairro = "";
		this.cep = 0;
		this.cidade = "";
		this.estado = "";
		this.contato = "";
		this.telefone = "";
	}

	public Pedido_End(long cod_pedido, String endereco, String numero, String complemento, String bairro, long cep,
			String cidade, String estado, String contato, String telefone) {
		super();
		this.cod_pedido = cod_pedido;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.contato = contato;
		this.telefone = telefone;
	}

	public long getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(long cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
}
