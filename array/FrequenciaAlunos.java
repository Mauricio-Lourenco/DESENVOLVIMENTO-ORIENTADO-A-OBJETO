package array;

import java.util.Scanner;

public class FrequenciaAlunos {
	static int[] dias = new int[5];

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);

		for (int i = 0; i < dias.length; i++) {
			System.out.print("Frequência do " + (i + 1) + "º " + "dia: ");
			dias[i] = lerTeclado.nextInt();
		}

		int maiorIndice = maiorFrequencia();
		int menorIndice = menorFrequencia();
		System.out.println("\nFrequência Total: " + frequenciaTotal());
		System.out.println("Frequência média: " + frequenciaMedia());
		System.out.println("Maior Frequência: " + dias[maiorIndice]);
		System.out.println("Menor Frequência: " + dias[menorIndice]);
		System.out.printf("Dia de maior frequência: %d\n", maiorIndice + 1);
		System.out.printf("Dia de menor frequência: %d\n", menorIndice + 1);
		System.out.printf("Dias acima da média: %d\n", acimaMedia());
		System.out.println("Percentual de diferença: " + diferenca());
		System.out.println("Quantidade de frequências pares:  " + frequenciasPares());

		lerTeclado.close();
	}

	public static int frequenciaTotal() {
		int total = 0;
		for (int i = 0; i < dias.length; i++) {
			total += dias[i];
		}
		return total;
	}

	public static double frequenciaMedia() {
		return (double) frequenciaTotal() / dias.length;
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

	public static int acimaMedia() {
		int contador = 0;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] > frequenciaMedia()) {
				contador++;
			}
		}
		return contador;
	}

	public static double diferenca() {
		return (double) (dias[maiorFrequencia()] - dias[menorFrequencia()]) / dias[maiorFrequencia()] * 100;
	}

	public static double frequenciasPares() {
		int contador = 0;
		for (int i = 0; i < dias.length; i++) {
			if (dias[i] % 2 == 0) {
				contador++;
			}
		}
		return contador;
	}
}
