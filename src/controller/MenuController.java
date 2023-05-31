package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CadastroClienteView;
import view.CadastroFuncView;
import view.CadastroLancheView;
import view.CadastroPizzaView;
import view.CadastroSalgadinhoView;
import view.MenuView;

public class MenuController {
	@SuppressWarnings("unused")
	private MenuView menuView;
	
	public MenuController(MenuView menuView) {
		super();
		this.menuView = menuView;
		
		MenuView.setBtnCli(new clienteBtn());
		MenuView.setBtnFunc(new funcBtn());
		MenuView.setBtnLanche(new lancheBtn());
		MenuView.setBtnPizza(new pizzaBtn());
		MenuView.setBtnSalgadinho(new salgadinhoBtn());
		
	}
	
	private class clienteBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			CadastroClienteView cadastroClienteView = new CadastroClienteView();

			cadastroClienteView.setVisible(true);
		}
	}
	
	private class funcBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			CadastroFuncView cadastroFuncView = new CadastroFuncView();

			cadastroFuncView.setVisible(true);
		}
	}

	private class lancheBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			CadastroLancheView cadastroLancheView = new CadastroLancheView();

			cadastroLancheView.setVisible(true);
		}
	}
	
	private class pizzaBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			CadastroPizzaView cadastroPizzaView = new CadastroPizzaView();

			cadastroPizzaView.setVisible(true);
		}
	}
	
	private class salgadinhoBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			CadastroSalgadinhoView cadastroSalgadinhoView = new CadastroSalgadinhoView();

			cadastroSalgadinhoView.setVisible(true);
		}
	}
}