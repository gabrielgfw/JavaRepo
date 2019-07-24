package br.com.orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario newFun01 = new Funcionario();
		newFun01.nomeFuncionario = "Rodrigo Rewerson";
		newFun01.salarioFuncionario = 4230.21;
		
		Funcionario newFun02 = new Funcionario();
		newFun02.nomeFuncionario = "Abigael Rores";
		newFun02.salarioFuncionario = 3423.23;
		
		System.out.println("Nome Funcionário: " + newFun01.nomeFuncionario);
		System.out.println("Salário Funcionário: R$ " + newFun01.salarioFuncionario);
		System.out.println("---------------------------");
		System.out.println("Nome Funcionário: " + newFun02.nomeFuncionario);
		System.out.println("Salário Funcionário: R$ " + newFun02.salarioFuncionario);
		
	}

}
