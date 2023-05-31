package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Salgadinho;
import view.CadastroLancheView;
import view.CadastroSalgadinhoView;

public class CadastroSalgadinhoController {
	CadastroSalgadinhoView cadSalga;
	private List<Salgadinho> listSalga = new ArrayList<Salgadinho>();
	private SimpleDateFormat dateFormat;

	public CadastroSalgadinhoController(CadastroSalgadinhoView cadSalga) {
		CadastroLancheView.setFinalizarBtn(new FinalizarBtn());
	}

	public class FinalizarBtn implements ActionListener {
		@SuppressWarnings("unused")
		@Override
		public void actionPerformed(ActionEvent e) {
			String id = cadSalga.txtId.getText();
			String nome = cadSalga.txtNome.getText();
			String precoVenda = cadSalga.txtPrecoVenda.getText();
			String dataValidadeStr = cadSalga.txtDataValidade.getText();
			String peso = cadSalga.txtPeso.getText();
			String recheio = cadSalga.txtRecheio.getText();
			String massa = cadSalga.txtMassa.getText();
			String tipo = cadSalga.cmbTipo.getSelectedItem().toString();

			try {
				Date dataValidade = dateFormat.parse(dataValidadeStr);

				Salgadinho salgadinho = new Salgadinho(id, nome, 0.0, dataValidade, 0.0, recheio, massa, tipo);

				listSalga.add(salgadinho);

				cadSalga.txtId.setText("");
				cadSalga.txtNome.setText("");
				cadSalga.txtPrecoVenda.setText("");
				cadSalga.txtDataValidade.setText("");
				cadSalga.txtPeso.setText("");
				cadSalga.txtRecheio.setText("");
				cadSalga.txtMassa.setText("");
				cadSalga.cmbTipo.setSelectedIndex(0);

			} catch (ParseException ex) {
				System.out.println("Data de vencimento invalida.");

			}
		}
	}
}
