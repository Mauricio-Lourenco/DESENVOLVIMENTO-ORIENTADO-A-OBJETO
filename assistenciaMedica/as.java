package assistenciaMedica;

import java.util.Scanner;

public class as {

	public static void main(String[] args) {

		Scanner lerTeclado = new Scanner(System.in);

		System.out.print("Salario Bruto : R$ ");
		double salarioBruto = lerTeclado.nextDouble();

		System.out.printf("Salario Liquido R$ %.2f\n", calcularSalarioLiquido(salarioBruto));
		System.out.println("Tipo de Desconto: " + definirTipoDesconto(salarioBruto));
		lerTeclado.close();

	}

	public static double calcularSalarioLiquido(double salarioBruto) {
		final double LIMITE_DESCONTO = 400;
		double percentualDesconto;

		if (salarioBruto <= 2000) {
			percentualDesconto = 0;
		} else if (salarioBruto <= 4000) {
			percentualDesconto = 2;
		} else {
			percentualDesconto = 4;
		}

		double valorDesconto = salarioBruto * percentualDesconto / 100;
		if (valorDesconto > LIMITE_DESCONTO) {
			valorDesconto = LIMITE_DESCONTO;
		}

		double salarioLiquido = salarioBruto - valorDesconto;

		return salarioLiquido;

	}

	public static String definirTipoDesconto(double salarioBruto) {
		String tipoDesconto;

		if (salarioBruto <= 2000) {
			tipoDesconto = "Isento";
		} else if (salarioBruto <= 4000) {
			tipoDesconto = "Mínimo";
		} else {
			tipoDesconto = "Médio";
		}

		double valorDesconto = salarioBruto - calcularSalarioLiquido(salarioBruto);

		if (valorDesconto == 400) {
			tipoDesconto = "Máximo";
		}
		return tipoDesconto;

	}

}
