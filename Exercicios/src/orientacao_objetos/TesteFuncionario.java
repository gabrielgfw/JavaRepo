package orientacao_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario Funcionario01 = new Funcionario();
		Funcionario01.nomeFuncionario = "Kakaroto Maldito";
		Funcionario01.salarioFuncionario = 8001;
		
		Funcionario Funcionario02 = new Funcionario();
		Funcionario02.nomeFuncionario = "Vegeta Lokasso";
		Funcionario02.salarioFuncionario = 350;

		System.out.println("-----------------------------------------------");
		System.out.println("Nome Funcionario 01: " + Funcionario01.nomeFuncionario);
		System.out.println("Salario Funcionario 01: " + Funcionario01.salarioFuncionario);
		System.out.println("-----------------------------------------------");
		System.out.println("Nome Funcionario 02: " + Funcionario02.nomeFuncionario);
		System.out.println("Salario Funcionario 02: " + Funcionario02.salarioFuncionario);
		System.out.println("-----------------------------------------------");

		
		Funcionario01.setAumentoSalarial(1500);
		
		Funcionario02.setAumentoSalarial(319.33);
		
		Funcionario02.getInfoFuncionario();
	}
	
}
