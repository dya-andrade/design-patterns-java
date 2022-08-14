package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//CHAIN OF RESPONSIBILITY
public class DescontoParaMaisDeCincoItens extends Desconto {

	public DescontoParaMaisDeCincoItens(Desconto proximoDesconto) {
		super(proximoDesconto);
	}

	//TEMPLATE METHOD
	@Override
	public BigDecimal efutuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

}
