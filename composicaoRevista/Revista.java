package composicaoRevista;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Revista {

	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private List<Edicao> listaEdicoes;

	public Revista(int codigo, String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.reciclagemProduzida = 0;
		this.listaEdicoes = new ArrayList<Edicao>();
	}

	private Edicao pesquisarEdicaoPorId(int numeroEdicao) {
		for (Edicao edicao : listaEdicoes) {
			if (edicao.getNumero() == numeroEdicao) {
				return edicao;
			}
		}
		return null;
	}

	public boolean adicionarEdicao(int numero, Date data, int tiragem, int qtdeVendida) {
		Edicao edicaoEncontrada = pesquisarEdicaoPorId(numero);
		if (edicaoEncontrada == null) {
			this.listaEdicoes.add(new Edicao(numero, data, tiragem, qtdeVendida));
			return true;
		}
		return false;

	}

	public boolean removerEdicao(Edicao edicao) {
		Edicao edicaoEncontrada = pesquisarEdicaoPorId(edicao.getNumero());
		if (edicaoEncontrada != null) {
			listaEdicoes.remove(edicao);
			return true;
		}
		return false;

	}

	public String reciclarEdicao(int numeroEdicao) {
		Edicao edicaoEncontrada = pesquisarEdicaoPorId(numeroEdicao);
		if (edicaoEncontrada == null) {
			return "Edição não encontrada";
		} else if (edicaoEncontrada.obterQtdeReciclagem() == 0) {
			return "Não ouve exemplares para reciclar";
		} else if (edicaoEncontrada.isReciclou()) {
			return "Edição já reciclada";
		} else {
			this.reciclagemProduzida += edicaoEncontrada.obterQtdeReciclagem();
			edicaoEncontrada.reciclarExemplares();
			return "Reciclagem realizada";
		}

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}

	public void setReciclagemProduzida(int reciclagemProduzida) {
		this.reciclagemProduzida = reciclagemProduzida;
	}

	public List<Edicao> getListaEdicoes() {
		return listaEdicoes;
	}

	public void setListaEdicoes(List<Edicao> listaEdicoes) {
		this.listaEdicoes = listaEdicoes;
	}

	@Override
	public String toString() {
		return "Revista [codigo=" + codigo + ", titulo=" + titulo + ", reciclagemProduzida=" + reciclagemProduzida
				+ ", listaEdicoes=" + listaEdicoes + "]";
	}

}
