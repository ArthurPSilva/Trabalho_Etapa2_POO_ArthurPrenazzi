package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroLancheView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblId, lblNome, lblPrecoVenda, lblDataValidade, lblPeso, lblPao, lblRecheio, lblMolho;
	public JTextField txtId, txtNome, txtPrecoVenda, txtDataValidade, txtPeso, txtPao, txtRecheio, txtMolho;
	private JButton btnFinalizar;

	public CadastroLancheView() {
		super("Cadastro Lanche");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		lblId = new JLabel("ID do salgado");
		txtId = new JTextField(10);
		lblNome = new JLabel("Nome do Prato");
		txtNome = new JTextField(30);
		lblPrecoVenda = new JLabel("Preco da venda");
		txtPrecoVenda = new JTextField(10);
		lblDataValidade = new JLabel("Data da validade");
		txtDataValidade = new JTextField(10);
		lblPeso = new JLabel("Peso");
		txtPeso = new JTextField(10);
		lblPao = new JLabel("Pao");
		txtPao = new JTextField(10);
		lblRecheio = new JLabel("Recheio");
		txtRecheio = new JTextField(10);
		lblMolho = new JLabel("Molho");
		txtMolho = new JTextField(10);
		btnFinalizar = new JButton("Finalizar");

		add(lblId);
		add(txtId);
		add(lblNome);
		add(txtNome);
		add(lblPrecoVenda);
		add(txtPrecoVenda);
		add(lblDataValidade);
		add(txtDataValidade);
		add(lblPeso);
		add(txtPeso);
		add(lblPao);
		add(txtPao);
		add(lblRecheio);
		add(txtRecheio);
		add(lblMolho);
		add(txtMolho);
		add(btnFinalizar);

		pack();

		setVisible(true);

	}

	public static void setFinalizarBtn(ActionListener finalizarBtn) {
		// TODO Auto-generated method stub
	}
}