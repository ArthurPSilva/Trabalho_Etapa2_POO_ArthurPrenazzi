package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.PagamentoView;
import view.PedidoView;

public class PedidoController {
	private PedidoView view;

	public PedidoController(PedidoView view) {
		this.view = view;
		PedidoView.setBtnCalcularTotal(new CalcularTotalBtn());
		PedidoView.setBtnFinalizar(new FinalizarBtn());
		PedidoView.setBtnDividir(new DividirBtn());

	}

	private void calcularTotal() {
		double taxaServico = Double.parseDouble(view.txtTaxaServico.getText());
		double quantidade = Double.parseDouble(view.txtQuantidade.getText());

		double total = taxaServico * quantidade;

		view.txtValorTotal.setText(String.valueOf(total));
	}

	private class CalcularTotalBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			calcularTotal();
		}
	}

	private class FinalizarBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			PagamentoView pagamentoView = new PagamentoView();

			pagamentoView.setVisible(true);
		}
	}

	private class DividirBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			double valorTotal = Double.parseDouble(view.txtValorTotal.getText());
			double novoValor = valorTotal / 2;
			view.txtValorTotal.setText(String.valueOf(novoValor));

		}

	}
}
