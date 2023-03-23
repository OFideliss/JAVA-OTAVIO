package SituacaoAprendizagemIndividual;

import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Digite o primeiro número");
        double numero1 = sc.nextDouble();
        System.out
                .println(
                        "Digite o número de acordo com a operação que deseja realizar: 1.Adição - 2.Subtração - 3.Multiplicação - 4.Divisão");
        double operacao = sc.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = sc.nextDouble();
        double resultado;
        if (operacao == 1) {
            resultado = (numero1 + numero2);
            System.out.println("O resultado da operação de Adição entre os números " + numero1 + " e o número "
                    + numero2 + " é de " + resultado);
        } else if (operacao == 2) {
            resultado = (numero1 - numero2);
            System.out.println("O resultado da operação de Subtração do número " + numero1 + " pelo número " + numero2
                    + " é de: " + resultado);
        } else if (operacao == 3) {
            resultado = (numero1 * numero2);
            System.out.println("O resultado da operação de Multiplicação entre os números " + numero1 + " e o número "
                    + numero2 + " é de " + resultado);
        } else {
            resultado = (numero1 / numero2);
            System.out.println("O resultado da operação de Divisão do número " + numero1 + " pelo número " + numero2
                    + " é de: " + resultado);
        }

    }

    public void exercicio2() {
        System.out.println("Por favor digite o numero da sua matricula:");
        double nMatricula = sc.nextDouble();

        if (nMatricula % 4 == 0) {
            System.out.println("Você esta no time do Chris");
        } else if (nMatricula % 4 == 1) {
            System.out.println("Você esta no time do Greg");
        } else if (nMatricula % 4 == 2) {
            System.out.println("Você esta no time do Caruso");
        } else {
            System.out.println("Você esta no time do Jerome");
        }

    }

    public void exercicio3() {
        System.out.println("Digite a quantidade em Kg de morango que você irá levar:");
        double pMorango = sc.nextDouble();
        System.out.println("Digite a quantidade em Kg de maças que você irá levar:");
        double pMaca = sc.nextDouble();
        System.out.println("Digite a quantidade em Kg de bananas que você irá levar:");
        double pBanana = sc.nextDouble();
        double pTotal = pMorango + pMaca + pBanana;
        double valorCompra = (pMorango * 2.5) + (pMaca * 1.8) + (pBanana * 1.3);

        if (pTotal > 8 || valorCompra > 25) {
            valorCompra = (valorCompra * 0.9);
            System.out.println("O valor total da sua compra é de R$" + valorCompra);
        } else {
            System.out.println("O valor total da sua compra é de R$" + valorCompra);
        }

    }
}
