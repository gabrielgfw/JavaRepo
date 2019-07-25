package br.com.orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {

		CartaoDeCredito newCartao01 = new CartaoDeCredito(1230912903);
		newCartao01.dataValidade = "10/19";
		newCartao01.clienteCartao = new Cliente();
		newCartao01.clienteCartao.nomeCliente = "Robeswaldo";
		newCartao01.clienteCartao.codigoCliente = 123123;
		
		CartaoDeCredito newCartao02 = new CartaoDeCredito(1234212923);
		newCartao02.dataValidade = "11/22";
		newCartao02.clienteCartao = new Cliente();
		newCartao02.clienteCartao.nomeCliente = "Amandinus";
		newCartao02.clienteCartao.codigoCliente = 321321321;
		
		
		System.out.println("---------------------------------------------");
		System.out.println("Numero Cartao: " + newCartao01.numeroCartao);
		System.out.println("Data Validade: " + newCartao01.dataValidade);
		System.out.println("Nome Cliente: " + newCartao01.clienteCartao.nomeCliente);
		System.out.println("Codigo Cliente: " + newCartao01.clienteCartao.codigoCliente);
		System.out.println("---------------------------------------------");
		System.out.println("Numero Cartao " + newCartao02.numeroCartao);
		System.out.println("Data Validade: " + newCartao02.dataValidade);
		System.out.println("Nome Cliente: " + newCartao02.clienteCartao.nomeCliente);
		System.out.println("Codigo Cliente: " + newCartao02.clienteCartao.codigoCliente);
		System.out.println("---------------------------------------------");
		
	}

}