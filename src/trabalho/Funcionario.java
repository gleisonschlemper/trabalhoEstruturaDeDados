package trabalho;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private String cargo;
	private String cpf;
	private Funcionario prox;
	
	public Funcionario(String nome,String sobrenome,String cpf,String cargo) {
		setNome(nome);
		setSobrenome(sobrenome);
		setCargo(cargo);
		setCpf(cpf);
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Funcionario getProx() {
		return prox;
	}

	public void setProx(Funcionario prox) {
		// TODO Auto-generated method stub
		this.prox = prox;
	}

	
	
	
	
}
