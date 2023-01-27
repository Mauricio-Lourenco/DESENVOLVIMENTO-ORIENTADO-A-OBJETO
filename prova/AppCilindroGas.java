package prova;

import java.util.Scanner;

public class AppCilindroGas {
	static CilindroGas cilindroGas;
	static Scanner lerTeclado = new Scanner(System.in);

	public static void main(String[] args) {

		int acao;
		do {
			System.out.println("===== Selecione a ação =====");

			System.out.println("Cadastrar cilindro [1]");
			System.out.println("Abastecer cilindro [2]");
			System.out.println("Esvaziar cilindro  [3]");
			System.out.println("Realizar consumo   [4]");
			System.out.println("Mostrar dados      [5]");
			System.out.println("Encerrar aplicação [6]");
			acao = lerTeclado.nextInt();

			switch (acao) {
			case 1:
				cadastrarCilindro();
				break;
			case 2:
				cilindroGas.abastecerCilindro();
				break;
			case 3:
				cilindroGas.esvaziarCilindro();
				break;
			case 4:
				registrarConsumo();
				break;
			case 5:
				mostrarDados();
				break;
			}
		} while (acao != 0);

	}

	public static void cadastrarCilindro() {
		System.out.println("Informe o Id do cilindro");
		int idCilindro = lerTeclado.nextInt();
		System.out.println("Informe a localização");
		String localizacao = lerTeclado.next();
		System.out.println("Informe a capacidade máxima");
		double capacidadeMaxima = lerTeclado.nextDouble();
		System.out.println("Informe o custo/Kg de gás");
		double custoKg = lerTeclado.nextDouble();

		cilindroGas = new CilindroGas(idCilindro, localizacao, capacidadeMaxima, custoKg);
		mostrarDados();
	}

	public static void registrarConsumo() {
		System.out.println("============================================");
		System.out.println("Informe quanto deseja consumir");
		double qtdeKg = lerTeclado.nextDouble();
		boolean situacao = cilindroGas.registrarConsumo(qtdeKg);
		if (situacao == true) {
			System.out.println("Consumo Registrado");
			System.out.println("=============================================");
		} else {
			System.out.println("Consumo não registrado");
			System.out.println("Quantidade maior que o consumo permitido");
			System.out.println("==============================================");
		}
		mostrarDados();

	}

	public static void mostrarDados() {
		System.out.println("Id do cilindro: " + cilindroGas.getIdCilindro());
		System.out.println("Localização: " + cilindroGas.getLocalizacao());
		System.out.println("Capacidade Máxima: " + cilindroGas.getCapacidadeMaxima());
		System.out.println("Capacidade Atual: " + cilindroGas.getCapacidadeAtual());
		System.out.println("Custo do abastecimento: " + cilindroGas.getCustoAbastecimento());
		System.out.println("Status do Kg" + cilindroGas.getCustoKg());
	}

}
