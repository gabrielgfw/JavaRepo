package br.com.interfaces;

abstract public class ContaBanco implements InterfaceClasse{

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

}