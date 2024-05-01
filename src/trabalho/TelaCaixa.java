package trabalho;

import java.util.Scanner;

public class TelaCaixa {
	public static void TelaCaixa(ListaCaixa caixa, ListaPedidos pedidos, ListaAtendimento atendimento, ListaFinanceiro financeiro) {
		Scanner input = new Scanner(System.in);
		Cliente cliente;
		int codigoPedido;
		double valorConta,pagarConta;
		
		boolean sistema = true;
		while(sistema) {
			System.out.println("1 - Mostrar cliente no caixa");
			System.out.println("2 - Mostrar quantidade de clientes no caixa");
			System.out.println("3 - Atender cliente");
			System.out.println("4 - Mostrar total de cliente atendidos");
			System.out.println("5 - Sair ");
			int escolha = input.nextInt();
			switch (escolha) {
				case 1 : 
					System.out.println(caixa.mostrarClientesNoCaixa());
					break;
				case 2 : 
					caixa.quantidadeDeClienteNoCaixa();
					break;
				case 3 : 
					Cliente clienteAtendido = caixa.atenderCliente(); // Pega sempre o primeiro da fila
					System.out.println(clienteAtendido);
					System.out.println("Cliente atendido: "+clienteAtendido.getNome()+" "+clienteAtendido.getSobrenome());
					System.out.println("Digite código do Pedido: ");
					codigoPedido = input.nextInt();
					Pedido pedidoCliente = pedidos.consultar(codigoPedido);
					financeiro.cadastrar(clienteAtendido, pedidoCliente);
					valorConta = pedidoCliente.getProdutos().valorTotal();
					System.out.println("Valor da conta: "+valorConta);
					do {
						System.out.println("Ensira o valor da conta");
						pagarConta = input.nextDouble();
					} while(caixa.pagarConta(valorConta,pagarConta));
	
					System.out.println("Obrigado por vim no restaurante\nseu troco deu: "+(pagarConta - valorConta));
					caixa.gerarNotaFiscal(pedidoCliente);
					System.out.println();
					caixa.removerClienteDoCaixa(clienteAtendido.getCpf());
					
					break;
				case 4 : 
					financeiro.mostrar();
					break;
				case 5 : 	
					sistema = false;
					break;
					
			}
		}
	}
}
