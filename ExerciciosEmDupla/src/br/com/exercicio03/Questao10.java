package br.com.exercicio03;

public class Questao10 {

	public static void main(String[] args) {

		int constante = 3;

		for (int i = 0; i <= 15; i++) {
			double memory;
			if (i == 0) {
				System.out.println(3 + " elevado à " + i + "= " + 1);
			} else {
				memory = constante * i;
				System.out.println(constante + " elevado à " + i + " = " + memory);
			}
		}
	}
}
