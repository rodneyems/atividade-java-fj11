package br.com.casadocodigo.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Livro implements Comparable<Livro>{
	private String titulo;
	private String descricao;
	private int isbn;
	private static List<Livro> colecao = new ArrayList<Livro>();
	
	public Livro (String titulo, int isbn) throws Exception {
		this.setIsbn(isbn);
		this.setTitulo(titulo);
		setColecao(this);
	}
	
	private static void setColecao(Livro livro) {
		colecao.add(livro);
	}
	
	public static void getColecao() {
		for (Livro livro : colecao) {
			System.out.println(livro);
		}
		Collections.sort(colecao);
			System.out.println("AGORA ORDENADO");
		for (Livro livro : colecao) {
			System.out.println(livro);
		}
	}
	
	@Override
	public int compareTo(Livro livro) {
		if (this.isbn < livro.isbn) {
			return -1;
		}
		if (this.isbn > livro.isbn) {
			return 1;
		}
		return 0;
	}
	
	
	@Override
	public String toString() {
		return this.isbn + " - " + this.titulo;
	}
	
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getIsbn() {
		return isbn;
	}
	
	public void setIsbn(int isbn) {
		for (Livro livro : colecao) {
			if (livro.getIsbn() == isbn) {
				throw new CampoJaCadastradoException("ISBN Já cadastrado");
			}
		}
		this.isbn = isbn;
	}
}
