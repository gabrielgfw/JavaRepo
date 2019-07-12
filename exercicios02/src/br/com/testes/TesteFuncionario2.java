package br.com.testes;

import br.com.orientacao_objetos.Funcionario;
import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		
		Funcionario NovoFuncionario01 = new Funcionario();		
		Funcionario NovoFuncionario02 = new Funcionario();
		
		NovoFuncionario01.setNomeFuncionario(Teclado.lerTexto("Digite o nome do funcionario:"));	
		NovoFuncionario01.setSalarioFuncionario(Teclado.lerDouble("Digite o salário do funcionario:"));				
		NovoFuncionario01.getInfoFuncionario();
		
		System.out.println("// infos por getters {");
		System.out.println("Nome Funcionário: " + NovoFuncionario01.getNomeFuncionario());
		System.out.println("Salário funcionario: R$ " + NovoFuncionario01.getSalarioFuncionario());
		System.out.println("}");
	}
}
