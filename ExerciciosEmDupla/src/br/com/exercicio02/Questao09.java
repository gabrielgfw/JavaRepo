package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {


		double numeroInformado;
		
		numeroInformado = Teclado.lerDouble("Informe um n�mero!");

		if(numeroInformado > 0) {
			System.out.println(numeroInformado + " � um n�mero positivo!");
		} else if (numeroInformado < 0) {
			System.out.println(numeroInformado + " � um n�mero negativo!");
		} else {
			System.out.println(numeroInformado + " � nulo!");
		}
		
	}

}
