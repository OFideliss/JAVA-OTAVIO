package Matriz;

import java.util.Random;
import java.util.Scanner;

public class MatrizExemplo {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exemplo1() {
        // gerar, preencher, imprimir e manipular matrizes
        // criar uma matriz 10x9
        int matriz[][] = new int[10][9]; // bidimensional 10x9
        // preencher minha matriz
        for (int i = 0; i < matriz.length; i++) { // primeria dimensão //linha
            for (int j = 0; j < matriz[0].length; j++) {// segunda dimensão // coluna
                matriz[i][j] = rd.nextInt(10); // escolhe numero aleatorio de 0 a 9

            }
        }
        // imprimir elemento por elemento da minha matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println("matriz[" + i + "][" + j + "]=" + matriz[i][j]);
            }
        }
        // imprimir a matriz em formato linha x coluna
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        // somar todos os elementos da 4° linha
        int somaLinha = 0;
        for (int i = 0; i < matriz[0].length; i++) {
            somaLinha += matriz[3][i];
        }
        System.out.println("A soma dos elementos da 4° linha é: " + somaLinha);

        // somar todos os elementos da 4° coluna
        int somaColuna = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaColuna += matriz[i][3];
        }
        System.out.println("A soma dos elementos da 4° coluna é: " + somaColuna);
    }

    public void exercicio1() {
        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }

    }

    public void exercicio2() {
        int matriz[][] = new int[4][4];
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("Matriz Tranposta:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = i;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }

        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal principal é: "+soma);
    }

}
