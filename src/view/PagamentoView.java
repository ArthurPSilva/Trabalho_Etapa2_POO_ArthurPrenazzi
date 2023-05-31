package view;

import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PagamentoView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lblTipo, lblValorPago;
	private JTextField txtValorPago;
	private JButton btnFinalizar;
	public JButton btnNotaFiscal;
	public JComboBox<String> cmbTipo;
	
	public PagamentoView() {
		super("Pagamento");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		lblTipo = new JLabel("Forma de pagamento");
		cmbTipo = new JComboBox<>(new String[]{" ","Cartão Debito","Cartão Credio","Dinheiro","Pix"});
		lblValorPago = new JLabel("Valor pago");
		txtValorPago = new JTextField(10);
		btnFinalizar = new JButton("Finalizar");
		btnNotaFiscal = new JButton("Nota Fiscal");
		
		add(lblTipo);
		add(cmbTipo);
		add(lblValorPago);
		add(txtValorPago);
		add(btnFinalizar);
		add(btnNotaFiscal);
		
		pack();

		setVisible(true);
	}

	public static void setBtnNotaFiscal(ActionListener NotaFiscalBtn) {
		// TODO Auto-generated method stub
		
	}
	
	public static void setBtnFinalizar(ActionListener FinalizarBtn) {
		// TODO Auto-generated method stub
		
	}

	public double getValorPago() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
