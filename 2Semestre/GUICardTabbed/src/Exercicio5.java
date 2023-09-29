import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.*;

public class Exercicio5 extends JFrame {
    // =========Componentes pontuacao===========
    // Criar uma varival para somar a pontuação
    int pontos = 0;

    // Chamar o ctor
    public Exercicio5() {
        super("Exericio 5 - O Jogo");
        //
        // =======================Painel Principal========================
        // Criar o painel principal
        JPanel mainPanel = new JPanel();
        CardLayout cl = new CardLayout();
        mainPanel.setLayout(cl);
        // add painel principal (mainPanel) ao frame
        this.add(mainPanel);
        //
        // ===========================Cards no Jogo========================
        // Card Inicio
        JPanel inicio = new JPanel();
        // Card Pontuação
        JPanel pontuacao = new JPanel();
        // Card Tela1 do jogo
        JPanel tela1 = new JPanel();
        // Card Tela2 do jogo
        JPanel tela2 = new JPanel();
        // Card Tela3 do jogo
        JPanel tela3 = new JPanel();
        // Card Tela4 do jogo
        JPanel tela4 = new JPanel();
        // Card Tela5 do jogo
        JPanel tela5 = new JPanel();
        //
        // ===========================Add Cards ao mainPanel=================
        mainPanel.add(inicio, "Inicio"); // Add card Inicio
        mainPanel.add(tela1, "oneQuestion"); // Add card tela1
        mainPanel.add(tela2, "twoQuestion"); // Add card tela2
        mainPanel.add(tela3, "threeQuestion"); // Add card tela3
        mainPanel.add(tela4, "fourQuestion"); // Add card tela4
        mainPanel.add(tela5, "fiveQuestion"); // Add card tela5
        mainPanel.add(pontuacao, "Pontuação"); // Add card pontuacao
        //
        // ======================Componentes dos cards====================
        // =========Componentes Inicio===========
        // Texto inicial
        JLabel textoInicio1 = new JLabel("Seja bem vindo ao - O Jogo");
        // Botão de ir ao jogo
        JButton butJogo = new JButton("Iniciar O Jogo");
        //
        // =========Componentes Tela1===========
        // Criar um BorderFactory
        Border borderTela1 = BorderFactory.createTitledBorder("Primeiro Desafio");
        // Criar pergunta
        JLabel Quest1 = new JLabel("Quanto é uma duzia de padeiro?");
        // Criar texto para acertou/errou
        JLabel resultado1Certo = new JLabel("Acertou!!");
        JLabel resultado1Errado = new JLabel("Errou. Péssimo!!");
        // Criar um grupo de botões para os checkbox
        // Isso serve para permitir apenas uma seleção
        ButtonGroup grupoRespostas1 = new ButtonGroup();
        // Criar CheckBox para as possiveis respotas
        JCheckBox resposta1 = new JCheckBox("24");
        JCheckBox resposta2 = new JCheckBox("12");
        JCheckBox resposta3 = new JCheckBox("6");
        JCheckBox resposta4 = new JCheckBox("13");
        // Add os checkbox ao grupo de botões para permitir apenas uma seleção
        grupoRespostas1.add(resposta1);
        grupoRespostas1.add(resposta2);
        grupoRespostas1.add(resposta3);
        grupoRespostas1.add(resposta4);
        //
        // Criar um panel para colocar as respostas
        JPanel panelRespostas1 = new JPanel();
        // Setar o painel como um BoxLayout
        panelRespostas1.setLayout(new BoxLayout(panelRespostas1, BoxLayout.Y_AXIS));
        // Add ao novo painel as respotas
        panelRespostas1.add(resposta1);
        panelRespostas1.add(resposta2);
        panelRespostas1.add(resposta3);
        panelRespostas1.add(resposta4);
        //
        // Criar um botão para a proxima pergunta
        JButton butTela2 = new JButton("Próximo Desafio");
        //
        // =======================Add componentes aos cards====================
        //
        // ==========Add ao inicio==========
        inicio.add(textoInicio1);
        inicio.add(butJogo);
        //
        // ==========Add a Tela1==========
        // tela1.setLayout(new BoxLayout(tela1, BoxLayout.Y_AXIS));
        // Setar tela1 como BorderLayout
        tela1.setLayout(new BorderLayout());
        // Modificar a borda para que tenha um texto nela
        tela1.setBorder(borderTela1);
        // Add a tela1 os elementos Desafio, Respotas e Proximo desafio
        tela1.add(Quest1, BorderLayout.NORTH);
        tela1.add(panelRespostas1, BorderLayout.CENTER);
        tela1.add(butTela2, BorderLayout.SOUTH);
        // tela1.add(resposta1);
        // tela1.add(resposta2);
        // tela1.add(resposta3);
        // tela1.add(resposta4);
        //
        // ==================================Set do Frame===============================
        //
        // Definindo a função do X do frame (o número 2 fecha a janela e interrompe o
        // programa)
        this.setDefaultCloseOperation(2);
        // Medidas da janela -> posição XY e altura e largura
        this.setBounds(100, 100, 300, 300);
        // Visibilidade do JFrame verdadeira
        this.setVisible(true);
        //
        // ============================Criar ações para os botões=======================
        // ===========Botão do Inicio===========
        // Botão leva ao jogo
        butJogo.addActionListener(e -> {
            cl.next(mainPanel);
        });
        //
        // ===========Botão Primeiro Desafio===========
        // criar String para armazenar a resposta correta
        String respostaCorreta1 = "13";
        // Add um ação o botão da tela1
        butTela2.addActionListener(e -> {
            // Verificação de qual resposta (CheckBox) foi selecionada
            if (resposta1.isSelected()) {
                // Verificar se essa resposta bate qual a correta
                if (resposta1.getText().equals(respostaCorreta1)) {
                    pontos++;
                    cl.next(mainPanel);
                } else {
                    cl.next(mainPanel);
                    System.out.println("Resposta incorreta!");
                    resultado1Errado.setVisible(true);
                }
            }
        });
    }

}
