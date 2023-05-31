package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import view.PagamentoView;
import view.PedidoView;

public class PagamentoController {
	PagamentoView pagamentoView;
	PedidoView pedidoView;

	public PagamentoController(PedidoView pedidoView, PagamentoView pagamentoView) {
		this.pedidoView = pedidoView;
		this.pagamentoView = pagamentoView;
		PagamentoView.setBtnFinalizar(new FinalizarBtn());
		PagamentoView.setBtnNotaFiscal(new NotaFiscalBtn());

	}

	public void gerarNotaFiscal() {

		int idPedido = pedidoView.getIdPedido();
		String nomeCliente = pedidoView.getNomeCliente();
		String nomeFuncionario = pedidoView.getNomeFuncionario();
		double taxaDeServico = pedidoView.getTaxaDeServico();
		List<String> itensConsumidos = pedidoView.getItensConsumidos();
		List<Integer> quantidade = pedidoView.getQuantidade();
		double valorTotal = pedidoView.getValorTotal();

		System.out.println("======= NOTA FISCAL =======");
		System.out.println("ID do Pedido: " + idPedido);
		System.out.println("Cliente: " + nomeCliente);
		System.out.println("Funcionário: " + nomeFuncionario);
		System.out.println("Taxa de Serviço: " + taxaDeServico);
		System.out.println("Itens Consumidos:");
		for (int i = 0; i < itensConsumidos.size(); i++) {
			String item = itensConsumidos.get(i);
			int qtd = quantidade.get(i);
			System.out.println("- " + item + " (Quantidade: " + qtd + ")");
		}
		System.out.println("Valor Total: " + valorTotal);
		System.out.println("===========================");
	}

	public double calcularTroco() {
		double valorTotal = pedidoView.getValorTotal();
		double valorPago = pagamentoView.getValorPago();

		double troco = valorTotal - valorPago;
		return troco;
	}

	private class NotaFiscalBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			gerarNotaFiscal();
		}
	}

	private class FinalizarBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			calcularTroco();
		}
	}
}
