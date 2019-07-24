package br.com.orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {

		CartaoDeCredito newCartao01 = new CartaoDeCredito();
		newCartao01.dataValidade = "10/19";
		newCartao01.numeroCartao = 1230912903;
		
		CartaoDeCredito newCartao02 = new CartaoDeCredito();
		newCartao02.dataValidade = "11/22";
		newCartao02.numeroCartao = 1234212923;
		
		System.out.println("---------------------------------------------");
		System.out.println("Numero Cartao: " + newCartao01.numeroCartao);
		System.out.println("Data Validade: " + newCartao01.dataValidade);
		System.out.println("---------------------------------------------");
		System.out.println("Numero Cartao " + newCartao02.numeroCartao);
		System.out.println("Data Validade: " + newCartao02.dataValidade);
		System.out.println("---------------------------------------------");
		
	}

}
