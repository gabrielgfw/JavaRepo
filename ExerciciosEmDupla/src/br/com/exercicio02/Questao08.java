package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {

		int numeroInformado;
		
		numeroInformado = Teclado.lerInt("Informe um número e te direi se ele está entre 1 e 10.");
		
		
		if(numeroInformado > 0 && numeroInformado <= 10) {
			System.out.println(numeroInformado + " está entre 1 e 10!");
		} else {
			System.out.println(numeroInformado + " não está entre 1 e 10!");
		}
		

	}

}
