package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

public class FrameTabuada {

	public String titulo;
	public int largura, altura;
	public Color corDaTela;
	public Color corDoTitulo;
	public Font fonteDoTitulo;
	public Font fonteDoSubTitulo;
	public Font fonteDosParagrafos;
	public Color corDaLetraCaixa;
	public Font  fonteDaLetraCaixa;
	public Color corDaLetraBotao;
	public Color corDaCaixaCalcular;
	public Color corDaCaixaLimpar;
	public Color corDaCaixaResultado;
	public Color corDoFundoLista;
	public Color corDaLetraLista;
	
	public void criarTela() {
		JFrame tela = new JFrame();
		
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// obter instância da tela
		Container painel = tela.getContentPane();
		painel.setBackground(corDaTela);
		
		
		
		//criar os componetes da tela
		
		ImageIcon imagem = new ImageIcon(getClass().getResource("calculadora.png"));
		JLabel labelImagem = new JLabel(imagem);
		
		labelImagem.setBounds(25, 20, 50, 30);
		
		JLabel labelTabuada1 = new JLabel();
		labelTabuada1.setText("Tabuada 1.0");
		labelTabuada1.setBounds(100, 10, 200, 30);
		labelTabuada1.setForeground(corDoTitulo);
		labelTabuada1.setFont(fonteDoTitulo);
		
		JTextArea textAreaSubTitulo = new JTextArea("Com a tabuada 1.0 os seus problemas acabaram. Calcule a tabuada que desejar em segundos!");
		textAreaSubTitulo.setBounds(100, 40, 400, 40);
		textAreaSubTitulo.setEditable(false);		
		textAreaSubTitulo.setLineWrap(true);
		textAreaSubTitulo.setWrapStyleWord(true);
		textAreaSubTitulo.setFont(fonteDoSubTitulo);
		textAreaSubTitulo.setBackground(corDaTela);
		
		//Multiplicando
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando :");
		labelMultiplicando.setBounds(150, 100, 120, 30);
		labelMultiplicando.setFont(fonteDosParagrafos);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(270, 100, 170, 30);
		textFieldMultiplicando.setForeground(corDaLetraCaixa);
		textFieldMultiplicando.setFont(fonteDaLetraCaixa);
		
		// MinMultiplicador
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador :");
		labelMinMultiplicador.setBounds(100, 160, 160, 30);
		labelMinMultiplicador.setFont(fonteDosParagrafos);
		
		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(270, 160, 170, 30);
		textFieldMinMultiplicador.setForeground(corDaLetraCaixa);
		textFieldMinMultiplicador.setFont(fonteDaLetraCaixa);
		
		//MaxMultiplicador
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador :");
		labelMaxMultiplicador.setBounds(100, 225, 160, 30);
		labelMaxMultiplicador.setFont(fonteDosParagrafos);
		
		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(270, 225, 170, 30);
		textFieldMaxMultiplicador.setForeground(corDaLetraCaixa);
		textFieldMaxMultiplicador.setFont(fonteDaLetraCaixa);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado: ");
		labelResultado.setBounds(100, 370, 120, 20);
		labelResultado.setFont(fonteDosParagrafos);
		
		
		
		//criar botões
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(100, 300, 150, 50);
		buttonCalcular.setForeground(corDaLetraBotao);
		buttonCalcular.setBackground(corDaCaixaCalcular);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(270, 300, 150, 50);
		buttonLimpar.setForeground(corDaLetraBotao);
		buttonLimpar.setBackground(corDaCaixaLimpar);
		
		// criando Jlist
		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);
		
		scroll.setBounds(100, 400, 365, 200);
		lista.setBackground(corDoFundoLista);
		lista.setForeground(corDaLetraLista);
		lista.setFont(fonteDaLetraCaixa);
		
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (textFieldMultiplicando.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Multiplicando é obrigatório");
					textFieldMultiplicando.requestFocus();
					
				} else if(textFieldMinMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Mínino multiplicador é obrigatório");
					textFieldMinMultiplicador.requestFocus();
				}
				else if(textFieldMaxMultiplicador.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Máximo multiplicador é obrigatório");
					textFieldMaxMultiplicador.requestFocus();
				} 
					else {
					Tabuada tabuada = new Tabuada();
					tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
					tabuada.minMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
					tabuada.maxMultipicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
					 
					if(tabuada.maxMultipicador < tabuada.minMultiplicador) {
						JOptionPane.showMessageDialog(null, "Máximo multiplicador tem que ser maior que o mínimo", 
								"ERRO", 
								JOptionPane.ERROR_MESSAGE);
					} 
					
					lista.setListData(tabuada.getTabuada());
				}
				
				
				
				
			}
		});
		
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textFieldMultiplicando.setText("");
				textFieldMinMultiplicador.setText("");
				textFieldMaxMultiplicador.setText("");
				lista.setVisible(false);
			}
		});
		
		textFieldMultiplicando.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textFieldMultiplicando.setText(textFieldMultiplicando.getText().replaceAll("[^0-9]", ""));
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textFieldMinMultiplicador.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textFieldMinMultiplicador.setText(textFieldMinMultiplicador.getText().replaceAll("[^0-9]", ""));
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textFieldMaxMultiplicador.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				textFieldMaxMultiplicador.setText(textFieldMaxMultiplicador.getText().replaceAll("[^0-9]", ""));
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		//Adicionar ao painel
		painel.add(labelTabuada1);
		painel.add(textAreaSubTitulo);
		painel.add(labelMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(textFieldMinMultiplicador);
		painel.add(textFieldMultiplicando);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		painel.add(labelImagem);
	
		
		
		
		tela.setVisible(true);
	}
}
