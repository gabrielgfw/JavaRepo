package br.com.classes_abstratas;

abstract public class FuncionarioBanco {

	private String nomeFuncionario;
	private double salarioFuncionario;
	private double valeRefeicaoDiario;
	
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
	
	abstract public void getBonificacao();
}