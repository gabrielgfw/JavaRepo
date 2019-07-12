package br.com.testes;

import br.com.orientacao_objetos.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario Funcionario01 = new Funcionario();
		Funcionario01.setNomeFuncionario("Kakaroto Maldito");
		Funcionario01.setSalarioFuncionario(8001.52);
		Funcionario01.setValeRefeicaoDiario(20.42);
		
		Funcionario Funcionario02 = new Funcionario();
		Funcionario02.setNomeFuncionario("Vegeta Lokasso");
		Funcionario02.setSalarioFuncionario(350);
		Funcionario02.setValeRefeicaoDiario(35.05);

		System.out.println("-----------------------------------------------");
		System.out.println("Nome Funcionario 01: " + Funcionario01.getNomeFuncionario());
		System.out.println("Salario Funcionario 01: " + Funcionario01.getSalarioFuncionario());
		System.out.println("Vale Refeição Diário Funcionario 01:" + " R$ " + Funcionario01.getValeRefeicaoDiario());
		System.out.println("-----------------------------------------------");
		System.out.println("Nome Funcionario 02: " + Funcionario02.getNomeFuncionario());
		System.out.println("Salario Funcionario 02: " + Funcionario02.getSalarioFuncionario());
		System.out.println("Vale Refeição Diário Funcionario 02:" + " R$ " + Funcionario02.getValeRefeicaoDiario());
		System.out.println("-----------------------------------------------");
		
		Funcionario01.setAumentoSalarial(1500);
		Funcionario02.setAumentoSalarial(319.33);	
		Funcionario02.getInfoFuncionario();
		Funcionario02.setReajusteVR();
		
	}	
}