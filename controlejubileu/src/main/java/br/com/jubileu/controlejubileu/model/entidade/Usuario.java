package br.com.jubileu.controlejubileu.model.entidade;

public class Usuario {
	private long cod_usuario;
	private String login;
	private String senha;
	private String nome;
	private String email;
	
	public Usuario() {
		super();
		this.cod_usuario = 0;
		this.login = "";
		this.senha = "";
		this.nome = "";
		this.email = "";
	}
	
	public Usuario(long cod_usuario, String login, String senha, String nome, String email) {
		super();
		this.cod_usuario = cod_usuario;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
	}

	public long getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(long cod_usuario) {
		this.cod_usuario = cod_usuario;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}