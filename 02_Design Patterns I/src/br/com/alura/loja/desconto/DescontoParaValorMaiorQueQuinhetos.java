package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//CHAIN OF RESPONSIBILITY
public class DescontoParaValorMaiorQueQuinhetos extends Desconto {

	public DescontoParaValorMaiorQueQuinhetos(Desconto proximoDesconto) {
		super(proximoDesconto);
	}

	//TEMPLATE METHOD
	@Override
	public BigDecimal efutuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	//TEMPLATE METHOD
	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
