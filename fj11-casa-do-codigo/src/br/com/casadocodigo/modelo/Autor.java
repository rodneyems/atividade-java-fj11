package br.com.casadocodigo.modelo;

public class Autor {
	private String nome;
	private String email;
	private String descricao;
	
	public Autor(String nome, String email){
		setNome(nome);
		setEmail(email);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Autor " + this.nome;
	}
		
}
