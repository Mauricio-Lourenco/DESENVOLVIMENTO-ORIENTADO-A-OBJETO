package estacionamento;

import java.util.Scanner;

public class AppEstacionamento {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);

		Estacionamento estacionamento = new Estacionamento(1, "PassaAqui", "Recife", 20, "Desativado");

		System.out.println("========= Dados do estacionamento =========\n");
		System.out.println(estacionamento);
		estacionamento.getAtivar();
		System.out.println();
		System.out.println("===========================================");
		System.out.println();
		System.out.println(estacionamento);

		System.out.println();
		System.out.println("Quantas são as horas da franquia inicial?");
		int horasFranquiaInicial = lerTeclado.nextInt();
		System.out.println("Qual o valor da Franquia inicial?");
		double valorFranquiaInicial = lerTeclado.nextDouble();
		System.out.println("Qual o valor adicional por hora?");
		double valorAdicionalHora = lerTeclado.nextDouble();
		System.out.println("Quantas horas além passou estacionado?");
		double horasEstacionado = lerTeclado.nextDouble();

		estacionamento.setHorasFranquiaInicial(horasFranquiaInicial);
		estacionamento.setValorFranquiaInicial(valorFranquiaInicial);
		estacionamento.setValorAdicionalHora(valorAdicionalHora);
		estacionamento.calcularEstacionamento(horasEstacionado);

		System.out.println("Valor que deve ser pago: " + estacionamento.calcularEstacionamento(horasEstacionado));
		lerTeclado.close();

	}

}
