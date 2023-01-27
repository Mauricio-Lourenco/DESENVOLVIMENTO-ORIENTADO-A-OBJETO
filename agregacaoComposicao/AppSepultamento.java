package agregacaoComposicao;

public class AppSepultamento {

	public static void main(String[] args) {

		Corpo corpo = new Corpo(01, "Roberto");
		Tumulo tumulo = new Tumulo(01, "Recife");
		Sepultamento sepultamento = new Sepultamento(01, "07/12", corpo, tumulo);
		Exumacao exumacao = new Exumacao(01, "10/12", sepultamento);

		System.out.println("Situação Inicial: " + corpo.getSituacao());
		System.out.println("================================================");

		sepultamento.sepultar();
		sepultamento.getTumulo().isOcupado();

		System.out.println("Id do corpo        : " + sepultamento.getCorpo().getIdCorpo());
		System.out.println("Nome               : " + sepultamento.getCorpo().getNome());
		System.out.println("Data               : " + sepultamento.getData());
		System.out.print("Situação do corpo  : ");
		if (sepultamento.getTumulo().isOcupado() == true) {
			System.out.println("Não Exumado");
		} else {
			System.out.println("Exumado");
		}
		System.out.print("Situação do túmulo : ");
		if (sepultamento.getTumulo().isOcupado() == true) {
			System.out.println("Ocupado");
		} else {
			System.out.println("Não Ocupado");
		}
		
		System.out.println("================================================");
		
		exumacao.exumar();
		
		System.out.println("Id do corpo        : " + sepultamento.getCorpo().getIdCorpo());
		System.out.println("Nome               : " + sepultamento.getCorpo().getNome());
		System.out.println("Data               : " + sepultamento.getData());
		System.out.print("Situação do corpo  : ");
		if (sepultamento.getTumulo().isOcupado() == true) {
			System.out.println("Não Exumado");
		} else {
			System.out.println("Exumado");
		}
		System.out.print("Situação do túmulo : ");
		if (sepultamento.getTumulo().isOcupado() == true) {
			System.out.println("Ocupado");
		} else {
			System.out.println("Não Ocupado");
		}
	}
}
