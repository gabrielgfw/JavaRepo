package br.com.functions;
import br.com.util.Teclado;

public class Metodos {


	private int contDeOperacao;
	private int numeroOperacao;
	private String nomeOperacao;
	private double valorOperacao;
	private String dataOperacao;
	public String resposta;
	private double subtotalEntrada;
	private double subtotalSaida;
	private Metodos array[] = new Metodos[999];
	
	// CONSTRUTOR //	
	public Metodos(int numeroOperacao,String nomeOperacao, double valorOperacao, String dataOperacao) {
		this.numeroOperacao = numeroOperacao;
		this.nomeOperacao = nomeOperacao;
		this.valorOperacao = valorOperacao;
		this.dataOperacao = dataOperacao;
		this.contDeOperacao += 1;
	}
	

	public String getnomeOperacao() {
		return nomeOperacao;
	}	
	public double getvalorOperacao() {
		return valorOperacao;
	}
	public String getdataOperacao() {
		return dataOperacao;
	}
	public double getsubtotalEntrada() {
		return subtotalEntrada;
	}
	public double getsubtotalSaida() {
		return subtotalSaida;
	}
	public int getnumeroOperacao() {
		return numeroOperacao;
	}
	public void setsubtotalEntrada(Double soma) {
		subtotalEntrada = this.getsubtotalEntrada() + soma;
	}
	public void setsubtotalSaida(Double soma) {
		subtotalSaida = this.getsubtotalSaida() + soma;
	}
	public void setnomeOperacao(String nomeOperacao) {
		this.nomeOperacao = nomeOperacao;
	}
	public void setvalorOperacao(double d) {
		this.valorOperacao = d;
	}
	public void setdataOperacao(String dataOperacao) {
		this.dataOperacao = dataOperacao;
	}
	public void setnumeroOperacao(int opNr) {
		numeroOperacao = contDeOperacao;
	}

	// INICIANDO INTERFACE //
	
	public void Inicio() {
		
	    resposta = Teclado.lerTexto(
	    		"==============================================" + "\n"
	    	  + "Bem-vindo ao Controle financeiro!" + "\n"
	    	  + "Digite algumas das opções abaixo:" + "\n"
	    	  + "Opções: [entrada], [saida], [saldo]" + "\n"
	    	  + "----------------------------------------------" + "\n"
	    	  + "Anote o número da operação" + "\n"
	    	  + "para consulta-las futuramente." + "\n"
	    	  + "==============================================");
	 		
		// FILTRO //
		if (!(resposta.equalsIgnoreCase("entrada") ||
			  resposta.equalsIgnoreCase("saida") ||
			  resposta.equalsIgnoreCase("saldo") ||
			  resposta.equalsIgnoreCase("consulta"))) {
			
			System.out.println("Opção inválida:" + "\n" + resposta);
			System.out.println("Digite novamente algumas das opções abaixo:");
			System.out.println("Opções: [entrada], [saida], [saldo]");
			System.out.println("----------------------------------------------");
			System.out.println("para futuras consultas.");
			System.out.println("==============================================");
			
			resposta = Teclado.lerTexto("");
		}	
		
		if(resposta.equalsIgnoreCase("entrada")) {			
			this.Entrada();			
		} else if(resposta.equalsIgnoreCase("saida")) {						
			this.Saida();			
		} else if(resposta.equalsIgnoreCase("saldo")){
			this.Saldo();
		} else {
			this.Consulta();
		}
		
	}
	
