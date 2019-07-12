package br.com.testes;

import br.com.orientacao_objetos.AgenciaBanco;
import br.com.orientacao_objetos.ContaBanco;

public class TesteContaBanco {

	public static void main(String[] args) {
		
		AgenciaBanco Agencia01 = new AgenciaBanco(333);
		
		AgenciaBanco Agencia02 = new AgenciaBanco(341);
				
		System.out.println("Objetos instanciados: " + ContaBanco.getContObjetos());
		
		ContaBanco NovaConta01 = new ContaBanco(ContaBanco.contObjetos, 0, 0, 0, 0);
		NovaConta01.setSaldoConta(1501.32);
		NovaConta01.setLimiteConta(1999.50);
		NovaConta01.setNumeroAgencia(Agencia01.getNumeroAgencia()); // vínculo
		
		ContaBanco NovaConta02 = new ContaBanco(ContaBanco.contObjetos, 0, 0, 0, 0);
		NovaConta02.setSaldoConta(3099.23);
		NovaConta02.setLimiteConta(4009.03);
		NovaConta02.setNumeroAgencia(Agencia02.getNumeroAgencia()); // vínculo
		
		System.out.println("Objetos instanciados: " + ContaBanco.contObjetos);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Conta 01: " + NovaConta01.getNumeroConta());
		System.out.println("Saldo Conta 01: R$ " + NovaConta01.getSaldoConta());  // getter
		System.out.println("Limite Conta 01: R$ " + NovaConta01.getLimiteConta());
		System.out.println("Nr. Agencia Conta 01: " + NovaConta01.getNumeroAgencia());
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Conta 02: " + NovaConta02.getNumeroConta());
		System.out.println("Saldo Conta 02: R$ " + NovaConta02.getSaldoConta());  // getter
		System.out.println("Limite Conta 02: R$ " + NovaConta02.getLimiteConta());
		System.out.println("Nr. Agencia Conta 02: " + NovaConta02.getNumeroAgencia());
		System.out.println("-----------------------------------------------");
		
		NovaConta01.setDeposito(1500.0);
		NovaConta01.setSaque(400.35);
		NovaConta01.extratoConta();
		NovaConta02.setSaque(1994.30);
		System.out.println("Saldo disponível Conta 02: R$ " + NovaConta02.getSaldoConta());
		NovaConta02.zeraContador();
		
	}

}
