package trabalho;

public class ListaCaixa {
	private Caixa inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Caixa getInicio() {
		return inicio;
	}
	
	public void inserirInicio(ListaClientes clientes) {
		Caixa novoNodo = new Caixa(clientes);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public void cadastrarClienteNoCaixa(ListaClientes clientes) {
		if(vazia()) {
			inserirInicio(clientes);
			return;
		}
		
		Caixa novoNodo = new Caixa(clientes);
		Caixa aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoNodo);
	}
	
	public String mostrarClientesNoCaixa() {
		String lista = "";
		Caixa aux = inicio;
		while(aux != null) {
			lista+=aux.getClientes().mostrar();
			aux = aux.getProx();
		}
		
		return lista;
	}
	
	public double valorDaConta(Pedido pedido) {
		return pedido.getProdutos().valorTotal();	
	}
	
	public void quantidadeDeClienteNoCaixa() {
		int quant = 0;
		Caixa aux = inicio;
		while(aux != null) {
			quant+=aux.getClientes().quantidade();
			aux = aux.getProx();
		}
		System.out.println("Quantidade de cliente no caixa: "+quant);
	}
	
	public Cliente atenderCliente() {
		Caixa aux = inicio;
		return aux.getClientes().mostrarPrimeiroCliente();
	}
	
	public void removerClienteDoCaixa(String clienteCPF) {
	    if (vazia()) return;
	    Caixa aux = inicio;
	    while(aux != null) {
			aux.getClientes().deletarClientes(clienteCPF);
			aux = aux.getProx();
		}
	}
}
