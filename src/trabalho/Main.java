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
		ListaAtendimento atendimentos = new ListaAtendimento();
		ListaFinanceiro financeiro = new ListaFinanceiro();
		
		boolean sistema = true;
		while(sistema) {
			System.out.println("Escolha a opcao");
			System.out.println("---------------------");
			System.out.println("1 - Gerenciar Cliente");
			System.out.println("2 - Gerenciar funcionario");
			System.out.println("3 - Gerenciar Mesas");
			System.out.println("4 - Gerenciar Pedidos");
			System.out.println("5 - Gerenciar Caixa");
			System.out.println("6 - Gerenciar Fila");
			System.out.println("7 - Gerenciar Atedimento aos clientes");
			System.out.println("8 - Fechar programa");
			int escolha = input.nextInt();
			switch (escolha) {
			case 1: 
				TelaCliente.TelaCliente(clientes,fila);
				break;
			case 2: 
				TelaFuncionario.TelaFuncionario(funcionarios);
				break;
			case 3:
				TelaMesa.TelaMesa(mesas,clientes,caixa,fila);
				break;
			case 4: 
				TelaPedido.TelaPedido(pedidos,clientes,mesas);
				break;
			case 5 : 
				TelaCaixa.TelaCaixa(caixa,pedidos,atendimentos,financeiro);
				break;
			case 6 : 
				TelaFila.TelaFila(fila);
				break;
			case 7 : 
				TelaAtendimento.TelaAtendimento(funcionarios,clientes,atendimentos,pedidos);
				break;
			case 8 :
				sistema = false;
				break;	
		}
	}
	}
}
