package br.com.exercicio;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {

		int numeroInformado;
		
		numeroInformado = Teclado.lerInt("Informe um n�mero e te direi quais s�o multiplos de 3 e 5, do 1 at� o n�mero informado!");
	
		for(int i = 1; i <= numeroInformado; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
