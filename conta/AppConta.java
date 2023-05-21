package conta;

import java.util.Scanner;

public class AppConta {

	public static void main(String[] args) {
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("======= Cadastro de Conta Bancária =======");
		
		System.out.println("Digite o número da conta: ");
		int numero = lerTeclado.nextInt();
		lerTeclado.nextLine();
		System.out.println("Digite o tipo de conta [Corrente | Poupança]: ");
		String tipo = lerTeclado.nextLine();
		
		Conta conta = new Conta();
		conta.cadastroConta(numero, tipo);
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Realize o depósito: ");
			double deposito = lerTeclado.nextDouble();
			conta.deposito(deposito);
		}
		
		System.out.println("====");
		System.out.println("");
		
		for ( int i = 0; i < 2; i++) {
			System.out.println("Digite o valor do saque: ");
			double saque = lerTeclado.nextDouble();
			conta.saque(saque);
		}
		
		System.out.println("====================");
		System.out.println("\nNúmero da Conta: " + conta.numero);
		System.out.println("Tipo da Conta: " + conta.tipo);
		System.out.printf("Saldo em Conta: %.2f", conta.saldo);
		
		
		lerTeclado.close();
	}
}
