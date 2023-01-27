package PROVA2;

import java.util.ArrayList;
import java.util.List;

public class AplicacaoHospedagem {
	static Hospedagem hospedagem;

	public static void main(String[] args) {

		List<Quarto> quarto = new ArrayList<Quarto>();

		quarto.add(new Quarto(01, "a"));
		quarto.add(new Quarto(02, "b"));
		quarto.add(new Quarto(03, "c"));
		quarto.add(new Quarto(04, "a"));
		quarto.add(new Quarto(05, "a"));

		Hospedagem hospedagem = new Hospedagem(01, quarto.get(1));
		
		System.out.println(quarto);
		

	}
}
