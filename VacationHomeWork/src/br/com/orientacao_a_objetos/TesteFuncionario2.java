package br.com.orientacao_a_objetos;

import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {

		Funcionario newFun01 = new Funcionario();
		newFun01.nomeFuncionario = Teclado.lerTexto("Digite o nome do funcionário!");
		
		Funcionario newFun02 = new Funcionario();
		newFun02.setNome();
		newFun02.setSalario();
		
		
	}

}
