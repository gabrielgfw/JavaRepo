package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao10 {

	public static void main(String[] args) {

		double numero01;
		double numero02;

		numero01 = Teclado.lerDouble(
				"Digite dois números e te direi se o 2º número é divisor do 1º!" + "\n" + "Digite o 1º número:");
		numero02 = Teclado.lerDouble("Digite o 2º número:");

		if (numero01 % numero02 == 0) {
			System.out.println(numero02 + " é divisível por " + numero01);
		} else {
			System.out.println(numero02 + " não é divisível para " + numero01);
		}

	}

}
