package trabalho;

public class Cliente {
	private String cpf;
	private String nome;
	private String sobrenome;
	private String telefone;
	private Cliente prox;
	
	public Cliente(String cpf,String nome, String sobrenome, String telefone) {
		setCpf(cpf);
		setNome(nome);
		setSobrenome(sobrenome);
		setTelefone(telefone);
		setProx(null);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cliente getProx() {
		return prox;
	}

	public void setProx(Cliente prox) {
		this.prox = prox;
	}
	
	
}
