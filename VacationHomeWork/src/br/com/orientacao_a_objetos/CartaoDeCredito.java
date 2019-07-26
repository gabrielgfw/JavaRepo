package br.com.orientacao_a_objetos;

public class CartaoDeCredito {

	private int numeroCartao;
	private String dataValidade;
	private Cliente clienteCartao;
	

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
	public Cliente getClienteCartao() {
		return clienteCartao;
	}
	public void setClienteCartao(Cliente clienteCartao) {
		this.clienteCartao = clienteCartao;
	}
	
	public CartaoDeCredito (int nrCartao) {
		this.numeroCartao = nrCartao;
	}
}