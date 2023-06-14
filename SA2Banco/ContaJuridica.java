package SA2Banco;

import javax.swing.JOptionPane;

// criando uma classe ContaJuridicapara as contas de pessoas juridicas.

public class ContaJuridica extends Conta {

    // atributos especificos
    String nCNPJ;

    // métodos
    // construtor vazio(default)
    // get e set
    public String getnCNPJ() {
        return nCNPJ;
    }

    public void setnCNPJ(String nCNPJ) {
        this.nCNPJ = nCNPJ;
    }


    // métodos definidos pelo programador/opcionais

    public void emprestimoPJ() {// Pedir emprestimo

        double valorEmprestimo = 0;
        if (saldo <= 500) {
            JOptionPane.showMessageDialog(null, "Usuário não possui os requisitos necessários para um emprestimo.");

        } else if (saldo > 500 & saldo < 100000) {
            valorEmprestimo = saldo * 2.5;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);

        } else if (saldo > 100000 & saldo < 500000) {
            valorEmprestimo = saldo * 4;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);
        } else if (saldo > 500000 & saldo < 5000000) {
            valorEmprestimo = saldo * 6;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);
        } else if (saldo > 5000000) {
            valorEmprestimo = saldo * 10;
            JOptionPane.showMessageDialog(null, "Valor disponivel para emprestimo R$: " + valorEmprestimo);
        }

    }
}
