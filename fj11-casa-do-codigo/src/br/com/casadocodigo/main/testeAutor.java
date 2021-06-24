package br.com.casadocodigo.main;

import br.com.casadocodigo.modelo.Autor;

public class testeAutor {

	public static void main(String[] args) {
		Autor rodney = new Autor("Rodney", "rodney.martins@live.com");
		rodney.setDescricao("Autor bonito");
		
		System.out.println(rodney.toString());
	}

}
