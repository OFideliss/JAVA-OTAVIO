package Exception;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExemploTryCatch {
    public static void main(String[] args) {
        boolean rodando = true;
        while (rodando) {

            try {
                // digitar o primeiro número de entrada
                int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
                // escolher a operação desejada
                int operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a operação desejada:"
                        + "\n 1 - Somar"
                        + "\n 2 - Subtrair"
                        + "\n 3 - Multiplicar"
                        + "\n 4 - Divisão"
                        + "\n 5 - Sair"));
                if (operacao >= 5) { // Sair da aplicação
                    rodando = false;
                    JOptionPane.showMessageDialog(null, "Você saiu da calculadora");
                    break;
                }
                // digitar o segundo número de entrada
                int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
                // realizando a operação
                if (operacao == 1) { // Soma
                    JOptionPane.showMessageDialog(null, "O resultado é "
                            + (numero1 + numero2));
                }
                if (operacao == 2) { // Subtração
                    JOptionPane.showMessageDialog(null, "O resultado é "
                            + (numero1 - numero2));
                }
                if (operacao == 3) { // Multiplicação
                    JOptionPane.showMessageDialog(null, "O resultado é "
                            + (numero1 * numero2));
                }
                if (operacao == 4) { // Divisão
                    JOptionPane.showMessageDialog(null, "O resultado é "
                            + (numero1 / numero2));
                }

            } catch (ArithmeticException erro1) { // quando escolher operação divisão por Zero!!!
                JOptionPane.showMessageDialog(null,
                        "Erro - Não é possivel dividir por zero, digite outro número válido");
            } catch (NumberFormatException erro2) { // quando o npumero digitado não for inteiro
                JOptionPane.showMessageDialog(null,
                        "Erro - O número digitado não é inteiro, tente outro número");
            } catch (Exception erro3) {// quando apresentar outro erro
                JOptionPane.showMessageDialog(null, "Algo deu errado"
                        + "\n Digite novamente");
            } 
        }
    }
}