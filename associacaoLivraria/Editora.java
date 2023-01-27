package associacaoLivraria;

public class Editora {
	private int idEditora;
	private String razaoSocial;
	private String contato;
	private String cidade;
	private String uf;
	
	
	
	public Editora(int idEditora, String razaoSocial, String cidade) {
		this.idEditora = idEditora;
		this.razaoSocial = razaoSocial;
		this.cidade = cidade;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public int getIdEditora() {
		return idEditora;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}

	@Override
	public String toString() {
		return "Editora [idEditora=" + idEditora + ", razaoSocial=" + razaoSocial + ", contato=" + contato + ", cidade="
				+ cidade + ", UF=" + uf + "]";
	}
	
	

}
