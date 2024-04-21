package trabalho;

public class ListaFuncionarios {
	private Funcionario inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Funcionario getInicio() {
		return inicio;
	}
	
	public void cadastrar(String nome, String sobrenome,String cpf, String cargo) {
		Funcionario novoFuncionario = new Funcionario(nome,sobrenome,cpf,cargo);
		novoFuncionario.setProx(inicio);
		inicio = novoFuncionario;
	}
	
	
	public String mostrar() {
		
		if(vazia()) {
			return "Não tem clientes cadastrado";
		}
		
		String lista = "";
		Funcionario aux = inicio;
		while(aux != null) {
			lista+="Nome: "+aux.getNome()+"\n"+
				   "Sobrenome: "+aux.getSobrenome()+"\n"+
				   "CPF: "+aux.getCpf()+"\n"+
				   "Cargo: "+aux.getCargo()+"\n"+
				   "---------------------------";
			aux = aux.getProx();
		}
		
		return lista;
	}
	

	public Funcionario consultar(String cpf, String cargo) {
		Funcionario aux = inicio;
		while(aux != null) {
			if(aux.getCpf().equalsIgnoreCase(cpf) && aux.getCargo().equalsIgnoreCase(cargo)) {
				return aux;
			}
			aux = aux.getProx();
		}
		
		return new Funcionario("Nao existe","Nao existe","Nao existe","Nao existe");
	}
	
	public void deletar(String cpf) {
		if(vazia()) return;
		if(inicio.getCpf().equalsIgnoreCase(cpf)) {
			inicio = inicio.getProx();
			return;
		}
		Funcionario aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getProx().getCpf().equalsIgnoreCase(cpf)) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
		}
		aux = aux.getProx();
	}
}
