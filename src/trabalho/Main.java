package trabalho;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ListaClientes clientes = new ListaClientes();
		ListaFuncionarios funcionarios = new ListaFuncionarios();
		ListaMesas mesas = new ListaMesas();
		ListaPedidos pedidos = new ListaPedidos();
		ListaCaixa caixa = new ListaCaixa();
		ListaFila fila = new ListaFila();
		
		boolean sistema = true;
		while(sistema) {
			System.out.println("Escolha a opcao");
			System.out.println("---------------------");
			System.out.println("1 - Gerenciar Cliente");
			System.out.println("2 - Gerenciar funcionario");
			System.out.println("3 - Gerenciar Mesas");
			System.out.println("4 - Gerenciar Pedidos");
			System.out.println("5 - Gerenciar Caixa");
			System.out.println("6 - Gerenciar Atedimento");
			System.out.println("7 - Fechar programa");
			int escolha = input.nextInt();
			switch (escolha) {
			case 1: 
				TelaCliente.TelaCliente(clientes);
				break;
			case 2: 
				TelaFuncionario.TelaFuncionario(funcionarios);
				break;
			case 3:
				TelaMesa.TelaMesa(mesas,clientes,caixa);
				break;
			case 4: 
				TelaPedido.TelaPedido(pedidos,clientes,mesas);
				break;
			case 5 : 
				
				break;
			case 6 : 
				
				break;
			case 7 :
				sistema = false;
				break;	
		}
	}
		
		/*//clientes.cadastrarInicio("1234567","Gleison", "silva", "(47) 89073723");
		//clientes.cadastrarFinal("555","Maria", "Schlemper", "(47) 89084723");
		System.out.println(clientes.mostrar());
		System.out.println(clientes.atualizarCadastro("555","carlos","schlemper","890"));
		//clientes.deletarClientes("555");
		System.out.println(clientes.mostrar());
		System.out.println(clientes.consultar("1234567"));
		
		
		ListaProdutos produtos = new ListaProdutos();
		produtos.cadastrarInicio("Pastel", 5.5);
		produtos.cadastrarInicio("Bolinho", 5.5);
		
		Cliente cliente = clientes.consultar("1234567");
		pedidos.cadastrar(1, cliente, produtos);
		
		ListaProdutos produtos2 = new ListaProdutos();
		produtos2.cadastrarInicio("Pastel", 5.5);

		Cliente cliente2 = clientes.consultar("555");
		pedidos.cadastrar(2, cliente2, produtos2);
		//System.out.println(pedidos.fechamentoConta());
		System.out.println(pedidos.mostrar());
	
	
		System.out.println("\n\n");
		//ListaFuncionarios funcionarios = new ListaFuncionarios();
		funcionarios.cadastrar("Gleison", "Schlemper", "5555", "cozinheiro");
		funcionarios.cadastrar("Maria", "Schlemper", "222", "garcon");
		System.out.println(funcionarios.mostrar());
		
		Funcionario funcionarioCozinheiro = funcionarios.consultar("5555","cozinheiro");
		Funcionario funcionarioGarcon = funcionarios.consultar("222","garcon");
		System.out.println(funcionarioCozinheiro);
		ListaAtendimento atendimentos = new ListaAtendimento();
		atendimentos.cadastrarInicio(funcionarioCozinheiro, funcionarioGarcon, pedidos);
		
		System.out.println(atendimentos.mostrar());
		
		//mesas.cadastrarMesa(1, 4);
		//mesas.cadastrarMesaCliente();
		
		ListaMesas mesas = new ListaMesas();
		ListaClientes clientes = new ListaClientes();
		ListaClientes clientes2 = new ListaClientes();
		ListaCaixa caixa = new ListaCaixa ();
		ListaProdutos produtos = new ListaProdutos();
		ListaPedidos pedidos = new ListaPedidos();
		ListaFila fila = new ListaFila();
		
		clientes.cadastrar("1234567","Gleison", "silva", "(47) 89073723");
		clientes.cadastrar("1234568","maria", "silva", "(47) 89073723");
		clientes2.cadastrar("1234569","maria", "silva", "(47) 89073723");
		fila.cadastrar(clientes);
		fila.cadastrar(clientes2);
		//clientes.deletarPrimeiroCliente();
		//System.out.println(clientes.mostrar());
		
		produtos.cadastrarInicio("Pastel", 5.5);
		produtos.cadastrarInicio("Bolinho", 5.5);
		//System.out.println(clientes.mostrar());
		
		mesas.cadastrarMesa(1, 4);
		mesas.cadastrarMesa(2, 4);
		mesas.cadastrarMesa(3, 4);
		mesas.cadastrarMesaCliente(2, clientes);
		mesas.cadastrarMesaCliente(1, clientes2);
		//int codigoPedido,Cliente cliente,ListaProdutos produtos,Mesa mesa
		Cliente cliente = clientes.consultar("1234567");
		Mesa mesa = mesas.consultar(2);
		// Pedidos tem o valor da compra no restaurante 
		pedidos.cadastrar(1, cliente, produtos, mesa);
		mesas.liberarMesa(2, caixa);
		mesas.liberarMesa(1, caixa);
	
		Pedido pedido = pedidos.consultar(1);
		System.out.println(caixa.mostrarClientesNoCaixa());
	
		System.out.println("Valor da conta: "+caixa.valorDaConta(pedido));
		
		caixa.quantidadeDeClienteNoCaixa();
		Cliente clienteAtendimento = caixa.atenderCliente();
		caixa.removerClienteDoCaixa(clienteAtendimento.getCpf());
		Cliente clienteAtendimento2 = caixa.atenderCliente();
		System.out.println(clienteAtendimento2.getCpf());
		caixa.removerClienteDoCaixa(clienteAtendimento2.getCpf());
		System.out.println(caixa.mostrarClientesNoCaixa());
		//System.out.println(clienteAtendimento.getCpf());
		//caixa.removerClienteDoCaixa();
		//System.out.println(caixa.mostrarClientesNoCaixa());
		//mesas.cadastrarMesaCliente(1, clientes);*/
	}
}
