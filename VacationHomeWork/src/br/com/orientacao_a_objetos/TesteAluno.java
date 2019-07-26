package br.com.orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno newAluno01 = new Aluno();
		newAluno01.setNomeAluno("Ferpestom Aniltom");
		newAluno01.setRgAluno(1320381);
		newAluno01.setDtNascimentoAluno("05/02/1992");
		
		Aluno newAluno02 = new Aluno();
		newAluno02.setNomeAluno("Rozane Santos");
		newAluno02.setRgAluno(3927212);
		newAluno02.setDtNascimentoAluno("03/11/1983");

		
		System.out.println("Nome Aluno: " + newAluno01.getNomeAluno());
		System.out.println("RG Aluno: " + newAluno01.getRgAluno());
		System.out.println("Data Nascimento Aluno: " + newAluno01.getDtNascimentoAluno());
		System.out.println("--------------------------------");
		System.out.println("Nome Aluno: " + newAluno02.getNomeAluno());
		System.out.println("RG Aluno: " + newAluno02.getRgAluno());
		System.out.println("Data Nascimento Aluno: " + newAluno02.getDtNascimentoAluno());
	}

}
