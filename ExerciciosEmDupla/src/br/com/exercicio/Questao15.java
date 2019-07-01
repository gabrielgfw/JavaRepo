package br.com.exercicio;

import br.com.util.Teclado;

public class Questao15 {

	public static void main(String[] args) {


		String[] nomePessoa = new String[10];
		double[] salarioPessoa = new double[10];
		double aliquota01 = 0.1;
		double aliquota02 = 0.15;
		
		for(int i = 0; i < 3; i++) {
			nomePessoa[i] = Teclado.lerTexto("Digite o nome da " + (i+1) + " ª" + " pessoa!");
			salarioPessoa[i] = Teclado.lerDouble("Digite o salário da " + (i+1) + " ª" + " pessoa!");			
		}

		for(int i = 0; i < 3; i++) {
			double valorDaAliquota;	
			double salarioFinal;
			
			if(salarioPessoa[i] < 600) {
				System.out.println("Nome da " + (i+1) + " ª " + "pessoa: " + nomePessoa[i]);
				System.out.println("Salário da" + (i+1) + " ª " + "pessoa: " + "R$ " + salarioPessoa[i]);
				System.out.println("Não possuí imposto de renda, salário menor que R$ 600,00!");;
				System.out.println("--------------------------------------------------------");
				
			} else if (salarioPessoa[i] < 1500) {
				System.out.println("Nome da " + (i+1) + " ª " + "pessoa: " + nomePessoa[i]);
				System.out.println("Salário da" + (i+1) + " ª " + "pessoa: " + "R$ " + salarioPessoa[i]);
				valorDaAliquota = salarioPessoa[i] * aliquota01;
				System.out.println("Valor da alíquota do imposto de renda: R$ " + valorDaAliquota);
				salarioFinal = salarioPessoa[i] - valorDaAliquota;
				System.out.println("Salário com desconto: R$ " + salarioFinal);
				System.out.println("--------------------------------------------------------");
			} else {
				System.out.println("Nome da " + (i+1) + " ª " + "pessoa: " + nomePessoa[i]);
				System.out.println("Salário da" + (i+1) + " ª " + "pessoa: " + "R$ " + salarioPessoa[i]);
				valorDaAliquota = salarioPessoa[i] * aliquota02;
				System.out.println("Valor da alíquota do imposto de renda: R$ " + valorDaAliquota);
				salarioFinal = salarioPessoa[i] - valorDaAliquota;
				System.out.println("Salário com desconto: R$ " + salarioFinal);
				System.out.println("--------------------------------------------------------");
			}
		}
	}

}
