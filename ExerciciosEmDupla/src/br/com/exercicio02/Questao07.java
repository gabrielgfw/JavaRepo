package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao07 {

	public static void main(String[] args) {
		
		int numeroInformado;
		int numeroInformadoConvertido;

		
		numeroInformado = Teclado.lerInt("Digite um número e te direi o módulo deste número!");
		
		numeroInformadoConvertido = numeroInformado * (-1);
		
		System.out.println(numeroInformadoConvertido);
	}

}
