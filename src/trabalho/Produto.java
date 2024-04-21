package trabalho;

public class Produto {

	private String nome;
	private double preco;
	private Produto prox;
	
	public Produto(String nome,  double preco){
		setNome(nome);
		setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public  double getPreco() {
		return preco;
	}

	public void setPreco( double preco) {
		this.preco = preco;
	}

	public Produto getProx() {
		return prox;
	}

	public void setProx(Produto prox) {
		this.prox = prox;
	}
	
	
	
}
