import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalcGrid {
    public CalcGrid() {

        // ===========================================================Calculadoara===========================================================//
        JFrame janelaCalc = new JFrame("Layout Calculadora");
        // Mudando o Layout Frame
        BorderLayout border = new BorderLayout();
        JPanel painelCalc = new JPanel(); // Padrão FlowLayout
        JPanel painelV = new JPanel(); // Padrão FlowLayout
        janelaCalc.getContentPane().add(painelCalc, BorderLayout.CENTER);
        janelaCalc.getContentPane().add(painelV, BorderLayout.NORTH);
        // Set Layout do JPanel
        GridLayout gridCalc = new GridLayout(4, 4); // Quatro linhas por Quatro Colunas
        painelCalc.setLayout(gridCalc);
        JTextField campoTexto = new JTextField("Insira um Valor", 25);
        painelV.add(campoTexto);

        // Vetor com os textos dos botões
        // \u00F7 é o código para o simbolo de divisão "÷"
        String textBotoes[] = { "7", "8", "9", "C", "4", "5", "6", "\u00F7", "1", "2", "3", "x", "+", "0", "-", "=" };
        for (int i = 0; i < textBotoes.length; i++) {
            painelCalc.add(new JButton(textBotoes[i]));
        }
        janelaCalc.setDefaultCloseOperation(1);
        janelaCalc.pack();
        janelaCalc.setVisible(true);
    }
}
