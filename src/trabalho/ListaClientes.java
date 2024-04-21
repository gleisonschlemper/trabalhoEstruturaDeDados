package trabalho;

public class ListaClientes {
	private Cliente inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Cliente getInicio() {
		return inicio;
	}
	
	public void cadastrarInicio(String cpf,String nome, String sobrenome,String telefone) {
		Cliente novoCliente = new Cliente(cpf,nome,sobrenome,telefone);
		novoCliente.setProx(inicio);
		inicio = novoCliente;
	}
	

	public void cadastrar(String cpf,String nome, String sobrenome,String telefone) {
			if(vazia()) {
				cadastrarInicio(cpf,nome,sobrenome,telefone);
				return;
			}
			
			Cliente novoNodo = new Cliente(cpf,nome,sobrenome,telefone);
			Cliente aux = inicio;
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
		Cliente aux = inicio;
		while(aux != null) {
			lista+="\nNome: "+aux.getNome()+"\n"+
				   "Sobrenome: "+aux.getSobrenome()+"\n"+
				   "CPF: "+aux.getCpf()+"\n"+
				   "Telefone: "+aux.getTelefone()+"\n"+
				   "-------------------------\n";
			aux = aux.getProx();
		}
		
		return lista;
	}
	
	public String atualizarCadastro(String cpf,String nome,String sobrenome,String telefone) {
		Cliente aux = inicio;
		while(aux != null) {
			if(aux.getCpf().equalsIgnoreCase(cpf)) {
				aux.setNome(nome);
				aux.setSobrenome(sobrenome);
				aux.setTelefone(telefone);
				return "atualiacao realizado com sucesso!";
			}
			aux = aux.getProx();
		}
		
		return "CPF inexistente";
	}
	
	public Cliente mostrarPrimeiroCliente() {
		return inicio;
	}
	
	public void deletarClientes(String cpf) {
		if(vazia()) return;
		if(inicio.getCpf().equalsIgnoreCase(cpf)) {
			inicio = inicio.getProx();
			return;
		}
		Cliente aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getCpf().equalsIgnoreCase(cpf)) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
		}
		aux = aux.getProx();
	}
	
	public boolean deletarPrimeiroCliente() {
	    if (vazia()) return false;
	    inicio = inicio.getProx();
	    return true;
	}
	
	public Cliente consultar(String cpf) {
		Cliente aux = inicio;
		while(aux!= null) {
			if(aux.getCpf().equalsIgnoreCase(cpf)) return aux;
				
			aux = aux.getProx();
		}
		
		return new Cliente("Nao existe", "Nao existe", "Nao existe", "Nao existe");
	}

	
	public int quantidade() {
		int quantidade = 0;
		Cliente aux = inicio;
		while(aux != null) {
			quantidade++;
			aux = aux.getProx();
		}
		
		return quantidade;	
	}
	
	
}
