package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Cliente;
import view.CadastroClienteView;

public class CadastroClienteController {
	CadastroClienteView cadCli;
	private List<Cliente> listaCli = new ArrayList<Cliente>();
	private SimpleDateFormat dateFormat;

	public CadastroClienteController(CadastroClienteView cadCli) {
		this.cadCli = cadCli;
		CadastroClienteView.setCadastroBtn(new CadastrarBtn());
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	}

	private class CadastrarBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String codigo = cadCli.txtCod.getText();
			String nome = cadCli.txtNome.getText();
			String cpf = cadCli.txtCpf.getText();
			String endereco = cadCli.txtEndereco.getText();
			String telefone = cadCli.txtTelefone.getText();
			String aniversarioStr = cadCli.txtAniversario.getText();

			try {

				Date aniversario = dateFormat.parse(aniversarioStr);

				Cliente cliente = new Cliente(codigo, nome, cpf, endereco, telefone, aniversario);

				listaCli.add(cliente);

				cadCli.txtCod.setText("");
				cadCli.txtNome.setText("");
				cadCli.txtCpf.setText("");
				cadCli.txtEndereco.setText("");
				cadCli.txtTelefone.setText("");
				cadCli.txtAniversario.setText("");

			} catch (ParseException ex) {
				System.out.println("Data de aniversário inválida. Certifique-se de usar o formato dd/MM/yyyy.");
			}
		}
	}
}
