package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		double valor01, valor02, diferenca;
		
		
		valor01 = Teclado.lerDouble("Informe dois n�mero!" + "\n" 
								  + "1� n�mero: ");
		valor02 = Teclado.lerDouble("2� n�mero: ");
		
		if(valor01 > valor02) {
			diferenca = valor01 - valor02;
			System.out.println("Diferen�a entre os n�meros " + valor01 + " e " + valor02 + " �:");
			System.out.println(diferenca);
		} else {
			diferenca = valor02 - valor01;
			diferenca = valor02 - valor01;
			System.out.println("Diferen�a entre os n�mero " + valor02 + " e " + valor01 + " �:");
			System.out.println(diferenca);
		}
	}
	
}
