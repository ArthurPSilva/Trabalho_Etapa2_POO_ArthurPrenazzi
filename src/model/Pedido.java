package model;

import java.util.ArrayList;

public class Pedido {
	private int idPedido;
	private String nomeCliente;
	private String nomeFuncionario;
	private double taxaDeServico;
	private ArrayList<Prato> itensConsumidos;
	private ArrayList<Integer> quantidades;
	private double valorTotal;

	public Pedido(int idPedido, String nomeCliente, String nomeFuncionario, double taxaDeServico,
			ArrayList<Prato> itensConsumidos, ArrayList<Integer> quantidades, double valorTotal) {
		super();
		this.idPedido = idPedido;
		this.nomeCliente = nomeCliente;
		this.nomeFuncionario = nomeFuncionario;
		this.taxaDeServico = taxaDeServico;
		this.itensConsumidos = itensConsumidos;
		this.quantidades = quantidades;
		this.valorTotal = valorTotal;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getTaxaDeServico() {
		return taxaDeServico;
	}

	public void setTaxaDeServico(double taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}

	public ArrayList<Prato> getItensConsumidos() {
		return itensConsumidos;
	}

	public void setItensConsumidos(ArrayList<Prato> itensConsumidos) {
		this.itensConsumidos = itensConsumidos;
	}

	public ArrayList<Integer> getQuantidades() {
		return quantidades;
	}

	public void setQuantidades(ArrayList<Integer> quantidades) {
		this.quantidades = quantidades;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
