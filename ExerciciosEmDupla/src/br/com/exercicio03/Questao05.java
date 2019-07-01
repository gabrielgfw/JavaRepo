package br.com.exercicio03;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {

		int numb = 0, mult;

		numb = Teclado.lerInt("Digite um número para cálulo: ");

		for (int i = 1; i <= 10; i++) {
			if (i <= 10) {
				mult = numb * i;
				System.out.println(numb + " . " + i + " = " + mult);
			}
		}
	}

}
