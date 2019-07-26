package br.com.classes_abstratas;

public class Gerente extends FuncionarioBanco{

	private double salarioFuncionario;
	
	@Override
	public void getBonificacao() {
		salarioFuncionario = this.getSalarioFuncionario();
		System.out.println("Bonificação de 10%!");
		System.out.println("-----------------------");
		System.out.println("Salário atual: R$ " + this.getSalarioFuncionario());
		salarioFuncionario += salarioFuncionario * 0.1;
		this.setSalarioFuncionario(salarioFuncionario);
		System.out.println("Salario reajustado: R$ " + this.getSalarioFuncionario());
		System.out.println("-----------------------");
	}

}
