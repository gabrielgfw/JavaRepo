package br.com.orientacao_a_objetos;

public class TesteContaBanco {

	public static void main(String[] args) {

		ContaBanco newConta01 = new ContaBanco();
		newConta01.numeroConta = 9032;
		newConta01.saldoConta = 5003.23;
		newConta01.limiteConta = 3040.22;
		
		ContaBanco newConta02 = new ContaBanco();
		newConta02.numeroConta = 4231;
		newConta02.saldoConta = 2013.25;
		newConta02.limiteConta = 1020.32;
		
		System.out.println("Numero Conta: "+ newConta01.numeroConta);
		System.out.println("Saldo Conta: R$ " + newConta01.saldoConta);
		System.out.println("Limite Conta: R$ " + newConta01.limiteConta);
		System.out.println("----------------------------");
		System.out.println("Numero Conta: " + newConta02.numeroConta);
		System.out.println("saldo Conta: R$ " + newConta02.saldoConta);
		System.out.println("Limite Conta: R$ " + newConta02.limiteConta);
	}

}
