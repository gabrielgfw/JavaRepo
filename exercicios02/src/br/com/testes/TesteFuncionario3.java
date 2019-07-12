package br.com.testes;

import br.com.orientacao_objetos.Funcionario;
import br.com.orientacao_objetos.Gerente;
import br.com.orientacao_objetos.Secretaria;
import br.com.orientacao_objetos.Telefonista;

public class TesteFuncionario3 {

	public static void main(String[] args) {

		
		Gerente Fun01 = new Gerente();
		Fun01.setNomeFuncionario("Odonistom");
		Fun01.setSalarioFuncionario(9503.32);
		Fun01.setSenha(1564853);
		Fun01.setValeRefeicaoDiario(35.65);
		
		Secretaria Fun02 = new Secretaria();
		Fun02.setNomeFuncionario("Amandis");
		Fun02.setSalarioFuncionario(2500.25);
		Fun02.setRamalTelefone(9458);
		Fun02.setValeRefeicaoDiario(21.52);
		
		Telefonista Fun03 = new Telefonista();
		Fun03.setNomeFuncionario("Rosnete");
		Fun03.setCodigoEstacao(35);
		
	}

}
