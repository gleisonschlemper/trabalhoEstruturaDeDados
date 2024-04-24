package trabalho;

public class ListaAtendimento {
	private Atendimento inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Atendimento getInicio() {
		return inicio;
	}
	
	public void cadastrarInicio(Funcionario cozinheiro, Funcionario garcon, Pedido pedido,Cliente cliente) {
		Atendimento novoAtedimento = new Atendimento(cozinheiro,garcon,pedido,cliente);
		novoAtedimento.setProx(inicio);
		inicio = novoAtedimento;
	}
	
	public void cadastrarFinal(Funcionario cozinheiro, Funcionario garcon, Pedido pedido,Cliente cliente) {
		if(vazia()) {
			cadastrarInicio(cozinheiro,garcon,pedido,cliente);
			return;
		}	
		Atendimento novoAtedimento = new Atendimento(cozinheiro,garcon,pedido,cliente);
		Atendimento aux = inicio;
		while(aux.getProx() != null) {
			aux = aux.getProx();
		}
		aux.setProx(novoAtedimento);
	}
	
	public String mostrar() {
		
		if(vazia()) {
			return "Não tem Funcionario cadastrado";
		}
		
		String lista = "";
		Atendimento aux = inicio;
		while(aux != null) {
			lista+="Cozinheiro: "+aux.getCozinheiro().getNome()+"\nGarcon: "+aux.getGarcon().getNome()+" "+aux.getGarcon().getSobrenome()+"\nProdutos comprados: "+aux.getPedido().getProdutos().mostrar()+"\n";
			aux = aux.getProx();
		}
		
		return lista;
	}
}
