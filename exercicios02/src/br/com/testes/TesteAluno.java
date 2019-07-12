package br.com.testes;

import br.com.orientacao_objetos.Aluno;
import br.com.orientacao_objetos.Turma;

public class TesteAluno {

	public static void main(String[] args) {

		Turma Turma01 = new Turma();
		Turma01.setSiglaTurma("FV1");
		
		Turma Turma02 = new Turma();
		Turma02.setSiglaTurma("MM2");
		
		Aluno Aluno01 = new Aluno();
		Aluno01.setNomeAluno("Denerius Star Guerius");
		Aluno01.setDataNascimento("04/03/99");
		Aluno01.setRgAluno(232123);
		Aluno01.setSiglaTurma(Turma01.getSiglaTurma()); // vínculo
		
		Aluno Aluno02 = new Aluno();
		Aluno02.setNomeAluno("Peperone Amargous");
		Aluno02.setDataNascimento("03/03/2003");
		Aluno02.setRgAluno(666555);
		Aluno02.setSiglaTurma(Turma02.getSiglaTurma()); // vínculo
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nome Aluno 01: " + Aluno01.getNomeAluno());
		System.out.println("Data Nascimento Aluno 01: " + Aluno01.getDataNascimento());
		System.out.println("RG Aluno 01: " + Aluno01.getRgAluno());
		System.out.println("Turma Aluno 01: " + Aluno01.getSiglaTurma());
		System.out.println("-----------------------------------------------");
		System.out.println("Nome Aluno 02: " + Aluno02.getNomeAluno());
		System.out.println("Data Nascimento Aluno 02: " + Aluno02.getDataNascimento());
		System.out.println("RG Aluno 02: " + Aluno02.getRgAluno());
		System.out.println("Turma Aluno 02: " + Aluno02.getSiglaTurma());
		System.out.println("-----------------------------------------------");
				 
	}

}
