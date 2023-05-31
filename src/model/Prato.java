package model;

import java.util.Date;

public class Prato {
	private String id;
	private String nome;
	private double precoVenda;
	private Date dataValidade;
	private double peso;

	public Prato(String id, String nome, double precoVenda, Date dataValidade, double peso) {
		super();
		this.id = id;
		this.nome = nome;
		this.precoVenda = precoVenda;
		this.dataValidade = dataValidade;
		this.peso = peso;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
