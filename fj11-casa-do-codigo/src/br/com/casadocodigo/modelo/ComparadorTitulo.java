package br.com.casadocodigo.modelo;

import java.util.Comparator;

public class ComparadorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro livro, Livro outro) {
		return livro.getTitulo().compareTo(outro.getTitulo());
	}
}
