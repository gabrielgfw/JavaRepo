package br.com.polimorfismo;

public class FuncionarioBanco extends ControlePonto{
	
	private String nomeFB;
	private double salarioFB;
	private double valeRefeicaoFB;
	
	public String getNomeFB() {
		return nomeFB;
	}
	public void setNomeFB(String nomeFB) {
		this.nomeFB = nomeFB;
	}
	public double getSalarioFB() {
		return salarioFB;
	}
	public void setSalarioFB(double salarioFB) {
		this.salarioFB = salarioFB;
	}
	public double getValeRefeicaoFB() {
		return valeRefeicaoFB;
	}
	public void setValeRefeicaoFB(double valeRefeicaoFB) {
		this.valeRefeicaoFB = valeRefeicaoFB;
	}

}