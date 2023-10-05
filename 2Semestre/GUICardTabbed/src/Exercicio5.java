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
        JButton butTela1 = new JButton("Próximo Desafio");
        //
        // =========Componentes Tela2===========
        // Criar um BorderFactory
        Border borderTela2 = BorderFactory.createTitledBorder("Segundo Desafio");
        // Criar pergunta 
        // colocar html no texto do JLabel deixa o texto responsivo
        JLabel Quest2 = new JLabel("<html>Em que ano a seleção brasileira de futebol foi campeã pela primeira vez da copa do mundo?</html>");
        // Criar um grupo de botões para os checkbox
        // Isso serve para permitir apenas uma seleção
        ButtonGroup grupoRespostas2 = new ButtonGroup();
        // Criar CheckBox para as possiveis respotas
        JCheckBox resposta5 = new JCheckBox("1970");
        JCheckBox resposta6 = new JCheckBox("2002");
        JCheckBox resposta7 = new JCheckBox("1958");
        JCheckBox resposta8 = new JCheckBox("1962");
        // Add os checkbox ao grupo de botões para permitir apenas uma seleção
        grupoRespostas2.add(resposta5);
        grupoRespostas2.add(resposta6);
        grupoRespostas2.add(resposta7);
        grupoRespostas2.add(resposta8);
        //
        // Criar um panel para colocar as respostas
        JPanel panelRespostas2 = new JPanel();
        // Setar o painel como um BoxLayout
        panelRespostas2.setLayout(new BoxLayout(panelRespostas2, BoxLayout.Y_AXIS));
        // Add ao novo painel as respotas
        panelRespostas2.add(resposta5);
        panelRespostas2.add(resposta6);
        panelRespostas2.add(resposta7);
        panelRespostas2.add(resposta8);
        //
        // Criar um botão para a proxima pergunta
        JButton butTela2 = new JButton("Próximo Desafio");
        //
        // =========Componentes Tela3===========
        // Criar um BorderFactory
        Border borderTela3 = BorderFactory.createTitledBorder("Terceiro Desafio");
        // Criar pergunta
        JLabel Quest3 = new JLabel("<html>Pode um peixe vivo viver fora d'agua fria?</html>");
        // Criar um grupo de botões para os checkbox
        // Isso serve para permitir apenas uma seleção
        ButtonGroup grupoRespostas3 = new ButtonGroup();
        // Criar CheckBox para as possiveis respotas
        JCheckBox resposta9 = new JCheckBox("Sim");
        JCheckBox resposta10 = new JCheckBox("Não");
        JCheckBox resposta11 = new JCheckBox("Depende");
        JCheckBox resposta12 = new JCheckBox("Faz o L");
        // Add os checkbox ao grupo de botões para permitir apenas uma seleção
        grupoRespostas3.add(resposta9);
        grupoRespostas3.add(resposta10);
        grupoRespostas3.add(resposta11);
        grupoRespostas3.add(resposta12);
        //
        // Criar um panel para colocar as respostas
        JPanel panelRespostas3 = new JPanel();
        // Setar o painel como um BoxLayout
        panelRespostas3.setLayout(new BoxLayout(panelRespostas3, BoxLayout.Y_AXIS));
        // Add ao novo painel as respotas
        panelRespostas3.add(resposta9);
        panelRespostas3.add(resposta10);
        panelRespostas3.add(resposta11);
        panelRespostas3.add(resposta12);
        //
        // Criar um botão para a proxima pergunta
        JButton butTela3 = new JButton("Próximo Desafio");
        //
        //
        // =========Componentes Tela4===========
        // Criar um BorderFactory
        Border borderTela4 = BorderFactory.createTitledBorder("Quarto Desafio");
        // Criar pergunta
        JLabel Quest4 = new JLabel("<html>Onde foi a copa do mundo de 2006?</html>");
        // Criar um grupo de botões para os checkbox
        // Isso serve para permitir apenas uma seleção
        ButtonGroup grupoRespostas4 = new ButtonGroup();
        // Criar CheckBox para as possiveis respotas
        JCheckBox resposta13 = new JCheckBox("México");
        JCheckBox resposta14 = new JCheckBox("Itália");
        JCheckBox resposta15 = new JCheckBox("França");
        JCheckBox resposta16 = new JCheckBox("Alemanha");
        // Add os checkbox ao grupo de botões para permitir apenas uma seleção
        grupoRespostas4.add(resposta13);
        grupoRespostas4.add(resposta14);
        grupoRespostas4.add(resposta15);
        grupoRespostas4.add(resposta16);
        //
        // Criar um panel para colocar as respostas
        JPanel panelRespostas4 = new JPanel();
        // Setar o painel como um BoxLayout
        panelRespostas4.setLayout(new BoxLayout(panelRespostas4, BoxLayout.Y_AXIS));
        // Add ao novo painel as respotas
        panelRespostas4.add(resposta13);
        panelRespostas4.add(resposta14);
        panelRespostas4.add(resposta15);
        panelRespostas4.add(resposta16);
        //
        // Criar um botão para a proxima pergunta
        JButton butTela4 = new JButton("Próximo Desafio");
        //
        //
        // =========Componentes Tela5===========
        // Criar um BorderFactory
        Border borderTela5 = BorderFactory.createTitledBorder("Ultimo Desafio");
        // Criar pergunta
        JLabel Quest5 = new JLabel("Quem colocou fogo em roma?");
        // Criar texto para acertou/errou
        // Criar um grupo de botões para os checkbox
        // Isso serve para permitir apenas uma seleção
        ButtonGroup grupoRespostas5 = new ButtonGroup();
        // Criar CheckBox para as possiveis respotas
        JCheckBox resposta17 = new JCheckBox("Júlio Cesar");
        JCheckBox resposta18 = new JCheckBox("Nero");
        JCheckBox resposta19 = new JCheckBox("Constantino");
        JCheckBox resposta20 = new JCheckBox("Cláudio");
        // Add os checkbox ao grupo de botões para permitir apenas uma seleção
        grupoRespostas5.add(resposta17);
        grupoRespostas5.add(resposta18);
        grupoRespostas5.add(resposta19);
        grupoRespostas5.add(resposta20);
        //
        // Criar um panel para colocar as respostas
        JPanel panelRespostas5 = new JPanel();
        // Setar o painel como um BoxLayout
        panelRespostas5.setLayout(new BoxLayout(panelRespostas5, BoxLayout.Y_AXIS));
        // Add ao novo painel as respotas
        panelRespostas5.add(resposta17);
        panelRespostas5.add(resposta18);
        panelRespostas5.add(resposta19);
        panelRespostas5.add(resposta20);
        //
        // Criar um botão para a proxima pergunta
        JButton butTela5 = new JButton("Finalizar O Jogo");
        //
        // =========Componentes Pontuação Tela6===========
        // Criar um BorderFactory
        Border borderTela6 = BorderFactory.createTitledBorder("Pontuação");
        // Criar pergunta
        JLabel Quest6 = new JLabel("Você fez 0 pontos no total");
        // Criar um botão para a proxima pergunta
        JButton butTela6 = new JButton("Reiniciar O Jogo");
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
        tela1.add(butTela1, BorderLayout.SOUTH);
        // tela1.add(resposta1);
        // tela1.add(resposta2);
        // tela1.add(resposta3);
        // tela1.add(resposta4);
        //
        // ==========Add a Tela2==========
        // tela1.setLayout(new BoxLayout(tela1, BoxLayout.Y_AXIS));
        // Setar tela2 como BorderLayout
        tela2.setLayout(new BorderLayout());
        // Modificar a borda para que tenha um texto nela
        tela2.setBorder(borderTela2);
        // Add a tela2 os elementos Desafio, Respotas e Proximo desafio
        tela2.add(Quest2, BorderLayout.NORTH);
        tela2.add(panelRespostas2, BorderLayout.CENTER);
        tela2.add(butTela2, BorderLayout.SOUTH);
        // tela2.add(resposta1);
        // tela2.add(resposta2);
        // tela2.add(resposta3);
        // tela2.add(resposta4);
        //
        // ==========Add a Tela3==========
        // tela1.setLayout(new BoxLayout(tela1, BoxLayout.Y_AXIS));
        // Setar tela1 como BorderLayout
        tela3.setLayout(new BorderLayout());
        // Modificar a borda para que tenha um texto nela
        tela3.setBorder(borderTela3);
        // Add a tela3 os elementos Desafio, Respotas e Proximo desafio
        tela3.add(Quest3, BorderLayout.NORTH);
        tela3.add(panelRespostas3, BorderLayout.CENTER);
        tela3.add(butTela3, BorderLayout.SOUTH);
        // tela1.add(resposta1);
        // tela1.add(resposta2);
        // tela1.add(resposta3);
        // tela1.add(resposta4);
        //
        // ==========Add a Tela4==========
        // tela1.setLayout(new BoxLayout(tela1, BoxLayout.Y_AXIS));
        // Setar tela1 como BorderLayout
        tela4.setLayout(new BorderLayout());
        // Modificar a borda para que tenha um texto nela
        tela4.setBorder(borderTela4);
        // Add a tela4 os elementos Desafio, Respotas e Proximo desafio
        tela4.add(Quest4, BorderLayout.NORTH);
        tela4.add(panelRespostas4, BorderLayout.CENTER);
        tela4.add(butTela4, BorderLayout.SOUTH);
        // tela1.add(resposta1);
        // tela1.add(resposta2);
        // tela1.add(resposta3);
        // tela1.add(resposta4);
        //
        // ==========Add a Tela5==========
        // tela1.setLayout(new BoxLayout(tela1, BoxLayout.Y_AXIS));
        // Setar tela1 como BorderLayout
        tela5.setLayout(new BorderLayout());
        // Modificar a borda para que tenha um texto nela
        tela5.setBorder(borderTela5);
        // Add a tela5 os elementos Desafio, Respotas e Proximo desafio
        tela5.add(Quest5, BorderLayout.NORTH);
        tela5.add(panelRespostas5, BorderLayout.CENTER);
        tela5.add(butTela5, BorderLayout.SOUTH);
        // tela1.add(resposta1);
        // tela1.add(resposta2);
        // tela1.add(resposta3);
        // tela1.add(resposta4);
        //
        // ==========Add a Pontuação Tela6==========
        // tela1.setLayout(new BoxLayout(tela1, BoxLayout.Y_AXIS));
        // Setar tela1 como BorderLayout
        pontuacao.setLayout(new BorderLayout());
        // Modificar a borda para que tenha um texto nela
        pontuacao.setBorder(borderTela6);
        // Add a tela1 os elementos Desafio, Respotas e Proximo desafio
        pontuacao.add(Quest6, BorderLayout.NORTH);
        //tela1.add(panelRespostas1, BorderLayout.CENTER);
        pontuacao.add(butTela6, BorderLayout.SOUTH);
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
        butTela1.addActionListener(e -> {
            // Verificação de qual resposta (CheckBox) foi selecionada
            if (resposta4.isSelected()) {
                // Verificar se essa resposta bate qual a correta
                if (resposta4.getText().equals(respostaCorreta1)) {
                    pontos++;
                } 
            }
            Quest6.setText("Você fez " + pontos + " pontos no total");
            cl.next(mainPanel);
        });
        // ===========Botão Segundo Desafio===========
        // criar String para armazenar a resposta correta
        String respostaCorreta2 = "1958";
        // Add um ação o botão da tela2
        butTela2.addActionListener(e -> {
            // Verificação de qual resposta (CheckBox) foi selecionada
            if (resposta7.isSelected()) {
                // Verificar se essa resposta bate qual a correta
                if (resposta7.getText().equals(respostaCorreta2)) {
                    pontos++;
                } 
            }
            Quest6.setText("Você fez " + pontos + " pontos no total");
            cl.next(mainPanel);
        });
        // ===========Botão Terceiro Desafio===========
        // criar String para armazenar a resposta correta
        String respostaCorreta3 = "Faz o L";
        // Add um ação o botão da tela1
        butTela3.addActionListener(e -> {
            // Verificação de qual resposta (CheckBox) foi selecionada
            if (resposta12.isSelected()) {
                // Verificar se essa resposta bate qual a correta
                if (resposta12.getText().equals(respostaCorreta3)) {
                    pontos++;
                } 
            }
            Quest6.setText("Você fez " + pontos + " pontos no total");
            cl.next(mainPanel);
        });
        // ===========Botão Quarto Desafio===========
        // criar String para armazenar a resposta correta
        String respostaCorreta4 = "Alemanha";
        // Add um ação o botão da tela1
        butTela4.addActionListener(e -> {
            // Verificação de qual resposta (CheckBox) foi selecionada
            if (resposta16.isSelected()) {
                // Verificar se essa resposta bate qual a correta
                if (resposta16.getText().equals(respostaCorreta4)) {
                    pontos++;
                } 
            }
            Quest6.setText("Você fez " + pontos + " pontos no total");
            cl.next(mainPanel);
        });
        // ===========Botão Ultimo Desafio===========
        // criar String para armazenar a resposta correta
        String respostaCorreta5 = "Nero";
        // Add um ação o botão da tela1
        butTela5.addActionListener(e -> {
            // Verificação de qual resposta (CheckBox) foi selecionada
            if (resposta18.isSelected()) {
                // Verificar se essa resposta bate qual a correta
                if (resposta18.getText().equals(respostaCorreta5)) {
                    pontos++;
                } 
            }
            Quest6.setText("Você fez " + pontos + " pontos no total");
            cl.next(mainPanel);
        });
    }

}
