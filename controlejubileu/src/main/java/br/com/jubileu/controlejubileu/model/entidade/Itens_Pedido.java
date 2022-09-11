package br.com.jubileu.controlejubileu.model.entidade;

public class Itens_Pedido {
	private long cod_pedido;
	private Produto cod_produto;
	private long quantidade;
	private double valor;
	private double desconto;
	
	public Itens_Pedido() {
		super();
		this.cod_pedido = 0;
		this.cod_produto = new Produto();
		this.quantidade = 0;
		this.valor = 0.0;
		this.desconto = 0.0;
	}

	public Itens_Pedido(long cod_pedido, Produto cod_produto, long quantidade, double valor, double desconto) {
		super();
		this.cod_pedido = cod_pedido;
		this.cod_produto = cod_produto;
		this.quantidade = quantidade;
		this.valor = valor;
		this.desconto = desconto;
	}

	public long getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(long cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public Produto getCod_produto() {
		return cod_produto;
	}

	public void setCod_produto(Produto cod_produto) {
		this.cod_produto = cod_produto;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
