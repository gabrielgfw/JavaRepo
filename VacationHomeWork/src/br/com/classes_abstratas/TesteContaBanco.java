package br.com.classes_abstratas;

public class TesteContaBanco {

	public static void main(String[] args) {

		ContaBanco con01 = new ContaPoupanca();
		con01.setCodigoConta(12);
		con01.setLimiteConta(5000.0);
		con01.setSaldoConta(3201.32);
		
		con01.getExtrato();

	}
}