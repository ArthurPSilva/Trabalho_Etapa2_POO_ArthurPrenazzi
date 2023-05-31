package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Pizza;
import view.CadastroPizzaView;

public class CadastroPizzaController {
	CadastroPizzaView cadPizza;
	private List<Pizza> listPizza = new ArrayList<Pizza>();
	private SimpleDateFormat dateFormat;

	public CadastroPizzaController(CadastroPizzaView cadPizza) {
		CadastroPizzaView.setFinalizarBtn(new FinalizarBtn());
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	}

	public class FinalizarBtn implements ActionListener {
		@SuppressWarnings("unused")
		@Override
		public void actionPerformed(ActionEvent e) {

			String id = cadPizza.txtId.getText();
			String nome = cadPizza.txtNome.getText();
			String precoVenda = cadPizza.txtPrecoVenda.getText();
			String dataValidadeStr = cadPizza.txtDataValidade.getText();
			String peso = cadPizza.txtPeso.getText();
			String molho = cadPizza.cmbMolho.getSelectedItem().toString();
			String recheio1 = cadPizza.cmbRecheio.getSelectedItem().toString();
			String recheio2 = cadPizza.cmbRecheio2.getSelectedItem().toString();
			String borda = cadPizza.cmbBorda.getSelectedItem().toString();

			try {
				Date dataValidade = dateFormat.parse(dataValidadeStr);

				Pizza pizza = new Pizza(id, nome, 0.0, dataValidade, 0.0, molho, recheio1, recheio2, borda);

				listPizza.add(pizza);

				cadPizza.txtId.setText("");
				cadPizza.txtNome.setText("");
				cadPizza.txtPrecoVenda.setText("");
				cadPizza.txtDataValidade.setText("");
				cadPizza.txtPeso.setText("");
				cadPizza.cmbMolho.setSelectedIndex(0);
				cadPizza.cmbRecheio.setSelectedIndex(0);
				cadPizza.cmbRecheio2.setSelectedIndex(0);
				cadPizza.cmbBorda.setSelectedIndex(0);

			} catch (ParseException ex) {
				System.out.println("Data de vencimento invalida.");

			}
		}
	}
}
