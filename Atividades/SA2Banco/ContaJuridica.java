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

        if (saldo < 500) {
            JOptionPane.showMessageDialog(null,
                    "Usuário não possui os requisitos necessários para um empréstimo. Saldo mínimo de R$500,00 necessário.");

        } else if (saldo >= 500 & saldo < 100000) {
            valorEmprestimo = saldo * 2.5;
            JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");

        } else if (saldo > 100000 & saldo < 500000) {
            valorEmprestimo = saldo * 4;
            JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");
        } else if (saldo > 500000 & saldo < 5000000) {
            valorEmprestimo = saldo * 6;
            JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");
        } else if (saldo > 5000000) {
            valorEmprestimo = saldo * 10;
            JOptionPane.showMessageDialog(null, "Valor disponivel para empréstimo: R$" + valorEmprestimo + ".");
        }

    }

    // caso o emprestimo seja aceito pelo usuario
    public void EmprestimoAceitoPJ() {
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
