package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao11 {

	public static void main(String[] args) {


		String numeroInformado;
		
		numeroInformado = Teclado.lerTexto("Digite um n�mero de 3 casas e te direi os n�meros individualmente!");
		
		for(int i = 0; i <= 2; i++) {
			System.out.println(numeroInformado.charAt(i));
		}
		
	}

}
