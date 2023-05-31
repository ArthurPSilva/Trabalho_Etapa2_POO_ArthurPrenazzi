package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JButton btnFunc, btnCliente, btnLanche, btnPizza, btnSalgadinho;

	public MenuView() {
		super("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		btnFunc = new JButton("Cadastro Funcionario");
		btnCliente = new JButton("Cadastro Cliente");
		btnLanche = new JButton("Venda Lanche");
		btnPizza = new JButton("Venda Pizza");
		btnSalgadinho = new JButton("Venda Salgadinho");

		add(btnFunc);
		add(btnCliente);
		add(btnPizza);
		add(btnSalgadinho);
		add(btnLanche);

		pack();

		setVisible(true);
	}

	public static void setBtnFunc(ActionListener funcBtn) {
		// TODO Auto-generated method stub

	}

	public static void setBtnCli(ActionListener clienteBtn) {
		// TODO Auto-generated method stub

	}

	public static void setBtnLanche(ActionListener lancheBtn) {
		// TODO Auto-generated method stub

	}
	
	public static void setBtnPizza(ActionListener pizzaBtn) {
		// TODO Auto-generated method stub

	}
	
	public static void setBtnSalgadinho(ActionListener salgadinhoBtn) {
		// TODO Auto-generated method stub

	}
}
