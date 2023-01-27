package associacaoLivraria;

public class Livro {
	private int idLivro;
	private String titulo;
	private String ISBN;
	private int numeroPaginas;
	private Editora editora;
	private Genero generoAtual;

	public Livro(int idLivro, String titulo, Genero generoAtual, Editora editora) {
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.generoAtual = generoAtual;
		this.editora = editora;
	}

	public Genero getGeneroAtual() {
		return generoAtual;
	}

	public Editora getEditora() {
		return editora;
	}

	public Livro(String titulo) {
		this.titulo = titulo;
	}

	public int getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(int idLivro) {
		this.idLivro = idLivro;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getIsbn() {
		return ISBN;
	}

	@Override
	public String toString() {
		return "Livro [idLivro=" + idLivro + ", titulo=" + titulo + ", ISBN=" + ISBN + ", numeroPaginas="
				+ numeroPaginas + ", editora=" + editora + ", genero=" + generoAtual + "]";
	}

}
