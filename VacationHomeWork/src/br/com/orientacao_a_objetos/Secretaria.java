package br.com.orientacao_a_objetos;

public class Secretaria extends Funcionario{

	private int ramalSecretaria;

	
	public int getRamalSecretaria() {
		return ramalSecretaria;
	}
	public void setRamalSecretaria(int ramalSecretaria) {
		this.ramalSecretaria = ramalSecretaria;
	}
	
	@Override
	public void getInfo() {
		System.out.println("Informações Funcionário!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcionário: " + this.getNomeFuncionario());
		System.out.println("Salário Funcionário: R$ " + this.getSalarioFuncionario());
		System.out.println("Ramal: " + this.getRamalSecretaria());
		System.out.println("Bonificação Salarial: " + "10%");
		System.out.println("------------------------------------------------------");
	}
	
	
}
