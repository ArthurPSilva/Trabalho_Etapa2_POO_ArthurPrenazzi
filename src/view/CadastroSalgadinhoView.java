package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroSalgadinhoView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblId, lblNome, lblPrecoVenda, lblDataValidade, lblPeso, lblRecheio, lblMassa, lblTipo;
	public JTextField txtId, txtNome, txtPrecoVenda, txtDataValidade, txtPeso, txtRecheio, txtMassa;
	public JComboBox<String> cmbTipo;
	private JButton btnFinalizar;

	public CadastroSalgadinhoView() {
		super("Cadastro Salgadinho");
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
		lblRecheio = new JLabel("Recheio");
		txtRecheio = new JTextField(10);
		lblMassa = new JLabel("Massa");
		txtMassa = new JTextField(10);
		lblTipo = new JLabel("Tipo");
		cmbTipo = new JComboBox<>(new String[] { " ", "Assado", "Frito" });
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
		add(lblRecheio);
		add(txtRecheio);
		add(lblMassa);
		add(txtMassa);
		add(lblTipo);
		add(cmbTipo);
		add(btnFinalizar);

		pack();

		setVisible(true);
	}

	public static void setFinalizarBtn(ActionListener finalizarBtn) {
		// TODO Auto-generated method stub
	}
}
