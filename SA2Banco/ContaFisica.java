package SA2Banco;

import java.util.Scanner;

// criando uma classe ContaFisica para as contas de pessoas Fisicas.

public class ContaFisica implements Conta {
    Scanner sc = new Scanner(System.in);
    // atributos especificos
    private static int constante = 0;
    int nCPF;

    // métodos get e set
    public int getnCPF() {
        return nCPF;
    }

    public void setnCPF(int nCPF) {
        this.nCPF = nCPF;
    }

    // métodos da classe conta
    @Override
    public String getNome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta");
        String nome = sc.nextLine();
        return nome;
    }

    @Override
    public int getNumeroConta() {
        int numeroConta = 10000 + constante;
        constante++;
        return numeroConta;
    }

    @Override
    public int getSaldo() {
        int saldo = 0;
        return saldo;
    }

}
