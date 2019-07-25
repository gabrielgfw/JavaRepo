package br.com.orientacao_a_objetos;

public class Gerente {
	
	double salarioGerente;
	
	public void setAumentoPadrao() {
		System.out.println("Aumento Salarial padrão de 10%!");
		System.out.println("---------------------------------------------");
		System.out.println("Salário Atual: R$ " + this.salarioGerente);
		this.salarioGerente += this.salarioGerente * 0.1;
		System.out.println("Salário Reajustado: R$ " + this.salarioGerente);
		System.out.println("---------------------------------------------");
	}
	
	public void setAumentoVariavel(double percentual) {
		System.out.println("Aumento Salarial de " + percentual + " %.");
		System.out.println("---------------------------------------------");
		System.out.println("Salário Atual: R$ " + this.salarioGerente);
		this.salarioGerente += this.salarioGerente * (percentual/100);
		System.out.println("Salário Reajustado: R$ " + this.salarioGerente);
		System.out.println("---------------------------------------------");
	}

}
