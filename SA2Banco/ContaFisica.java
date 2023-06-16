package SA2Banco;

import javax.swing.JOptionPane;

// criando uma classe ContaFisica para as contas de pessoas Fisicas.

public class ContaFisica extends Conta {

    String nCPF;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;

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

    // métodos definidos pelo programador/opcionais

    public void emprestimoPF() {// Pedir emprestimo

        // double valorEmprestimo = 0;
        if (saldo <= 500) {
            JOptionPane.showMessageDialog(null, "Usuário não possui os requisitos necessários para um emprestimo.");

        } else if (saldo > 500 & saldo < 5000) {
            valorEmprestimo = saldo * 1.5;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);
        } else if (saldo > 5000 & saldo < 50000) {
            valorEmprestimo = saldo * 1.8;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);
        } else if (saldo > 50000 & saldo < 250000) {
            valorEmprestimo = saldo * 3;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);
        } else if (saldo > 250000) {
            valorEmprestimo = saldo * 5;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);
        }

    }

    public void EmprestimoAceito() {
        saldo += valorEmprestimo;
    }
}
