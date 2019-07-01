package br.com.exercicio;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {

		int numeroInformado;
		
		numeroInformado = Teclado.lerInt("Digite o número que deseja visualizar a tabuada!");
				
		for(int i = 0; i <= 10; i++) {
			System.out.println(numeroInformado + " x " + i + " = " + numeroInformado * i);
		}
		
	}

}
