package br.com.casadocodigo.main;

import br.com.casadocodigo.modelo.Livro;

public class testeLivro {

	public static void main(String[] args) {
		try {
			Livro l1 = new Livro("LIVRO 1", 12345);
			Livro l2 = new Livro("LIVRO 2", 12340);
			Livro l3 = new Livro("LIVRO 3", 12343);
			Livro.getColecao();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
