package br.com.exercicio02;

import br.com.util.Teclado;
import java.util.Arrays;

public class Questao13 {

	public static void main(String[] args) {

		double[] numeroInformado = new double[3];

		for (int i = 0; i < 3; i++) {
			numeroInformado[i] = Teclado.lerDouble("Digite o " + (i + 1) + "º número!");
		}
		Arrays.sort(numeroInformado);
		
		for(int i = 0; i < 3; i++) {
			System.out.println((i+1) + "º número: " + numeroInformado[i]);
		}
	}
}