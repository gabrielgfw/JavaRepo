package br.com.exercicio;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		double numb, exp, result = 0, memoria = 0;

		numb = Teclado.lerDouble("Digite um número: ");
		exp = Teclado.lerDouble("Digite o expoente: ");

		for (int i = 0; i <= exp; i++) {
			if (i == 0) {
				result = (numb * numb);
			} else {
				memoria = result * numb;
			}

		}
		System.out.println(memoria);
	}

}