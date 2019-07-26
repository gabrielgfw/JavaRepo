package br.com.orientacao_a_objetos;

public class Telefonista extends Funcionario{

	private int codigoEstacao;

	
	public int getCodigoEstacao() {
		return codigoEstacao;
	}
	public void setCodigoEstacao(int codigoEstacao) {
		this.codigoEstacao = codigoEstacao;
	}
	
	@Override
	public void getInfo() {
		System.out.println("Informa��es Funcion�rio!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcion�rio: " + this.getNomeFuncionario());
		System.out.println("Sal�rio Funcion�rio: R$ " + this.getSalarioFuncionario());
		System.out.println("C�digo Esta��o: " + this.getCodigoEstacao());
		System.out.println("Bonifica��o Salarial: " + "10%");
		System.out.println("------------------------------------------------------");
	}
	
}
