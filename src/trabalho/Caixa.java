package trabalho;

public class Caixa {
	private Funcionario funcionario;
	private ListaClientes clientes;
	private ListaPedidos pedidos;
	private double valorDaConta;
	private Caixa prox;
	
	public Caixa(ListaClientes clientes) {
		setClientes(clientes);
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ListaPedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(ListaPedidos pedidos) {
		this.pedidos = pedidos;
	}

	public ListaClientes getClientes() {
		return clientes;
	}

	public void setClientes(ListaClientes clientes) {
		this.clientes = clientes;
	}

	public double getValorDaConta() {
		return valorDaConta;
	}

	public void setValorDaConta(double valorDaConta) {
		this.valorDaConta = valorDaConta;
	}

	public Caixa getProx() {
		return prox;
	}
	public void setProx(Caixa prox) {
		this.prox = prox;
	}
}
