package br.com.jubileu.controlejubileu.model.entidade;

public class Loja {
	private long id;
	private long cnpj;
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	private long numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Loja() {
		super();
		this.id = 0;
		this.cnpj = 0;
		this.nome = "";
		this.telefone = "";
		this.email = "";
		this.endereco = "";
		this.numero = 0;
		this.complemento = "";
		this.bairro = "";
		this.cidade = "";
		this.estado = "";
	}

	public Loja(long id, long cnpj, String nome, String telefone, String email, String endereco, long numero,
			String complemento, String bairro, String cidade, String estado) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
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
}