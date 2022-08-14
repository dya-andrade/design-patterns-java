package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

//OBSERVER
public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Salvar pedido no banco de dados.");
	}

}
