package br.com.orientacao_a_objetos;

public class Funcionario {

	private String nomeFuncionario;
	protected double salarioFuncionario = 1000.00; // salário inicial
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
		System.out.println("Salário atual: R$ " + this.getSalarioFuncionario());
		this.salarioFuncionario += this.getSalarioFuncionario() * (percentual / 100);
		System.out.println("Aumento salárial de " + percentual + " % realizado!");
		System.out.println("Novo salário: R$ " + this.getSalarioFuncionario());
		System.out.println("-------------------------");
	}
	
	public void getInfo() {
		System.out.println("Informações Funcionário!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcionário: " + this.getNomeFuncionario());
		System.out.println("Salário Funcionário: R$ " + this.getSalarioFuncionario());
		System.out.println("------------------------------------------------------");
	}
	
	public void setReajusteVR() {
		System.out.println("Reajuste de Vale Refeição!");
		System.out.println("----------------------------------");
		System.out.println("Vale Refeição atual: R$ " + this.getValeRefeicaoDiario());
		this.valeRefeicaoDiario += (this.getValeRefeicaoDiario() * taxaReajusteVR);
		System.out.println("Vale Refeição ajustado: R$ " + this.getValeRefeicaoDiario());
		System.out.println("----------------------------------");
	}
	
}
