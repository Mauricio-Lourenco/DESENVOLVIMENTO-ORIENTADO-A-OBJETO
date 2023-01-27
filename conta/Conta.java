package conta;

public class Conta {
	public int numero;
	public String tipo;
	public double saldo;

	public void cadastroConta(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public boolean saque(double retirada) {
		boolean situacao = false;
		if (retirada > saldo) {
			situacao = false;
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= retirada;
			situacao = true;
		}
		return situacao;

	}

	public double mostrarSaldo() {
		return saldo;
	}

}
