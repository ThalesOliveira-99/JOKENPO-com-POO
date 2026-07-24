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

        // Cabeçalho Rústico
        System.out.println("+---------------------------------------+");
        System.out.println("|             J O K E N P O             |");
        System.out.println("+---------------------------------------+");

        System.out.print("\n> Informe o seu nome: ");
        String nome = sc.nextLine();
        Usuario us = new Usuario(nome);

        System.out.println("\n[ SYSTEM ] Jogador " + us.getNome().toUpperCase() + " registrado com sucesso.\n");

        int opcao = -1;

        do {
            // Menu Principal Estilo Arcade/Terminal
            System.out.println("=========================================");
            System.out.println("             PAINEL DE JOGO              ");
            System.out.println("=========================================");
            System.out.println("  [ 1 ] - PEDRA                          ");
            System.out.println("  [ 2 ] - PAPEL                          ");
            System.out.println("  [ 3 ] - TESOURA                        ");
            System.out.println("  [ 0 ] - SAIR                           ");
            System.out.println("=========================================");
            System.out.print("> Digite a sua opção: ");

            // Validação para não quebrar se o usuário digitar uma letra
            if (!sc.hasNextInt()) {
                System.out.println("\n[ ERRO ] Digite apenas números inteiros!\n");
                sc.next();
                continue;
            }

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("\n+---------------------------------------+");
                System.out.println("|       Sessão encerrada pelo jogador.  |");
                System.out.println("|       Até a próxima partida!          |");
                System.out.println("+---------------------------------------+\n");
                break;
            } else if (opcao < 1 || opcao > 3) {
                System.out.println("\n[ ERRO ] Opção inválida! Escolha entre 1, 2, 3 ou 0.\n");
            } else {
                System.out.println("\n-----------------------------------------");
                us.setOpcao(opcao);
                pc.gerarJogada();
                jks.jogada(us, pc);
            }

        } while (opcao != 0);

        sc.close();
    }
}