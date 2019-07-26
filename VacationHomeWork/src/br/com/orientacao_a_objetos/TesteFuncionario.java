package br.com.orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario newFun01 = new Funcionario();
		newFun01.setNomeFuncionario("Rodrigo Rewerson");
		newFun01.setSalarioFuncionario(4230.21);
		newFun01.setValeRefeicaoDiario(23.21);
		
		Funcionario newFun02 = new Funcionario();
		newFun02.setNomeFuncionario("Abigael Rores");
		newFun02.setSalarioFuncionario(3423.23);
		newFun02.setValeRefeicaoDiario(32.74);
		
		newFun01.getInfo();
		
		newFun02.setAumentoSalarial(20);
		newFun02.getInfo();
		
		newFun01.setReajusteVR();;
		
	}

}
