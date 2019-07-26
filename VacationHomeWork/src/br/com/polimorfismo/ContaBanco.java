package br.com.polimorfismo;

public class ContaBanco {
	
	private int codigoConta;
	private double saldoConta;
	private double limiteConta;
	
	
	public int getCodigoConta() {
		return codigoConta;
	}
	public void setCodigoConta(int codigoConta) {
		this.codigoConta = codigoConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	public double getLimiteConta() {
		return limiteConta;
	}
	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}
	
	public void getExtrato() {
		System.out.println("Extrato!");
		System.out.println("--------------------");
		System.out.println("Codigo Conta: " + this.getCodigoConta());
		System.out.println("Saldo Conta: R$ " + this.getSaldoConta());
		System.out.println("Limite Conta: R$ " + this.getLimiteConta());
		System.out.println("--------------------");
	}

}
