package br.com.exercicio03;

public class Questao07 {

	public static void main(String[] args) {

		int cont = 1;

		for (int i = 1; i < 200; i++) {
			if (cont % 4 == 0) {
				System.out.println(cont);

			}
			cont++;
		}
	}
}
