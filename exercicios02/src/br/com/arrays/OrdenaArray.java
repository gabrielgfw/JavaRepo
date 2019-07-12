package br.com.arrays;

import java.util.Arrays;

public class OrdenaArray {

	public static void main(String[] args) {
		
		int[] numerosTop = new int [] {10 ,3 ,2 , 1, 4};
		
		
		System.out.println("Ordenação Master!");
		Arrays.sort(numerosTop);		
		for(int num : numerosTop) {
			System.out.println(num);
		}
	}

}
