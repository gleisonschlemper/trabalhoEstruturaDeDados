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
	
	public boolean pagarConta(double valorConta, double pagarConta) {
		if(pagarConta < valorConta) {
			return true;
		}
		else {
			return false;
		}
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
	
	public String gerarNotaFiscal(Pedido pedido) {
		return "Produtos comprados "+pedido.getProdutos().mostrar()+"\n"+
			   "Preco total: "+pedido.getProdutos().valorTotal();
	}
}
