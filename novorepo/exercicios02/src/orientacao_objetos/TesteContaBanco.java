package orientacao_objetos;

public class TesteContaBanco {

	public static void main(String[] args) {

		AgenciaBanco Agencia01 = new AgenciaBanco(333);
		
		AgenciaBanco Agencia02 = new AgenciaBanco(341);
				
		ContaBanco NovaConta01 = new ContaBanco();
		NovaConta01.numeroConta = 20001;
		NovaConta01.saldoConta = 1501.32;
		NovaConta01.limiteConta = 1999.50;
		NovaConta01.numeroAgencia = Agencia01.numeroAgencia; // vínculo
		
		ContaBanco NovaConta02 = new ContaBanco();
		NovaConta02.numeroConta = 20973;
		NovaConta02.saldoConta = 3099.23;
		NovaConta02.limiteConta = 4009.03;
		NovaConta02.numeroAgencia = Agencia02.numeroAgencia; // vínculo
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Conta 01:         " + NovaConta01.numeroConta);
		System.out.println("Saldo Conta 01:    R$ " + NovaConta01.getSaldo());  // getter
		System.out.println("Limite Conta 01:   R$ " + NovaConta01.limiteConta);
		System.out.println("Nr. Agencia Conta 01: " + NovaConta01.numeroAgencia);
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Conta 02:         " + NovaConta02.numeroConta);
		System.out.println("Saldo Conta 02:    R$ " + NovaConta02.getSaldo());  // getter
		System.out.println("Limite Conta 02:   R$ " + NovaConta02.limiteConta);
		System.out.println("Nr. Agencia Conta 02: " + NovaConta02.numeroAgencia);
		System.out.println("-----------------------------------------------");
		
		NovaConta01.setDeposito(1500);
		NovaConta01.setSaque(400.35);
		NovaConta01.extratoConta();
		
		NovaConta02.setSaque(1994.30);
		System.out.println("Saldo disponível Conta 02: R$ " + NovaConta02.getSaldo());
		
		
	}

}
