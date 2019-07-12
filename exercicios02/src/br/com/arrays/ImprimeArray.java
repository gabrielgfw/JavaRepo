package br.com.arrays;

public class ImprimeArray {

	public static void main(String[] args) {

		
		int[] numerosTop = new int [] {10 ,3 ,11 , 1, 3};
		double maiorNumero;
		
		for (int i = 0; i < numerosTop.length; i++) {
			System.out.println("Número " + i + ": " + numerosTop[i]);
		}
		
		maiorNumero = 0;
		
		for (int i = 0; i < numerosTop.length; i++) {
			if(numerosTop[i] > maiorNumero) {
				maiorNumero = numerosTop[i];
			}
		}
		
		System.out.println("Maior número: " + maiorNumero);
	}
}
