package trabalho;

public class Pedido {
	private boolean ativo;
	private int codigoPedido = 0;
	private Cliente cliente;
	private ListaProdutos produtos;
	private Mesa mesa;
	private Pedido prox;
	
	public Pedido(int codigoPedido,Cliente cliente,ListaProdutos produtos,Mesa mesa) {
		setAtivo(true);
		setCliente(cliente);
		setCodigoPedido(codigoPedido);
		setProdutos(produtos);
		setMesa(mesa);
	}
	
	public int getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ListaProdutos getProdutos() {
		return produtos;
	}
	public void setProdutos(ListaProdutos produtos) {
		this.produtos = produtos;
	}
	public Pedido getProx() {
		return prox;
	}
	public void setProx(Pedido prox) {
		this.prox = prox;
	}

	public boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
}
