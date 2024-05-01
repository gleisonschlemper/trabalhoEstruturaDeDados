package trabalho;

public class ListaFinanceiro {
	private Financeiro inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Financeiro getInicio() {
		return inicio;
	}
	
	public void cadastrarIninico(Cliente cliente, Pedido pedido) {
		Financeiro novaFila = new Financeiro(cliente,pedido);
		novaFila.setProx(inicio);
		inicio = novaFila;
	}
	
	public void cadastrar(Cliente cliente, Pedido pedido) {
			if(vazia()) {
				cadastrarIninico(cliente, pedido);
				return;
			}
			
			Financeiro novoNodo = new Financeiro(cliente,pedido);
			Financeiro aux = inicio;
			while(aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(novoNodo);
	}
	
	public String mostrar() {
		
		if(vazia()) {
			return "Não tem clientes cadastrado";
		}
		
		String lista = "";
		Financeiro aux = inicio;
		while(aux != null) {
			lista+="\nNome: "+aux.getCliente().getNome()+"\n"+
				   "Sobrenome: "+aux.getCliente().getSobrenome()+"\n"+
				   "CPF: "+aux.getCliente().getCpf()+"\n"+
				   "Telefone: "+aux.getCliente().getTelefone()+"\n"+
				   "-------------------------\n";
			aux = aux.getProx();
		}
		
		return lista;
	}
	

}
