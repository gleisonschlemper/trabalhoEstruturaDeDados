package trabalho;

import java.util.Scanner;

public class TelaMesa {
	public static void TelaMesa(ListaMesas mesas, ListaClientes clientes,ListaCaixa caixa,ListaFila fila) {
		Scanner input = new Scanner(System.in);
		boolean sistema = true;
		while(sistema) {
			int numeroDaMesa, capacidadeDaMesa;
			String clienteCPF;
			System.out.println("");
			System.out.println("1 - Mesas ocupadas");
			System.out.println("2 - Mesas disponiveis");
			System.out.println("3 - Ocupar mesa");
			System.out.println("4 - Alterar capacidade da mesa");
			System.out.println("5 - Cadastrar mesa");
			System.out.println("6 - Liberar Mesa");
			System.out.println("7 - Sair");
			int escolha = input.nextInt();
			switch (escolha) {
				case 1 : 
					System.out.println("Mesas Ocupados");
					System.out.println(mesas.mostrarMesasOcupadas());
					break;
				case 2 : 
					System.out.println("Mesas disponiveis");
					System.out.println(mesas.mostrarMesasDisponiveis());	
					break;
				case 3 : 
					ListaClientes clientesMesa = new ListaClientes();
					boolean ativoCliente = true;
					System.out.println("Numero da mesa: ");
					numeroDaMesa = input.nextInt();
					while(ativoCliente) {		
						System.out.println("CPF do Cliente: ");
						String cpf = input.next();
						fila.deletarClientes(cpf);
						Cliente cliente = clientes.consultar(cpf);
						clientesMesa.cadastrar(cliente.getNome(), cliente.getSobrenome(), cliente.getCpf(), cliente.getTelefone());
						System.out.println("Continuar cadastrar cliente na mesa");
						System.out.println("1 - Sim");
						System.out.println("2 - Nao");
						int continuar = input.nextInt();
						if(continuar == 1) ativoCliente = true;
						else ativoCliente = false;
					}
					mesas.cadastrarMesaCliente(numeroDaMesa, clientesMesa);
					break;
				case 4 : 
					System.out.println("Numero da mesa: ");
					numeroDaMesa = input.nextInt();
					System.out.println("Nova capacidade: ");
					capacidadeDaMesa = input.nextInt();
					mesas.alterarCapacidade(numeroDaMesa, capacidadeDaMesa);
					System.out.println(mesas.mostrar());
					break;
				case 5 : 
					System.out.println("Numero da mesa: ");
					numeroDaMesa = input.nextInt();
					System.out.println("Capacidade da mesa: ");
					capacidadeDaMesa = input.nextInt();
					mesas.cadastrarMesa(numeroDaMesa, capacidadeDaMesa);
					System.out.println(mesas.mostrar());
					break;
				case 6: 
					System.out.println("Numero da Mesa");
					numeroDaMesa = input.nextInt();
					System.out.println("CPF do cliente que saiu da mesa: ");
					clienteCPF = input.next();
					Cliente cliente = clientes.consultar(clienteCPF);
					mesas.liberarMesa(numeroDaMesa,caixa);
					break;
				case 7: 
					sistema = false;
					break;
			}
		}
	}
}
