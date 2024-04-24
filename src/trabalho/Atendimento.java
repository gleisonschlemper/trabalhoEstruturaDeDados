package trabalho;

public class Atendimento {
	private int codigoDeAtimento;
	private Funcionario cozinheiro;
	private Funcionario garcon;
	private Pedido pedido;
	private Cliente cliente;
	private Atendimento prox;

	public Atendimento(Funcionario cozinheiro, Funcionario garcon, Pedido pedido,Cliente cliente) {
		setCozinheiro(cozinheiro);
		setGarcon(garcon);
		setPedido(pedido);
		setCliente(cliente);
	}
	
	public Funcionario getCozinheiro() {
		return cozinheiro;
	}
	public void setCozinheiro(Funcionario cozinheiro) {
		this.cozinheiro = cozinheiro;
	}
	public Funcionario getGarcon() {
		return garcon;
	}
	public void setGarcon(Funcionario garcon) {
		this.garcon = garcon;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Atendimento getProx() {
		return prox;
	}

	public void setProx(Atendimento prox) {
		this.prox = prox;
	}

	public int getCodigoDeAtimento() {
		return codigoDeAtimento;
	}

	public void setCodigoDeAtimento(int codigoDeAtimento) {
		this.codigoDeAtimento = codigoDeAtimento;
	}
}
