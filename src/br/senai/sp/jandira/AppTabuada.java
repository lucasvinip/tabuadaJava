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
		tela.largura = 700;
		tela.corDaTela = new Color(220,220,220);
		tela.corDoTitulo = new Color(220, 20, 60);
		tela.fonteDoTitulo = new Font("Cooper Black", Font.ITALIC, 20);
		tela.fonteDoSubTitulo = new Font("Cooper Black", Font.ITALIC, 15);
		tela.fonteDosParagrafos = new Font("Arial", Font.BOLD, 14);
		tela.corDaLetraCaixa = new Color(30,144,255);
		tela.fonteDaLetraCaixa = new Font("Times New Roman", Font.BOLD, 18);
		tela.corDaLetraBotao = new Color(192,192,192);
		tela.corDaCaixaCalcular = new Color(47,79,79);
		tela.corDaCaixaLimpar = new Color(240,230,140);
		tela.corDoFundoLista = new Color(255,250,205);
		tela.corDaLetraLista = new Color(176,224,230);
		
		
		
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