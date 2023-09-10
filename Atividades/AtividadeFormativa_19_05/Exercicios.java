package AtividadeFormativa_19_05;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void Exercicio1() {
        // criando variaveis
        int linhaUsuario;
        int colunaUsuario;
        // pedir quantidade de linhas para usuario
        System.out.println("Digite a quantidade de linhas");
        linhaUsuario = sc.nextInt();
        // pedir quantidade de colunas para usuario
        System.out.println("Digite a quantidade de colunas");
        colunaUsuario = sc.nextInt();
        int matrizUsuario[][] = new int[linhaUsuario][colunaUsuario];
        // criando matriz com valores aleatorios
        for (int i = 0; i < matrizUsuario.length; i++) {
            for (int j = 0; j < matrizUsuario[0].length; j++) {
                matrizUsuario[i][j] = rd.nextInt(10);
            }
        }

        // imprimir matriz para o usuario
        System.out.println("Matriz:");
        for (int i = 0; i < matrizUsuario.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrizUsuario[0].length; j++) {
                System.out.print(matrizUsuario[i][j] + "  ");
            }
            System.out.println("| ");
        }

        // substituindo os valores da matriz criada por
        // se i>j valor = 1
        // se i==j valor = 0
        // se j>i valor = 2
        System.out.println("Matriz atualizada com os valores:");
        for (int i = 0; i < matrizUsuario.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrizUsuario[0].length; j++) {
                if (i > j) {
                    matrizUsuario[i][j] = 1;
                } else if (i == j) {
                    matrizUsuario[i][j] = 0;
                } else {
                    matrizUsuario[i][j] = 2;
                }
                System.out.print(matrizUsuario[i][j] + "  ");
            }
            System.out.println("| ");
        }
    }

    public void Exercicio2() {
        // criando numero aleatorio
        int nAleatorio = (int) (Math.random() * 10) + 1;
        // criando contador
        int contador = 1;
        // valiavel booleana para saber se acertou numero ou não
        boolean tentarNovamente = true;

        // laço para realizar a repetição caso erre o numero
        while (tentarNovamente) {

            // pedindo palpite do usuario
            int nUsuario;
            System.out.println("Digite um número:");
            nUsuario = sc.nextInt();

            // verificando se o valor confere ou não
            tentarNovamente = nAleatorio != nUsuario;

            // retornando ao usuario se valor é maior ou menor
            if (nUsuario > nAleatorio) {
                System.out.println("Errrou. O número digitado é maior do que o número aleatorio");

            } else if (nUsuario < nAleatorio) {
                System.out.println("Errrou. O número digitado é menor do que o número aleatorio");

            } else {
                System.out.println("Parabens, você acertou e só precisou de " + (contador) + " tentativas");
            }
            contador++;
        }
    }

    public void Exercicio3() {
        // Crinando vetor de tamanho aleatorio entre 100 e 1000
        int aleatorio = rd.nextInt(100, 1000);
        int vetorA[] = new int[aleatorio];

        // Crinando vetor com números aleatorios de 1 a 100
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rd.nextInt(100) + 1;
        }

        // Exibindo os numeros pares do vetor
        System.out.println("Números pares do vetor:");
        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                System.out.print(vetorA[i] + ", ");
            }
        }

        // Para espaçar os número pares dos impares
        System.out.println("");
        System.out.println("");

        // Exibindo os numeros impares do vetor
        System.out.println("Números impares do vetor:");
        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 != 0) {
                System.out.print(vetorA[i] + ", ");
            }
        }

        // criando contadores para os numeros pares e impares
        int contPares = 0;
        int contImpares = 0;

        // contando os numeros pares nas posições impares do vetor
        for (int i = 0; i < vetorA.length; i += 2) {
            if (vetorA[i] % 2 == 0) {
                contPares++;
            }
        }

        // contando os numeros impares nas posições pares do vetor
        for (int i = 1; i < vetorA.length; i += 2) {
            if (vetorA[i] % 2 != 0) {
                contImpares++;
            }
        }
        // Para espaçar
        System.out.println("");
        System.out.println("");

        System.out.println("Existem " + contPares + " números PARES em posições IMPARES do vetor.");
        System.out.println("Existem " + contImpares + " números IMPARES em posições PARES do vetor.");
    }
}
