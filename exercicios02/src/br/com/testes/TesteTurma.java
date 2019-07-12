package br.com.testes;

import br.com.orientacao_objetos.Turma;

public class TesteTurma {

	public static void main(String[] args) {

		Turma Turma01 = new Turma();
		Turma01.setEnsinoTurma("Fundamental");
		Turma01.setPeriodoTurma("Matutino");
		Turma01.setSerieTurma(3);
		Turma01.setSiglaTurma("FM3");

		Turma Turma02 = new Turma();
		Turma02.setEnsinoTurma("Médio");
		Turma02.setPeriodoTurma("Vespertino");
		Turma02.setSerieTurma(9);
		Turma02.setSiglaTurma("MV9");
		
		System.out.println("-----------------------------------------------");
		System.out.println("Ensino Turma 01: " + Turma01.getEnsinoTurma());
		System.out.println("Período Turma 01: " + Turma01.getPeriodoTurma());
		System.out.println("Série Turma 01: " + Turma01.getSerieTurma() + "º ano");
		System.out.println("Sigla Turma 01: " + Turma01.getSiglaTurma());
		System.out.println("-----------------------------------------------");
		System.out.println("Ensino Turma 02: " + Turma02.getEnsinoTurma());
		System.out.println("Período Turma 02: " + Turma02.getPeriodoTurma());
		System.out.println("Série Turma 02: " + Turma02.getSerieTurma() + "º ano");
		System.out.println("Sigla Turma 02: " + Turma02.getSiglaTurma());
		System.out.println("-----------------------------------------------");
		
	}
}
