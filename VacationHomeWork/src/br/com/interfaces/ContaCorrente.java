package br.com.interfaces;

public class ContaCorrente extends ContaBanco{

	@Override
	public void getExtrato() {
		System.out.println("Extrato de conta corrente!");
		System.out.println("----------------------");
		System.out.println("Código Conta: R$ " + this.getCodigoConta());
		System.out.println("Saldo Conta:  R$ " + this.getSaldoConta());
		System.out.println("Limtie Conta: R$ " + this.getLimiteConta());
		System.out.println("----------------------");
	}

}
