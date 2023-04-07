package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

public class ExemploWhile {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        int iteracao = 0;

        while (iteracao < 1000) {
            iteracao += 1;
            System.out.println("Essa é a iteraçao de numero: " + iteracao);

        }
    }

    public void exemplo2() { // jogo de adivinhação
        // Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int numeroAleatorio = rd.nextInt(10);
        boolean tentarNovamente = true;
        System.out.println("Aperte a tecla CTRL+C, a qualquer momento para parar.");

        // Enquanto tentarNovamente for igual a true, itere novamente

        while (tentarNovamente) {
            System.out.print("Tente adivinhar o número: ");
            int numero = sc.nextInt();
            // Repare que a relação abaixo e a de diferença,
            // enquanto diferente, retorna true e, por isso,
            // tenta novamente.
            tentarNovamente = numeroAleatorio != numero;
            // if (tentarNovamente) {
            // System.out.println("Errado!");
            // }

            // System.out.println("Parabéns! Você adivinhou. Era o número "
            // + numeroAleatorio + " mesmo.");
            // System.out.println("Fim!");
            // System.out.println("============================");

            if (numero == numeroAleatorio) {
                System.out.println("Acertô Miseravi!!");
                tentarNovamente = false;
            } else {
                System.out.println("Errou!!! Tente novamente");
            }
        }

    }

    public void exemplo3() {
        // ler cinco numero inteiros e printar na ordem
        // criar um vetor com while

        int vetor[] = new int[5];
        int i = 0;
        while (i < 5) {
            System.out.println("Digite o valor para o vetor["+i+"]"); ;
            vetor[i] = sc.nextInt();
            i++;
        }
        i = 0;
        while (i < 5) {
            System.out.println("O valor do vetor["+i+"] é "+vetor[i]);
            i++;
        }

    }

}
