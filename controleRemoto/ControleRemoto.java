package controleRemoto;

public class ControleRemoto {

	private int idControle;
	private String Modelo;
	private int temperaturaMinima;
	private int temperaturaMaxima;
	private int temperaturaAtual;
	private int velocidade;
	private boolean ligado;

	public ControleRemoto(int idControle, String modelo, int temperaturaMinima, int temperaturaMaxima) {

		this.idControle = idControle;
		Modelo = modelo;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
		this.temperaturaAtual = 0;
		velocidade = 1;
		ligado = false;
	}

	public void ligarDesligar() {
		if (this.ligado == false) {
			this.ligado = true;
			
			this.temperaturaAtual = (this.temperaturaMinima + this.temperaturaMaxima) / 2;
			velocidade = 1;

		} else {
			this.ligado = false;
			this.temperaturaAtual = 0;
		}

	}

	public boolean diminuirTemperatura() {
		boolean estado;
		if (this.temperaturaAtual > this.temperaturaMinima) {
			this.temperaturaAtual--;
			estado = true;
		} else {
			estado = false;
		}
		return estado;
	}

	public boolean aumentarTemperatura() {
		boolean estado;
		if(this.temperaturaAtual<this.temperaturaMaxima) {
			this.temperaturaAtual++;
			estado = true;
		}else {
			estado = false;
		}
		
		return estado;
	}

	public void ajustarVelocidade() {
		this.velocidade ++;
		if(this.velocidade > 3) {
			this.velocidade = 1;
		}
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
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

	public int getIdControle() {
		return idControle;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public boolean getLigado() {
		return ligado;
	}
	

}
