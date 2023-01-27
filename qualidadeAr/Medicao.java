package qualidadeAr;

public class Medicao {
	private int idMedicao;
	private int indice;
	private String classificacao;


	public String definirClassificacao() {
		if (indice <= 50) {
			classificacao = "Boa";
		} else if (indice <= 100) {
			classificacao = "Regular";
		} else if (indice <= 199) {
			classificacao = "Inadequada";
		} else if (indice <= 299) {
			classificacao = "Má";
		} else if (indice <= 399) {
			classificacao = "Péssima";
		} else {
			classificacao = "Crítica";
		}
		return classificacao;
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

}
