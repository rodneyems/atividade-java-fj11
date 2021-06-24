package br.com.casadocodigo.modelo;

public class Categoria {
	private String nome;
	private String descricao;
	
	Categoria(String nome){
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return this.nome;
	}
	
}
