package Matriz;

import java.util.Random;
import java.util.Scanner;

import org.omg.PortableServer.POAPackage.WrongPolicyHelper;

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
        int posicaoLinha = 0;
        int posicaoColuna = 0;
        int maiorNumero = 0;
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rd.nextInt(100);
                if (matriz[i][j] > maiorNumero) {
                    maiorNumero = matriz[i][j];
                    posicaoLinha = i + 1;
                    posicaoColuna = j + 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("Maior Numero: " + maiorNumero);
        System.out.println("Este número esta na linha " + posicaoLinha + " e na coluna " + posicaoColuna);

    }

    public void exercicio3() {
        int matriz[][] = new int[5][5];
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rd.nextInt(50);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("Qual número você deseja localizar na matriz?");
        int numeroX = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (numeroX == matriz[i][j]) {
                    encontrado = true;
                    System.out.println("localização: " + (i + 1) + "x" + (j + 1));
                }
            }
        }
        if (encontrado == false) {
            System.out.println("Não encontrado");
        }

    }

    public void exercicio4() {

        int matriz[][] = new int[10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" | ");
                if (i < j) {
                    matriz[i][j] = (2 * i) + (7 * j);
                } else if (i == j) {
                    matriz[i][j] = (int) (Math.pow(1, 2) * 3) - 1;
                } else {
                    matriz[i][j] = (int) (Math.pow(i, 3) * 4) - (int) (Math.pow(j, 2) * 5) + 1;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("| ");
        }
    }

    public void exercicio5() {
        // criando matriz de 5linhas e 4 colunas
        int matriz[][] = new int[5][4];
        // criando matriz para armazenar a nota final de cada aluno
        int notaFinal[] = new int[5];

        // variavel para comparar as notas finais
        int maiorNota = 0;
        // variavel para armazenar a matricula com a maior nota final
        int matriculaMaiorNota = 0;

        // variavel para descobrir a media final 
        int mediaNotasFinais = 0;

        // Pedindo as informações de cada aluno para o usuario e calculando a nota final
        // de cada aluno e armazenando-as
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Digite as informações do aluno " + (i + 1));
            for (int j = 0; j < matriz[0].length; j++) {
                if (j == 0) {
                    System.out.print("Número de matricula: ");
                    matriz[i][j] = sc.nextInt();
                } else if (j == 1) {
                    System.out.print("Média das provas: ");
                    matriz[i][j] = sc.nextInt();
                    notaFinal[i] += matriz[i][j];
                } else if (j == 2) {
                    System.out.print("Média dos trabalhos: ");
                    matriz[i][j] = sc.nextInt();
                    notaFinal[i] += matriz[i][j];
                } else {
                    matriz[i][j] = notaFinal[i];
                }

                // descobre qual a matricula do auluno de maior nota
                if (notaFinal[i] > maiorNota) {
                    maiorNota = notaFinal[i];
                    matriculaMaiorNota = matriz[i][0];
                }
            }
            // soma todas as notas finais de cada aluno e acumula na variavel abaixo
            mediaNotasFinais+= notaFinal[i];
        }
        // imprimir a matricula do auluno de maior nota
        System.out.println("O aluno com a maior nota tem amatricula: " + matriculaMaiorNota);

        // calcula a media aritmetica das notas finais
        mediaNotasFinais/= matriz.length;
        
        // imprimir a media aritmetica das notas finais
        System.out.println("A média aritmética das notas finais é: "+mediaNotasFinais);
    }
}
