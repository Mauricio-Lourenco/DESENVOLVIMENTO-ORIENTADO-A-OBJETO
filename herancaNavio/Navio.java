package herancaNavio;

public abstract class Navio {
	private int id;
	private String nome;
	private int quantidadePoroes;
	private double capacidadeCarga;
	private String disponibilidade;

	public Navio(int id, String nome, int quantidadePoroes, double capacidadeCarga) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidadePoroes = quantidadePoroes;
		this.capacidadeCarga = capacidadeCarga;
		this.disponibilidade = "Vazio";
	}

	public void iniciarCarregameno() {
		this.disponibilidade = "Carregando";

	}

	public void bolquearCarregamento() {
		this.disponibilidade = "Lotado";

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadePoroes() {
		return quantidadePoroes;
	}

	public void setQuantidadePoroes(int quantidadePoroes) {
		this.quantidadePoroes = quantidadePoroes;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

}
