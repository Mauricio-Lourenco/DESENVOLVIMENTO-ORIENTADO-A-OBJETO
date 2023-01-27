package polimorfismo;

public class ApuracaoNota2Chamada extends ApuracaoNotas {
	private double nota;

	public ApuracaoNota2Chamada(double nota1, double nota2, double nota) {
		super(nota1, nota2);
		this.nota = nota;
		this.media = calcularMedia(nota1, nota2);
	}

	public ApuracaoNota2Chamada(double nota1, double nota2, double nota3, double nota) {
		super(nota1, nota2, nota3);
		this.nota = nota;
		this.media = calcularMedia(nota1, nota2, nota3);
	}

	@Override
	public double calcularMedia(double nota1, double nota2) {
		if (nota1 == 0) {
			nota1 = this.nota;
			this.media = (this.nota + nota2) / 2;
		} else {
			nota2 = this.nota;
			this.media = (nota1 + this.nota) / 2;
		}

		return media;
	}

	@Override
	public double calcularMedia(double nota1, double nota2, double nota3) {
		if (nota1 == 0) {
			nota1 = this.nota;
			this.media = (this.nota + nota2 + nota3) / 3;
		} else if (nota2 == 0) {
			nota2 = this.nota;
			this.media = (nota1 + this.nota + nota3) / 3;
		} else {
			nota3 = this.nota;
			this.media = (nota1 + this.nota + nota2) / 3;
		}
		return media;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

}
