package agregacaoComposicao;

public class Tumulo {
	private int idTumulo;
	private String localizacao;
	private boolean ocupado;

	public Tumulo(int idTumulo, String localizacao) {
		this.idTumulo = idTumulo;
		this.localizacao = localizacao;
		this.ocupado = false;
	}

	public void ocupar() {
		ocupado = true;

	}

	public void desocupar() {
		ocupado = false;

	}

	public int getIdTumulo() {
		return idTumulo;
	}

	public void setIdTumulo(int idTumulo) {
		this.idTumulo = idTumulo;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

}
