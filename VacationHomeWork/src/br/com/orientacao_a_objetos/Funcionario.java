package br.com.orientacao_a_objetos;

public class Funcionario {

	String nomeFuncionario;
	double salarioFuncionario;
	
	
	public void setAumentoSalarial(double percentual) {
		System.out.println("-------------------------");
		System.out.println("Salário atual: R$ " + this.salarioFuncionario);
		this.salarioFuncionario += this.salarioFuncionario * (percentual / 100);
		System.out.println("Aumento salárial de " + percentual + " % realizado!");
		System.out.println("Novo salário: R$ " + this.salarioFuncionario);
		System.out.println("-------------------------");
	}
	
	public void getInfo() {
		System.out.println("Informações Funcionário!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcionário: " + this.nomeFuncionario);
		System.out.println("Salário Funcionário: R$ " + this.salarioFuncionario);
		System.out.println("------------------------------------------------------");
	}
	
}
