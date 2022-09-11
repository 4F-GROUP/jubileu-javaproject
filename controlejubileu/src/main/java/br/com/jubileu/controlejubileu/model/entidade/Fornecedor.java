package br.com.jubileu.controlejubileu.model.entidade;

public class Fornecedor {
	private long cod_fornecedor;
	private String razao_social;
	private String nome_fantasia;
	private long cnpj;
	private String endereco;
	private long numero;
	private String complemento;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	private String telefone;
	
	public Fornecedor() {
		super();
		this.cod_fornecedor = 0;
		this.razao_social = "";
		this.nome_fantasia = "";
		this.cnpj = 0;
		this.endereco = "";
		this.numero = 0;
		this.complemento = "";
		this.bairro = "";
		this.cep = 0;
		this.cidade = "";
		this.estado = "";
		this.telefone = "";
	}

	public Fornecedor(long cod_fornecedor, String razao_social, String nome_fantasia, long cnpj, String endereco,
			long numero, String complemento, String bairro, long cep, String cidade, String estado, String telefone) {
		super();
		this.cod_fornecedor = cod_fornecedor;
		this.razao_social = razao_social;
		this.nome_fantasia = nome_fantasia;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
	}

	public long getCod_fornecedor() {
		return cod_fornecedor;
	}

	public void setCod_fornecedor(long cod_fornecedor) {
		this.cod_fornecedor = cod_fornecedor;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNome_fantasia() {
		return nome_fantasia;
	}

	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}