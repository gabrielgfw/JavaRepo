package br.com.orientacao_a_objetos;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente newclient01 = new Cliente(00001);
		newclient01.setNomeCliente("Adailsom Manero");
		
		Cliente newclient02 = new Cliente(00002);
		newclient02.setNomeCliente("Arlindo Feius");
		
		System.out.println("-------------------------------------");
		System.out.println("Nome: " + newclient01.getNomeCliente());
		System.out.println("Código: " + newclient01.getCodigoCliente());		
		System.out.println("-------------------------------------");
		System.out.println("Nome: " + newclient02.getNomeCliente());
		System.out.println("Código: " + newclient02.getCodigoCliente());
		System.out.println("-------------------------------------");
		
	}

}