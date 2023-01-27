package medidor;

import java.util.Scanner;

public class AppMedidorEnergia {

	public static void main(String[] args) {

		Scanner lerTeclado = new Scanner(System.in);

		System.out.println("Informe o Id Medidor: ");
		int idMedidor = lerTeclado.nextInt();
		lerTeclado.nextLine();
		System.out.println("Informe o número de serie: ");
		String nrSerie = lerTeclado.nextLine();
		System.out.println("Informe o tipo Uc Instado [C / I / R]: ");
		char tipoUcInstado = lerTeclado.next().charAt(0);
		System.out.println("Informe a Leitura Anterior: ");
		int leituraAtual = lerTeclado.nextInt();

		MedidorEnergia medidorEnergia = new MedidorEnergia(idMedidor, nrSerie, tipoUcInstado, leituraAtual);

		System.out.println();
		System.out.printf("\nId Medidor: %d", medidorEnergia.getIdMedidor());
		System.out.printf("\nNúmero de Serie: %s", medidorEnergia.getNrSerie());
		System.out.printf("\nTipo Instado: %c", medidorEnergia.getTipoUcInstado());
		System.out.printf("\nLeitura Anterior: %d", medidorEnergia.getLeituraAnterior());
		System.out.printf("\nConsumo: %d", medidorEnergia.getConsumo());
		System.out.printf("\nLeitura Atual: %d", medidorEnergia.getLeituraAtual());
		System.out.printf("\nValor da conta: %.2f", medidorEnergia.getValorConta());

		lerTeclado.close();
	}
}
