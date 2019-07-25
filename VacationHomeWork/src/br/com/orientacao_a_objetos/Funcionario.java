package br.com.orientacao_a_objetos;

import br.com.util.Teclado;

public class Funcionario {

	String nomeFuncionario;
	double salarioFuncionario = 1000.00; // sal�rio inicial
	
	
	public void setAumentoSalarial(double percentual) {
		System.out.println("-------------------------");
		System.out.println("Sal�rio atual: R$ " + this.salarioFuncionario);
		this.salarioFuncionario += this.salarioFuncionario * (percentual / 100);
		System.out.println("Aumento sal�rial de " + percentual + " % realizado!");
		System.out.println("Novo sal�rio: R$ " + this.salarioFuncionario);
		System.out.println("-------------------------");
	}
	
	public void getInfo() {
		System.out.println("Informa��es Funcion�rio!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcion�rio: " + this.nomeFuncionario);
		System.out.println("Sal�rio Funcion�rio: R$ " + this.salarioFuncionario);
		System.out.println("------------------------------------------------------");
	}
	
	public void setNome() {
		this.nomeFuncionario = Teclado.lerTexto("Digite o nome do funcion�rio!");
		System.out.println("Nome alterado!");
		System.out.println(this.nomeFuncionario);
	}

	public void setSalario() {
		this.salarioFuncionario = Teclado.lerDouble("Digite o sal�rio do funcion�rio!");
		System.out.println("Sal�rio alterado!");
		System.out.println("R$ " + this.salarioFuncionario);
	}
	
}
