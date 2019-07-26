package br.com.orientacao_a_objetos;

public class Gerente extends Funcionario {
	
	private String senhaGerente;
	
	public void setPassword(String password) {
		this.senhaGerente = password;
	}

	public void setAumentoPadrao() {
		System.out.println("Aumento Salarial padrão de 10%!");
		System.out.println("---------------------------------------------");
		System.out.println("Salário Atual: R$ " + this.getSalarioFuncionario());
		this.salarioFuncionario += this.getSalarioFuncionario() * 0.1;
		System.out.println("Salário Reajustado: R$ " + this.getSalarioFuncionario());
		System.out.println("---------------------------------------------");
	}
	
	public void setAumentoVariavel(double percentual) {
		System.out.println("Aumento Salarial de " + percentual + " %.");
		System.out.println("---------------------------------------------");
		System.out.println("Salário Atual: R$ " + this.getSalarioFuncionario());
		this.salarioFuncionario += this.salarioFuncionario * (percentual/100);
		System.out.println("Salário Reajustado: R$ " + this.getSalarioFuncionario());
		System.out.println("---------------------------------------------");
	}

}
