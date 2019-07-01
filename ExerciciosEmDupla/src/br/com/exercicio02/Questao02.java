package br.com.exercicio02;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		
		
		String respostaAluno;
				
		respostaAluno = Teclado.lerTexto("Diga capital do Brasil!");
		
		if(respostaAluno.equalsIgnoreCase("Distrito Federal") || respostaAluno.equalsIgnoreCase("DF")) {
			System.out.println("Resposta correta!");
		} else {
			System.out.println(respostaAluno + " não é a capital do Brasil!");
		}
		
		
	}

}
