package ExercicioIfElse;

import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        System.out.println("Informe o primeiro valor:"); // Aparece na tela a pergunta em aspas e uma caixa para
                                                         // responder
        int Valor1; // a variavel Valor1 digitada é um numero racional
        Valor1 = sc.nextInt(); // A variavel valor1 é igual ao valor digitado
        System.out.println("Informe o segundo valor: ");
        int Valor2 = sc.nextInt();
        if (Valor1 > Valor2) {
            System.out.println("O Maior valor é" + Valor1);
        } else if (Valor1 < Valor2) {
            System.out.println("O Maior valor é " + Valor2);
        } else {
            System.out.println("Os valores são iguais");
        }
    }

    public void Exercicio2() {
        System.out.println("Digite o seu ano de nascimento:");
        int AnoNascimento = sc.nextInt();
        int IdadeMinVotar = 2007;
        if (AnoNascimento <= IdadeMinVotar) {
            System.out.println("Você pode votar este ano");
        } else {
            System.out.println("Você NÃO pode votar este ano");
        }
    }

    public void Exercicio3() {
        System.out.println("Digite a sua senha:");
        int Senha = sc.nextInt();
        int SenhaCorreta = 1234;
        if (Senha == SenhaCorreta) {
            System.out.println("ACESSO PERMITIDO");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }

    public void Exercicio4() {
        System.out.println("Digite a quantidade de maças que seram compradas:");
        int QuantidadeCompra = sc.nextInt();
        double ValorDuzia;
        if (QuantidadeCompra < 12) {
            ValorDuzia = 0.30;
        } else {
            ValorDuzia = 0.25;
        }
        double Precocompra = QuantidadeCompra * ValorDuzia;
        System.out.println("A sua compra irá custar R$:" + Precocompra);
    }

    public void Exercicio5() {
        System.out.println("Digite o Valor 1:");
        int Valor1 = sc.nextInt();
        System.out.println("Digite o Valor 2:");
        int Valor2 = sc.nextInt();
        System.out.println("Digite o Valor 3:");
        int Valor3 = sc.nextInt();
        if (Valor1 < Valor2 && Valor1 < Valor3 && Valor2 < Valor3) {
            System.out.println("Números em ordem crescente:" + Valor1 + ";" + Valor2 + ";" + Valor3);
        } else if (Valor1 < Valor2 && Valor1 < Valor3 && Valor3 < Valor2) {
            System.out.println("Números em ordem crescente:" + Valor1 + ";" + Valor3 + ";" + Valor2);
        } else if (Valor2 < Valor1 && Valor2 < Valor3 && Valor1 < Valor3) {
            System.out.println("Números em ordem crescente:" + Valor2 + ";" + Valor1 + ";" + Valor3);
        } else if (Valor2 < Valor1 && Valor2 < Valor3 && Valor3 < Valor1) {
            System.out.println("Números em ordem crescente:" + Valor2 + ";" + Valor3 + ";" + Valor1);
    } else if (Valor3 < Valor1 && Valor3 < Valor2 && Valor1 < Valor2) {
        System.out.println("Números em ordem crescente:" + Valor3 + ";" + Valor1 + ";" + Valor2);
    } else if (Valor3 < Valor1 && Valor3 < Valor2 && Valor2 < Valor1) {
        System.out.println("Números em ordem crescente:" + Valor3 + ";" + Valor2 + ";" + Valor1);
}
    }
    public void Exercicio6() {
        System.out.println("Digite a sua altura em cm:");
        int Altura = sc.nextInt();
        System.out.println("Digite 1 para sexo feminino ou 2 para masculino:");
        int Sexo = sc.nextInt();
        double PesoIdeal;
        if (Sexo == 1) {
            PesoIdeal = (62.1 * Altura) - 44.7;
        } else {
            PesoIdeal = (72.7 * Altura) - 58;
        }
        System.out.println("O seu peso ideal é de:" + PesoIdeal);
    }
}
