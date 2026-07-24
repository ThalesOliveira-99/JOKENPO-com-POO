package com.jokenpo.servico;

import com.jokenpo.entidade.Computador;
import com.jokenpo.entidade.Usuario;

public class JokenpoService {

    private int empates;

    public JokenpoService() {
        this.empates = 0; 
    }

    public void jogada(Usuario usuario, Computador pc) {
        // Opções: 1 = Pedra, 2 = Papel, 3 = Tesoura
        int opcaoUsuario = usuario.getOpcao();
        int opcaoPc = pc.getOpcao();

        if (opcaoUsuario == opcaoPc) {
            System.out.println("\nresultado: EMPATE!");
            this.empates++; 
        } 
       
        else if ((opcaoUsuario == 1 && opcaoPc == 3) || 
                 (opcaoUsuario == 2 && opcaoPc == 1) || 
                 (opcaoUsuario == 3 && opcaoPc == 2)) {
            System.out.println("\nresultado: Vitória de " + usuario.getNome() + "!");
            usuario.adicionarVitoria(); 
        } 
   
        else {
            System.out.println("\nresultado: Vitória do Computador!");
            pc.adicionarVitoria(); 
        }

       
        exibirPlacar(usuario, pc);
    }

    public void exibirPlacar(Usuario usuario, Computador pc) {
        System.out.println("===============================");
        System.out.println("        PLACAR ACUMULADO       ");
        System.out.println("===============================");
        System.out.println(usuario.getNome() + ": " + usuario.getVitorias() + " vitória(s)");
        System.out.println("Computador: " + pc.getVitorias() + " vitória(s)");
        System.out.println("Empates: " + this.empates);
        System.out.println("===============================\n");
    }

    public int getEmpates() {
        return empates;
    }
}