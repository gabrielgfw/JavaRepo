package br.com.classes_abstratas;

public class TesteFuncionarioBanco {

	public static void main(String[] args) {

		FuncionarioBanco gen01 = new Gerente();
		gen01.setNomeFuncionario("Fulanoide");
		gen01.setSalarioFuncionario(942.23);
		gen01.setValeRefeicaoDiario(23.21);

		gen01.getBonificacao();
	}

}
