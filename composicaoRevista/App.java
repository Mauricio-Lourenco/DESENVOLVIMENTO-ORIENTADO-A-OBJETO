package composicaoRevista;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	static Scanner lerTeclado = new Scanner(System.in);
	static SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
	static Revista revista = new Revista(1, "SQL Magazine");

	public static void main(String[] args) {

		Date data;
		do {
			try {
				System.out.println("Data: ");
				String dataString = lerTeclado.nextLine();
				data = formatoData.parse(dataString);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Data Incorreta");
				continue;
			}
			break;
		} while (true);

		revista.adicionarEdicao(52, data, 1000, 800);
		revista.adicionarEdicao(53, data, 900, 900);
		revista.adicionarEdicao(54, data, 1200, 1000);

		System.out.println(revista.reciclarEdicao(53));
		mostrarEdicao(53);
		
		System.out.println(revista.reciclarEdicao(54));
		mostrarEdicao(54);
		
		System.out.println(revista.reciclarEdicao(54));
		mostrarEdicao(54);
		
		System.out.println(revista.reciclarEdicao(99));
		mostrarEdicao(99);


	}

	public static void mostrarEdicoes() {
		for (Edicao edicao : revista.getListaEdicoes()) {
			System.out.println(edicao);
		}
	}

	public static void mostrarEdicao(int id) {
		for (Edicao edicao : revista.getListaEdicoes()) {
			if (edicao.getNumero() == id) {
				System.out.println(edicao);
			}
		}
	}

}
