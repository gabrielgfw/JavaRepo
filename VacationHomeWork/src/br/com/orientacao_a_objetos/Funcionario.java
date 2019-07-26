package br.com.orientacao_a_objetos;

public class Funcionario {

	private String nomeFuncionario;
	protected double salarioFuncionario = 1000.00; // sal�rio inicial
	protected double valeRefeicaoDiario;
	private double taxaReajusteVR = 0.15; // 15%
	
	
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

	public double getValeRefeicaoDiario() {
		return valeRefeicaoDiario;
	}

	public void setValeRefeicaoDiario(double valeRefeicaoDiario) {
		this.valeRefeicaoDiario = valeRefeicaoDiario;
	}

	public double getTaxaReajusteVR() {
		return taxaReajusteVR;
	}

	public void setTaxaReajusteVR(double taxaReajusteVR) {
		this.taxaReajusteVR = taxaReajusteVR;
	}
	

	public void setAumentoSalarial(double percentual) {
		System.out.println("-------------------------");
		System.out.println("Sal�rio atual: R$ " + this.getSalarioFuncionario());
		this.salarioFuncionario += this.getSalarioFuncionario() * (percentual / 100);
		System.out.println("Aumento sal�rial de " + percentual + " % realizado!");
		System.out.println("Novo sal�rio: R$ " + this.getSalarioFuncionario());
		System.out.println("-------------------------");
	}
	
	public void getInfo() {
		System.out.println("Informa��es Funcion�rio!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcion�rio: " + this.getNomeFuncionario());
		System.out.println("Sal�rio Funcion�rio: R$ " + this.getSalarioFuncionario());
		System.out.println("------------------------------------------------------");
	}
	
	public void setReajusteVR() {
		System.out.println("Reajuste de Vale Refei��o!");
		System.out.println("----------------------------------");
		System.out.println("Vale Refei��o atual: R$ " + this.getValeRefeicaoDiario());
		this.valeRefeicaoDiario += (this.getValeRefeicaoDiario() * taxaReajusteVR);
		System.out.println("Vale Refei��o ajustado: R$ " + this.getValeRefeicaoDiario());
		System.out.println("----------------------------------");
	}
	
}
