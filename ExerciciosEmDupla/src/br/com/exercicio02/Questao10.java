package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao10 {

	public static void main(String[] args) {

		double numero01;
		double numero02;

		numero01 = Teclado.lerDouble(
				"Digite dois n�meros e te direi se o 2� n�mero � divisor do 1�!" + "\n" + "Digite o 1� n�mero:");
		numero02 = Teclado.lerDouble("Digite o 2� n�mero:");

		if (numero01 % numero02 == 0) {
			System.out.println(numero02 + " � divis�vel por " + numero01);
		} else {
			System.out.println(numero02 + " n�o � divis�vel para " + numero01);
		}

	}

}
