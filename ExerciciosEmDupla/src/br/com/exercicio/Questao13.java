package br.com.exercicio;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		
		int polegadaInformada;
		double polegadaConvertida;
		double polegadaValor = 2.54;
		
		polegadaInformada = Teclado.lerInt("Conversor de polegada para centímeros!" + "\n"
										+ "Digite um valor em polegadas (int):");
		polegadaConvertida = polegadaInformada * polegadaValor;

		System.out.println("Valor informado (polegadas): " + polegadaInformada);
		System.out.println("Convertido para cm: " + polegadaConvertida + " cm");
	}

}
