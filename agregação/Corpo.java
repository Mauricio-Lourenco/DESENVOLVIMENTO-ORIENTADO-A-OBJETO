package agregação;

public class Corpo {

	private int idCorpo;
	private String nome;
	private String situacao;

	public Corpo(int idCorpo, String nome) {
		this.idCorpo = idCorpo;
		this.nome = nome;
		this.situacao = "Aguardando Sepultamento";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public int getIdCorpo() {
		return idCorpo;
	}

	public void sepultar() {
		this.situacao = "Sepultado";
	}

	public void exumar() {
		this.situacao = "Exumado";

	}



}
