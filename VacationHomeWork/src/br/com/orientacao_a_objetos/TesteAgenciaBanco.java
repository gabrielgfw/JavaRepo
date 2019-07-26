package br.com.orientacao_a_objetos;

public class TesteAgenciaBanco {

	public static void main(String[] args) {


		AgenciaBanco newAgencia01 = new AgenciaBanco(50);
		
		AgenciaBanco newAgencia02 = new AgenciaBanco(30);
		
		System.out.println("Numero da agência: " + newAgencia01.getNumeroAgencia());
		System.out.println("-------------------------------------------------");
		System.out.println("Numero da agência: " + newAgencia02.getNumeroAgencia());

	}

}
