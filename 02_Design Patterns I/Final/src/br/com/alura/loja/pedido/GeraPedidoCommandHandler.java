package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

//COMMAND HANDLER
public class GeraPedidoCommandHandler {
	
	//OBSERVER
	private List<AcaoAposGerarPedido> acoes;
	
	//CONSTRUTOR COM INJEÇÃO DE DEPENDÊNCIAS: repository, service, etc.
	public GeraPedidoCommandHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}
	
	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);		
		
		//OBSERVER
		acoes.forEach(a -> a.executarAcao(pedido));
	}

}
