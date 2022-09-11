package br.com.jubileu.controlejubileu.model.entidade;

public class Categoria {
	private long cod_categoria;
	private String nome;
	private long cod_categoriapai;
	
	public Categoria() {
		super();
		this.cod_categoria = 0;
		this.nome = "";
		this.cod_categoriapai = 0;
	}

	public Categoria(long cod_categoria, String nome, long cod_categoriapai) {
		super();
		this.cod_categoria = cod_categoria;
		this.nome = nome;
		this.cod_categoriapai = cod_categoriapai;
	}

	public long getCod_categoria() {
		return cod_categoria;
	}

	public void setCod_categoria(long cod_categoria) {
		this.cod_categoria = cod_categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCod_categoriapai() {
		return cod_categoriapai;
	}

	public void setCod_categoriapai(long cod_categoriapai) {
		this.cod_categoriapai = cod_categoriapai;
	}	
}