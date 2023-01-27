package controle;

public class ClasseControle {
	private int idControle, temperaturaMinima, temperaturaMaxima, temperaturaAtual, velocidade;
	private boolean ligado;
	private String modelo;

	public ClasseControle(int idControle, int temperaturaMinima, int temperaturaMaxima, String modelo) {
		super();
		this.idControle = idControle;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
		this.modelo = modelo;
	}

	public void ligarDesligar() {
		if (ligado == false) {
			ligado = true;

			temperaturaAtual = (temperaturaMinima + temperaturaMaxima) / 2;
			velocidade = 1;
		} else {
			ligado = false;
			velocidade = 0;
		}
	}

	public boolean diminuirTemperatura() {
		boolean estado;
		if (temperaturaAtual > temperaturaMinima) {
			temperaturaAtual--;
			estado = true;
		} else {
			estado = false;
		}
		return estado;

	}

	public boolean aumentarTemperatura() {
		boolean estado;
		if (temperaturaAtual < temperaturaMaxima) {
			temperaturaAtual++;
			estado = true;
		} else {
			estado = false;
		}
		return estado;

	}

	public void ajustarTemperatura() {
		velocidade++;
		if (velocidade > 3) {
			velocidade = 1;
		}
	}

	public int getIdControle() {
		return idControle;
	}

	public void setIdControle(int idControle) {
		this.idControle = idControle;
	}

	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public int getTemperaturaAtual() {
		return temperaturaAtual;
	}

	public void setTemperaturaAtual(int temperaturaAtual) {
		this.temperaturaAtual = temperaturaAtual;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
