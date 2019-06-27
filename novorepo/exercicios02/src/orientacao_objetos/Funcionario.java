package orientacao_objetos;

public class Funcionario {

	String nomeFuncionario;
	double salarioFuncionario;
	int aumentosRecebidos;
	
	
	public void setAumentoSalarial(double valorAumento) {
		this.salarioFuncionario += valorAumento;
		this.aumentosRecebidos++;
		System.out.println("================================================");
		System.out.println("Aumento Salarial concluído com sucesso!");
		System.out.println("------------------------------------------------");
		System.out.println("Funcionário: " + this.nomeFuncionario);
		System.out.println("Aumento: R$ " + valorAumento);
		System.out.println("Salário atualizado: R$ " + this.salarioFuncionario);
		System.out.println("================================================");		
	}
	
	public void getInfoFuncionario() {
		System.out.println("================================================");
		System.out.println("Consulta de Funcionário");
		System.out.println("------------------------------------------------");
		System.out.println("Nome Funcionário: " + this.nomeFuncionario);
		System.out.println("Salário Funcionário: R$ " + this.salarioFuncionario);
		System.out.println("Já recebeu " + this.aumentosRecebidos + " aumento(s).");
		System.out.println("================================================");	
	}
	
}
