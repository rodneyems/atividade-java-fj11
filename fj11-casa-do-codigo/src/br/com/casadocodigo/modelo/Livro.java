package br.com.casadocodigo.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Livro implements Comparable<Livro>{
	private String titulo;
	private String descricao;
	private int isbn;
	private Categoria categoria;
	public static List<Livro> colecao = new ArrayList<Livro>();
//	public static HashSet<Livro> colecao = new HashSet<Livro>();
	
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (isbn != other.isbn)
			return false;
		return true;
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
