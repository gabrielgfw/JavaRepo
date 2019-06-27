package orientacao_objetos;

public class TesteTurma {

	public static void main(String[] args) {

		Turma Turma01 = new Turma();
		Turma01.ensinoTurma = "Fundamental";
		Turma01.periodoTurma = "Matutino";
		Turma01.serieTurma = 3;
		Turma01.siglaTurma = "FM3";

		Turma Turma02 = new Turma();
		Turma02.ensinoTurma = "Médio";
		Turma02.periodoTurma = "Vespertino";
		Turma02.serieTurma = 9;
		Turma02.siglaTurma = "MV9";
		
		System.out.println("-----------------------------------------------");
		System.out.println("Ensino Turma 01: " + Turma01.ensinoTurma);
		System.out.println("Período Turma 01: " + Turma01.periodoTurma);
		System.out.println("Série Turma 01: " + Turma01.serieTurma + "º ano");
		System.out.println("Sigla Turma 01: " + Turma01.siglaTurma);
		System.out.println("-----------------------------------------------");
		System.out.println("Ensino Turma 02: " + Turma02.ensinoTurma);
		System.out.println("Período Turma 02: " + Turma02.periodoTurma);
		System.out.println("Série Turma 02: " + Turma02.serieTurma + "º ano");
		System.out.println("Sigla Turma 02: " + Turma02.siglaTurma);
		System.out.println("-----------------------------------------------");
		
		
		
	}

}
