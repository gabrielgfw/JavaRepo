package orientacao_objetos;

public class TesteAgenciaBanco {

	public static void main(String[] args) {
		
		AgenciaBanco NovaAgencia01 = new AgenciaBanco();
		NovaAgencia01.numeroAgencia = 1001;
		
		AgenciaBanco NovaAgencia02 = new AgenciaBanco();
		NovaAgencia02.numeroAgencia = 1002;
		
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Agencia 01: " + NovaAgencia01.numeroAgencia);
		System.out.println("-----------------------------------------------");
		System.out.println("Nr. Agencia 02: " + NovaAgencia02.numeroAgencia);
		System.out.println("-----------------------------------------------");
		
		

	}

}
