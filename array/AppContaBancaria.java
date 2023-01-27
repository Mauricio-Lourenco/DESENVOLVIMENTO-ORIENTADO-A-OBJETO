package array;

import java.util.Scanner;

public class AppContaBancaria {

	public static ContaBancaria[] vetorContas = new ContaBancaria[3];

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);

		for (int i = 0; i < vetorContas.length; i++) {

			int numero;
			do {
				System.out.print("Digite o número da conta: ");
				numero = lerTeclado.nextInt();
				if (numero <= 0) {
					System.out.println();
					System.out.println("Número Inválido. Digite um positivo");
					continue;
				}
				break;
			} while (true);

			lerTeclado.nextLine();
			System.out.print("Digite o tipo de conta: ");
			String tipo = lerTeclado.nextLine();

			double limite;
			do {
				System.out.println("Digite o limite: ");
				limite = lerTeclado.nextDouble();
				if (limite <= 0) {
					System.out.println("Limite inválido. Digite um positivo");
				}
				System.out.println("=======================================");
				break;
			} while (true);

			vetorContas[i] = new ContaBancaria(numero, tipo, limite);
		}

		lerTeclado.close();
	}
}
