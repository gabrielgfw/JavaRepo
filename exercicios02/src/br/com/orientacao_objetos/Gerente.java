package br.com.orientacao_objetos;

public class Gerente extends Funcionario{
	
	private int senha;
	private int qtdAumentos;
	
	
	public void setSenha(int pws) {
		this.senha = pws;
	}
	public int getQtdAumentos() {
		return qtdAumentos;
	}
	public void setQtdAumentos(int qtdAumentos) {
		this.qtdAumentos = qtdAumentos;
	}
	
	public void setAumentoPadrao() {
		super.setAumentoSalarial();
		this.salarioFuncionario += this.salarioFuncionario * 0.05;
		System.out.println("================================================");
		System.out.println("Aumento salarial("+ 10 + "%) aplicado com sucesso!");
		System.out.println("------------------------------------------------");
		System.out.println("Nome do beneficiado: " + this.nomeFuncionario);
		System.out.println("Salário atualizado: R$ " + this.salarioFuncionario);
		System.out.println("================================================");
	}

	public void setAumentoManual(double percentualDeAumento) { 
		this.salarioFuncionario += this.salarioFuncionario * (percentualDeAumento / 100);
		this.qtdAumentos++;
		System.out.println("================================================");
		System.out.println("Aumento salarial("+ percentualDeAumento + "%) aplicado com sucesso!");
		System.out.println("------------------------------------------------");
		System.out.println("Nome do beneficiado: " + this.nomeFuncionario);
		System.out.println("Salário atualizado: R$ " + this.salarioFuncionario);
		System.out.println("================================================");
	}
	
}
