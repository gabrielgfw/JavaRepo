package br.com.polimorfismo;

public class ContaCorrente extends ContaBanco{

	private String tipoConta = "Conta Corrente";

	
	
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	@Override
	public void getExtrato() {
		System.out.println("Extrato!");
		System.out.println("--------------------");
		System.out.println("Tipo Conta: " + this.getTipoConta());
		System.out.println("Codigo Conta: " + this.getCodigoConta());
		System.out.println("Saldo Conta: R$ " + this.getSaldoConta());
		System.out.println("Limite Conta: R$ " + this.getLimiteConta());
		System.out.println("--------------------");
	}
}
