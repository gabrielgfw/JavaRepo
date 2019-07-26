package br.com.polimorfismo;

public class Funcionario extends ControlePonto{
	
	private String nomeFuncionario;
	private double salarioFuncionario;
	
	
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
	
}
