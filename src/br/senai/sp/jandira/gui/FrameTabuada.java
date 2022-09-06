package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameTabuada {

	public String titulo;
	public int largura, altura;
	public Color corDoTitulo;
	public Font fonteDoTitulo;
	
	
	public void criarTela() {
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		//criar os componetes da tela
		JLabel labelTabuada1 = new JLabel();
		labelTabuada1.setText("Tabuada 1.0");
		labelTabuada1.setBounds(100, 10, 100, 30);
		labelTabuada1.setForeground(corDoTitulo);
		labelTabuada1.setFont(fonteDoTitulo);
		
		JLabel labelSubTitulo = new JLabel();
		labelSubTitulo.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule \r\n"
				+ "a tabuada que desejar em segundos");
		
		// obter instância da tela
		Container painel = tela.getContentPane();
		
		
		
		
		
		
		
		
		
		//Adicionar ao painel
		painel.add(labelTabuada1);
		painel.add(labelSubTitulo);
		
		tela.setVisible(true);
	}
}
