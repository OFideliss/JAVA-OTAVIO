package IteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in); // incluir biblioteca scanner

    public void exemplo1() {

        for (int i = 0; i < 10; i++) {
            System.out.println(" o número da iteração é " + i);
        }
    }

    public void exemplo2() {

        int vetor[] = new int[10]; // Array do tipo inteiro de 10 posições
        // preencher o vetor com for
        for (int i = 0; i < vetor.length; i++) { // "fori"
            System.out.print("vetor[" + i + "]="); // println = pula linha // print = não pula a linha
            vetor[i] = sc.nextInt();
        }
        // imprimir o vetor na ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetor[i]);
        }
    }

    public void exemplo3() {
        // Carrinho de Compra
        double carrinhoCompra[] = new double[] { 19.90, 35.70, 56.80, 97.50 };
        // Finalizar a compra
        double valorFinal = 0;
        for (int i = 0; i < carrinhoCompra.length; i++) {
            valorFinal += carrinhoCompra[i];
            // Imprimir valor parcial da compra
            System.out.println("Valor parcial da compra R$" + valorFinal);
        }
        // Mostrar o valor final da compra
        System.out.println("O valor da compra é R$" + valorFinal);
    }

    public void exemplo4() {
        // ler 4 notas, mostrar as 4 notas e a media
        double vetorNotas[] = new double[4];
        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do Aluno:");
            vetorNotas[i] = sc.nextDouble();
        }
        // imprimir as 4 notas e imprimir a média
        double mediaNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            mediaNotas += vetorNotas[i];
            System.out.println("A " + (i + 1) + "º nota é:" + vetorNotas[i]);
        }
        mediaNotas /= vetorNotas.length;
        System.out.println("A média do aluno foi de: " + mediaNotas);
    }

    public void exemplo5() {
        // Exercicio 6.
        // ler 4 notas de 10 alunos
        // vetor para guardar as médias
        double vetorMedia[] = new double[3];
        // preencher o vetor de médias
        for (int i = 0; i < vetorMedia.length; i++) {
            double notas = 0;
            for (int j = 0; j < 4; j++) {
                System.out.println("Nota " + (j + 1) + "Aluno " + (i + 1) + ":");
                notas += sc.nextDouble();
            }
            notas /= 4; // calcula média
            vetorMedia[i] = notas; // coloca a média no vetor
        }
        // imprimir notas >= 7 do vetor médias
        for (int i = 0; i < vetorMedia.length; i++) {
            if (vetorMedia[i] >= 7) {
                System.out.println("A média do aluno " + (i + 1) + " é " + vetorMedia[i]);
            }
        }
    }

    public void exemplo6() {
        // ler um vetor com 5 números inteiros e mostrar a soma, multiplicação e os
        // numeros
        int vetorNumeros[] = new int[5];
        int soma = 0;
        int multi = 1;
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Digite o valor " + (i + 1) + " : ");
            vetorNumeros[i] = sc.nextInt();
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            soma += vetorNumeros[i];
        }
        System.out.println("A Soma dos números digitados é: " + soma);

        for (int i = 0; i < vetorNumeros.length; i++) {
            multi *= vetorNumeros[i];
        }
        System.out.println("A Multiplicação dos números digitados é: " + multi);

        System.out.println("Os números digitados são os seguintes:");

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println(vetorNumeros[i]);
        }
    }

    public void exemplo7() {
        // pedir altura e idade de 5 pessoas e imprimir em ordem inversa
        int vetorIdade[] = new int[5];
        double vetorAltura[] = new double[5];

        for (int i = 0; i < vetorIdade.length; i++) {
            System.out.println("Digite a idade da pessoa " + (i + 1));
            vetorIdade[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorAltura.length; i++) {
            System.out.println("Digite a altura da pessoa " + (i + 1));
            vetorAltura[i] = sc.nextDouble();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println("A idade da pessoa " + (i + 1) + " é " + vetorIdade[i]);
            System.out.println("A altura da pessoa " + (i + 1) + " é " + vetorAltura[i]);
        }

    }

    public void exemplo8() {
        // ler um vetor 10 numeros inteiros, calcular a soma dos quadradados dos
        // elementos do vetor.
        int vetorInt[] = new int[10];
        int vetorQuadrado[] = new int[10];
        int soma = 0;
        for (int i = 0; i < vetorInt.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° numero inteiro:");
            vetorInt[i] = sc.nextInt();
        }
        for (int i = 0; i < vetorQuadrado.length; i++) {
            vetorQuadrado[i] = vetorInt[i] * vetorInt[i];
            soma += vetorQuadrado[i];
        }

        System.out.println("O resultado da soma dos quadrados dos numeros digitados é: " + soma);
    }

    public void exemplo9() {

    }

}
