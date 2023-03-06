package ExercicioIfElse;

import java.util.Scanner;

import javax.print.attribute.standard.Media;

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
        System.out.println("Digite a sua altura em m,cm:");
        double Altura = sc.nextDouble();
        System.out.println("Digite 1 para sexo feminino ou 2 para masculino:");
        int Sexo = sc.nextInt();
        double PesoIdeal;
        if (Sexo == 1) {
            PesoIdeal = (62.1 * Altura) - 44.7;
        } else {
            PesoIdeal = (72.7 * Altura) - 58;
        }
        System.out.println("O seu peso ideal é de:" + PesoIdeal + "Kg");
    }

    public void Exericio7() { // Media Notas
        System.out.println("Informe a Nota 1 do Aluno");
        int Nota1 = sc.nextInt();
        System.out.println("Informe a Nota 2 do Aluno");
        int Nota2 = sc.nextInt();
        int NotaAprovado = 50;
        double MediaAluno = (Nota1 + Nota2) / 2;
        System.out.println("A média do Aluno foi de: " + MediaAluno);
        if (MediaAluno >= NotaAprovado) {
            System.out.println("O Aluno foi aprovado por nota");
        } else {
            System.out.println("O Aluno não foi aprovado por nota");
        }
        System.out.println("Informe a frequênica do Aluno");
        int FrequenciaAluno = sc.nextInt();
        if (FrequenciaAluno >= 75) {
            System.out.println("O Aluno foi Aprovador por Frequencia");
        } else {
            System.out.println("O Aluno não foi aprovado por frequência");
        }
        if (MediaAluno >= NotaAprovado && FrequenciaAluno >= 75) {
            System.out.print("O Aluno foi aprovado no GERAL");
        } else {
            System.out.println("O Aluno NÃO foi aprovado no GERAL");
        }
    }

        // LISTA DE EXERCICIOS 2 //

        public void Exercicio8() {
            System.out.println("Digite um número do conjunto dos números Inteiros:");
            int NumeroInt = sc.nextInt();
            if (NumeroInt%2 == 0) {
                System.out.println("O número que você digitou é PAR");
            } else {
                System.out.println("O número que você digitou é IMPAR");
            }
        }

        public void Exercicio9() {
            
        System.out.println("Digite a sua Nota:");
        int Nota = sc.nextInt();
        if (Nota >= 7) {
            System.out.println("Meus parabens, você foi aprovado!!");
        } else if (Nota == 5 || Nota == 6 ) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado :(");
        }
        }
        public void Exercicio10() {
            System.out.println("Digite uma letra do alfabeto:");
            
        }
}
