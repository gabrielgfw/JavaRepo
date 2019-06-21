package orientacao_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {


		Cliente NovoCliente01 = new Cliente();
		NovoCliente01.codigoCliente = 01;
		NovoCliente01.nomeCliente = "Abigaelis";
		
		Cliente NovoCliente02 = new Cliente();
		NovoCliente02.codigoCliente = 02;
		NovoCliente02.nomeCliente = "Deneropis";
		
		CartaoDeCredito NovoCartao01 = new CartaoDeCredito();
		NovoCartao01.numeroCartao = 123456789;
		NovoCartao01.dataValidade = "11/22";
		NovoCartao01.codigoCliente = NovoCliente01.codigoCliente;  // vínculo
		
		CartaoDeCredito NovoCartao02 = new CartaoDeCredito();
		NovoCartao02.numeroCartao = 987654321;
		NovoCartao02.dataValidade = "10/24";
		NovoCartao02.codigoCliente = NovoCliente02.codigoCliente; // vínculo
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Cartao 01:      " + NovoCartao01.numeroCartao);
		System.out.println("Validade Cartao 01: " + NovoCartao01.dataValidade);
		System.out.println("Titular Cartao 01:  " + NovoCartao01.codigoCliente);
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Cartao 02:      " + NovoCartao02.numeroCartao);
		System.out.println("Validade Cartao 02: " + NovoCartao02.dataValidade);
		System.out.println("-----------------------------------------------");
		
		
	}

}
