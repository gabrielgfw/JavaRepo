package br.com.testes;

import br.com.orientacao_objetos.CartaoDeCredito;
import br.com.orientacao_objetos.Cliente;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {

		Cliente NovoCliente01 = new Cliente();
		NovoCliente01.setCodigoCliente(01);
		NovoCliente01.setNomeCliente("Abigaelis");
		
		Cliente NovoCliente02 = new Cliente();
		NovoCliente02.setCodigoCliente(02);
		NovoCliente02.setNomeCliente("Deneropis");
		
		CartaoDeCredito NovoCartao01 = new CartaoDeCredito(123456789);
		NovoCartao01.setDataValidade("11/22");
		NovoCartao01.setCodigoCliente(NovoCliente01.getCodigoCliente());  // vínculo
		
		CartaoDeCredito NovoCartao02 = new CartaoDeCredito(987654321);
		NovoCartao02.setDataValidade("10/24");
		NovoCartao02.setCodigoCliente(NovoCliente02.getCodigoCliente()); // vínculo
			
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Cartao 01:      " + NovoCartao01.getNumeroCartao());
		System.out.println("Validade Cartao 01: " + NovoCartao01.getDataValidade());
		System.out.println("Titular Cartao 01:  " + NovoCartao01.getCodigoCliente());
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Cartao 02:      " + NovoCartao02.getNumeroCartao());
		System.out.println("Validade Cartao 02: " + NovoCartao02.getDataValidade());
		System.out.println("-----------------------------------------------");
				
	}
}
