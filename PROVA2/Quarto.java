package PROVA2;

public class Quarto {
	private int idQuarto;
	private boolean ocupado;
	private String tipo;

	public Quarto(int idQuarto, String tipo) {
		this.idQuarto = idQuarto;
		this.ocupado = false;
		this.tipo = tipo;
	}

	public void mudarStatus() {
		if (ocupado == false) {
			ocupado = true;
		} else {
			ocupado = false;
		}
	}

	public int getIdQuarto() {
		return idQuarto;
	}

	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		
		return "Quartos" + "\n" + "idQuarto: " + idQuarto + ", ocupado: " + ocupado + ", tipo: " + tipo;
	}

	
}
