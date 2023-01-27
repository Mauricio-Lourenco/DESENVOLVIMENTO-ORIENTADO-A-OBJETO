package array;

import java.util.Scanner;

public class FrequenciaSemanal {
	static int[] dias = new int[5];
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		registrar();
		System.out.println();
		mostrarFrequencia();

		int maiorIndice = maiorFrequencia();
		int menorIndice = menorFrequencia();

		System.out.println("\nFrequencia total: " + totalAlunos());
		System.out.println("Frequência Média: " + frequenciaMedia());
		System.out.println("Maior Frequência: " + dias[maiorIndice]);
		System.out.println("Menor Frequencia: " + dias[menorIndice]);
		System.out.printf("Dia de maior Frequência: %d", maiorIndice + 1);
		System.out.printf("\nDia de menor Frequência: %d", menorIndice + 1);
		System.out.println("\nDias com frequência maior que a média: " + diasAcimaMedia());
		System.out.println("Dias com frequências pares: " + frequenciasPares());

	}

	public static int diasAcimaMedia() {
		int contador = 0;
		double frequenciaMedia = frequenciaMedia();
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] > frequenciaMedia) {
				contador++;
			}
		}
		return contador;
	}

	public static int frequenciasPares() {
		int contador = 0;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}

	public static void registrar() {
		for (int i = 0; i < dias.length; i++) {
			System.out.print("Frequência no " + (i + 1) + "º" + " dia: ");
			dias[i] = input.nextInt();
		}
	}

	public static double totalAlunos() {
		int total = 0;
		for (int i = 0; i < dias.length; i++) {
			total += dias[i];
		}
		return total;
	}

	public static void mostrarFrequencia() {
		for (int i = 0; i < dias.length; i++) {
			System.out.print("Presença no " + (i + 1) + "º" + " dia: " + dias[i] + "\n");
		}
	}

	public static double frequenciaMedia() {
		double media = totalAlunos() / dias.length;
		return media;
	}

	public static int maiorFrequencia() {
		int maiorFrequencia = Integer.MIN_VALUE;
		int indiceMaiorFrequencia = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] > maiorFrequencia) {
				maiorFrequencia = dias[i];
				indiceMaiorFrequencia = i;
			}
		}
		return indiceMaiorFrequencia;
	}

	public static int menorFrequencia() {
		int menorFrequencia = Integer.MAX_VALUE;
		int indiceMenorFrequencia = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] < menorFrequencia) {
				menorFrequencia = dias[i];
				indiceMenorFrequencia = i;
			}
		}
		return indiceMenorFrequencia;
	}

	public static int diaMaiorFrequencia() {
		int maiorFrequencia = Integer.MIN_VALUE;
		int indiceMaiorFrequencia = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] > indiceMaiorFrequencia) {
				maiorFrequencia = dias[i];
				indiceMaiorFrequencia = i;
			}
		}
		return maiorFrequencia;

	}

	public static int diaMenorFrequencia() {
		int menorFrequencia = Integer.MAX_VALUE;
		int indiceMenorFrequencia = -1;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] < indiceMenorFrequencia) {
				menorFrequencia = dias[i];
				indiceMenorFrequencia = i;
			}
		}
		return menorFrequencia;

	}
}
