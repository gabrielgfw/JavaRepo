package orientacao_objetos;

public class TesteAluno {

	public static void main(String[] args) {

		Turma Turma01 = new Turma();
		Turma01.siglaTurma = "FV1";
		
		Turma Turma02 = new Turma();
		Turma02.siglaTurma = "MM2";
		
		
		Aluno Aluno01 = new Aluno();
		Aluno01.nomeAluno = "Denerius Star Guerius";
		Aluno01.dataNascimento = "04/03/99";
		Aluno01.rgAluno = 232123;
		Aluno01.siglaTurma = Turma01.siglaTurma; // vínculo
		
		Aluno Aluno02 = new Aluno();
		Aluno02.nomeAluno = "Peperone Amargous";
		Aluno02.dataNascimento = "03/03/2003";
		Aluno02.rgAluno = 666555;
		Aluno02.siglaTurma = Turma02.siglaTurma; // vínculo
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nome Aluno 01: " + Aluno01.nomeAluno);
		System.out.println("Data Nascimento Aluno 01: " + Aluno01.dataNascimento);
		System.out.println("RG Aluno 01: " + Aluno01.rgAluno);
		System.out.println("Turma Aluno 01: " + Aluno01.siglaTurma);
		System.out.println("-----------------------------------------------");
		System.out.println("Nome Aluno 02: " + Aluno02.nomeAluno);
		System.out.println("Data Nascimento Aluno 02: " + Aluno02.dataNascimento);
		System.out.println("RG Aluno 02: " + Aluno02.rgAluno);
		System.out.println("Turma Aluno 02: " + Aluno02.siglaTurma);
		System.out.println("-----------------------------------------------");
				 

	}

}
