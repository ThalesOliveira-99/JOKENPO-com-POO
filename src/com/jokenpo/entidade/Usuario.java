package com.jokenpo.entidade;

public class Usuario {

	private String nome;
	private Integer opcao;
	
	public Usuario() {
	}
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public Usuario(String nome, int opcao) {
		this.nome = nome;
		this.opcao = opcao;	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getOpcao() {
		return opcao;
	}

	public void setOpcao(Integer opcao) {
		this.opcao = opcao;
	}
	
}
