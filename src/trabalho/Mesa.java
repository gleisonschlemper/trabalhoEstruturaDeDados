package trabalho;

public class Mesa {
	private boolean ocupado;
	private int codigo;
	private int capacidade;
	private ListaClientes clientes;
	private Mesa prox;
	
	public Mesa(int codigo, int capacidade, boolean ocupado) {
		setCodigo(codigo);
		setCapacidade(capacidade);
		setOcupado(ocupado);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public ListaClientes getClientes() {
		return clientes;
	}

	public void setClientes(ListaClientes clientes) {
		this.clientes = clientes;
	}

	public Mesa getProx() {
		return prox;
	}

	public void setProx(Mesa prox) {
		this.prox = prox;
	}

	public boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
	
	
	
}
