package associacaoLivraria;

public class Genero {
	private int idGenero;
	private String nomeGenero;
	
	public Genero(int idGenero, String nomeGenero) {
		this.idGenero = idGenero;
		this.nomeGenero = nomeGenero;
	}
	public int getIdGenero() {
		return idGenero;
	}
	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	public String getNomeGenero() {
		return nomeGenero;
	}

	@Override
	public String toString() {
		return "Genero [idGenero=" + idGenero + ", nomeGenero=" + nomeGenero + "]";
	}
	
	

}
