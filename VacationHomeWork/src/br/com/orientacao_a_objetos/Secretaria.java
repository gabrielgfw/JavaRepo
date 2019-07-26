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
		System.out.println("Informa��es Funcion�rio!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcion�rio: " + this.getNomeFuncionario());
		System.out.println("Sal�rio Funcion�rio: R$ " + this.getSalarioFuncionario());
		System.out.println("Ramal: " + this.getRamalSecretaria());
		System.out.println("Bonifica��o Salarial: " + "10%");
		System.out.println("------------------------------------------------------");
	}
	
	
}
