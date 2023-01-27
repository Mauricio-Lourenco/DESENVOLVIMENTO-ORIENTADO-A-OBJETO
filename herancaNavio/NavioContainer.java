package herancaNavio;

public class NavioContainer extends Navio {

	private int quantidadeGuindastes;
	private int quantidadeCamadas;

	public NavioContainer(int id, String nome, int quantidadePoroes, double capacidadeCarga, int quantidadeGuindastes,
			int quantidadeCamadas) {
		super(id, nome, quantidadePoroes, capacidadeCarga);
		this.quantidadeGuindastes = quantidadeGuindastes;
		this.quantidadeCamadas = quantidadeCamadas;
	}

	public int getQuantidadeGuindastes() {
		return quantidadeGuindastes;
	}

	public void setQuantidadeGuindastes(int quantidadeGuindastes) {
		this.quantidadeGuindastes = quantidadeGuindastes;
	}

	public int getQuantidadeCamadas() {
		return quantidadeCamadas;
	}

	public void setQuantidadeCamadas(int quantidadeCamadas) {
		this.quantidadeCamadas = quantidadeCamadas;
	}

}
