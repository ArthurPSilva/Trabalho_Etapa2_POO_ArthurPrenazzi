package view;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PedidoView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextField txtidPedido;
	public JTextField txtNomeCliente;
	private JTextField txtNomeFunc;
	public JTextField txtTaxaServico;
	private JTextField txtItensConsu;
	public JTextField txtQuantidade;
	public JTextField txtValorTotal;
	private JLabel lblidPedido, lblNomeCliente, lblNomeFunc, lblTaxaServico, lblItensConsu, lblQuantidade,
			lblValorTotal;
	public JButton btnFinalizar;
	public JButton btnCalcularTotal;
	public JButton btnDividir;

	public PedidoView() {
		super("Cadastro de Pedido");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		lblidPedido = new JLabel("ID do Pedido");
		txtidPedido = new JTextField(10);
		lblNomeCliente = new JLabel("Nome do cliente");
		txtNomeCliente = new JTextField(10);
		lblNomeFunc = new JLabel("Nome do funcionario");
		txtNomeFunc = new JTextField(10);
		lblTaxaServico = new JLabel("Taxa de Servico");
		txtTaxaServico = new JTextField(10);
		lblItensConsu = new JLabel("Itens consumidos");
		txtItensConsu = new JTextField(100);
		lblQuantidade = new JLabel("Quantidade");
		txtQuantidade = new JTextField(10);
		lblValorTotal = new JLabel("Valor Total");
		txtValorTotal = new JTextField(10);
		btnCalcularTotal = new JButton("Calcular total");
		btnFinalizar = new JButton("Finalizar");
		btnDividir = new JButton("Dividir");

		add(lblidPedido);
		add(txtidPedido);
		add(lblNomeCliente);
		add(txtNomeCliente);
		add(lblNomeFunc);
		add(txtNomeFunc);
		add(lblTaxaServico);
		add(txtTaxaServico);
		add(lblItensConsu);
		add(txtItensConsu);
		add(lblQuantidade);
		add(txtQuantidade);
		add(lblValorTotal);
		add(txtValorTotal);
		add(btnCalcularTotal);
		add(btnFinalizar);
		add(btnDividir);

		pack();

		setVisible(true);
	}


	public static void setBtnCalcularTotal(ActionListener btnCalcularTotal) {
		// TODO Auto-generated method stub
		
	}


	public static void setBtnFinalizar(ActionListener finalizarBtn) {
		// TODO Auto-generated method stub
		
	}


	public static void setBtnDividir(ActionListener dividirBtn) {
		// TODO Auto-generated method stub
		
	}


	public int getIdPedido() {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getNomeCliente() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getNomeFuncionario() {
		// TODO Auto-generated method stub
		return null;
	}


	public double getTaxaDeServico() {
		// TODO Auto-generated method stub
		return 0;
	}


	public List<String> getItensConsumidos() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Integer> getQuantidade() {
		// TODO Auto-generated method stub
		return null;
	}


	public double getValorTotal() {
		// TODO Auto-generated method stub
		return 0;
	}

}
