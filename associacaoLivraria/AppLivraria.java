package associacaoLivraria;

public class AppLivraria {

	public static void main(String[] args) {

		Genero priGen = new Genero(01, "Romance");
		Genero segGen = new Genero(02, "Fantasia");
		Genero terGen = new Genero(03, "Ficção Científica");

		Editora priEdit = new Editora(01, "Maurício", "Recife");
		Editora segEdit = new Editora(02, "Paulo", "São Paulo");

		Livro priLivro = new Livro(01, "Romeu e Julieta", priGen, priEdit);
		Livro segLivro = new Livro(02, "Harry Potter e a Pedra Filosofal", segGen, segEdit);
		Livro terLivro = new Livro(03, "Jogador Número 1", terGen, priEdit);
		Livro quaLivro = new Livro(03, "As crônicas de Nárnia", terGen, priEdit);
		Livro quiLivro = new Livro(03, "O Senhor dos Anéis", terGen, segEdit);

		priLivro.getTitulo();
		priLivro.getGeneroAtual().getIdGenero();
		priLivro.getEditora().getRazaoSocial();
		priLivro.getEditora().getCidade();

		mostrarLivro(priLivro);
		mostrarLivro(segLivro);
		mostrarLivro(terLivro);
		mostrarLivro(quaLivro);
		mostrarLivro(quiLivro);
	}

	private static void mostrarLivro(Livro livro) {

		System.out.println("\nTitulo do livro  : " + livro.getTitulo());
		System.out.println("Nome do gênero   : " + livro.getGeneroAtual().getNomeGenero());
		System.out.println("Razão Social     : " + livro.getEditora().getRazaoSocial());
		System.out.println("Cidade Editora   : " + livro.getEditora().getCidade());
		System.out.println("==================================================");

	}

}
