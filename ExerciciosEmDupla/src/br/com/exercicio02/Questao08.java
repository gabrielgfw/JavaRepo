package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {

		int numeroInformado;
		
		numeroInformado = Teclado.lerInt("Informe um n�mero e te direi se ele est� entre 1 e 10.");
		
		
		if(numeroInformado > 0 && numeroInformado <= 10) {
			System.out.println(numeroInformado + " est� entre 1 e 10!");
		} else {
			System.out.println(numeroInformado + " n�o est� entre 1 e 10!");
		}
		

	}

}
