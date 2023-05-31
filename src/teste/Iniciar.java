package teste;

import controller.CadastroClienteController;
import controller.CadastroFuncController;
import controller.CadastroLancheController;
import controller.CadastroPizzaController;
import controller.CadastroSalgadinhoController;
import controller.PagamentoController;
import controller.PedidoController;
import view.CadastroClienteView;
import view.CadastroFuncView;
import view.CadastroLancheView;
import view.CadastroPizzaView;
import view.CadastroSalgadinhoView;
import view.PagamentoView;
import view.PedidoView;

public class Iniciar {
	public static void main(String[] args) {
		CadastroPizzaView cadastroPizzaView = new CadastroPizzaView();
		new CadastroPizzaController(cadastroPizzaView);
		
		CadastroSalgadinhoView cadastroSalgadinhoView = new CadastroSalgadinhoView();
		new CadastroSalgadinhoController(cadastroSalgadinhoView);
		
		CadastroLancheView cadastroLancheView = new CadastroLancheView();
		new CadastroLancheController(cadastroLancheView);
		
		CadastroFuncView cadastroFuncView = new CadastroFuncView();
		new CadastroFuncController(cadastroFuncView);
		
		CadastroClienteView cadastroClienteView = new CadastroClienteView();
		new CadastroClienteController(cadastroClienteView);
		
		PedidoView pedidoView = new PedidoView();
		new PedidoController(pedidoView);
		
		PagamentoView pagamentoView = new PagamentoView();
		new PagamentoController(pedidoView, pagamentoView);
		
		
	}
}
