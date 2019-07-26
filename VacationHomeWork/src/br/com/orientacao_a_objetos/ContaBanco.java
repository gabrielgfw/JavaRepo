package br.com.orientacao_a_objetos;

import java.util.Random;

public class ContaBanco {
		
	private int numeroConta;
	private double saldoConta;
	private double limiteConta = 100.0; // limite inicial
	private AgenciaBanco agenciaConta;
	static int contador;
	private int memoryContador;
	private int backupContador;
	
	Random random = new Random();
	
	public ContaBanco() {
		if(contador < memoryContador) {
			contador++;
			memoryContador = contador;
			this.numeroConta = contador;
		} else {
			contador++;
			backupContador = memoryContador;
			memoryContador = contador;
			backupContador++;
			this.numeroConta = backupContador;
		}
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

	public AgenciaBanco getAgenciaConta() {
		return agenciaConta;
	}

	public void setAgenciaConta(AgenciaBanco agenciaConta) {
		this.agenciaConta = agenciaConta;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		ContaBanco.contador = contador;
	}

	public int getMemoryContador() {
		return memoryContador;
	}

	public void setMemoryContador(int memoryContador) {
		this.memoryContador = memoryContador;
	}

	public int getBackupContador() {
		return backupContador;
	}

	public void setBackupContador(int backupContador) {
		this.backupContador = backupContador;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}
	
	public void zerarContador() {
		memoryContador = contador;
		contador = 0;
		System.out.println("-------------------");
		System.out.println("Contador zerado!");
		System.out.println("-------------------");
		System.out.println("Contas criadas anteriormente: " + memoryContador);
		System.out.println("-------------------");
	}
	
	public void setDeposito(double valorDeposito) {
		this.saldoConta += valorDeposito;
	}
	
	public void setSaque(double valorSaque) {
		this.saldoConta -= valorSaque;
	}
	
	public double getSaldo() {
		return this.saldoConta;
	}

	public void getExtrato() {
		System.out.println("======================");
		System.out.println("Extrato Conta");
		System.out.println("----------------------");
		System.out.println("Número Conta: " + this.getNumeroConta());
		System.out.println("Saldo Conta: R$ " + this.getSaldoConta());
		System.out.println("Limite Conta: R$ " + this.getLimiteConta());
		System.out.println("Agencia Banco: " + this.agenciaConta.getNumeroAgencia());
		System.out.println("======================");
	}
	
	public void transferencia(double valor, ContaBanco contaB) {
		this.saldoConta -= valor;
		contaB.saldoConta += valor;
		System.out.println("Transferência bem sucedida!");
		System.out.println("Valor transferido: R$" + valor);
	}
	
	
}