package array;

public class QualidadeAr {
	private int idMedicao;
	private int indice;
	private String classificacao;

	public QualidadeAr(int idMedicao, int indice) {
		this.idMedicao = idMedicao;
		this.indice = indice;
		this.definirClassificacao();
	}

	public int getIdMedicao() {
		return idMedicao;
	}

	public void setIdMedicao(int idMedicao) {
		this.idMedicao = idMedicao;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public String definirClassificacao() {
		if (indice <= 50) {
			classificacao = "boa";
		} else if (indice <= 100) {
			classificacao = "regular";
		} else if (indice <= 199) {
			classificacao = "inadequada";
		} else if (indice <= 299) {
			classificacao = "má";
		} else if (indice <= 399) {
			classificacao = "péssima";
		} else {
			classificacao = "crítica";
		}
		return classificacao;
	}

}
