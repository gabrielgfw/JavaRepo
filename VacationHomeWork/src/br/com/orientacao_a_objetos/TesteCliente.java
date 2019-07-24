package br.com.orientacao_a_objetos;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente newclient01 = new Cliente();
		newclient01.codigoCliente = 00001;
		newclient01.nomeCliente = "Adailsom Manero";
		
		Cliente newclient02 = new Cliente();
		newclient02.codigoCliente = 00002;
		newclient02.nomeCliente = "Arlindo Feius";
		
		System.out.println("-------------------------------------");
		System.out.println("Nome: " + newclient01.nomeCliente);
		System.out.println("Código: " + newclient01.codigoCliente);		
		System.out.println("-------------------------------------");
		System.out.println("Nome: " + newclient02.nomeCliente);
		System.out.println("Código: " + newclient02.codigoCliente);
		System.out.println("-------------------------------------");
		
	}

}
