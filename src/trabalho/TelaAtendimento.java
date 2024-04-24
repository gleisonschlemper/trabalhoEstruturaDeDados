package trabalho;

import java.util.Scanner;

public class TelaAtendimento {
	public static void TelaAtendimento(ListaFuncionarios funcionarios, ListaClientes clientes, ListaAtendimento atendimentos, ListaPedidos pedidos) {
		Scanner input = new Scanner(System.in);
		String garcoCPF,cozinherioCPF,clienteCPF;
		int codigoAtendimento, codigoPedido; 
		boolean sistema = true;
		while(sistema) {
			System.out.println("1 - Cadastrar atendimento ao cliente");
			System.out.println("2 - Mostrar atendimento");
			System.out.println("3 - Sair");
			int escolha = input.nextInt();
			switch (escolha) {
				case 1 : 
					System.out.println("Digite cpf do garcon:");
					garcoCPF = input.next();
					Funcionario funcionarioGarcon = funcionarios.consultar(garcoCPF, "Garcon");
					System.out.println("Digite cpf do cozinheiro:");
					cozinherioCPF = input.next();
					Funcionario funcionarioCozinheiro = funcionarios.consultar(cozinherioCPF, "cozinheiro");
					System.out.println("Digite cpf do cliente:");
					clienteCPF  = input.next();
					Cliente cliente = clientes.consultar(clienteCPF);
					System.out.println("Digite codigo de atendimento:");
					codigoAtendimento = input.nextInt();
					System.out.println("codigo do pedido:");
					codigoPedido = input.nextInt();
					Pedido pedido = pedidos.consultar(codigoPedido);
					atendimentos.cadastrarFinal(funcionarioCozinheiro,funcionarioGarcon, pedido, cliente);
					break;
				case 2 : 
					System.out.println(atendimentos.mostrar());
					break;
				case 3 : 	
					sistema = false;
					break;
					
			}
		}
	}
}
