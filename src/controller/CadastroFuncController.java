package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import view.CadastroFuncView;
import model.Funcionario;
import java.util.ArrayList;

public class CadastroFuncController {
	CadastroFuncView cadFuc;
	private List<Funcionario> listaFunc = new ArrayList<Funcionario>();

	public CadastroFuncController(CadastroFuncView cadFuc) {
		this.cadFuc = cadFuc;
		CadastroFuncView.setCadastroBtn(new CadastrarBtn());

	}

	private class CadastrarBtn implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String codigo = cadFuc.txtCodFunc.getText();
			String nome = cadFuc.txtNomeFunc.getText();
			String cpf = cadFuc.txtCpfFunc.getText();
			String endereco = cadFuc.txtEnderecoFunc.getText();
			String telefone = cadFuc.txtTelefoneFunc.getText();
			@SuppressWarnings("unused")
			String salario = cadFuc.txtSalario.getText();
			String cargo = cadFuc.txtCargo.getText();

			Funcionario func = new Funcionario(codigo, nome, cpf, endereco, telefone, 0.000, cargo);

			listaFunc.add(func);
			
			cadFuc.txtCodFunc.setText("");
			cadFuc.txtNomeFunc.setText("");
			cadFuc.txtCpfFunc.setText("");
			cadFuc.txtEnderecoFunc.setText("");
			cadFuc.txtTelefoneFunc.setText("");
			cadFuc.txtCargo.setText("");
			cadFuc.txtSalario.setText("");
		}
	}

}
