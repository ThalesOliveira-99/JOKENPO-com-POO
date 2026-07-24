package com.jokenpo.entidade;

import java.util.Random;

public class Computador {

	private int opcao;
	
	Random gerador = new Random();
	
	public Computador() {
	}
	
	public Computador(int opcao) {
		this.opcao = gerador.nextInt();
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	public Random getGerador() {
		return gerador;
	}

	public void setGerador(Random gerador) {
		this.gerador = gerador;
	}
	
	public void gerarJogada() {
		setOpcao(gerador.nextInt(3));
	}
}
