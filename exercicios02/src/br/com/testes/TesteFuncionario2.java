package br.com.testes;

import br.com.orientacao_objetos.Funcionario;
import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		
		Funcionario NovoFuncionario01 = new Funcionario();		
		Funcionario NovoFuncionario02 = new Funcionario();
		
		NovoFuncionario01.setNomeFuncionario(Teclado.lerTexto("Digite o nome do funcionario:"));	
		NovoFuncionario01.setSalarioFuncionario(Teclado.lerDouble("Digite o sal�rio do funcionario:"));				
		NovoFuncionario01.getInfoFuncionario();
		
		System.out.println("// infos por getters {");
		System.out.println("Nome Funcion�rio: " + NovoFuncionario01.getNomeFuncionario());
		System.out.println("Sal�rio funcionario: R$ " + NovoFuncionario01.getSalarioFuncionario());
		System.out.println("}");
	}
}
