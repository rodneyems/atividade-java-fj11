package br.com.casadocodigo.main;

import br.com.casadocodigo.modelo.Livro;

public class testeLivro {

	public static void main(String[] args) {
		try {
			Livro l1 = new Livro("LIVRO 1", 12345);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Livro l2 = new Livro("LIVRO 2", 12340);
		} catch (Exception e) {
			System.out.println(e);;
		}	
		try {
			Livro l2 = new Livro("LIVRO 3", 12343);
		} catch (Exception e) {
			System.out.println(e);;
		}	
		Livro.getColecao();
	}

}
