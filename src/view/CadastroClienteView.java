package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroClienteView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCod, lblNome, lblCpf, lblEndereco, lblTelefone, lblAniversario;
	public JTextField txtCod, txtNome, txtCpf, txtEndereco, txtTelefone, txtAniversario;
	private JButton btnCadastro;

	public CadastroClienteView() {
		super("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		lblCod = new JLabel("Codigo");
		txtCod = new JTextField(10);
		lblNome = new JLabel("Nome");
		txtNome = new JTextField(30);
		lblCpf = new JLabel("CPF");
		txtCpf = new JTextField(15);
		lblEndereco = new JLabel("Endereco");
		txtEndereco = new JTextField(50);
		lblTelefone = new JLabel("Telefone");
		txtTelefone = new JTextField(20);
		lblAniversario = new JLabel("Data de Aniversario");
		txtAniversario = new JTextField(10);
		btnCadastro = new JButton("Cadastrar");

		add(lblCod);
		add(txtCod);
		add(lblNome);
		add(txtNome);
		add(lblCpf);
		add(txtCpf);
		add(lblEndereco);
		add(txtEndereco);
		add(lblTelefone);
		add(txtTelefone);
		add(lblAniversario);
		add(txtAniversario);
		add(btnCadastro);

		pack();

		setVisible(true);

	}

	public static void setCadastroBtn(ActionListener cadastroBtn) {
		// TODO Auto-generated method stub
		
	}

}