package br.com.orientacao_a_objetos;

public class TesteAgenciaBanco {

	public static void main(String[] args) {


		AgenciaBanco newAgencia01 = new AgenciaBanco();
		newAgencia01.numeroAgencia = 50;
		
		AgenciaBanco newAgencia02 = new AgenciaBanco();
		newAgencia02.numeroAgencia = 30;
		
		System.out.println("Numero da ag�ncia: " + newAgencia01.numeroAgencia);
		System.out.println("-------------------------------------------------");
		System.out.println("Numero da ag�ncia: " + newAgencia02.numeroAgencia);

	}

}
