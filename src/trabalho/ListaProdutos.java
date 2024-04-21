package trabalho;

public class ListaProdutos {
	
	Produto inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Produto getInicio() {
		return inicio;
	}
	
	public void cadastrarInicio(String nome, double preco) {
		Produto novoProduto = new Produto(nome,preco);
		novoProduto.setProx(inicio);
		inicio = novoProduto;
	}
	
	public String mostrar() {		
		if(vazia()) {
			return "Não tem clientes cadastrado";
		}
			
		String lista = "";
		Produto aux = inicio;
		while(aux != null) {
			lista+=aux.getNome()+" "+aux.getPreco()+"\n";
			aux = aux.getProx();
		}	
		return lista;
	}
	
	public Produto consultar(String nome) {
		Produto aux = inicio;
		while(aux != null) {
			if(aux.getNome().equalsIgnoreCase(nome)) {
				return aux;
			}
			aux = aux.getProx();
		}
		
		return null;
	}
	
	public double valorTotal() {
		double conta = 0;
		Produto aux = inicio;
		while(aux != null) {
			conta+=aux.getPreco();
			aux = aux.getProx();
		}
		
		return conta;
	}
}
