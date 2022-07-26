package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		Orcamento orcamentoPrimeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento orcamentoSegundo = new Orcamento(new BigDecimal("1000"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		
		System.out.println(calculadora.calcular(orcamentoPrimeiro));
		System.out.println(calculadora.calcular(orcamentoSegundo));
	}

}
