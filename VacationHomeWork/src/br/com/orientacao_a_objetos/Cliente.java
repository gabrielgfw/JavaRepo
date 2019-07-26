package br.com.orientacao_a_objetos;

public class Cliente {
	
	private String nomeCliente;
	private int codigoCliente;
	
	public Cliente(int codigocliente) {
		this.codigoCliente = codigocliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
}
