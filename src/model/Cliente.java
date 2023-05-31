package model;

import java.util.Date;

public class Cliente extends Pessoa{
	private Date aniversario;

	public Cliente(String codigo, String nome, String cpf, String endereco, String telefone, Date aniversario) {
		super(codigo, nome, cpf, endereco, telefone);
		this.aniversario = aniversario;
	}

	public Date getAniversario() {
		return aniversario;
	}

	public void setAniversario(Date aniversario) {
		this.aniversario = aniversario;
	}
	
	
}
