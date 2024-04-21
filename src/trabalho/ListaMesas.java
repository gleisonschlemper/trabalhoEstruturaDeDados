package trabalho;

public class ListaMesas {
	private Mesa inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Mesa getInicio() {
		return inicio;
	}
	
	public void cadastrarMesa(int codigo, int capacidade) {
		Mesa novaMesa = new Mesa(codigo,capacidade,false);
		novaMesa.setProx(inicio);
		inicio = novaMesa;
	}
	

	public void cadastrarMesaCliente(int codigoMesa,ListaClientes clientes) {
		Mesa aux = inicio;
		while(aux != null) {
			if(aux.getCodigo() == codigoMesa && aux.getCapacidade() >= clientes.quantidade()) {
				aux.setClientes(clientes);
				aux.setOcupado(true);
			}	
			aux = aux.getProx();
		}
	}
	
	public void alterarCapacidade(int codigo, int capacidade) {
		Mesa aux = inicio;
		while(aux != null) {
			if(aux.getCodigo() == codigo) {
				aux.setCapacidade(capacidade);
			}
			aux = aux.getProx();
		}
	}
	
	public String mostrar() {
		String lista = "";
		Mesa aux = inicio;
		while(aux != null) {
			lista+="-----------------------------------\n";
			lista+="Codigo da mesa: "+aux.getCodigo()+"\n";
			lista+="Capacidade: "+aux.getCapacidade()+"\n";
			aux = aux.getProx();
		}
		
		return lista;
	}
	
	public boolean verificarMesasDisponivel() {
		Mesa aux = inicio;
		while(aux != null) {
			if(aux.getOcupado() != true) {
				return true;
			}
			aux = aux.getProx();
		}
		return false;
	}
	
	public String mostrarMesasOcupadas() {
		String lista = "";
		Mesa aux = inicio;
		while(aux != null) {
			if(aux.getOcupado()) {
				lista+="Codigo da mesa: "+aux.getCodigo()+"\n";
				lista+="Clientes na mesa:\n";
				lista+=aux.getClientes().mostrar();
			}
			aux = aux.getProx();
		}
		return lista;
	}
	
	public String mostrarMesasDisponiveis() {
		String lista = "";
		Mesa aux = inicio;
		while(aux != null) {
			if(aux.getOcupado() != true) {
				lista+="Codigo da mesa: "+aux.getCodigo()+"\n";
			}
			aux = aux.getProx();
		}
		return lista;
	}

	
	public Mesa consultar(int codigoMesa) {
		Mesa aux = inicio;
		while(aux != null) {
			if(aux.getCodigo() == codigoMesa) {
				return aux;
			}	
			aux = aux.getProx();
		}
		return new Mesa(0, 0, false);
	}
	
	public void liberarMesa(int codigoMesa,ListaCaixa caixa) {
		Mesa aux = inicio;
		while(aux != null) {
			if(aux.getCodigo() == codigoMesa) {
				ListaClientes clientes = aux.getClientes();
				caixa.cadastrarClienteNoCaixa(clientes);
				aux.setClientes(null);
				aux.setOcupado(false);
			}	
			aux = aux.getProx();
		}
	}
}
