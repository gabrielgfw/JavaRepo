package br.com.polimorfismo;

public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente contaCorrente01 = new ContaCorrente();
		contaCorrente01.setCodigoConta(12);
		contaCorrente01.setSaldoConta(5230.64);
		contaCorrente01.setLimiteConta(3532.32);
		
		ContaPoupanca contaPoupanca01 = new ContaPoupanca();
		contaPoupanca01.setCodigoConta(13);
		contaPoupanca01.setSaldoConta(329.21);
		contaPoupanca01.setLimiteConta(2002.32);
	
		contaCorrente01.getExtrato();
		contaPoupanca01.getExtrato();
		

	}

}
