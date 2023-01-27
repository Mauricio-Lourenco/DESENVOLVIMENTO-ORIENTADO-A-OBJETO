package array;

public class AppQualidadeAr {

	public static void main(String[] args) {
		
		QualidadeAr[] vetor = new QualidadeAr[2];

		QualidadeAr medicaoQualidadeAr1 = new QualidadeAr(1, 80);
		QualidadeAr medicaoQualidadeAr2 = new QualidadeAr(5, 300);

		vetor[0] = medicaoQualidadeAr1;
		vetor[1] = medicaoQualidadeAr2;

		System.out.println("Id Objeto 1: " + medicaoQualidadeAr1.getIdMedicao());
		System.out.println("Índice Objeto 1: " + medicaoQualidadeAr1.getIndice());
		System.out.println("Classificação Objeto 1: " + medicaoQualidadeAr1.getClassificacao());
		
		System.out.println("\nId Objeto 2: " + medicaoQualidadeAr2.getIdMedicao());
		System.out.println("Índice Objeto 2: " + medicaoQualidadeAr2.getIndice());
		System.out.println("Classificação Objeto 2: " + medicaoQualidadeAr2.getClassificacao());

	}

}
