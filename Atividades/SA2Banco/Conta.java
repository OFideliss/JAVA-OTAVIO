package SA2Banco;

import javax.swing.JOptionPane;

//Criando uma super classe para criar os atributos de uma conta generica (tanto Fisica quando Juridica)
public abstract class Conta {
    // Atributos da super classe conta
    String nome;
    int nConta;
    double saldo;
    double valorEmprestimo;
    double valorEmprestimoaPedido;

    // métodos
    // construtor vazio(default)
    // get e set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getValorEmprestimoaPedido() {
        return valorEmprestimoaPedido;
    }

    public void setValorEmprestimoaPedido(double valorEmprestimoaPedido) {
        this.valorEmprestimoaPedido = valorEmprestimoaPedido;
    }
    // métodos definidos pelo programador/opcionais

    public void saque() {// Saque
        double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do saque:"));
        if (saque <= saldo) {
            saldo -= saque;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso. Seu saldo agora é de: R$" + saldo + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada. Saldo insuficiente.");
        }
    }

    public void deposito() {// Depósito
        double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do depósito:"));
        saldo += deposito;
        JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso. Seu saldo agora é de: R$" + saldo + ".");
    }

}
