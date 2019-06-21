package orientacao_objetos;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente NovoCliente01 = new Cliente();
		NovoCliente01.codigoCliente = 01;
		NovoCliente01.nomeCliente = "Robeswaldir";
		
		Cliente NovoCliente02 = new Cliente();
		NovoCliente02.codigoCliente = 02;
		NovoCliente02.nomeCliente = "Renaltis";

		System.out.println("------------------------------------------------------");	
		System.out.println("Codigo Cliente 01: " + NovoCliente01.codigoCliente);
		System.out.println("Nome Cliente 01:   " + NovoCliente01.nomeCliente);		
		System.out.println("------------------------------------------------------");		
		System.out.println("Codigo Cliente 02: " + NovoCliente02.codigoCliente);
		System.out.println("Nome Cliente 02:   " + NovoCliente02.nomeCliente);		
		System.out.println("------------------------------------------------------");
	}

}
