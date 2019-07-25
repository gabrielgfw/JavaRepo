package br.com.orientacao_a_objetos.array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] numeros = new int[] {0, 2, 3, 1};
		double media = 0.0;
		double soma = 0.0;
		int maiorNumero = 0;
		
		System.out.println("--------------------");
		System.out.println("Imprimindo o array!");
		System.out.println("--------------------");
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("--------------------");
		System.out.println("Ordenando o array!");
		System.out.println("--------------------");
		
		Arrays.sort(numeros);
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("--------------------");
		System.out.println("Extraindo a média do array!");
		
		for(int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			media = (soma / numeros.length);
		}
		System.out.println("--------------------");
		System.out.println("> Média: " + media);
		System.out.println("--------------------");
		System.out.println("Extraindo o maior número!");
		System.out.println("--------------------");
		
		for(int i = 0; i < numeros.length; i++) {
			if(maiorNumero < numeros[i]) {
				maiorNumero = numeros[i];
			}
		}
		System.out.println("> Maior número: " + maiorNumero);
		System.out.println("--------------------");
	}

}
