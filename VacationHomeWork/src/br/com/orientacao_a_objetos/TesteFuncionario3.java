package br.com.orientacao_a_objetos;

public class TesteFuncionario3 {

	public static void main(String[] args) {


		Gerente gen01 = new Gerente();
		gen01.setNomeFuncionario("Vagabunds");
		gen01.setSalarioFuncionario(5329.21);
		gen01.setPassword("12345qwe");
		gen01.setValeRefeicaoDiario(32.21);
		
		Secretaria sen01 = new Secretaria();
		sen01.setNomeFuncionario("Milena Obscowisg");
		sen01.setSalarioFuncionario(2402.21);
		sen01.setValeRefeicaoDiario(14.02);
		sen01.setRamalSecretaria(9100);
		
		Telefonista ten01 = new Telefonista();
		ten01.setNomeFuncionario("Abigaelis Fernaus");
		ten01.setSalarioFuncionario(2152.32);
		ten01.setValeRefeicaoDiario(14.05);
		ten01.setCodigoEstacao(32);

	}

}
