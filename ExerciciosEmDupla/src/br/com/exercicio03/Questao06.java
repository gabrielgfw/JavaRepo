package br.com.exercicio03;

import br.com.util.Teclado;

public class Questao06 {

	public static void main(String[] args) {

		double numeroInformado;
		double resultadoMultiplicacao;

		numeroInformado = Teclado.lerDouble("Digite um número entre 0 e 50!");

		if (numeroInformado > 50) {
			numeroInformado = Teclado.lerDouble(numeroInformado + " é maior que 50, favor tente outro número!");
		} else {
			resultadoMultiplicacao = 0;
			while (resultadoMultiplicacao <= 250) {
				resultadoMultiplicacao += numeroInformado * 3;
				System.out.println(resultadoMultiplicacao);
			}
		}

	}

}
