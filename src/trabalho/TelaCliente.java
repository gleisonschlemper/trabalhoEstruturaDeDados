package trabalho;

import java.util.Scanner;

public class TelaCliente {
	
	public static void TelaCliente(ListaClientes clientes) {
		Scanner input = new Scanner(System.in);
		boolean sistema = true;
		while(sistema) {
			String nome,sobrenome,cpf,telefone;
			System.out.println("");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Deletar Cliente");
			System.out.println("3 - Consultar Cliente");
			System.out.println("4 - Atualizar dados do cliente");
			System.out.println("5 - Mostrar todos clientes");
			System.out.println("6 - Sair");
			int escolha = input.nextInt();
			switch (escolha) {
				case 1 : 
					System.out.println("CPF do Cliente:");
					cpf = input.next();
					System.out.println("Nome do Cliente:");
					nome = input.next();
					System.out.println("Sobrenome do Cliente:");
					sobrenome = input.next();
					System.out.println("Telefone do Cliente:");
					telefone = input.next();
					clientes.cadastrar(cpf,nome,sobrenome,telefone);
					break;
				case 2 : 
					System.out.println("CPF do Cliente:");
					cpf = input.next();
					clientes.deletarClientes(cpf);
					break;
				case 3 : 
					System.out.println("CPF do Cliente:");
					cpf = input.next();
					Cliente cliente = clientes.consultar(cpf);
					System.out.println("Dados do Cliente:");
					System.out.println("------------------");
					System.out.println("Nome: "+cliente.getNome());
					System.out.println("Sobrenome: "+cliente.getSobrenome());
					System.out.println("CPF: "+cliente.getCpf());
					System.out.println("Telefone: "+cliente.getTelefone());
					break;
				case 4 : 
					System.out.println("CPF do Cliente:");
					cpf = input.next();
					System.out.println("Nome do Cliente:");
					nome = input.next();
					System.out.println("Sobrenome do Cliente:");
					sobrenome = input.next();
					System.out.println("Telefone do Cliente:");
					telefone = input.next();
					System.out.println(clientes.atualizarCadastro(cpf,nome,sobrenome,telefone));
					break;
				case 5 : 
					System.out.println("Clientes Cadastrados");
					System.out.println(clientes.mostrar());
					break;
				case 6 : 	
					sistema = false;
					break;
					
			}
		}
	}
}
