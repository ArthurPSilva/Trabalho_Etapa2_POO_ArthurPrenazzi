package model;

public class Pagamento {
	private Pedido pedido;
	private String tipo;
	private double valorPagoDinheiro;

	public Pagamento(Pedido pedido, String tipo, double valorPagoDinheiro) {
		super();
		this.pedido = pedido;
		this.tipo = tipo;
		this.valorPagoDinheiro = valorPagoDinheiro;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValorPagoDinheiro() {
		return valorPagoDinheiro;
	}

	public void setValorPagoDinheiro(double valorPagoDinheiro) {
		this.valorPagoDinheiro = valorPagoDinheiro;
	}

}
