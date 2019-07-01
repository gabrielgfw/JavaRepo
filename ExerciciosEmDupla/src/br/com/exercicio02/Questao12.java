package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao12 {

	public static void main(String[] args) {

		
		double[] numeroInformado = new double [5];
		double maiorNumero;
		double menorNumero;
		
		maiorNumero = 0;
		menorNumero = 0;
		
		for(int i = 0; i < 5; i++) {
			numeroInformado[i] = Teclado.lerDouble("Digite o " + (i+1) + "º " + "número!");
		} 
		
		for(int i = 0; i < numeroInformado.length; i++) {
			if(i == 0) {
				maiorNumero = numeroInformado[i];
				menorNumero = numeroInformado[i];
			} else if (numeroInformado[i] < menorNumero) {
				menorNumero = numeroInformado[i];
			} else if (numeroInformado[i] > maiorNumero) {
				maiorNumero = numeroInformado[i];
			}
		}
		
		System.out.println("Maior número: " + maiorNumero);
		System.out.println("Menor número: " + menorNumero);
	}

}