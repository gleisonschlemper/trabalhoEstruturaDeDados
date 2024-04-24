package trabalho;

public class Fila {
	private Cliente cliente;
	private Fila prox;
	
	public Fila(Cliente cliente) {
		setCliente(cliente);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Fila getProx() {
		return prox;
	}
	public void setProx(Fila prox) {
		this.prox = prox;
	}
}
