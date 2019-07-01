package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao04 {

	public static void main(String[] args) {

		double numeroInformado;

		
		numeroInformado = Teclado.lerDouble("Diga um número e te direi se o mesmo é multiplo de 4 e 5");
		
		if(numeroInformado % 4 == 0 && numeroInformado % 5 == 0) {
			System.out.println("Numero " + numeroInformado + " é multiplo de 4 e 5!");
		} else {
			System.out.println(numeroInformado + " não é multiplo de 4 e 5!");
		}
		
	}

}
