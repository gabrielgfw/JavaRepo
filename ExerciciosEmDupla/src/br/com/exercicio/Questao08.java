package br.com.exercicio;

import br.com.util.Teclado;

public class Questao08 {

	public static void main(String[] args) {

		String[] nomePessoa = new String[20];
		String[] sexoPessoa = new String[20];
		int[] idadePessoa = new int[20];
		
		for(int i = 0; i < 20; i++) {
			nomePessoa[i] = Teclado.lerTexto("Digite o nome da " + (i+1) + "ª " + "pessoa!");
			sexoPessoa[i] = Teclado.lerTexto("Digite o sexo da " + (i+1) + "ª " + "pessoa (M / F)");
			idadePessoa[i] = Teclado.lerInt("Digite a idade da " + (i+1) + "ª " + "pessoa!");
		}
		
		for(int i = 0; i <= 19; i++) {
			if (sexoPessoa[i].equalsIgnoreCase("M") && idadePessoa[i] >= 21) {
				System.out.println("Nome da pessoa: " + nomePessoa[i]);
				System.out.println("Idade da pessoa: " + idadePessoa[i]);
				System.out.println("-------------------------------");
			}
		}
		System.out.println("sem mais pessoas do sexo masculino com idade igual ou superior a 21 anos!");
	}

}
