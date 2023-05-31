package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroFuncView extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblCodFunc, lblNomeFunc, lblCpfFunc, lblEnderecoFunc, lblTelefoneFunc, lblSalario, lblCargo;
	public JTextField txtCodFunc;
	public JTextField txtNomeFunc;
	public JTextField txtCpfFunc;
	public JTextField txtEnderecoFunc;
	public JTextField txtTelefoneFunc;
	public JTextField txtSalario;
	public JTextField txtCargo;
	public JButton btnCadastrar;
	
	public CadastroFuncView(){
		super("Cadastro de Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		lblCodFunc = new JLabel("Codigo Funcionario");
		txtCodFunc = new JTextField(10);
		lblNomeFunc = new JLabel("Nome");
		txtNomeFunc = new JTextField(20);
		lblCpfFunc = new JLabel("CPF");
		txtCpfFunc = new JTextField(20);
		lblEnderecoFunc = new JLabel("Endereco");
		txtEnderecoFunc =new JTextField(50);
		lblTelefoneFunc = new JLabel("Telefone");
		txtTelefoneFunc = new JTextField(20);
		lblSalario = new JLabel("Salario");
		txtSalario = new JTextField(10);
		lblCargo = new JLabel("Cargo");
		txtCargo =new JTextField(20);
		btnCadastrar = new JButton("Cadastrar");
		
		add(lblCodFunc);
		add(txtCodFunc);
		add(lblNomeFunc);
		add(txtNomeFunc);
		add(lblCpfFunc);
		add(txtCpfFunc);
		add(lblEnderecoFunc);
		add(txtEnderecoFunc);
		add(lblTelefoneFunc);
		add(txtTelefoneFunc);
		add(lblSalario);
		add(txtSalario);
		add(lblCargo);
		add(txtCargo);
		add(btnCadastrar);
		
		pack();

		setVisible(true);
		
	}

	public static void setCadastroBtn(ActionListener cadastroBtn) {
		// TODO Auto-generated method stub
		
	}
}
