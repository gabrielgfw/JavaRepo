package br.com.testes;

import br.com.orientacao_objetos.AgenciaBanco;

public class TesteAgenciaBanco {

	public static void main(String[] args) {
		
		AgenciaBanco NovaAgencia01 = new AgenciaBanco(1001);		
		AgenciaBanco NovaAgencia02 = new AgenciaBanco(1002);
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Agencia 01: " + NovaAgencia01.getNumeroAgencia());
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Agencia 02: " + NovaAgencia02.getNumeroAgencia());
		System.out.println("-----------------------------------------------");
				
	}

}
