package controleRemoto;

import java.util.Scanner;

public class AppControleRemoto {
	static ControleRemoto controle = new ControleRemoto(122, "Creg", 16, 25);

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		dadosControleRemoto();
		System.out.println("==========================\n");

		controle.ligarDesligar();

		int opcao = 0;
		do {

			System.out.println(
					"\nOpção 1 (Aumentar temperatura)\nOpção 2 (Diminuir Temperatura)\nOpção 3 (Ajustar Velocidade)\nOpção 3 (Ligar/Desligar)\nOpção 5 (Mostrar Temperatura)");
			System.out.println("Escolha A Opção:");
			opcao = scan.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Program Finalizado");
				break;
			case 1:
				controle.aumentarTemperatura();
				System.out.printf("Temperatura Atual: %d\n", controle.getTemperaturaAtual());

				if (controle.getTemperaturaAtual() == controle.getTemperaturaMaxima()) {
					System.out.println("Condicionador de ar já está na temperatura máxima");
				}
				break;
			case 2:
				controle.diminuirTemperatura();
				System.out.printf("Temperatura Atual: %d\n", controle.getTemperaturaAtual());

				if (controle.getTemperaturaAtual() == controle.getTemperaturaMinima()) {
					System.out.println("Condicionador de ar já está na temperatura minima");
				}
				break;
			case 3:
				for (int i = 0; i < 5; i++) {
					controle.ajustarVelocidade();
					System.out.printf("\nVelocidade: %d\n", controle.getVelocidade());
				}
				;
				break;
			case 4:
				controle.ligarDesligar();
				break;
			case 5:
				controle.getTemperaturaAtual();
				if (controle.getLigado() == false) {
					System.out.println("Equipamento Desligado");
				} else {
					System.out.printf("Temperatura Atual: %d\n", controle.getTemperaturaAtual());
				}
				break;
			}
		} while (opcao != 0);
		scan.close();
	}

	public static void dadosControleRemoto() {
		System.out.printf("Id Controle Remoto: %d", controle.getIdControle());
		System.out.printf("\nModelo do controle Remoto: %s", controle.getModelo());
		System.out.printf("\nTemperatura Atual: %d", controle.getTemperaturaAtual());
		System.out.printf("\nTemperatura Mínima: %d", controle.getTemperaturaMinima());
		System.out.printf("\nTemperatura Máxima: %d", controle.getTemperaturaMaxima());
		System.out.printf("\nVelocidade: %d", controle.getVelocidade());
		System.out.printf("\nEstado: %b\n", controle.getLigado());
	}
}
