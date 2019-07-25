package br.com.orientacao_a_objetos;

import java.util.Random;

public class ContaBanco {
		
	int numeroConta;
	double saldoConta;
	double limiteConta = 100.0; // limite inicial
	AgenciaBanco agenciaConta;
	static int contador;
	int memoryContador;
	int backupContador;
	
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
		System.out.println("Número Conta: " + this.numeroConta);
		System.out.println("Saldo Conta: R$ " + this.saldoConta);
		System.out.println("Limite Conta: R$ " + this.limiteConta);
		System.out.println("Agencia Banco: " + this.agenciaConta.numeroAgencia);
		System.out.println("======================");
	}
	
	public void transferencia(double valor, ContaBanco contaB) {
		this.saldoConta -= valor;
		contaB.saldoConta += valor;
		System.out.println("Transferência bem sucedida!");
		System.out.println("Valor transferido: R$" + valor);
	}
}