package trabalho;

public class ListaFila {
	private Fila inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Fila getInicio() {
		return inicio;
	}
	
	public void cadastrarIninico(ListaClientes clientes) {
		Fila novaFila = new Fila(clientes);
		novaFila.setProx(inicio);
		inicio = novaFila;
	}
	
	public void cadastrar(ListaClientes clientes) {
			if(vazia()) {
				cadastrarIninico(clientes);
				return;
			}
			
			Fila novoNodo = new Fila(clientes);
			Fila aux = inicio;
			while(aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(novoNodo);
	}
	
	public Cliente mostrarPrimeiroCliente() {
		return inicio.getClientes().mostrarPrimeiroCliente();
	}
	
}
