package br.com.exercicio;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {

		double[] nota1 = new double[15];
		double[] nota2 = new double[15];
		double[] media = new double[15];
		String[] alunos = new String[15];
		double mediaTurma;

		mediaTurma = 0;
		
		for (int i = 0; i < 15; i++) {
			alunos[i] = Teclado.lerTexto("Digiter o nome do " + (i + 1) + "º aluno");
			nota1[i] = Teclado.lerDouble("Digite a 1ª nota: ");
			nota2[i] = Teclado.lerDouble("Digite a 2ª nota: ");

			media[i] = (nota1[i] + nota2[i]) / 2;
			mediaTurma += media[i];
		}

		for (int i = 0; i < 15; i++) {					
			if (media[i] >= 5) {
				System.out.println("Nome aluno: " + alunos[i]);
				System.out.println("Nota 1: " + nota1[i] + "\n" + "Nota 2: " + nota2[i]);
				System.out.println("Aluno Aprovado com média: " + media[i] + "\n");
				
			} else if (media[i] < 5) {
				System.out.println("Nome aluno: " + alunos[i]);
				System.out.println("Nota 1: " + nota1[i] + "\n" + "Nota 2: " + nota2[i]);
				System.out.println("Aluno Reprovado com média: " + media[i] + "\n");
			}

		}

		mediaTurma = mediaTurma / alunos.length;
		System.out.println("Média turma: " + mediaTurma);
	}

}