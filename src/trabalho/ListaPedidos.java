package trabalho;

public class ListaPedidos {
	Pedido inicio;
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public Pedido getInicio() {
		return inicio;
	}
	
	public void cadastrar(int codigoPedido,Cliente cliente,ListaProdutos produtos,Mesa mesa) {
		Pedido novoProduto = new Pedido(codigoPedido,cliente,produtos,mesa);
		novoProduto.setProx(inicio);
		inicio = novoProduto;
	}
	
	public String mostrar() {		
		if(vazia()) {
			return "Não tem pedidos cadastrado";
		}
			
		String lista = "";
		Pedido aux = inicio;
		while(aux != null) {
			lista+="Pedido: "+aux.getCodigoPedido()+"\n";
			lista+="Nome completo do cliente: "+aux.getCliente().getNome()+" "+aux.getCliente().getSobrenome()+"\n";
			lista+="Numero da mesa: "+aux.getMesa().getCodigo()+"\n";
			lista+="Capacidade da mesa: "+aux.getMesa().getCapacidade()+"\n";
			lista+="Produtos comprados: \n";
			lista+=aux.getProdutos().mostrar()+"\n";
			lista+="------------------------------";
			aux = aux.getProx();
		}	
		return lista;
	}
	
	
	public void alterarPedido(int codigoPedido,ListaProdutos produtos) {		
		Pedido aux = inicio;
		while(aux != null) {
			if(aux.getCodigoPedido() == codigoPedido) {
				aux.setProdutos(produtos);
				System.out.println("atualiacao realizado com sucesso!");
				return;
			}
			aux = aux.getProx();
		}
		
		System.out.println("CPF inexistente");
	}
	
	public Pedido consultar(int codigoPedido) {
		Pedido aux = inicio;
		while(aux != null) {
			if(aux.getCodigoPedido() == codigoPedido) {
				return aux;
			}	
			aux = aux.getProx();
		}
		
		return new Pedido(0, null, null,null);
	}
	
	public void cancelarPedido(int codigoPedido) {
		
		if(vazia()) return;
		if(inicio.getCodigoPedido() == codigoPedido) {
			inicio = inicio.getProx();
			System.out.println("Pedido cancelado");
			return;
		}
		
		Pedido aux = inicio;
		while(aux.getProx() != null) {
			if(aux.getCodigoPedido() == codigoPedido) {
				aux.setProx(aux.getProx().getProx());
				System.out.println("Pedido cancelado");
				return;
			}
			aux = aux.getProx();
		}
		System.out.println("Pedido não existe");
	}
}
