package trabalho;

import java.util.Scanner;

public class TelaFila {

	public static void TelaFila(ListaFila fila) {
		Scanner input = new Scanner(System.in);
		Cliente cliente;
		
		boolean sistema = true;
		while(sistema) {
			String clienteCPF;
			System.out.println("1 - Mostrar Clientes na Fila");
			System.out.println("2 - Consultar Clientes na Fila");
			System.out.println("3 - Sair");
			int escolha = input.nextInt();
			switch (escolha) {
				case 1 : 
					System.out.println(fila.mostrar());
					break;
				case 2 : 
					System.out.println("Digite CPF");
					clienteCPF = input.next();
					cliente = fila.consultar(clienteCPF);
					System.out.println("Nome: "+cliente.getNome());
					System.out.println("Sobrenome: "+cliente.getSobrenome());
					System.out.println("CPF: "+cliente.getCpf());
					System.out.println("Telefone: "+cliente.getTelefone());
					break;
				case 3 : 	
					sistema = false;
					break;
					
			}
		}
	}
}
