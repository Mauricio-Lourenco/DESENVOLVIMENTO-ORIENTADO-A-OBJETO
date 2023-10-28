package heranca;

public class NavioGraneleiro extends Navio {

	private int quantidadeEscoltilhas;

	public NavioGraneleiro(int id, String nome, int quantidadePoroes, double capacidadeCarga,
			int quantidadeEscoltilhas) {
		super(id, nome, quantidadePoroes, capacidadeCarga);
		this.quantidadeEscoltilhas = quantidadeEscoltilhas;
	}

	public int getQuantidadeEscoltilhas() {
		return quantidadeEscoltilhas;
	}

	public void setQuantidadeEscoltilhas(int quantidadeEscoltilhas) {
		this.quantidadeEscoltilhas = quantidadeEscoltilhas;
	}

}
