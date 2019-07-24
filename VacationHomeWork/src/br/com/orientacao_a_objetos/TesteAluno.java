package br.com.orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno newAluno01 = new Aluno();
		newAluno01.nomeAluno = "Ferpestom Aniltom";
		newAluno01.rgAluno = 1320381;
		newAluno01.dtNascimentoAluno = "05/02/1992";
		newAluno01.turmaAluno = new Turma();
		newAluno01.turmaAluno.periodoTurma = "Matutino";
		newAluno01.turmaAluno.serieTurma = 3;
		newAluno01.turmaAluno.siglaTurma = "3M2";
		newAluno01.turmaAluno.tipoEnsino = "Médio";
		
		Aluno newAluno02 = new Aluno();
		newAluno02.nomeAluno = "Rozane Santos";
		newAluno02.rgAluno = 3927212;
		newAluno02.dtNascimentoAluno = "03/11/1983";
		newAluno02.turmaAluno = new Turma();
		newAluno02.turmaAluno.periodoTurma = "Vespertino";
		newAluno02.turmaAluno.serieTurma = 9;
		newAluno02.turmaAluno.siglaTurma = "9V2";
		newAluno02.turmaAluno.tipoEnsino = "Fundamental";
		
		System.out.println("Nome Aluno: " + newAluno01.nomeAluno);
		System.out.println("RG Aluno: " + newAluno01.rgAluno);
		System.out.println("Data Nascimento Aluno: " + newAluno01.dtNascimentoAluno);
		System.out.println("Sigla Turma Aluno: " + newAluno01.turmaAluno.siglaTurma);
		System.out.println("--------------------------------");
		System.out.println("Nome Aluno: " + newAluno02.nomeAluno);
		System.out.println("RG Aluno: " + newAluno02.rgAluno);
		System.out.println("Data Nascimento Aluno: " + newAluno02.dtNascimentoAluno);
		System.out.println("Sigla Turma Aluno: " + newAluno02.turmaAluno.siglaTurma);

	}

}
