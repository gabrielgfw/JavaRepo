package br.com.polimorfismo;

import java.time.LocalDateTime;

public class ControlePonto {
	
	private LocalDateTime pontoEntrada;
	private LocalDateTime pontoSaida;
	
	
	public LocalDateTime getPontoEntrada() {
		return pontoEntrada;
	}
	public void setPontoEntrada(LocalDateTime pontoEntrada) {
		this.pontoEntrada = pontoEntrada;
	}
	public LocalDateTime getPontoSaida() {
		return pontoSaida;
	}
	public void setPontoSaida(LocalDateTime pontoSaida) {
		this.pontoSaida = pontoSaida;
	}
	
	public void registrarEntrada() {
		this.setPontoEntrada(LocalDateTime.now());
		System.out.println("Entrada registrada: " + this.getPontoEntrada());
	}
	
	public void registrarSaida() {
		this.setPontoSaida(LocalDateTime.now());
		System.out.println("Saída registrada: " + this.getPontoSaida());
	}
	
}