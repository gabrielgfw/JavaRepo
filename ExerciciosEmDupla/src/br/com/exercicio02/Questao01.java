package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao01 {

	public static void main(String[] args) {

		double numeroInformado;
		double metadeNumero;

		numeroInformado = Teclado.lerDouble("Digite um n�mero!");

		if (numeroInformado > 20) {
			metadeNumero = numeroInformado / 2;
			System.out.println("Seu n�mero: " + numeroInformado + " � maior que 20:" + "\n" + "Metade do seu n�mero: "
					+ metadeNumero);
		} else {
			System.out.println("Seu n�mero: " + numeroInformado + " � menor que 20!");
		}

	}

}
