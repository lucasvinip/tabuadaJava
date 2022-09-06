package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicando, minMultiplicador, maxMultipicador;

	public String[] getTabuada() {

		int tamanho = maxMultipicador - minMultiplicador + 1;
		String tabuada[] = new String[tamanho];

		int contador = 0;
		
		// laço de repetição
		while (contador < tamanho) {
			int produto = multiplicando * minMultiplicador;

			String resultado = multiplicando + " X " + minMultiplicador + " = " + produto;
			tabuada[contador] = resultado;

			contador++;
			minMultiplicador++;
		}

		return tabuada;
	}

}
