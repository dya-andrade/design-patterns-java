package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//CHAIN OF RESPONSIBILITY
public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}
	
	//TEMPLATE METHOD
	@Override
	public BigDecimal efutuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	//TEMPLATE METHOD
	@Override
	public Boolean deveAplicar(Orcamento orcamento) {
		return true;
	}
}
