package br.com.interfaces;

public class ContaPoupanca extends ContaBanco{

	@Override
	public void getExtrato() {
		System.out.println("Extrato de conta poupan�a!");
		System.out.println("----------------------");
		System.out.println("C�digo Conta: R$ " + this.getCodigoConta());
		System.out.println("Saldo Conta:  R$ " + this.getSaldoConta());
		System.out.println("Limtie Conta: R$ " + this.getLimiteConta());
		System.out.println("----------------------");
	}

}
