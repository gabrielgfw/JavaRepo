package br.com.exercicio;

import br.com.util.Teclado;

public class Questao10 {

    public static void main(String[] args) {

        int fatorial = 1, numb = 0;

        numb = Teclado.lerInt("Digite um número: ");
        for (int i = 1; i <= numb; i++) {

            fatorial *= i;

            System.out.println(i + "!" + fatorial);
        }

    }
}