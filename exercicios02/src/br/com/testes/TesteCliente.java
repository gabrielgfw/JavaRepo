package br.com.testes;

import br.com.orientacao_objetos.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente NovoCliente01 = new Cliente();
		NovoCliente01.setCodigoCliente(01);
		NovoCliente01.setNomeCliente("Robeswaldir");
		
		Cliente NovoCliente02 = new Cliente();
		NovoCliente02.setCodigoCliente(02);
		NovoCliente02.setNomeCliente("Renaltis");

		System.out.println("------------------------------------------------------");	
		System.out.println("Codigo Cliente 01: " + NovoCliente01.getCodigoCliente());
		System.out.println("Nome Cliente 01:   " + NovoCliente01.getNomeCliente());		
		System.out.println("------------------------------------------------------");		
		System.out.println("Codigo Cliente 02: " + NovoCliente02.getCodigoCliente());
		System.out.println("Nome Cliente 02:   " + NovoCliente02.getNomeCliente());		
		System.out.println("------------------------------------------------------");
		
	}
}
