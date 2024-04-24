package trabalho;

import java.util.Scanner;

public class TelaFuncionario {
	public static void TelaFuncionario(ListaFuncionarios funcionarios) {
		Scanner input = new Scanner(System.in);
		boolean sistema = true;
		while(sistema) {
			String nome,sobrenome,cpf,nomeCargo;
			Funcionario funcionario;
			int cargo;
			System.out.println("\n");
			System.out.println("1 - Cadastrar Funcionario");
			System.out.println("2 - Deletar Funcionario");
			System.out.println("3 - Consultar Funcionario");
			System.out.println("4 - Mostrar todos Funcionario");
			System.out.println("5 - Sair");
			int escolha = input.nextInt();
			switch (escolha) {
				case 1 : 
					System.out.println("CPF do Funcionario:");
					cpf = input.next();
					System.out.println("Nome do Funcionario:");
					nome = input.next();
					System.out.println("Sobrenome do Funcionario:");
					sobrenome = input.next();
					System.out.println("Digite a Opção de cargo");
					System.out.println("1 - Garcon");
					System.out.println("2 - Cozinheiro");
					cargo = input.nextInt();
					if(cargo == 1) 
						funcionarios.cadastrar(nome, sobrenome, cpf, "Garcon");
					else if(cargo == 2)
						funcionarios.cadastrar(nome, sobrenome, cpf, "Cozinheiro");
					break;
				case 2 : 
					System.out.println("CPF do Funcionario: ");
					cpf = input.next();
					funcionarios.deletar(cpf);
					break;
				case 3 : 
					System.out.println("CPF do Funcionario: ");
					cpf = input.next();
					System.out.println("Cargo do Funcionario: ");
					nomeCargo = input.next();
					funcionario = funcionarios.consultar(cpf, nomeCargo);
					System.out.println("Dados do Funcionario");
					System.out.println("--------------------");
					System.out.println("Nome: "+funcionario.getNome());
					System.out.println("Sobrenome: "+funcionario.getSobrenome());
					System.out.println("CPF: "+funcionario.getCpf());
					System.out.println("Cargo: "+funcionario.getCargo());
					break;
				case 4 : 
					System.out.println("Funcionarios cadastrados:");
					System.out.println("------------------------");
					System.out.println(funcionarios.mostrar());
					break;
				case 5 : 
					sistema = false;
					break;
			}
		}
	}
}
