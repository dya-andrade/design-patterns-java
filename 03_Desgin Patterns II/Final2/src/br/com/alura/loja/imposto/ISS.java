package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//DECORATOR
public class ISS extends Imposto {

	public ISS(Imposto outro) {
		super(outro);
	}
	
	public BigDecimal realizarCalculoEspecifico(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
