package qualidadeAr;

import java.util.Scanner;

public class AppMedicaoQualidade {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);

		int idMedicao;

		System.out.println("========= Classificação de Qualidade do Ar =========\n");

		do {
			System.out.println("Informe o Identificador de Medição: ");
			idMedicao = lerTeclado.nextInt();

			if (idMedicao < 0) {
				System.out.println("Valor Inválido. Digite um identificador Positivo");
				continue;
			}
			break;

		} while (true);

		int indice;

		do {
			System.out.println("Informe o Índice da Medição:");
			indice = lerTeclado.nextInt();

			if (indice < 0) {
				System.out.println("Valor Inválido. Digite um índice Positivo");
				continue;
			}
			break;

		} while (true);

		MedicaoQualidadeAr medicaoQualidadeAr = new MedicaoQualidadeAr();

		medicaoQualidadeAr.setIdMedicao(idMedicao);
		medicaoQualidadeAr.setIndice(indice);
		medicaoQualidadeAr.definirClassificacao();

		System.out.println("================================");
		System.out.println("Identificador de Medição: " + medicaoQualidadeAr.getIdMedicao());
		System.out.println("Índice de Medição: " + medicaoQualidadeAr.getIndice());
		System.out.println("Qualidade do Ar: " + medicaoQualidadeAr.getClassificacao());

		lerTeclado.close();
	}

}
