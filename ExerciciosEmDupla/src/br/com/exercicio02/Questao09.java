package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {


		double numeroInformado;
		
		numeroInformado = Teclado.lerDouble("Informe um número!");

		if(numeroInformado > 0) {
			System.out.println(numeroInformado + " é um número positivo!");
		} else if (numeroInformado < 0) {
			System.out.println(numeroInformado + " é um número negativo!");
		} else {
			System.out.println(numeroInformado + " é nulo!");
		}
		
	}

}
