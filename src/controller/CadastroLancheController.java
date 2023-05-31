package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import model.Lanche;
import view.CadastroLancheView;

public class CadastroLancheController {
	CadastroLancheView cadLanche;
	private List<Lanche> listLanche = new ArrayList<Lanche>();
	private SimpleDateFormat dateFormat;

	public CadastroLancheController(CadastroLancheView cadLanche) {
		CadastroLancheView.setFinalizarBtn(new FinalizarBtn());
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	}

	public class FinalizarBtn implements ActionListener {
		@SuppressWarnings("unused")
		@Override
		public void actionPerformed(ActionEvent e) {
			String id = cadLanche.txtId.getText();
			String nome = cadLanche.txtNome.getText();
			String precoVenda = cadLanche.txtPrecoVenda.getText();
			String dataValidadeStr = cadLanche.txtDataValidade.getText();
			String peso = cadLanche.txtPeso.getText();
			String pao = cadLanche.txtPao.getText();
			String recheio = cadLanche.txtRecheio.getText();
			String molho = cadLanche.txtMolho.getText();

			try {
				Date dataValidade = dateFormat.parse(dataValidadeStr);

				Lanche lanche = new Lanche(id, nome, 0.0, dataValidade, 0.0, pao, recheio, molho);

				listLanche.add(lanche);

				cadLanche.txtId.setText("");
				cadLanche.txtNome.setText("");
				cadLanche.txtPrecoVenda.setText("");
				cadLanche.txtDataValidade.setText("");
				cadLanche.txtPeso.setText("");
				cadLanche.txtPao.setText("");
				cadLanche.txtRecheio.setText("");
				cadLanche.txtMolho.setText("");

			} catch (ParseException ex) {
				System.out.println("Data de vencimento invalida.");

			}
		}
	}
}