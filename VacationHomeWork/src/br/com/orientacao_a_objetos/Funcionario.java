package br.com.orientacao_a_objetos;

import br.com.util.Teclado;

public class Funcionario {

	String nomeFuncionario;
	double salarioFuncionario = 1000.00; // salário inicial
	
	
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
	
	public void setNome() {
		this.nomeFuncionario = Teclado.lerTexto("Digite o nome do funcionário!");
		System.out.println("Nome alterado!");
		System.out.println(this.nomeFuncionario);
	}

	public void setSalario() {
		this.salarioFuncionario = Teclado.lerDouble("Digite o salário do funcionário!");
		System.out.println("Salário alterado!");
		System.out.println("R$ " + this.salarioFuncionario);
	}
	
}
