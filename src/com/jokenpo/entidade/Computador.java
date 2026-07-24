package com.jokenpo.entidade;

import java.util.Random;

public class Computador {

	private int opcao;
	private int vitorias;
	
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
	
	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitoria) {
		this.vitorias = vitorias;
	}

	public void gerarJogada() {
		setOpcao(gerador.nextInt(3)+ 1);
	}
	
	public void adicionarVitoria() {
		this.vitorias ++;
	}
}
