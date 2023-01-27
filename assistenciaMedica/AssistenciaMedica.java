package assistenciaMedica;

import java.util.Scanner;

public class AssistenciaMedica {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o salário bruto: ");
		double bruto = entrada.nextDouble();

		System.out.print("Valor do salário liquido: " + salarioLiquido(bruto));
		System.out.println();
		System.out.print("Tipo de desconto: " + tipo(bruto));

		entrada.close();
	}

	public static double salarioLiquido(double bruto) {
		double liquido = 0;
		double desconto = bruto - liquido;

		if (bruto <= 2000) {
			return bruto;
		} else if (bruto <= 4000) {
			return liquido = bruto -= (bruto * 2 / 100);
		} else {
			if (desconto > 400) {
				return bruto - 400;
			} else {
				return liquido = bruto -= (bruto * 4 / 100);
			}
		}
	}

	public static String tipo(double bruto) {
		String tipo;
		if (bruto <= 2000) {
			tipo = "Isento";
		} else if (bruto <= 4000) {
			tipo = "Mínimo";
		} else {
			tipo = "Médio";
		}
		double desconto = bruto - salarioLiquido(bruto);
		if (desconto == 400) {
			tipo = "Máximo";
		}
		return tipo;
	}
}
