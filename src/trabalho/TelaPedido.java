package trabalho;

import java.util.Scanner;

public class TelaPedido {
	public static void TelaPedido(ListaPedidos pedidos,ListaClientes clientes, ListaMesas mesas) {
		Scanner input = new Scanner(System.in);
		boolean sistema = true;
		while(sistema) {
			String produto,clienteCPF;
			int numeroPedido,numeroDaMesa;
			double preco;
			Cliente cliente;
			ListaProdutos produtos;
			boolean ativoProdutos = true;
			System.out.println("");
			System.out.println("1 - Registrar Pedidos");
			System.out.println("2 - Alterar Pedido");
			System.out.println("3 - Cancelar Pedido");
			System.out.println("4 - Consultar Pedido");
			System.out.println("5 - mostrar todos pedidos");
			System.out.println("6 - Sair");
			int escolha = input.nextInt();
			switch (escolha) {
				case 1 : 
					System.out.println("Numero do pedido: ");
					numeroPedido = input.nextInt();
					System.out.println("CPF do cliente: ");
					clienteCPF = input.next();
					cliente = clientes.consultar(clienteCPF);
					System.out.println(cliente.getNome()+" "+cliente.getSobrenome());
					System.out.println("Numero da mesa: ");
					numeroDaMesa = input.nextInt();
					Mesa mesa = mesas.consultar(numeroDaMesa);
					produtos = new ListaProdutos();
					while(ativoProdutos) {
						System.out.println("Nome do Produto:");
						produto = input.next();
						System.out.println("Preco do preduto:");
						preco = input.nextDouble();
						produtos.cadastrarInicio(produto, preco);
						System.out.println("Continuar Pedir produto");
						System.out.println("1 - Sim");
						System.out.println("2 - Nao");
						int continuar = input.nextInt();
						if(continuar == 1)ativoProdutos = true;
						else ativoProdutos = false;
					}
					
					pedidos.cadastrar(escolha, cliente, produtos,mesa);
					break;
				case 2 : 
					System.out.println("Numero do pedido: ");
					numeroPedido = input.nextInt();
					produtos = new ListaProdutos();
					while(ativoProdutos) {
						System.out.println("Nome do Produto:");
						produto = input.next();
						System.out.println("Preco do preduto:");
						preco = input.nextDouble();
						produtos.cadastrarInicio(produto, preco);
						System.out.println("Continuar Pedir produto");
						System.out.println("1 - Sim");
						System.out.println("2 - Nao");
						int continuar = input.nextInt();
						if(continuar == 1)ativoProdutos = true;
						else ativoProdutos = false;
					}
					
					pedidos.alterarPedido(numeroPedido,produtos);
					break;
				case 3 : 
					System.out.println("Numero do pedido: ");
					numeroPedido = input.nextInt();
	
					pedidos.cancelarPedido(numeroPedido);
					break;
				case 4 : 
					System.out.println("Numero do pedido: ");
					numeroPedido = input.nextInt();
					System.out.println("CPF do cliente: ");
					clienteCPF = input.next();
					Pedido pedido = pedidos.consultar(numeroPedido);
					if(pedido.getCodigoPedido() == 0 && 
					   pedido.getCliente() == null && 
					   pedido.getProdutos() == null) 
						System.out.println("Pedido nao existe");
					else {
						System.out.println("Numero do Pedido: "+pedido.getCodigoPedido());
						System.out.println("Nome completo do Cliente: "+pedido.getCliente().getNome()+" "+pedido.getCliente().getSobrenome());
						System.out.println("CPF do cliente: "+pedido.getCliente().getCpf());
						System.out.println("Numero da mesa: "+pedido.getMesa().getCodigo());
						System.out.println("Produtos do clientes: ");
						System.out.println(pedido.getProdutos().mostrar());
					}
					break;
				case 5 : 
					System.out.println("Pedidos ativos:");
					System.out.println("---------------");
					System.out.println(pedidos.mostrar());
					break;
				case 6 : 
					sistema = false;
					break;
			}
		}
	}
}
