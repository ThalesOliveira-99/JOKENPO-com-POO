package com.jokenpo.aplicacao;

import java.util.Scanner;

import com.jokenpo.entidade.Computador;
import com.jokenpo.entidade.Usuario;
import com.jokenpo.servico.JokenpoService;

public class TesteAplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		JokenpoService jks = new JokenpoService();
		Computador pc = new Computador();
		
		System.out.print("Digite o seu nome:");
		String nome = sc.nextLine();
		Usuario us = new Usuario(nome);
		int opcao = 0;
		
		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Pedra");
			System.out.println("2 - Papel");
			System.out.println("3 - Tesoura");
			System.out.println("0 - Sair do jogo");
			opcao = sc.nextInt();
			if(opcao == 0) {
				System.out.println("Saindo do jogo...");
				break;
			} else if(opcao < 1 || opcao > 3) {
				System.out.println("Opção inválida! Tente novamente");
			} else {
				us.setOpcao(opcao);
				pc.gerarJogada();
				jks.jogada(us, pc);
			}
		}
		while(opcao != 0);
		sc.close();

	}

}
