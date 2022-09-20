package br.com.jubileu.controlejubileu.model.entidade;

public class Produto {
	private long cod_produto;
	private String nome;
	private String descricao;
	private String detalhes;
	private String marca;
	private String imagem;
	private String miniatura;
	private long unidade;
	private double valor_unit;
	private long estoque;
	
	public Produto() {
		super();
		this.cod_produto = 0;
		this.nome = "";
		this.descricao = "";
		this.detalhes = "";
		this.marca = "";
		this.imagem = "";
		this.miniatura = "";
		this.unidade = 0;
		this.valor_unit = 0.0;
		this.estoque = 0;
	}

	public Produto(long cod_produto, String nome, String descricao, String detalhes, String marca, String imagem, String miniatura, long unidade, double valor_unit,
			long estoque) {
		super();
		this.cod_produto = cod_produto;
		this.nome = nome;
		this.descricao = descricao;
		this.detalhes = detalhes;
		this.marca = marca;
		this.imagem = imagem;
		this.miniatura = miniatura;
		this.unidade = unidade;
		this.valor_unit = valor_unit;
		this.estoque = estoque;
	}

	public long getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(long cod_produto) {
		this.cod_produto = cod_produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getMiniatura() {
		return miniatura;
	}

	public void setMiniatura(String miniatura) {
		this.miniatura = miniatura;
	}

	public long getUnidade() {
		return unidade;
	}

	public void setUnidade(long unidade) {
		this.unidade = unidade;
	}

	public double getValor_unit() {
		return valor_unit;
	}

	public void setValor_unit(double valor_unit) {
		this.valor_unit = valor_unit;
	}

	public long getEstoque() {
		return estoque;
	}

	public void setEstoque(long estoque) {
		this.estoque = estoque;
	}
}