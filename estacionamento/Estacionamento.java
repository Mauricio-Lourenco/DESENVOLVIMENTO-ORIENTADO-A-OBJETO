package estacionamento;

public class Estacionamento {
	private int codigo;
	private String nome;
	private String cidade;
	private int qtdeVagas;
	private String situacao;
	private int horasFranquiaInicial;
	private double valorFranquiaInicial;
	private double valorAdicionalHora;

	public Estacionamento(int codigo, String nome, String cidade, int qtdeVagas, String situacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.cidade = cidade;
		this.qtdeVagas = qtdeVagas;
		this.situacao = situacao;
	}

	public void ativar() {
		this.situacao = "Ativado";
	}

	public void desativar() {
		this.situacao = "Desativado";
	}

	public double calcularEstacionamento(double horasEstacionado) {
		if (situacao == "Ativado") {
			if (horasEstacionado > horasFranquiaInicial) {
			}
		} else {
			System.out.println("Estacionamento desativado");
		}
		return horasEstacionado * valorAdicionalHora + valorFranquiaInicial;
	}

	public void setAtivar() {
		this.situacao = "Ativado";
	}

	public void getAtivar() {
		this.situacao = "Ativado";
	}

	public void setDesativar() {
		this.situacao = "Desativado";
	}

	public void getDesativar() {
		this.situacao = "Desativado";
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getHorasFranquiaInicial() {
		return horasFranquiaInicial;
	}

	public void setHorasFranquiaInicial(int horasFranquiaInicial) {
		this.horasFranquiaInicial = horasFranquiaInicial;
	}

	public double getValorFranquiaInicial() {
		return valorFranquiaInicial;
	}

	public void setValorFranquiaInicial(double valorFranquiaInicial) {
		this.valorFranquiaInicial = valorFranquiaInicial;
	}

	public double getValorAdicionalHora() {
		return valorAdicionalHora;
	}

	public void setValorAdicionalHora(double valorAdicionalHora) {
		this.valorAdicionalHora = valorAdicionalHora;
	}

	@Override
	public String toString() {
		return "Código:   " + codigo + "\nNome:     " + nome + "\nCidade:   " + cidade + "\nVagas:    " + qtdeVagas
				+ "\nSituação: " + situacao;
	}

}
