package br.com.orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {

		Turma newTurma01 = new Turma();
		newTurma01.periodoTurma = "Matutino";
		newTurma01.serieTurma = 3;
		newTurma01.siglaTurma = "3M2";
		newTurma01.tipoEnsino = "Médio";
		
		Turma newTurma02 = new Turma();
		newTurma02.periodoTurma = "Vespertino";
		newTurma02.serieTurma = 9;
		newTurma02.siglaTurma = "9V2";
		newTurma02.tipoEnsino = "Fundamental";
		
		
		System.out.println("Período Turma: " + newTurma01.periodoTurma);
		System.out.println("Série Turma: " + newTurma01.serieTurma);
		System.out.println("Sigla Turma: " + newTurma01.siglaTurma);
		System.out.println("Tipo Ensino: " + newTurma01.tipoEnsino);
		System.out.println("---------------------------");
		System.out.println("Período Turma: " + newTurma02.periodoTurma);
		System.out.println("Série Turma: " + newTurma02.serieTurma);
		System.out.println("Sigla Turma: " + newTurma02.siglaTurma);
		System.out.println("Tipo Ensino: " + newTurma02.tipoEnsino);
		
	}
}
