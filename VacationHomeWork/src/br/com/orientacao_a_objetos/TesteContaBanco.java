package br.com.orientacao_a_objetos;

public class TesteContaBanco {

	public static void main(String[] args) {

		ContaBanco newConta01 = new ContaBanco();
		newConta01.setSaldoConta(5003.23);
		newConta01.setLimiteConta(3040.22);
		newConta01.setAgenciaConta(new AgenciaBanco(50));
		
		ContaBanco newConta02 = new ContaBanco();
		newConta02.setSaldoConta(2013.25);
		newConta02.setLimiteConta(1020.32);
		newConta02.setAgenciaConta(new AgenciaBanco(32));
		
		System.out.println("-------------------------");
		System.out.println("Teste métodos: ");
		
		System.out.println("Saldo Conta01: " + newConta01.getSaldo());
		newConta01.setSaque(1523.23);
		newConta01.getExtrato();
		
		newConta02.setDeposito(1432.21);
		newConta02.getExtrato();
	
		newConta02.transferencia(300, newConta01);
		System.out.println("Saldo Conta01: " + newConta01.getSaldo());
		
		System.out.println("--------------------------");
		System.out.println("Quantidades de Contas criadas: " + ContaBanco.contador);
		
		newConta01.zerarContador();
	}

}