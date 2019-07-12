package br.com.testes;

import br.com.orientacao_objetos.Gerente;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente GerenteDistribuicao = new Gerente();
		GerenteDistribuicao.setNomeFuncionario("Deniswaldo Pernost");
		GerenteDistribuicao.setSalarioFuncionario(7493.50);

		Gerente GerenteRH = new Gerente();
		GerenteRH.setNomeFuncionario("Porteussom Ridoust");
		GerenteRH.setSalarioFuncionario(9430.32);

		GerenteDistribuicao.setAumentoPadrao();
		GerenteRH.setAumentoManual(20);

	}
}