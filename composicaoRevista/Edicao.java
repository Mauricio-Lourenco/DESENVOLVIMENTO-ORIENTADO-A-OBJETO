package composicaoRevista;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Edicao {
	private int numero;
	private Date data;
	private int tiragem;
	private int qtdeVendida;
	private boolean reciclou;

	public Edicao(int numero, Date data, int tiragem, int qtdeVendida) {
		this.numero = numero;
		this.data = data;
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		this.reciclou = false;
	}

	public void reciclarExemplares() {
		this.reciclou = true;

	}

	public int obterQtdeReciclagem() {
		return this.tiragem - this.qtdeVendida;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getTiragem() {
		return tiragem;
	}

	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}

	public int getQtdeVendida() {
		return qtdeVendida;
	}

	public void setQtdeVendida(int qtdeVendida) {
		this.qtdeVendida = qtdeVendida;
	}

	public boolean isReciclou() {
		return reciclou;
	}

	public void setReciclou(boolean reciclou) {
		this.reciclou = reciclou;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yy");
		return "\nEdicao: " +  "\nNúmero " + numero + "\ndata: " + formatoData.format(data) + "\ntiragem: " + tiragem
				+ "\nqtdeVendida: " + qtdeVendida + "\nreciclou: " + reciclou;
	}

}
