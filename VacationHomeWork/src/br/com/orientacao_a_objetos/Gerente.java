package br.com.orientacao_a_objetos;

public class Gerente extends Funcionario {
	
	private String senhaGerente;
	
	public void setPassword(String password) {
		this.senhaGerente = password;
	}
	
	public String getSenhaGerente() {
		return this.senhaGerente;
	}
	
	@Override
	public void setReajusteSalariaPadrao() {
		System.out.println("Reajuste salarial 20%!");
		System.out.println("-----------------------------------");
		System.out.println("Sal�rio atual: R$ " + this.getSalarioFuncionario());
		this.salarioFuncionario += (this.getSalarioFuncionario() * 0.2); // 10% reajuste
		System.out.println("Sal�rio reajustado: R$ " + this.getSalarioFuncionario());
		System.out.println(":D Uhulll!! aumento!!");
		System.out.println("-----------------------------------");
	}
	
	@Override
	public void getInfo() {
		System.out.println("Informa��es Funcion�rio!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcion�rio: " + this.getNomeFuncionario());
		System.out.println("Sal�rio Funcion�rio: R$ " + this.getSalarioFuncionario());
		System.out.println("Bonifica��o Salarial: " + "20%");
		System.out.println("Senha Gerente: (n�o fala pra ningu�m por favor!) " + this.getSenhaGerente());
		System.out.println("------------------------------------------------------");
	}

	public void setAumentoPadrao() {
		System.out.println("Aumento Salarial padr�o de 10%!");
		System.out.println("---------------------------------------------");
		System.out.println("Sal�rio Atual: R$ " + this.getSalarioFuncionario());
		this.salarioFuncionario += this.getSalarioFuncionario() * 0.1;
		System.out.println("Sal�rio Reajustado: R$ " + this.getSalarioFuncionario());
		System.out.println("---------------------------------------------");
	}
	
	public void setAumentoVariavel(double percentual) {
		System.out.println("Aumento Salarial de " + percentual + " %.");
		System.out.println("---------------------------------------------");
		System.out.println("Sal�rio Atual: R$ " + this.getSalarioFuncionario());
		this.salarioFuncionario += this.salarioFuncionario * (percentual/100);
		System.out.println("Sal�rio Reajustado: R$ " + this.getSalarioFuncionario());
		System.out.println("---------------------------------------------");
	}

}
