package IteracaoWhile;

import java.util.Random;
import java.util.Scanner;

import javax.swing.SizeSequence;


public class ListaExtra {
    Scanner sc = new Scanner(System.in);

    public void exercicio1() {
        String usuario;
        String senha;

        System.out.println("Digite o nome de usuario");
        usuario = sc.nextLine();

        System.out.println("Digite a sua senha");
        senha = sc.nextLine();

        while (senha.equals(usuario)) {
            System.out.println("Sua senha não pode ser igual ao seu Usuario. Digite outra senha válida");
            senha = sc.nextLine();
        }
        System.out.println("Cadastro realizado com sucesso");
    }

    public void exercicio2() {
        String nome;
        int idade = 0;
        double salario = 0;
        String sexo;
        String estadoCivil;

        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();
        while (nome.length() < 3) {
            System.out.println("Digite um nome válido(mais de 3 letras):");
            nome = sc.nextLine();
        }

        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Digite uma idade válida:");
            idade = sc.nextInt();
        }

        System.out.println("Digite seu Sálario(apenas números)");
        salario = sc.nextDouble();
        while (salario <= 0) {
            System.out.println("Digite um sálario maior que 0:");
            salario = sc.nextDouble();
        }

        sc.nextLine();

        System.out.println("Sexo(digite f para feminino ou m para masculino):");
        sexo = sc.nextLine();
        while (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println(
                    "é preciso escolher entras as opções existentes qual seu sexo(f para femenino ou m para masculino)");
            sexo = sc.nextLine();
        }

        System.out.println(
                "Digite qual o seu estado civil('s' para solteiro, 'c' para casado, 'v' para viuvo, 'd' para divorciado)");
        estadoCivil = sc.nextLine();
        while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v")
                && !estadoCivil.equals("d")) {
            System.out.println(
                    "é preciso escolher entras as opções existentes qual seu estado civil('s' para solteiro, 'c' para casado, 'v' para viuvo, 'd' para divorciado)");
            estadoCivil = sc.nextLine();
        }
    }

    public void exercicio3() {
        double paisA = 80000;
        double paisB = 200000;
        int anos = 0;
        while (paisA <= paisB) {
            paisA *= 1.03;
            paisB *= 1.015;
            anos += 1;
        }

        System.out.println(
                "O número de anos necessarios para que o pais A iguale ou ultrapasse a população do pais B é de "
                        + anos + " anos.");
    }

    public void exercicio4() {
        double paisA;
        double paisB;
        double taxaA;
        double taxaB;
        int anos = 0;

        System.out.println("Digite a população do país A:");
        paisA = sc.nextDouble();
        System.out
                .println("Agora digite a taxa de crescimento ao ano do país A em porcentagem, mas sem simbolos(ex:2):");
        taxaA = sc.nextDouble();
        System.out.println("Digite a população do país B:");
        paisB = sc.nextDouble();
        System.out
                .println("Agora digite a taxa de crescimento ao ano do país B em porcentagem, mas sem simbolos(ex:2):");
        taxaB = sc.nextDouble();

        taxaA = (taxaA / 100) + 1;
        taxaB = (taxaB / 100) + 1;

        while (paisA <= paisB) {
            paisA *= taxaA;
            paisB *= taxaB;
            anos += 1;
        }

        System.out.println(
                "O número de anos necessarios para que o pais A iguale ou ultrapasse a população do pais B é de "
                        + anos + " anos.");

    }

    public void exercicio5() {

        int numeros[] = new int[8];
        int maiorNumero = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número inteiro: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O Maior número digitado é: " + maiorNumero);

    }

    public void exercicio6() {

        int numero = 1;
        while (numero < 1000) {
            if (numero % 3 == 0) {
                System.out.println("O número " + numero + " é divisivel por 3 e menor que 1000");
            }
            numero += 1;
        }
    }

    public void exercicio7() {
        int numeroA;
        int numeroB;
        int inteiro;
        System.out.println("Digite o primeiro número inteiro:");
        numeroA = sc.nextInt();
        System.out.println("Digite o segundo número inteiro:");
        numeroB = sc.nextInt();
        if (numeroA > numeroB) {
            System.out.println("Os números inteiros entre " + numeroB + " e " + numeroA + " são os seguintes:");
            inteiro = numeroB;
            while (inteiro < numeroA - 1) {
                inteiro += 1;
                System.out.println(inteiro);
            }
        } else if (numeroB > numeroA) {
            System.out.println("Os números inteiros entre " + numeroA + " e " + numeroB + " são os seguintes:");
            inteiro = numeroA;
            while (inteiro < numeroB - 1) {
                inteiro += 1;
                System.out.println(inteiro);
            }
        } else {
            System.out.println("Você digitou dois número iguais");
        }

    }

    public void exercicio8() {
        int numero;
        int i = 1;
        System.out.println("De qual número você gostaria a tabuada? (entre 1 e 10)");
        numero = sc.nextInt();
        System.out.println("A tabuadado do " + numero + " é a seguinte:");
        while (numero > 10 || numero < 0) {
            System.out.println("Digite um número entre 1 e 10:");
            numero = sc.nextInt();
        }
        int produto = numero;
        while (i <= 10) {
            produto = numero * i;
            System.out.println(numero + " x " + i + " = " + produto);
            i += 1;
        }
    }

    public void exercicio9() {

        int base;
        int expoente;
        int i = 1;
        System.out.println("Digite o número que ficara na base");
        base = sc.nextInt();
        System.out.println("Digite o número que ficara no expoente");
        expoente = sc.nextInt();

        int resultado = base;
        while (i < expoente) {
            resultado *= base;
            i += 1;
        }

        System.out.println("O resultado da operação de potência é: " + resultado);

    }

    public void exercicio10() {
        int enesimo;
        int ultimoTermo = 1;
        int penultimoTermo = 1;
        int i;
        int primeroTermo;
        int resultado = 0;

        System.out.println("O primeiro termo da sequencia de Fibonacci que deseja imprimir é (0 ou 1)?");
        primeroTermo = sc.nextInt();

        System.out.println("Digite até qual termo da sequência você deseja imprimir:");
        enesimo = sc.nextInt();

        if (primeroTermo == 0) {
            i = 2;
            System.out.println("Os termos da sequência ate a " + enesimo + "° posição são os seguintes:");
            System.out.println("0");
            System.out.println("1");
        } else {
            i = 1;
            System.out.println("Os termos da sequência ate a " + enesimo + "° posição são os seguintes:");
            System.out.println("1");
        }

        while (i < enesimo) {
            resultado = ultimoTermo + penultimoTermo;
            ultimoTermo = penultimoTermo;
            System.out.println(ultimoTermo);
            penultimoTermo = resultado;
            i++;
        }

        // System.out.println("O " + enesimo + "° termo da sequencia é: " + resultado);

    }

    public void exercicio11() {

        int fatorial;
        int resultado = 0;
        int i = 1;
        int quantidadeRepeticao;
        System.out.println("Digite o número que deseja realizar a operação de fatorial:");
        fatorial = sc.nextInt();
        quantidadeRepeticao = fatorial;
        resultado = fatorial;
        while (i < quantidadeRepeticao) {
            resultado *= fatorial - 1;
            i++;
            fatorial--;
        }

        System.out.println("O resultado é:" + resultado);

    }

    public void exercicio12() {

        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();
        int i = 0;
        double resultado;
        double vetorA[] = new double[numero];
        while (i >= numero) {
            vetorA[i] = numero%i;
            i++;
        }
    }

}
