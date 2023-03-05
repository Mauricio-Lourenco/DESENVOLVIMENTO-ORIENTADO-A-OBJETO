package agregação;

public class AppSepultamento {

	public static void main(String[] args) {

		Corpo corpo = new Corpo(07, "Francisco");
		Tumulo tumulo = new Tumulo(1, "Recife ");
		Sepultamento sepultamento = new Sepultamento(22, "12/11/2022", corpo, tumulo);
		Exumacao exumacao = new Exumacao(13, "12/11/2023", sepultamento);

		System.out.println("Situação Inicial: " + corpo.getSituacao());
		System.out.print("===========================================");

		sepultamento.sepultar();
		sepultamento.getTumulo().getOcupado();
		System.out.println("\nData               : " + sepultamento.getData());
		System.out.println("Nome               : " + sepultamento.getCorpo().getNome());
		System.out.println("Id do Corpo        : " + sepultamento.getCorpo().getIdCorpo());
		System.out.print("Situação do Corpo  : ");
		if (sepultamento.getTumulo().getOcupado() == true) {
			System.out.println("Não exumado");
		} else {
			System.out.println("Exumado");
		}
		System.out.print("Situação do Túmulo : ");
		if (sepultamento.getTumulo().getOcupado() == false) {
			System.out.println("Desocupado");
		} else {
			System.out.println("Ocupado");
		}
		
		System.out.print("===========================================");

		exumacao.exumar();
		System.out.println("\nData               : " + sepultamento.getData());
		System.out.println("Nome               : " + sepultamento.getCorpo().getNome());
		System.out.println("Id do Corpo        : " + sepultamento.getCorpo().getIdCorpo());
		System.out.print("Situação do Corpo  : ");
		if (sepultamento.getTumulo().getOcupado() == true) {
			System.out.println("Não exumado");
		} else {
			System.out.println("Exumado");
		}
		System.out.print("Situação do Túmulo : ");
		if (sepultamento.getTumulo().getOcupado() == false) {
			System.out.println("Desocupado");
		} else {
			System.out.println("Ocupado");
		}

	}

}
