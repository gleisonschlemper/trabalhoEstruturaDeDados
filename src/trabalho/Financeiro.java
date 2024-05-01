package trabalho;

public class Financeiro {
	private Cliente cliente;
	private Pedido pedido;
	private Financeiro prox;
	
	public Financeiro(Cliente cliente,Pedido pedido) {
		setCliente(cliente);
		setPedido(pedido);
	}
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Financeiro getProx() {
		return prox;
	}

	public void setProx(Financeiro prox) {
		this.prox = prox;
	}
}
