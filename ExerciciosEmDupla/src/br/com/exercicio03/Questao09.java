package br.com.exercicio03;

public class Questao09 {

	public static void main(String[] args) {

		int par = 0, soma = 0;

		for (int i = 0; i <= 500; i++) {
			if (par % 2 == 0) {
				System.out.println("A soma dos número pares, de 0 até " + i + " é:");
				soma = par += i;
				System.out.println(soma);
			}
			par++;
		}
	}
}