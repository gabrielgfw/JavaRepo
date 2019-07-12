package br.com.orientacao_objetos;

import java.util.Random;

public class ContaBanco {

	public static int contObjetos;
	private int memoryContador;
	private int numeroConta;
	private double saldoConta;
	private double limiteConta = 100.0;  // limite inicial //
	private int numeroAgencia;
	
	Random random = new Random();
	
	public ContaBanco(int cont, int nrconta, double saldconta, double limitconta, int nragencia) {
		this.contObjetos = cont;
		this.numeroConta = nrconta;
		this.saldoConta = saldconta;
		this.limiteConta = limitconta;
		this.numeroAgencia = nragencia;
		this.numeroConta = random.nextInt(9999);
		
		this.contObjetos++;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
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
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public static int getContObjetos() {
		return contObjetos;
	}
	
	
	public double setDeposito(double valorDeposito) {
		return saldoConta += valorDeposito;
	}	
	public double setSaque(double valorSaque) {
		return saldoConta -= valorSaque;
	}
	
	public void extratoConta() {
		System.out.println("===========================================");
		System.out.println("Extrato bancário");
		System.out.println("-------------------------------------------");
		System.out.println("Numero Conta:    " + this.numeroConta);
		System.out.println("Agencia:         " + this.numeroAgencia);
		System.out.println("Saldo Conta:  R$ " + this.saldoConta);
		System.out.println("Limite Conta: R$ " + this.limiteConta);
		System.out.println("===========================================");
	}

	public void zeraContador() {
		memoryContador = contObjetos;
		this.contObjetos = 0;
		System.out.println("------------------------------------------------------");
		System.out.println("O contador de objetos instanciados foi zerado!");
		System.out.println("Anteriormente foram instanciados " + memoryContador + " Objetos!");
		System.out.println("------------------------------------------------------");
	}
	
}