	private void Entrada () {
		
		array[contDeOperacao] = new Metodos(contDeOperacao,"", 0, "");
	    array[contDeOperacao].setnomeOperacao(Teclado.lerTexto(
	    		"~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " + "\n"
	    	  + "Digite o nome da entrada!" + "\n"
	    	  + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ "));
	    
	    array[contDeOperacao].setvalorOperacao(Teclado.lerDouble(
	    		"~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " + "\n" 
	    	  + "Digite o valor da sua entrada:" + "\n"
	    	  + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ "));
	    
	    while (array[contDeOperacao].getvalorOperacao() <= 0) {
	    	System.out.println("----------------------------------------------");
	    	System.out.println("Valor informado é inválido:");
	    	System.out.println(array[contDeOperacao].getvalorOperacao());
	    	
	    	array[contDeOperacao].setvalorOperacao(Teclado.lerDouble(
	    			"Digite novamente o valor da sua entrada:" + "\n"
	    		  + "----------------------------------------------"));
	    }
	    	
	    
	    array[contDeOperacao].setdataOperacao(Teclado.lerTexto(
	    		"~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " + "\n"
	    	  + "Diga a data de lançamento (dd/mm/aa)" + "\n"
	    	  + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ "));
	    
	    try {
		    this.setsubtotalEntrada(array[contDeOperacao].getvalorOperacao());
		    numeroOperacao++;
		} catch (Exception e) {
			System.out.println("Error: [" + e + "]");
		}
	    
	    System.out.println("==============================================");
	    System.out.println("Cadastro realizado!");
	    System.out.println("----------------------------------------------");
	    System.out.println("Número da operação:");
	    
		    if(this.getnumeroOperacao() < 99) {
		    	System.out.println("00" + array[contDeOperacao].getnumeroOperacao());		    
		    } else {
		    	System.out.println("0" + array[contDeOperacao].getnumeroOperacao());
		    }
	    System.out.println("Nome:     " + array[contDeOperacao].getnomeOperacao());
	    System.out.println("Valor:    R$ " + array[contDeOperacao].getvalorOperacao());
	    System.out.println("Data:     " + array[contDeOperacao].getdataOperacao());
	    System.out.println("==============================================");
	    
	    contDeOperacao++;
	    resposta = null;
		this.MenuRetorno();
			    
	}
	
	private void Saida () {
		
		
		
		array[contDeOperacao] = new Metodos(contDeOperacao, "", 0, "");
	    array[contDeOperacao].setnomeOperacao(Teclado.lerTexto(
	    		"~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " + "\n"
	    	  + "Diga o nome da saída sem espaços:" + "\n"
	    	  + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ "));
	    
	    array[contDeOperacao].setvalorOperacao(Teclado.lerDouble(
	    		"~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " + "\n"
	    	  + "Diga o valor da sua saída:" + "\n"
	    	  + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ "));
	    
		    while (array[contDeOperacao].getvalorOperacao() <= 0) {
		    	System.out.println("----------------------------------------------");
		    	System.out.println("Valor informado é inválido: ");
		    	System.out.println(array[contDeOperacao].getvalorOperacao());
		    	
		    	array[contDeOperacao].setvalorOperacao(Teclado.lerDouble(
		    			"Digite novamente o valor da sua entrada:" + "\n"
		    		  + "----------------------------------------------"));
		    }
    
	    array[contDeOperacao].setdataOperacao(Teclado.lerTexto(
	    		"~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ " + "\n"
	    	  + "Diga a data de lançamento (dd/mm/aa)" + "\n"
	    	  + "~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ "));
	    
	    try {
		    this.setsubtotalSaida(array[contDeOperacao].getvalorOperacao());
		    numeroOperacao++;
		} catch (Exception e) {
			System.out.println("Error: [" + e + "]");
		}
	
	    System.out.println("==============================================");
	    System.out.println("Cadastro realizado!");
	    System.out.println("----------------------------------------------");
	    System.out.println("Número da operação:");
	    
		    if(this.getnumeroOperacao() < 99) {
		    	System.out.println("00" + array[contDeOperacao].getnumeroOperacao());		    
		    } else {
		    	System.out.println("0" + array[contDeOperacao].getnumeroOperacao());
		    }
		    
		System.out.println("---------------------------------------------");
	    System.out.println("Nome:     " + array[contDeOperacao].getnomeOperacao());
	    System.out.println("Valor:    R$ " + array[contDeOperacao].getvalorOperacao());
	    System.out.println("Data:     " + array[contDeOperacao].getdataOperacao());
	    System.out.println("==============================================");

	    contDeOperacao++;
	    //contDeOperacaoSaidas++;
	    resposta = "";
	    this.MenuRetorno();

	}
	
	public void Saldo() {
		
	    System.out.println("==============================================");
		System.out.println("Entradas: R$ " + this.getsubtotalEntrada());
		System.out.println("Saídas:   R$ " + this.subtotalSaida + "\n" + "- - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Saldo:    R$ " + (this.getsubtotalEntrada() - this.getsubtotalSaida()));
	    System.out.println("==============================================");		
		this.MenuRetorno();
	}
	
	// em desenvolvimento

	public void Teste() {
		System.out.println(contDeOperacao);
	}
	
	public void Consulta() {
		
		int respostaInt;
		
		System.out.println("Você está na tela de consultas.");
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Estas foram as operações já realizadas: ");
		
		for (int i = 0; i <= contDeOperacao; i++) {
			System.out.println("NrOp: " + array[i].getnumeroOperacao());
			System.out.println("nomeOperacao: " + array[i].getnomeOperacao());
			System.out.println("=-------------------=");
		}
			
		System.out.println(contDeOperacao + " operações realizadas.");
		
		resposta = Teclado.lerTexto(
				"Digite alguma das opções abaixo:" + "\n"
			  + "[consulta] ou [sair]." + "\n"
			  + "==============================================");
		
			if (!(resposta.equalsIgnoreCase("sair")) || resposta.equalsIgnoreCase("consulta")) {
				System.out.println("Opção inválida:" + "\n"
								 + resposta);
				resposta = Teclado.lerTexto("Digite novamente alguma opção abaixo:" + "\n"
										  + "[consulta] ou [sair].");
				
			} else if (resposta.equalsIgnoreCase("sair")) {
				this.MenuRetorno();
				
			} else {
				respostaInt = Teclado.lerInt("Digite o número da Operação ou [0] para sair.");
				
				if (respostaInt == 0) {
					this.MenuRetorno();
					
					// + 1 nesse length porque o valorOperacao da operação é sempre: contDeOperacao(variável) + 1
				} else if ((respostaInt) > contDeOperacao) {
					System.out.println("valorOperacao inválido:" + "\n"
									 + respostaInt);
					
					respostaInt = Teclado.lerInt("Digite novamente o número da Operação ou [0] para sair");
					if (respostaInt == 0) {
						this.MenuRetorno();
		
					} else {
						System.out.println("==============================================");
						System.out.println("Nr.Op: " + array[respostaInt].getnumeroOperacao());
						System.out.println("nomeOperacao da Operação: " + array[respostaInt].getnomeOperacao());
						System.out.println("valorOperacao da Operação: R$ " + array[respostaInt].getvalorOperacao());
						System.out.println("dataOperacao da Operação: " + array[respostaInt].getdataOperacao());
						System.out.println("==============================================");
					}
					
				}
				
			}
			System.out.println("=-- - - - --="
							 + "Retornando ao menu!" + "\n"
							 + "=-- - - - --=");
			this.MenuRetorno(); 
	}
	
	private void MenuRetorno() {
				
		resposta = Teclado.lerTexto("Digite algumas das opções abaixo:" + "\n"
								  + "Opções: [entrada], [saida], [saldo]" + "\n"
								  + "==============================================");
		
		// FILTRO		
		if (!(resposta.equalsIgnoreCase("entrada") ||
			  resposta.equalsIgnoreCase("saida") ||
			  resposta.equalsIgnoreCase("saldo"))) {			
		    System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
		    System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");		    
			resposta = Teclado.lerTexto("Digite algumas das opções abaixo:" + "\n"
									  + "Opções: [entrada], [saida], [saldo]");
		}
	
		if(resposta.equalsIgnoreCase("entrada")) {			
			this.Entrada();			
		}
		
		if(resposta.equalsIgnoreCase("saida")) {						
			this.Saida();
		} else {
			this.Saldo();
		}
	}	
}