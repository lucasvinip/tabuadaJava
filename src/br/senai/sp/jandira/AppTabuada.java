package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.altura = 650;
		tela.largura = 650;
		tela.corDoTitulo = new Color(220, 20, 60);
		tela.fonteDoTitulo = new Font("Cooper Black", Font.ITALIC, 15);
		
		
		
		
		
		
		
		
		tela.criarTela();
		
	}

}

	// testando o programa
	//Tabuada tabuada = new Tabuada();
	//
	//tabuada.multiplicando = 5;
	//tabuada.minMultiplicador = 120;	
	//tabuada.maxMultipicador = 1000;
	//
	//
	//String[] resultado = tabuada.getTabuada();
	//
	//// na primeira volta o contador é 0
	//int contador = 0;
	//while(contador < resultado.length) {
	//	System.out.println(resultado[contador]);
	//	contador++;
	//}
	//
	//
	//}