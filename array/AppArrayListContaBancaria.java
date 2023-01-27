package array;

import java.util.Scanner;

public class AppArrayListContaBancaria {

	static ContaBancaria[] contaBancaria = new ContaBancaria[3];
	static int contContaBancaria = 0;
	static Scanner lerTeclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao = 0;
		do {
			System.out.println("*** Seletor de Opções ***");
			System.out.println();
			System.out.println("1 - Cadastrar ContaBancaria");
			System.out.println("2 - Consultar ContaBancaria");
			System.out.println("3 - Realizar Deposito");
			System.out.println("4 - Realizar Saque");
			System.out.println("5 - Listar ContaBancaria");
			System.out.println("0 - Finalizar");

			System.out.print("\nOpção: ");
			opcao = lerTeclado.nextInt();

			switch (opcao) {
			case 1:
				cadastrarContaBancaria();
				break;
			case 2:
				consultarContaBancaria();
				break;
			case 3:
				realizarDeposito();
				break;
			case 4:
				realizarSaque();
				break;
			case 5:
				listarContaBancaria();
				break;
			case 0:
				System.out.println("\n--- PROGRAMA FINALIZADO");
				break;
			default:
				System.out.println("\nOpção incorreta");

			}

		} while (opcao != 0);
	}

	public static ContaBancaria pesquisarContaBancariaPorId(int numero) {
		for (ContaBancaria contaBancaria : contaBancaria) {
			if (contaBancaria != null && contaBancaria.getNumero() == numero) {
				return contaBancaria;
			}
		}
		return null;
	}

	public static void cadastrarContaBancaria() {
		System.out.println("\n--- Cadastro de Conta Bancária ---");

		if (contContaBancaria >= contaBancaria.length) {
			System.out.println("\nLimite de contas atingido!!!");
			return;
		}

		int numero;
		do {
			System.out.printf("\nNúmero da conta para cadastrar: ");
			numero = lerTeclado.nextInt();
			if (numero <= 0) {
				System.out.println("O número da conta deve ser um número positivo");
				continue;
			}
			ContaBancaria contaBancaria = pesquisarContaBancariaPorId(numero);
			if (contaBancaria != null) {
				System.out.println("Conta Bancária já existente");
				continue;
			}
			break;
		} while (true);

		System.out.printf("Tipo: ");
		lerTeclado.nextLine();
		String tipo = lerTeclado.nextLine();

		double limite;
		do {
			System.out.printf("Limite: ");
			limite = lerTeclado.nextDouble();
			if (limite <= 0) {
				System.out.println("O limite da conta deve ser um número positivo");
				continue;
			}
			break;
		} while (true);

		contaBancaria[contContaBancaria] = new ContaBancaria(numero, tipo, limite);

		System.out.printf("\nCadastro efetuado\n");
		contContaBancaria++;
	}

	public static void alterarContaBancaria() {
		System.out.println("\n--- Alteração de Conta Bancária ---");

		if (contContaBancaria == 0) {
			System.out.println("\nNão há Conta Bancária cadastrada!!!");
			return;
		}

		int numero;
		ContaBancaria contaBancariaEncontrada;
		do {
			System.out.printf("\nNúmero da conta para cadastrar: ");
			numero = lerTeclado.nextInt();
			if (numero <= 0) {
				System.out.println("O número da conta deve ser um número positivo");
				continue;
			}
			contaBancariaEncontrada = pesquisarContaBancariaPorId(numero);
			if (contaBancariaEncontrada == null) {
				System.out.println("\nConta Bancária não cadastrada!!!");
				continue;
			}

			break;
		} while (true);

		System.out.printf("Tipo: ");
		lerTeclado.nextLine();
		String tipo = lerTeclado.nextLine();

		double limite;
		do {
			System.out.printf("Limite: ");
			limite = lerTeclado.nextDouble();
			if (limite <= 0) {
				System.out.println("O limite da conta deve ser um número positivo");
				continue;
			}
			break;
		} while (true);

		contaBancariaEncontrada.setTipo(tipo);
		contaBancariaEncontrada.setLimite(limite);

		System.out.printf("\nAlteração efetuada\n");
	}

	public static void consultarContaBancaria() {
		System.out.println("\n--- Consulta de Conta Bancaria ---");
		if (contContaBancaria == 0) {
			System.out.println("\nNão há Conta Bancária cadastrada!!!");
			return;
		}

		System.out.printf("\nNúmero da conta para consultar: ");
		int numero = lerTeclado.nextInt();

		ContaBancaria contaBancariaEncontrada = pesquisarContaBancariaPorId(numero);
		if (contaBancariaEncontrada == null) {
			System.out.println("\nConta Bancária não cadastrada!!!");
			return;
		}
		System.out.printf("\nNúmero...........: %d", contaBancariaEncontrada.getNumero());
		System.out.printf("\nTipo.............: %s", contaBancariaEncontrada.getTipo());
		System.out.printf("\nLimite...........: %.2f", contaBancariaEncontrada.getLimite());
		System.out.printf("\nSaldo............: %.2f", contaBancariaEncontrada.getSaldo());
		System.out.printf("\nSaldo disponível.: %.2f\n", contaBancariaEncontrada.obterSaldoDisponivel());

	}

	public static void realizarDeposito() {
		System.out.println("\n--- Registrar Deposito ---");
		if (contContaBancaria == 0) {
			System.out.println("\nNão há Conta Bancária cadastrada!!!");
			return;
		}

		System.out.printf("\nNúmero da conta para deposito: ");
		int numero = lerTeclado.nextInt();

		ContaBancaria contaBancariaEncontrada = pesquisarContaBancariaPorId(numero);
		if (contaBancariaEncontrada == null) {
			System.out.println("\nConta Bancária não cadastrada!!!");
			return;
		}

		System.out.println("Valor do deposito:");
		double valorDeposito = lerTeclado.nextDouble();

		contaBancariaEncontrada.realizarDeposito(valorDeposito);
		System.out.println("\nDeposito realizado!!!");

	}

	public static void realizarSaque() {
		System.out.println("\n--- Registrar Saque ---");
		if (contContaBancaria == 0) {
			System.out.println("\nNão há Conta Bancária cadastrada!!!");
			return;
		}

		System.out.printf("\nNúmero da conta para saque: ");
		int numero = lerTeclado.nextInt();

		ContaBancaria contaBancariaEncontrada = pesquisarContaBancariaPorId(numero);
		if (contaBancariaEncontrada == null) {
			System.out.println("\nConta Bancária não cadastrada!!!");
			return;
		}

		System.out.println("Valor do saque:");
		double valorSaque = lerTeclado.nextDouble();

		if (contaBancariaEncontrada.realizarSaque(valorSaque) == true) {
			System.out.println("\nSaque realizado!!!");
		} else {
			System.out.println("\nSaldo Indisponível!!!");
		}
	}

	public static void listarContaBancaria() {
		if (contContaBancaria == 0) {
			System.out.println("\nNão há Conta Bancária cadastrada!!!");
			return;
		}
		System.out.println("      Listagem de Conta Bancaria");
		System.out.println("_______________________________________________\n");
		System.out.println("Numero   Tipo   Limite      Saldo   Saldo disp.");
		System.out.println("_______________________________________________");

		for (int i = 0; i < contaBancaria.length; i++) {
			if (contaBancaria[i] != null) {
				System.out.printf("\n%-7d  %-4s %8.2f   %8.2f      %8.2f", contaBancaria[i].getNumero(),
						contaBancaria[i].getTipo(), contaBancaria[i].getLimite(), contaBancaria[i].getSaldo(),
						contaBancaria[i].obterSaldoDisponivel());
			}
		}
		System.out.println("\n_______________________________________________");

	}

}
