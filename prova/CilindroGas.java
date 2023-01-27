package prova;

public class CilindroGas {
	private int idCilindro;
	private String localizacao;
	private double capacidadeMaxima;
	private double capacidadeAtual;
	private double custoKg;
	private double custoAbastecimento;
	private String statusAbastecimento;

	public CilindroGas(int idCilindro, String localizacao, double capacidadeMaxima, double custoKg) {
		this.idCilindro = idCilindro;
		this.localizacao = localizacao;
		this.capacidadeMaxima = capacidadeMaxima;
		this.custoKg = custoKg;
		abastecerCilindro();
		statusAbastecimento = "Cheio";
	}

	public void abastecerCilindro() {

		capacidadeAtual += (capacidadeMaxima - capacidadeAtual);
		double percentual = (capacidadeAtual / capacidadeMaxima) * 100;
		if (capacidadeAtual >= capacidadeMaxima / 2) {
			custoAbastecimento = custoAbastecimento - (custoKg * 5 / 100);
		} else {
			custoAbastecimento = custoKg * capacidadeAtual;
		}

		if (percentual >= 90) {
			statusAbastecimento = "Cheio";
		} else if (percentual < 90 && percentual >= 70) {
			statusAbastecimento = "Alto";
		} else if (percentual < 70 && percentual >= 30) {
			statusAbastecimento = "Médio";
		} else {
			statusAbastecimento = "Baixo";
		}

	}

	public boolean registrarConsumo(double qtdeKg) {
		if (qtdeKg > capacidadeAtual) {
			return false;
		}

		capacidadeAtual -= qtdeKg;
		double percentual = capacidadeAtual / capacidadeMaxima;
		if (percentual >= 90) {
			statusAbastecimento = "Cheio";
		} else if (percentual < 90 && percentual >= 70) {
			statusAbastecimento = "Alto";
		} else if (percentual < 70 && percentual >= 30) {
			statusAbastecimento = "Médio";
		} else {
			statusAbastecimento = "Baixo";
		}
		return true;
	}

	public void esvaziarCilindro() {
		if (capacidadeAtual > 0) {
			do {
				capacidadeAtual = 0;
			} while (capacidadeAtual > 0);
		} else {
			System.out.println("Cilindro já se encontra vazio");
		}
	}

	public int getIdCilindro() {
		return idCilindro;
	}

	public void setIdCilindro(int idCilindro) {
		this.idCilindro = idCilindro;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public double getCapacidadeMaxima() {
		return capacidadeMaxima;
	}

	public void setCapacidadeMaxima(double capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}

	public double getCapacidadeAtual() {
		return capacidadeAtual;
	}

	public void setCapacidadeAtual(double capacidadeAtual) {
		this.capacidadeAtual = capacidadeAtual;
	}

	public double getCustoKg() {
		return custoKg;
	}

	public void setCustoKg(double custoKg) {
		this.custoKg = custoKg;
	}

	public double getCustoAbastecimento() {
		return custoAbastecimento;
	}

	public void setCustoAbastecimento(double custoAbastecimento) {
		this.custoAbastecimento = custoAbastecimento;
	}

	public String getStatusAbastecimento() {
		return statusAbastecimento;
	}

	public void setStatusAbastecimento(String statusAbastecimento) {
		this.statusAbastecimento = statusAbastecimento;
	}

}
