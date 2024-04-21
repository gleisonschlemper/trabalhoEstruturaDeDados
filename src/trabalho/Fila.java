package trabalho;

public class Fila {
	private ListaClientes clientes;
	private Fila prox;
	
	public Fila(ListaClientes clientes) {
		setClientes(clientes);
	}


	public ListaClientes getClientes() {
		return clientes;
	}

	public void setClientes(ListaClientes clientes) {
		this.clientes = clientes;
	}



	public Fila getProx() {
		return prox;
	}
	public void setProx(Fila prox) {
		this.prox = prox;
	}
	
	
	
}
