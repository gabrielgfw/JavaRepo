package orientacao_objetos;

public class TesteGerente {

	public static void main(String[] args) {

		Gerente GerenteDistribuicao = new Gerente();
		GerenteDistribuicao.nomeGerente = "Deniswaldo Pernost";
		GerenteDistribuicao.salarioGerente = 7493.50;
		
		Gerente GerenteRH = new Gerente();
		GerenteRH.nomeGerente = "Porteussom Ridoust";
		GerenteRH.salarioGerente = 9430.32;

		
		GerenteDistribuicao.setAumentoPadrao();
		GerenteRH.setAumentoManual(20);
		
	}

}
