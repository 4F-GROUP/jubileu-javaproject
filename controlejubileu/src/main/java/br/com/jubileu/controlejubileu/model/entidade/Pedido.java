package br.com.jubileu.controlejubileu.model.entidade;

import java.util.Date;

public class Pedido {
	private Itens_Pedido cod_pedido;
	private Cliente cod_cliente;
	private Date data;
	private long qtd_itens;
	private double valor_total;
	private double valor_frete;
	
	public Pedido() {
		super();
		this.cod_pedido = new Itens_Pedido();
		this.cod_cliente = new Cliente();
		this.data = new Date();
		this.qtd_itens = 0;
		this.valor_total = 0.0;
		this.valor_frete = 0.0;
	}

	public Pedido(Itens_Pedido cod_pedido, Cliente cod_cliente, Date data, long qtd_itens, double valor_total,
			double valor_frete) {
		super();
		this.cod_pedido = cod_pedido;
		this.cod_cliente = cod_cliente;
		this.data = data;
		this.qtd_itens = qtd_itens;
		this.valor_total = valor_total;
		this.valor_frete = valor_frete;
	}

	public Itens_Pedido getCod_pedido() {
		return cod_pedido;
	}

	public void setCod_pedido(Itens_Pedido cod_pedido) {
		this.cod_pedido = cod_pedido;
	}

	public Cliente getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Cliente cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public long getQtd_itens() {
		return qtd_itens;
	}

	public void setQtd_itens(long qtd_itens) {
		this.qtd_itens = qtd_itens;
	}

	public double getValor_total() {
		return valor_total;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public double getValor_frete() {
		return valor_frete;
	}

	public void setValor_frete(double valor_frete) {
		this.valor_frete = valor_frete;
	}
}