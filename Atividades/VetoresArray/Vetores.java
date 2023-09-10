package VetoresArray;

import java.util.Scanner; // Sempre declarar quando for usar o Scanner

public class Vetores {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // Criando um Vetor
        double valores[] = new double[] { 10.5, 20.7, 30.6, 40.4 };
        System.out.println("1° Posição- índice[0]:" + valores[0]);
        System.out.println("2° Posição- índice[1]:" + valores[1]);
        System.out.println("3° Posição- índice[2]:" + valores[2]);
        System.out.println("4° Posição- índice[3]:" + valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando o valor do Índice[0]
        System.out.println("1° Posição- índice[0]:" + valores[0]);
    }

    public void exercicio1() {
        // Criando Vetor
        int valoresInt[] = new int[5];
        System.out.println("Digite 5 números inteiros:");
        valoresInt[0] = sc.nextInt();
        valoresInt[1] = sc.nextInt();
        valoresInt[2] = sc.nextInt();
        valoresInt[3] = sc.nextInt();
        valoresInt[4] = sc.nextInt();
        System.out.println("1° Posição- índice[0]:" + valoresInt[0]);
        System.out.println("2° Posição- índice[1]:" + valoresInt[1]);
        System.out.println("3° Posição- índice[2]:" + valoresInt[2]);
        System.out.println("4° Posição- índice[3]:" + valoresInt[3]);
        System.out.println("5° Posição- índice[4]:" + valoresInt[4]);
    }

    public void exercicio2() {
        double numeros[] = new double[10];
        System.out.println("Digite 10 números reais:");
        numeros[0] = sc.nextDouble();
        numeros[1] = sc.nextDouble();
        numeros[2] = sc.nextDouble();
        numeros[3] = sc.nextDouble();
        numeros[4] = sc.nextDouble();
        numeros[5] = sc.nextDouble();
        numeros[6] = sc.nextDouble();
        numeros[7] = sc.nextDouble();
        numeros[8] = sc.nextDouble();
        numeros[9] = sc.nextDouble();
        System.out.println("Os números que você digitou na ordem inversa são os seguintes:");
        System.out.println("1° Posição: " + numeros[9]);
        System.out.println("2° Posição: " + numeros[8]);
        System.out.println("3° Posição: " + numeros[7]);
        System.out.println("4° Posição: " + numeros[6]);
        System.out.println("5° Posição: " + numeros[5]);
        System.out.println("6° Posição: " + numeros[4]);
        System.out.println("7° Posição: " + numeros[3]);
        System.out.println("8° Posição: " + numeros[2]);
        System.out.println("9° Posição: " + numeros[1]);
        System.out.println("10° Posição: " + numeros[0]);
    }

    public void exercicio3() {
        double Notas[] = new double[4];
        double media;
        System.out.println("Digite as 4 notas do aluno:");
        Notas[0] = sc.nextDouble();
        Notas[1] = sc.nextDouble();
        Notas[2] = sc.nextDouble();
        Notas[3] = sc.nextDouble();
        media = ((Notas[0] + Notas[1] + Notas[2] + Notas[3]) / 4);
        System.out.println("As notas digitadas foram as seguints:");
        System.out.println("Nota 1: " + Notas[0]);
        System.out.println("Nota 2: " + Notas[1]);
        System.out.println("Nota 3: " + Notas[2]);
        System.out.println("Nota 4: " + Notas[3]);
        System.out.println("A média do aluno foi de:" + media);
    }
}
