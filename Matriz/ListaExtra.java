package Matriz;

import java.util.Random;
import java.util.Scanner;

public class ListaExtra {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1() {
        int matriz[][] = new int[4][4];
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = i * j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }
    }

    public void exercicio2() {
        int matriz[][] = new int[4][4];
        int posicaoLinha=0;
        int posicaoColuna=0;
        int maiorNumero=0;
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(100);
                if (matriz[i][j]>maiorNumero) {
                    maiorNumero = matriz[i][j];
                    posicaoLinha = i+1;
                    posicaoColuna= j+1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("Maior Numero: "+maiorNumero);
        System.out.println("Este número esta na linha "+posicaoLinha+" e na coluna "+posicaoColuna);

    }

    public void exercicio3() {
        int matriz[][] = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]= rd.nextInt(5);
            }
        }
        System.out.println("Qual número você deseja localizar na matriz?");
        int numeroX= sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(numeroX==matriz[i][j]) {
                    System.out.println("O número que você digitou esta na posição");
                }
            }
        }
    }
}
