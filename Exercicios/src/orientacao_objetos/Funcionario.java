package orientacao_objetos;

public class Funcionario {

	String nomeFuncionario;
	double salarioFuncionario;
	int aumentosRecebidos;
	
	
	public void setAumentoSalarial(double valorAumento) {
		this.salarioFuncionario += valorAumento;
		this.aumentosRecebidos++;
		System.out.println("================================================");
		System.out.println("Aumento Salarial conclu�do com sucesso!");
		System.out.println("------------------------------------------------");
		System.out.println("Funcion�rio: " + this.nomeFuncionario);
		System.out.println("Aumento: R$ " + valorAumento);
		System.out.println("Sal�rio atualizado: R$ " + this.salarioFuncionario);
		System.out.println("================================================");		
	}
	
	public void getInfoFuncionario() {
		System.out.println("================================================");
		System.out.println("Consulta de Funcion�rio");
		System.out.println("------------------------------------------------");
		System.out.println("Nome Funcion�rio: " + this.nomeFuncionario);
		System.out.println("Sal�rio Funcion�rio: R$ " + this.salarioFuncionario);
		System.out.println("J� recebeu " + this.aumentosRecebidos + " aumento(s).");
		System.out.println("================================================");	
	}
	
}
