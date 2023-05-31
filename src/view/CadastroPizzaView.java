package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroPizzaView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private JLabel lblMolho, lblRecheio, lblRecheio2, lblBorda, lblId, lblNome, lblPrecoVenda, lblDataValidade, lblPeso;
	public JTextField txtId, txtNome, txtPrecoVenda, txtDataValidade, txtPeso;
	public JComboBox<String> cmbMolho, cmbRecheio, cmbRecheio2, cmbBorda;
	private JButton btnFinalizar;

	public CadastroPizzaView() {
		super("Cadastro de Pizza");
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
		lblMolho = new JLabel("Molho");
		cmbMolho = new JComboBox<>(new String[] { " ", "Tomate", "Barbecue", "Pesto", "Nutella", "Molho Branco" });
		lblRecheio = new JLabel("Recheio 1");
		cmbRecheio = new JComboBox<>(
				new String[] { " ", "Queijo", "Calabresa", "Bacon", "Frango", "Tomate", "Cebola", "Azeitona" });
		lblRecheio2 = new JLabel("Recheio 2");
		cmbRecheio2 = new JComboBox<>(
				new String[] { " ", "Queijo", "Calabresa", "Bacon", "Frango", "Tomate", "Cebola", "Azeitona" });
		lblBorda = new JLabel("Borda");
		cmbBorda = new JComboBox<>(new String[] { " ", "Nutella", "Catupiry", "Cheddar" });
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
		add(lblMolho);
		add(cmbMolho);
		add(lblRecheio);
		add(cmbRecheio);
		add(lblBorda);
		add(cmbBorda);
		add(btnFinalizar);

		pack();

		setVisible(true);
	}

	public static void setFinalizarBtn(ActionListener finalizarBtn) {
		// TODO Auto-generated method stub
	}

}