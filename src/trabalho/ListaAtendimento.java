package trabalho;

public class ListaAtendimento {
	private Atendimento inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Atendimento getInicio() {
		return inicio;
	}
	
	public void cadastrarInicio(Funcionario cozinheiro, Funcionario garcon, ListaPedidos pedidos) {
		Atendimento novoAtedimento = new Atendimento(cozinheiro,garcon,pedidos);
		novoAtedimento.setProx(inicio);
		inicio = novoAtedimento;
	}
	
	public void cadastrarFinal(Funcionario cozinheiro, Funcionario garcon, ListaPedidos pedidos) {
		if(vazia()) {
			cadastrarInicio(cozinheiro,garcon,pedidos);
			return;
		}	
		Atendimento novoAtedimento = new Atendimento(cozinheiro,garcon,pedidos);
		Atendimento aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoAtedimento);
	}
	
	public String mostrar() {
		
		if(vazia()) {
			return "Não tem clientes cadastrado";
		}
		
		String lista = "";
		Atendimento aux = inicio;
		while(aux != null) {
			lista+=aux.getCozinheiro()+" "+aux.getGarcon()+" "+aux.getPedidos()+"\n";
			aux = aux.getProx();
		}
		
		return lista;
	}
}
