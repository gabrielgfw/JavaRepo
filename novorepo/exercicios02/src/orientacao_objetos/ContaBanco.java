package orientacao_objetos;

public class ContaBanco {

	int numeroConta;
	double saldoConta;
	double limiteConta = 100;  // limite inicial //
	int numeroAgencia;
	
	
	public double setDeposito(double valorDeposito) {
		return saldoConta += valorDeposito;
	}
	
	public double setSaque(double valorSaque) {
		return saldoConta -= valorSaque;
	}
	
	public void extratoConta() {
		System.out.println("===========================================");
		System.out.println("Extrato bancário");
		System.out.println("-------------------------------------------");
		System.out.println("Numero Conta:    " + this.numeroConta);
		System.out.println("Agencia:         " + this.numeroAgencia);
		System.out.println("Saldo Conta:  R$ " + this.saldoConta);
		System.out.println("Limite Conta: R$ " + this.limiteConta);
		System.out.println("===========================================");
	}
	
	public double getSaldo() {
		return this.saldoConta;
	}
	
}
