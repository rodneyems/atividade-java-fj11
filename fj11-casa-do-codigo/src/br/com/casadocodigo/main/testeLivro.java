package br.com.casadocodigo.main;

import java.util.Collection;
import java.util.Collections;

import br.com.casadocodigo.modelo.ComparadorTitulo;
import br.com.casadocodigo.modelo.Livro;

public class testeLivro {

	public static void main(String[] args) {
		ComparadorTitulo compare = new ComparadorTitulo();
		try {
			Livro l1 = new Livro("LIVRO 4", 00001);
//			Livro.colecao.add(l1);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Livro l2 = new Livro("LIVRO 2", 00003);
//			Livro.colecao.add(l2);

		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Livro l3 = new Livro("LIVRO 3", 00002);
//			Livro.colecao.add(l3);

		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			Livro l4 = new Livro("LIVRO 5", 00004);
//			Livro.colecao.add(l4);

		} catch (Exception e) {
			System.out.println(e);
		}
		Livro.getColecao();
		System.out.println("AGORA ORDENADO");
		Collections.sort(Livro.colecao);
		Livro.getColecao();		
		System.out.println("AGORA POR NOME");
		Collections.sort(Livro.colecao, compare);
		Livro.getColecao();	
	}

}
