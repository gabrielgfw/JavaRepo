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
		System.out.println("Informações Funcionário!");
		System.out.println("------------------------------------------------------");
		System.out.println("Nome Funcionário: " + this.getNomeFuncionario());
		System.out.println("Salário Funcionário: R$ " + this.getSalarioFuncionario());
		System.out.println("Código Estação: " + this.getCodigoEstacao());
		System.out.println("Bonificação Salarial: " + "10%");
		System.out.println("------------------------------------------------------");
	}
	
}
