package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

//DECORATOR
public abstract class Imposto {

	private Imposto outro;

	public Imposto(Imposto outro) {
		this.outro = outro;
	}

	//DECORATOR
	protected abstract BigDecimal realizarCalculoEspecifico(Orcamento orcamento);

	//SE NÃO FOR NULL, ELE CALCULA OUTRO IMPOSTO
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculoEspecifico(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		if (outro != null) {
			valorOutroImposto = outro.realizarCalculoEspecifico(orcamento);
		}

		return valorImposto.add(valorOutroImposto);
	}

}
