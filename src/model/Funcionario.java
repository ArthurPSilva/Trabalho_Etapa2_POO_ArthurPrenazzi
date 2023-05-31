package model;

public class Funcionario extends Pessoa {
	public double salario;
	public String cargo;

	public Funcionario(String codigo, String nome, String cpf, String endereco, String telefones,
			double salario, String cargo) {
		super(codigo, nome, cpf, endereco, telefones);
		this.salario = salario;
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
