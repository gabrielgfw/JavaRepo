package br.com.orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {

		CartaoDeCredito newCartao01 = new CartaoDeCredito(1230912903);
		newCartao01.setDataValidade("10/19");
		newCartao01.setClienteCartao(new Cliente(00001));
		
		CartaoDeCredito newCartao02 = new CartaoDeCredito(1234212923);
		newCartao02.setDataValidade("11/22");
		newCartao02.setClienteCartao(new Cliente(00002));
		
		
		
		System.out.println("---------------------------------------------");
		System.out.println("Numero Cartao: " + newCartao01.getNumeroCartao());
		System.out.println("Data Validade: " + newCartao01.getDataValidade());
		System.out.println("Codigo Cliente: " + newCartao01.getClienteCartao());
		System.out.println("---------------------------------------------");
		System.out.println("Numero Cartao " + newCartao02.getNumeroCartao());
		System.out.println("Data Validade: " + newCartao02.getDataValidade());
		System.out.println("Codigo Cliente: " + newCartao01.getClienteCartao());
		System.out.println("---------------------------------------------");
		
	}

}