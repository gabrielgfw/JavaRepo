package br.com.orientacao_objetos;

public class CartaoDeCredito {

	private int numeroCartao;
	private String dataValidade;
	private int codigoCliente;
		
	public CartaoDeCredito(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
		
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	
}
