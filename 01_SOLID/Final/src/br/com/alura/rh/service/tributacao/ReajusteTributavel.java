package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;

//INTERFACE SEGREGATION PRINCIPLE
public interface ReajusteTributavel extends Reajuste {

	BigDecimal valorImpostoDeRenda();
}
