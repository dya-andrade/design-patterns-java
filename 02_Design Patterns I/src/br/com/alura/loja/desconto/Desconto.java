package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//CHAIN OF RESPONSIBILITY
public abstract class Desconto {

	protected Desconto proximoDesconto;

	public Desconto(Desconto proximoDesconto) {
		this.proximoDesconto = proximoDesconto;
	}

	// MÉTODO CONCRETO AO INVÉS DE ABSTRATO
	final public BigDecimal calcular(Orcamento orcamento) {
		if (deveAplicar(orcamento)) {
			return efutuarCalculo(orcamento);
		}

		return proximoDesconto.calcular(orcamento);
	}

	//TEMPLATE METHOD
	protected abstract BigDecimal efutuarCalculo(Orcamento orcamento);
	//TEMPLATE METHOD
	protected abstract Boolean deveAplicar(Orcamento orcamento);
}
