package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		double valor01, valor02, diferenca;
		
		
		valor01 = Teclado.lerDouble("Informe dois número!" + "\n" 
								  + "1º número: ");
		valor02 = Teclado.lerDouble("2º número: ");
		
		if(valor01 > valor02) {
			diferenca = valor01 - valor02;
			System.out.println("Diferença entre os números " + valor01 + " e " + valor02 + " é:");
			System.out.println(diferenca);
		} else {
			diferenca = valor02 - valor01;
			diferenca = valor02 - valor01;
			System.out.println("Diferença entre os número " + valor02 + " e " + valor01 + " é:");
			System.out.println(diferenca);
		}
	}
	
}
