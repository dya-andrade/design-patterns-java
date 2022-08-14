package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDescontos {

	//CHAIN OF RESPONSIBILITY
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDescontos = new DescontoParaMaisDeCincoItens(new DescontoParaValorMaiorQueQuinhetos(new SemDesconto()));
		return cadeiaDeDescontos.calcular(orcamento);
	}
}
