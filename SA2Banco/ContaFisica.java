package SA2Banco;

import javax.swing.JOptionPane;

// criando uma classe ContaFisica para as contas de pessoas Fisicas.

public class ContaFisica extends Conta {

    String nCPF;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    int idade;
    // set get

    public String getnCPF() {
        return nCPF;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setnCPF(String nCPF) {
        this.nCPF = nCPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // métodos definidos pelo programador/opcionais

    public void emprestimoPF() {// Pedir emprestimo
        idade = 2023 - anoNascimento;
        if (idade >= 20) {

            if (saldo >= 500 & saldo <= 5000) {
                valorEmprestimo = saldo * 1.5;
                JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");
            } else if (saldo > 5000 & saldo <= 50000) {
                valorEmprestimo = saldo * 1.8;
                JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");
            } else if (saldo > 50000 & saldo <= 250000) {
                valorEmprestimo = saldo * 3;
                JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");
            } else if (saldo > 250000) {
                valorEmprestimo = saldo * 5;
                JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");
            } else if (saldo < 500) {
                JOptionPane.showMessageDialog(null,
                        "Usuário não possui os requisitos necessários para um empréstimo. Saldo mínimo de R$500,00.");
            }
        } else if (idade < 20) {
            JOptionPane.showMessageDialog(null,
                    "Usuário não tem idade mínima para fazer empréstimo. idade mínima: completar 20 anos este ano");
        }

    }

    // caso o emprestimo seja aceito pelo usuario
    public void EmprestimoAceitoPF() {
        valorEmprestimoaPedido = Integer.parseInt(JOptionPane.showInputDialog(
                "Informe o valor do empréstimo que deseja realizar. Limite máximo: R$" + valorEmprestimo));

        if (valorEmprestimoaPedido <= valorEmprestimo && valorEmprestimoaPedido > 0) {
            saldo += valorEmprestimoaPedido;
            JOptionPane.showMessageDialog(null, "Empréstimo aceito. Parabéns. Seu saldo agora é de: R$" + saldo + ".");
        } else if (valorEmprestimoaPedido == 0) {
            JOptionPane.showMessageDialog(null, "Empréstimo recusado. Valor mínimo não atingido.");
        } else if (valorEmprestimoaPedido < 0) {
            JOptionPane.showMessageDialog(null, "Empréstimo recusado. Você não pode escolher um valor negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo recusado. Valor máximo excedido.");
        }
    }
}
