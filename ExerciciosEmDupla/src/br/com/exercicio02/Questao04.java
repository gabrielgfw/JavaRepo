package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao04 {

	public static void main(String[] args) {

		double numeroInformado;

		
		numeroInformado = Teclado.lerDouble("Diga um n�mero e te direi se o mesmo � multiplo de 4 e 5");
		
		if(numeroInformado % 4 == 0 && numeroInformado % 5 == 0) {
			System.out.println("Numero " + numeroInformado + " � multiplo de 4 e 5!");
		} else {
			System.out.println(numeroInformado + " n�o � multiplo de 4 e 5!");
		}
		
	}

}
