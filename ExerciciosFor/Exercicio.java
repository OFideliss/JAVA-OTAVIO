package ExerciciosFor;

import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in); // incluir biblioteca scanner
    // exercicio 1 - criar um vetor de 5 n° e imprimir

    public void exercicio1() {
        // criar um vetor de 5 posições
        int vetor[] = new int[5];
        // preencher o vetor "for"
        for (int i = 0; i < vetor.length; i++) {
            // solicitar para o usuario escrever o n°
            System.out.print("Informe o valor do vetor de posição [" + i + "]");
            // ler o valor digitado e atribuir a posição do vetor
            vetor[i] = sc.nextInt();
        }
        // imprimir o vetor "for"
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor[" + i + "]=" + vetor[i]);
        }
    }

    // exercicio 2 - vetor decimal de 10 posições e imprimir na ordem inversa
    public void exercicio2() {
        // vetor de 10 posições
        double vetor[] = new double[10];
        // preencher o vetor "for"
        for (int i = 0; i < vetor.length; i++) {
            // solicitar para o usuario escrever o n°
            System.out.print("Informe o valor do vetor de posição [" + i + "]");
            // ler o valor digitado e atribuir a posição do vetor
            vetor[i] = sc.nextDouble();
        }
        // imprimir o vetor na ordem inversa
        for (int i = 9; i >= 0; i--) { // do 9 para o 0
            System.out.println("Vetor[" + i + "]=" + vetor[i]);
        }
    }

    // exercicio 3 - ler 4 notas e calcular a media
    public void exercicio3() {
        // criar vetor para receber as notas
        double notas[] = new double[4]; // vetor de tamanho 4
        /// preencher o vetor com as notas
        for (int i = 0; i < notas.length; i++) {
            // solicitar as notas para o usuario
            System.out.println("Informe a nota " + (i + 1) + " do aluno");
            // ler a nota
            notas[i] = sc.nextDouble();
        }
        // imprimir as notas e calcular a media
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota[" + (i + 1) + "]=" + notas[i]);
            // acumular o valor das notas na variavel media
            media += notas[i];
        }
        // dividir a media pelo numero de notas
        media /= notas.length;
        // imprimir a media
        System.out.println("A média é " + media);
    }

    // exercicio 4 - ler um vetor de caracteres e contar as consoantes
    public void exercicio4() {
        // char letras[] = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',//
        // 'j'};
        String letras2[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        // percorrer o vetor para procurar letras vogais ou consoantes
        // contar o numero de consoantes
        int cont = 0;
        for (int i = 0; i < letras2.length; i++) {
            if (letras2[i] != "a" && letras2[i] != "e" && letras2[i] != "i" && letras2[i] != "o" && letras2[i] != "u") {
                System.out.println(letras2[i] + " é consoante");
                cont++;
            }
        }
        // mostrar o contador de consoantes
        System.out.println("O numero de consoantes é " + cont);
    }

    // exercicio 4 - extra - ler as consoantes de uma palavra digitada
    public void exercicio4Ex() {
        System.out.println("Digite uma palavra:");
        String palavra = sc.next(); // ler a palavra digitada pelo usuario e guardar na variavel "palavra"
        palavra = palavra.toLowerCase(); // converte todas a letras da variavel para letras minusculas
        // percorrer a String para procurar letras vogais ou consoantes
        // contar o numero de consoantes
        int cont = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " é consoante");
                cont++;
            }
        }
        // mostrar o contador de consoantes
        System.out.println("O numero de consoantes é " + cont);
    }

    // exercicio 5 - ler 20 numeros e separar em pares e impares
    public void exercicio5() {
        // criar um vetor para os numeros
        int numeros[] = new int[20];
        int contPar = 0; // contador de numeros pares
        int contImpar = 0; // contador de numeros impares
        // preencher o vetor de numeros e determinar o numero de impares e pares
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o n°[" + (i + 1) + "]=");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                contPar++; // conta os numeros par
            } else {
                contImpar++; // conta os numero impares
            }
        }
        // apos a contagem dos pares e impares criar os respectivos vetores
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        // distribuir os numeros do vetor numeros para os vetores par e impar
        contPar=0;
        contImpar=0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2==0) {
                nPar[contPar]=numeros[i];
                contPar++;
            } else {
                nImpar[contImpar]=numeros[i];
                contImpar++;
            }
        }
    }

}