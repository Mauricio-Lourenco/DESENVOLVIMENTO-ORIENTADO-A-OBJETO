package medidor;

public class MedidorEnergia {

	 int idMedidor;
	 String nrSerie;
	 char tipoUcInstado;
	 int leituraAnterior;
	 int leituraAtual;
	 int consumo;
	 double valorConta;

	public MedidorEnergia(int idMedidor, String nrSerie, char tipoUcInstado, int leituraAtual) {
		this.idMedidor = idMedidor;
		this.nrSerie = nrSerie;
		this.tipoUcInstado = tipoUcInstado;
		this.leituraAtual = leituraAtual;
		this.leituraAnterior = leituraAtual;
		this.consumo = 0;
		this.valorConta = 0;
	}

	public void registrarLeitura(int leitura) {
		this.leituraAtual = this.leituraAnterior;
		leituraAtual = leitura;
		consumo = (leituraAtual - leituraAnterior);
		calcularConta();
	}

	public double calcularConta() {

		if (tipoUcInstado == 'C' || tipoUcInstado == 'c') {
			this.valorConta = this.consumo * 0.7;
		} else if (tipoUcInstado == 'I' || tipoUcInstado == 'i') {
			this.valorConta = this.consumo * 0.5;
		} else if (tipoUcInstado == 'R' || tipoUcInstado == 'r') {
			this.valorConta = this.consumo * 0.6;
		} return valorConta;

	}

	public char getTipoUcInstado() {
		return tipoUcInstado;
	}

	public void setTipoUcInstado(char tipoUcInstado) {
		this.tipoUcInstado = tipoUcInstado;
	}

	public int getIdMedidor() {
		return idMedidor;
	}

	public String getNrSerie() {
		return nrSerie;
	}

	public int getLeituraAnterior() {
		return leituraAnterior;
	}

	public int getLeituraAtual() {
		return leituraAtual;
	}

	public int getConsumo() {
		return consumo;
	}

	public double getValorConta() {
		return valorConta;
	}

}
