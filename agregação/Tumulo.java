package agregação;

public class Tumulo {

	private int idTumulo;
	private String localizacao;
	private boolean ocupado;

	public Tumulo(int idTumulo, String localizacao) {
		this.idTumulo = idTumulo;
		this.localizacao = localizacao;
		this.ocupado = false;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public int getIdTumulo() {
		return idTumulo;
	}

	public void ocupar() {
		this.ocupado = true;

	}

	public void desoculpar() {
		this.ocupado = false;

	}


}
