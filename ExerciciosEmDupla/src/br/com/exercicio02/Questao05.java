package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		
		double nota01, nota02, nota03;
		double mediaAluno;
				
		nota01 = Teclado.lerDouble("Digite as 3 notas do aluno!" + "\n" + "Nota 01:");
		nota02 = Teclado.lerDouble("Nota 02:");
		nota03 = Teclado.lerDouble("Nota 03:");		
		mediaAluno = (nota01 + nota02 + nota03) / 3;
		
		if(mediaAluno >= 5) {
			System.out.println("Aluno aprovado!");
			System.out.println("Média do aluno: " + mediaAluno);
		} else {
			System.out.println("Aluno reprovado!");
			System.out.println("Média do aluno: " + mediaAluno);
		}
	}
	
}
