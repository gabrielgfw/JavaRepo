package br.com.polimorfismo;

public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente gen01 = new Gerente();
		gen01.setNomeFuncionario("Robeswaldo");
		gen01.setSalarioFuncionario(4231.53);
		
		Telefonista ten01 = new Telefonista();
		ten01.setNomeFuncionario("Mariana");
		ten01.setSalarioFuncionario(2150.32);
	
		gen01.registrarEntrada();
		ten01.registrarEntrada();	
		ten01.registrarSaida();
		gen01.registrarSaida();
	}
}