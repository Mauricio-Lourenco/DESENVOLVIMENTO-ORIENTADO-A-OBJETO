package controle;

import java.util.Scanner;

public class AppControle {

	static ClasseControle classeControle;
	static Scanner lerTeclado = new Scanner(System.in);

	public static void main(String[] args) {

		int acao;
		do {
			System.out.println("===== Selecione a ação =====");

			System.out.println("Cadastrar controle           [1]");
			System.out.println("Ligar condicionador de ar    [2]");
			System.out.println("Desligar condicionador de ar [3]");
			System.out.println("Aumentar Temperatura de ar   [4]");
			System.out.println("Diminuir Temperatura de ar   [5]");
			System.out.println("Mostrar dados                [6]");
			System.out.println("Ajustar Temperatura          [7]");
			acao = lerTeclado.nextInt();

			switch (acao) {
			case 1:
				cadastrarControle();
				break;
			case 2:
				classeControle.ligarDesligar();
				break;
			case 3:
				classeControle.ligarDesligar();
				break;
			case 4:
				classeControle.aumentarTemperatura();
				System.out.println("Temperatura Atual: " + classeControle.getTemperaturaAtual());

				if (classeControle.getTemperaturaAtual() == classeControle.getTemperaturaMaxima()) {
					System.out.println("Condicionador de ar já está na temperatura máxima");
				}
				break;
			case 5:
				classeControle.diminuirTemperatura();
				System.out.println("Temperatura Atual: " + classeControle.getTemperaturaAtual());

				if (classeControle.getTemperaturaAtual() == classeControle.getTemperaturaMinima()) {
					System.out.println("Condicionador de ar já está na temperatura mínima");
				}
				break;
			case 6:
				mostrarDados();
				break;
			case 7:
				classeControle.ajustarTemperatura();
				break;
			}
		} while (acao != 0);

	}

	public static void cadastrarControle() {
		System.out.println("Informe o Id");
		int idControle = lerTeclado.nextInt();
		System.out.println("Informe a temperatura máxima");
		int temperaturaMaxima = lerTeclado.nextInt();
		System.out.println("Informe a temperatura mínima");
		int temperaturaMinima = lerTeclado.nextInt();
		System.out.println("Informe o modelo");
		String modelo = lerTeclado.next();

		classeControle = new ClasseControle(idControle, temperaturaMaxima, temperaturaMinima, modelo);

	}

	public static void mostrarDados() {
		System.out.printf("Id Controle Remoto: %d", classeControle.getIdControle());
		System.out.printf("\nModelo do controle Remoto: %s", classeControle.getModelo());
		System.out.printf("\nTemperatura Atual: %d", classeControle.getTemperaturaAtual());
		System.out.printf("\nTemperatura Mínima: %d", classeControle.getTemperaturaMinima());
		System.out.printf("\nTemperatura Máxima: %d", classeControle.getTemperaturaMaxima());
		System.out.printf("\nVelocidade: %d", classeControle.getVelocidade());
		System.out.printf("\nEstado: %b\n", classeControle.getModelo());
	}

}
