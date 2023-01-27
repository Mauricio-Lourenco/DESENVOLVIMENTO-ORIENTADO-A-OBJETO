package qualidadeAr;

import java.util.Scanner;

public class AppMedicao {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int idMedicao;
		do {
			System.out.print("Insira o id: ");
			idMedicao = input.nextInt();
			if (idMedicao <= 0) {
				System.out.print("Identificador deve ser positivo");
				continue;
			}
			break;

		} while (true);

		int indice;
		do {
			System.out.print("Insira o indice: ");
			indice = input.nextInt();
			if (indice < 0) {
				System.out.print("Indice não deve ser negativo");
				continue;
			}
			break;
		} while (true);

		Medicao medicao = new Medicao();
		
		medicao.setIdMedicao(idMedicao);
		medicao.setIndice(indice);
		medicao.definirClassificacao();
		
		System.out.println();
		System.out.print("Id: " + medicao.getIdMedicao());
		System.out.print("\nIndice: " + medicao.getIndice());
		System.out.print("\nSituação: " + medicao.getClassificacao());

		input.close();
	}
}
