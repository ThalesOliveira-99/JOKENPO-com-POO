package com.jokenpo.servico;

import com.jokenpo.entidade.Computador;
import com.jokenpo.entidade.Usuario;

public class JokenpoService {

	public void jogada(Usuario usuario, Computador pc) {
		//Pedra = 1, Papel = 2, Tesoura = 3
		
		if(usuario.getOpcao()  == (pc.getOpcao())) {
			System.out.println("Empate!");
		} else if(usuario.getOpcao() == 1 && pc.getOpcao() == 3 || usuario.getOpcao() == 2 && pc.getOpcao() == 1 || usuario.getOpcao() == 3 && pc.getOpcao() == 2) {
			System.out.println("Vitoria do " + usuario.getNome());
		} else {
			System.out.println("Vitória do PC");
		}
	}
		
}
	

