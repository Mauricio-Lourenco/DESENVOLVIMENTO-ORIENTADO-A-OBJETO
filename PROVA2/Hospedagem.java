package PROVA2;

public class Hospedagem {
	private int idHospedagem;
	private int qtdeDiarias;
	private double valor;
	private Quarto quarto;

	public Hospedagem(int idHospedagem, Quarto quarto) {
		this.idHospedagem = idHospedagem;
		this.qtdeDiarias = 0;
		this.valor = 0;
		this.quarto = quarto;
	}

	public boolean checkIn(Quarto quarto) {
		boolean situacao;
		if (quarto.isOcupado() == false) {
			quarto.mudarStatus();
			situacao = true;
		} else {
			situacao = false;
		}
		return situacao;
	}

	public void checkOut() {
		qtdeDiarias += qtdeDiarias;
		valor += valor;

	}

	public double calcularHospedagem() {
		double estadia = 0;
		if (quarto.getTipo() == "a" || quarto.getTipo() == "A") {
			estadia = 200.0 * qtdeDiarias;
		} else if (quarto.getTipo() == "b" || quarto.getTipo() == "B") {
			estadia = 300.0 * qtdeDiarias;
		} else if (quarto.getTipo() == "c" || quarto.getTipo() == "C") {
			estadia = 400.0 * qtdeDiarias;
		} else {
			System.out.println("Tipo inexistente");
		}
		return estadia;
	}

	public int getIdHospedagem() {
		return idHospedagem;
	}

	public void setIdHospedagem(int idHospedagem) {
		this.idHospedagem = idHospedagem;
	}

	public int getQtdeDiarias() {
		return qtdeDiarias;
	}

	public void setQtdeDiarias(int qtdeDiarias) {
		this.qtdeDiarias = qtdeDiarias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	@Override
	public String toString() {
		return "Hospedagem: " + idHospedagem + ", qtdeDiarias: " + qtdeDiarias + ", valor: " + valor + ", quarto: "
				+ quarto;
	}

}