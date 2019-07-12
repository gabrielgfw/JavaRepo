package br.com.orientacao_objetos;

public abstract class Funcionario {

	protected String nomeFuncionario;
	protected double salarioFuncionario;
	protected int aumentosRecebidos;
	protected double valeRefeicaoDiario;
	protected double taxaReajusteVR = 0.15;  // 15%
	
	
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public double getSalarioFuncionario() {
		return salarioFuncionario;
	}

	public void setSalarioFuncionario(double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}

	public int getAumentosRecebidos() {
		return aumentosRecebidos;
	}

	public void setAumentosRecebidos(int aumentosRecebidos) {
		this.aumentosRecebidos = aumentosRecebidos;
	}
	
	public double getValeRefeicaoDiario() {
		return valeRefeicaoDiario;
	}

	public void setValeRefeicaoDiario(double valorVR) {
		this.valeRefeicaoDiario = valorVR;
	}
	
	public void setAumentoSalarial() {
		this.salarioFuncionario += this.salarioFuncionario * 0.05;
		this.aumentosRecebidos++;
	}


	public void getInfoFuncionario() {
		System.out.println("Consulta de Funcion�rio");
		System.out.println("------------------------------------------------");
		System.out.println("Nome Funcion�rio: " + this.nomeFuncionario);
		System.out.println("Sal�rio Funcion�rio: R$ " + this.salarioFuncionario);
		System.out.println("Vale Refei��o Di�rio:" + " R$ " + this.valeRefeicaoDiario );
		System.out.println("J� recebeu " + this.aumentosRecebidos + " aumento(s).");
		System.out.println("================================================");	
	}
	
	public void setReajusteVR() {

		System.out.println("Reajuste de VR!");
		System.out.println("Taxa fixada em " + (this.taxaReajusteVR * 100) + " %.");
		System.out.println("------------------------------------------------");
		System.out.println("Funcion�rio(a) " + this.nomeFuncionario + ":");
		System.out.println("Vale Refei��o atual: R$ " + this.valeRefeicaoDiario);
		this.calculoReajusteVR();
		System.out.println("Vale Refei��o AJUSTADO: R$ " + this.valeRefeicaoDiario);
		System.out.println("================================================");	
	}
	
	private void calculoReajusteVR() {
		this.valeRefeicaoDiario += this.valeRefeicaoDiario * this.taxaReajusteVR;
	}
}
