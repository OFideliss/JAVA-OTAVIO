package AtividadeRemota;

import java.util.Scanner;

public class Exercicio {
    Scanner sc = new Scanner(System.in);

    public void Exercicio1() {
        System.out.println("Digite um número natural:");
        int NDigitado = sc.nextInt();

        if (NDigitado > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }

    public void Exercicio2() {
        System.out.println("Digite a quantidade de horas trabalhadas:");
        double QtnTrabalhado = sc.nextDouble();
        System.out.println("Digite o valor da hora trabalhada:");
        double SalarioPorH = sc.nextDouble();
        double SalarioFinal;
        double Hextra;
        double SalarioHextra;

        if (QtnTrabalhado <= 200) {
            SalarioFinal = QtnTrabalhado * SalarioPorH;
            System.out.println("O salário deste mês é de R$:" + SalarioFinal);
        } else {
            Hextra = QtnTrabalhado - 200;
            SalarioHextra = (Hextra * SalarioPorH * 1.5);
            SalarioFinal = (200 * SalarioPorH) + SalarioHextra;
            System.out.println("O salário deste mês é de R$:" + SalarioFinal);
        }

    }

    public void Exercicio3() {
        System.out.println("Digite o sálario fixo:");
        double SalarioFixo = sc.nextDouble();
        System.out.println("Digite o total de suas vendas:");
        double ValorVendas = sc.nextDouble();
        double SalarioFinal;
        double Parte1Salario;
        double Parte2Salario;
        double Diferenca;

        if (ValorVendas <= 2500) {
            SalarioFinal = SalarioFixo + (ValorVendas * 0.03);
            System.out.println("O sálario total deste mês é de R$:" + SalarioFinal);
        } else {
            Parte1Salario = (2500 * 0.03);
            Diferenca = (ValorVendas - 2500);
            Parte2Salario = (Diferenca * 0.05);
            SalarioFinal = (SalarioFixo + Parte1Salario + Parte2Salario);
            System.out.println("O sálario total deste mês é de R$:" + SalarioFinal);
        }

    }

    public void Exercicio4() {
        System.out.println("Digite o número da conta:");
        int NConta = sc.nextInt();
        System.out.println("Digite o saldo da conta:");
        double SaldoConta = sc.nextInt();
        System.out.println("Digite o vaolr do débito:");
        double Debito = sc.nextInt();
        System.out.println("Digite o valor do crédito:");
        double Cretido = sc.nextInt();
        double SaldoAtual = SaldoConta - Debito + Cretido;

        System.out.println("O saldo atual da conta:" + NConta + " é de R$:" + SaldoAtual);

        if (SaldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

    }

    public void Exercicio5() {
        System.out.println("Digite o Valor 1:");
        double A = sc.nextDouble();
        System.out.println("Digite o Valor 2:");
        double B = sc.nextDouble();
        System.out.println("Digite o Valor 3:");
        double C = sc.nextDouble();

        if (A > B && A > C) {
            System.out.println("O número " + A + " é o maior dos três digitados.");
        } else if (B > A && B > C) {
            System.out.println("O número " + B + " é o maior dos três digitados.");
        } else {
            System.out.println("O número " + C + " é o maior dos três digitados.");
        }

    }

    public void Exercicio6() {
        System.out.println("Digite a quantidade de litros vendido:");
        double QtnLitros = sc.nextDouble();
        System.out.println("Digite qual o combustível foi abastecido A para Alcool ou G para Gasolina:");
        String Combustivel = sc.nextLine();
        double Total;

        if (Combustivel .equals("A") && QtnLitros <= 20) {
            Total = QtnLitros * 3.90 * 0.97;
            System.out.println("O Valor a ser pago é de R$" + Total);
        } else if (Combustivel == "A" && QtnLitros > 20) {
            Total = QtnLitros * 3.90 * 0.94;
            System.out.println("O Valor a ser pago é de R$" + Total);
        } else if (Combustivel == "G" && QtnLitros <= 20) {
            Total = QtnLitros * 5.30 * 0.97;
            System.out.println("O Valor a ser pago é de R$" + Total);
        } else if (Combustivel == "G" && QtnLitros > 20){
            Total = QtnLitros * 5.30 * 0.94;
            System.out.println("O Valor a ser pago é de R$" + Total);
        }
    }
}