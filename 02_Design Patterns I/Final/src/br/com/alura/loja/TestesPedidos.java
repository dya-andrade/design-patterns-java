package br.com.alura.loja;

import java.math.BigDecimal;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoCommandHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

public class TestesPedidos {

	// CLI
	public static void main(String[] args) {
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		Integer quantidadeItens = Integer.parseInt(args[2]);

		// COMMAND 'interface' e COMMAND HANDLER 'class'
		GeraPedido geradorDePedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoCommandHandler commandHandler = new GeraPedidoCommandHandler(
				Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido()));
		commandHandler.execute(geradorDePedido);
	}
}
