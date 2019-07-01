package br.com.exercicio;

import br.com.util.Teclado;

public class Questao03 {

    public static void main(String[] args) {
       

        int numb, numb2 = 0, soma = 0;

        numb = Teclado.lerInt("Digite um número");

        for (int i = 0; i < numb; i++) {
            numb2++;
            soma += numb2;
        }
        
        System.out.println("Soma:" + soma);
    }

}