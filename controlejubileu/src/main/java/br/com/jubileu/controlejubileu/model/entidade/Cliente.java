package br.com.jubileu.controlejubileu.model.entidade;

public class Cliente {
	private long cod_cliente;
	private String nome;
	private String endereco;
	private long numero;
	private String complemento;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	private String telefone;
	private String email;
	private long cpf;
	private String login;
	private String senha;
	
	public Cliente() {
		super();
		this.cod_cliente = 0;
		this.nome = "";
		this.endereco = "";
		this.numero = 0;
		this.complemento = "";
		this.bairro = "";
		this.cep = 0;
		this.cidade = "";
		this.estado = "";
		this.telefone = "";
		this.email = "";
		this.cpf = 0;
		this.login = "";
		this.senha = "";
	}

	public Cliente(long cod_cliente, String nome, String endereco, long numero, String complemento, String bairro,
			long cep, String cidade, String estado, String telefone, String email, long cpf, String login,
			String senha) {
		super();
		this.cod_cliente = cod_cliente;
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.login = login;
		this.senha = senha;
	}

	public long getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(long cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}