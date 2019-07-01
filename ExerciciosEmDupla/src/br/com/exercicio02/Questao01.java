package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		double numeroInformado;
		double metadeNumero;

		numeroInformado = Teclado.lerDouble("Digite um número!");

		if (numeroInformado > 20) {
			metadeNumero = numeroInformado / 2;
			System.out.println("Seu número: " + numeroInformado + " é maior que 20:" + "\n" + "Metade do seu número: "
					+ metadeNumero);
		} else {
			System.out.println("Seu número: " + numeroInformado + " é menor que 20!");
		}

	}

}
