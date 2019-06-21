package orientacao_objetos;

public class Gerente {
	
	String nomeGerente;
	double salarioGerente;
	int qtdAumentos;
	
	
	public void setAumentoPadrao() {
		this.salarioGerente += this.salarioGerente * 0.1; // aumento de 10% //
		this.qtdAumentos++;
		System.out.println("================================================");
		System.out.println("Aumento salarial(10%) aplicado com sucesso!");
		System.out.println("------------------------------------------------");
		System.out.println("Nome do beneficiado: " + this.nomeGerente);
		System.out.println("Salário atualizado: R$ " + this.salarioGerente);
		System.out.println("================================================");
	}

	public void setAumentoManual(double percentualDeAumento) { 
		this.salarioGerente += this.salarioGerente * (percentualDeAumento / 100);
		this.qtdAumentos++;
		System.out.println("================================================");
		System.out.println("Aumento salarial("+ percentualDeAumento + "%) aplicado com sucesso!");
		System.out.println("------------------------------------------------");
		System.out.println("Nome do beneficiado: " + this.nomeGerente);
		System.out.println("Salário atualizado: R$ " + this.salarioGerente);
		System.out.println("================================================");
	}
	
}
