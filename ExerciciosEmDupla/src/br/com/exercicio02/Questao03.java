package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao03 {

	public static void main(String[] args) {

		int numeroInformado;

		
		numeroInformado = Teclado.lerInt("Diga um n�mero e te direi se o mesmo � par ou impar!");
		
		if(numeroInformado % 2 == 0) {
			System.out.println(numeroInformado + " � par!");
		} else {
			System.out.println(numeroInformado + " � impar!");
		}
		
	}

}
