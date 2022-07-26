package br.com.alura.loja.pedido;

import java.math.BigDecimal;

//COMMAND
public class GeraPedido {
	
	private String cliente;
	private BigDecimal valorOrcamento;
	private Integer quantidadeItens;
	
	//INJEÇÃO DE DEPENDENCIAS: PedidoRepository, EmailService, ...
	public GeraPedido(String cliente, BigDecimal valorOrcamento, Integer quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}
	
	public Integer getQuantidadeItens() {
		return quantidadeItens;
	}
}
