package trabalho;

public class ListaFila {
	private Fila inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Fila getInicio() {
		return inicio;
	}
	
	public void cadastrarIninico(Cliente cliente) {
		Fila novaFila = new Fila(cliente);
		novaFila.setProx(inicio);
		inicio = novaFila;
	}
	
	public void cadastrar(Cliente cliente) {
			if(vazia()) {
				cadastrarIninico(cliente);
				return;
			}
			
			Fila novoNodo = new Fila(cliente);
			Fila aux = inicio;
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
		Fila aux = inicio;
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
	
	public Cliente primeiroDaFila() {
		return inicio.getCliente();
	}
	
	public Cliente consultar(String cpf) {
		Fila aux = inicio;
		while(aux!= null) {
			if(aux.getCliente().getCpf().equalsIgnoreCase(cpf)) return aux.getCliente();		
			aux = aux.getProx();
		}	
		return new Cliente("Nao existe", "Nao existe", "Nao existe", "Nao existe");
	}
	
	public void deletarClientes(String cpf) {
		if(vazia()) return;
		if(inicio.getCliente().getCpf().equalsIgnoreCase(cpf)) {
			inicio = inicio.getProx();
			return;
		}
		Fila aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getCliente().getCpf().equalsIgnoreCase(cpf)) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
		}
		aux = aux.getProx();
	}
	
}
