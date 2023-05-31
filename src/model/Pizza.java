package model;

import java.util.Date;

public class Pizza extends Prato {
	private String molho;
	private String recheio;
	private String recheio2;
	private String borda;

	public Pizza(String id, String nome, double precoVenda, Date dataValidade, double peso, String molho,
			String recheio, String recheio2, String borda) {
		super(id, nome, precoVenda, dataValidade, peso);
		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
		this.recheio2 = recheio2;
	}

	public String getRecheio2() {
		return recheio2;
	}

	public void setRecheio2(String recheio2) {
		this.recheio2 = recheio2;
	}

	public String getMolho() {
		return molho;
	}

	public String getRecheio() {
		return recheio;
	}

	public String getBorda() {
		return borda;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

}
