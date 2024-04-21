package trabalho;

public class Atendimento {
	private int codigoDeAtimento;
	private Funcionario cozinheiro;
	private Funcionario garcon;
	private ListaPedidos pedidos;
	private Atendimento prox;
	
	public Atendimento(Funcionario cozinheiro, Funcionario garcon, ListaPedidos pedidos) {
		setCozinheiro(cozinheiro);
		setGarcon(garcon);
		setPedidos(pedidos);
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
	public ListaPedidos getPedidos() {
		return pedidos;
	}
	public void setPedidos(ListaPedidos pedidos) {
		this.pedidos = pedidos;
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
