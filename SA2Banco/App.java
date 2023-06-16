package SA2Banco;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        // criar um VETOR DE OBJETOS
        ContaFisica clientePF[] = new ContaFisica[10]; // vetor para os clientes PF
        ContaJuridica clientePJ[] = new ContaJuridica[10]; // vetor para os clientes PJ

        // começar o banco
        boolean corabolador = true;
        int contPF = 0;
        int contPJ = 0;

        while (corabolador) {
            boolean aberto = true;
            // pedir ao colaborador qual tipo de conta deseja acessar
            int acao = Integer.parseInt(JOptionPane
                    .showInputDialog("Olá, Seja bem vindo(a) ao banco SDNC. Informe qual tipo de conta deseja acessar:"
                            + "\n 1-Conta Fisica (PF)"
                            + "\n 2- Conta Juridica (PJ)"
                            + "\n 3- Sair"));

            if (acao == 1) {// Conta Fisica PF

                while (aberto) {
                    int acao1 = Integer.parseInt(JOptionPane.showInputDialog(" Conta Pessoa Física"
                            + "\n Informe a ação desejada:"
                            + "\n 1-Abrir Conta"
                            + "\n 2-Acessar Conta"
                            + "\n 3-Voltar"));

                    if (acao1 == 1) { // abrir a conta

                        // criar um objeto
                        clientePF[contPF] = new ContaFisica(); // construtor vazio chamado

                        // preencher os atributos do objeto
                        clientePF[contPF].setNome(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
                        clientePF[contPF].setnCPF(JOptionPane.showInputDialog("Informe o CPF do titular da conta"));
                        clientePF[contPF].setDiaNascimento(Integer.parseInt(
                                JOptionPane.showInputDialog("Informe o dia de nascimento do titular da conta")));
                        clientePF[contPF].setMesNascimento(Integer.parseInt(
                                JOptionPane.showInputDialog("Informe o mês de nascimento do titular da conta")));
                        clientePF[contPF].setAnoNascimento(Integer.parseInt(
                                JOptionPane.showInputDialog("Informe o ano de nascimento do titular da conta")));
                        clientePF[contPF].setnConta(1000 + contPF);
                        clientePF[contPF].setSaldo(0);

                        // acrescimo no contador
                        JOptionPane.showMessageDialog(null, "Conta criada com sucesso"
                                + "\n Conta n°: " + clientePF[contPF].getnConta() + "."
                                + "\n Titular: " + clientePF[contPF].getNome() + "."
                                + "\n CPF: " + clientePF[contPF].getnCPF() + ".");
                        contPF++;
                    } else if (acao1 == 2) { // Acessar uma conta já criada

                        // Localizar a conta no vetor
                        int i;// contador
                        int nContaBuscada = Integer
                                .parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja buscar:"));
                        for (i = 0; i < clientePF.length; i++) {
                            if (nContaBuscada == clientePF[i].getnConta()) {
                                JOptionPane.showMessageDialog(null, "Conta encontrada");

                                break;
                            }
                        }

                        // acessar as informações da conta. Menu de acesso da conta

                        // Tela 1 da conta. informações da conta
                        boolean acesso1 = true;
                        while (acesso1) {
                            int acao3 = Integer
                                    .parseInt(JOptionPane.showInputDialog("Conta n°: " + clientePF[i].getnConta() + "."
                                            + "\n Titular: " + clientePF[i].getNome() + "."
                                            + "\n CPF: " + clientePF[i].getnCPF() + "."
                                            + "\n Data nascimento: " + clientePF[i].getDiaNascimento() + "/"
                                            + clientePF[i].getMesNascimento() + "/" + clientePF[i].getAnoNascimento()
                                            + "\n      "
                                            + "\n Ações: "
                                            + "\n 1-Acessar operações"
                                            + "\n 2-Voltar"));

                            if (acao3 == 1) {

                                // tela de operações
                                boolean acesso = true;
                                while (acesso) {
                                    int acao2 = Integer
                                            .parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                                                    + "\n 1-Consultor o Saldo"
                                                    + "\n 2-Realizar Saque"
                                                    + "\n 3-Realizar Depósito"
                                                    + "\n 4-Pedir empréstimo"
                                                    + "\n 5-Voltar"));

                                    if (acao2 == 1) {// consultar saldo
                                        JOptionPane.showMessageDialog(null,
                                                "Seu saldo é de R$: " + clientePF[i].getSaldo());

                                    } else if (acao2 == 2) {// sacar dinheiro
                                        clientePF[i].saque();

                                    } else if (acao2 == 3) {// depositar dinheiro
                                        clientePF[i].deposito();

                                    } else if (acao2 == 4) {// pedir empréstimo
                                        clientePF[i].emprestimoPF();
                                        boolean emprestimoOnline = true;
                                        while (emprestimoOnline) {
                                            if (clientePF[i].getSaldo() <= 500) {
                                                emprestimoOnline = false;
                                                break;
                                            }
                                            int acao4 = Integer
                                                    .parseInt(
                                                            JOptionPane.showInputDialog("Deseja Realizar o empréstimo?"
                                                                    + "\n 1-Sim"
                                                                    + "\n 2-Não"));
                                            if (acao4 == 1) {
                                                clientePF[i].EmprestimoAceito();
                                                JOptionPane.showMessageDialog(null,
                                                "Empéstimo realizado com sucesso. Seu saldo é de R$: " + clientePF[i].getSaldo());
                                                emprestimoOnline = false;
                                                break;
                                            } else if (acao4 == 2) {
                                                emprestimoOnline = false;
                                                break;
                                            }
                                        }
                                    } else if (acao2 == 5) {// Voltar ao menu anterior
                                        acesso = false;

                                    } else { // caso o usuario digite outro numero
                                        JOptionPane.showMessageDialog(null,
                                                "Operação inválida. Escolha uma operação válida");
                                    }

                                }
                            } else if (acao3 == 2) {//
                                acesso1 = false; // Voltar ao menu anterior
                            }
                        }
                    } else if (acao1 == 3) { // Voltar ao menu anterior
                        aberto = false;

                    } else { // caso o usuario digite outro numero
                        JOptionPane.showMessageDialog(null, "Operação invalida. Escolha uma operação válida");

                    }
                }
            } else if (acao == 2) {// Conta Juridica PJ

                while (aberto) {
                    int acao1 = Integer.parseInt(JOptionPane.showInputDialog(" Conta Pessoa Juridica"
                            + "\n Informe a ação desejada:"
                            + "\n 1-Abrir Conta"
                            + "\n 2-Acessar Conta"
                            + "\n 3-Voltar"));

                    if (acao1 == 1) { // abrir a conta

                        // criar um objeto
                        clientePJ[contPJ] = new ContaJuridica(); // construtor vazio chamado

                        // preencher os atributos do objeto
                        clientePJ[contPJ].setNome(JOptionPane.showInputDialog("Informe o nome da empresa:"));
                        clientePJ[contPJ].setnCNPJ(JOptionPane.showInputDialog("Informe o CNPJ da empresa:"));
                        clientePJ[contPJ].setnConta(2000 + contPJ);
                        clientePJ[contPJ].setSaldo(0);

                        // acrescimo no contador
                        JOptionPane.showMessageDialog(null, "Conta criada com sucesso");
                        contPJ++;
                    } else if (acao1 == 2) { // Acessar uma conta já criada

                        // Localizar a conta no vetor
                        int i;// contador
                        int nContaBuscada = Integer
                                .parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja buscar:"));
                        for (i = 0; i < clientePJ.length; i++) {
                            if (nContaBuscada == clientePJ[i].getnConta()) {
                                JOptionPane.showMessageDialog(null, "Conta encontrada");
                                break;
                            }
                        }

                        // acessar as informações da conta. Menu de acesso da conta
                        boolean acesso = true;
                        while (acesso) {
                            int acao2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada:"
                                    + "\n 1-Consultor o Saldo"
                                    + "\n 2-Realizar Saque"
                                    + "\n 3-Realizar Depósito"
                                    + "\n 4-Pedir empréstimo"
                                    + "\n 5-Voltar"));

                            if (acao2 == 1) {// consultar saldo
                                JOptionPane.showMessageDialog(null, "Seu saldo é de R$: " + clientePJ[i].getSaldo());

                            } else if (acao2 == 2) {// sacar dinheiro
                                clientePJ[i].saque();

                            } else if (acao2 == 3) {// depositar dinheiro
                                clientePJ[i].deposito();

                            } else if (acao2 == 4) {// pedir empréstimo
                                clientePJ[i].emprestimoPJ();

                            } else if (acao2 == 5) {// Voltar ao menu anterior
                                acesso = false;

                            } else if (acao2 != 1 & acao2 != 2 & acao2 != 3 & acao2 != 4 & acao2 != 5) {
                                JOptionPane.showMessageDialog(null, "Operação inválida. Escolha uma operação válida");
                            }

                        }
                    } else if (acao1 == 3) { // Voltar ao menu anterior
                        aberto = false;
                    }
                }
            }

            else if (acao == 3) { // Voltar ao menu anterior
                JOptionPane.showMessageDialog(null, "Você saiu do sistema SDNC. Até logo");
                corabolador = false;

            } else {
                JOptionPane.showMessageDialog(null, "Operação inválida. Escolha uma operação válida");

            }
        }
    }
}
