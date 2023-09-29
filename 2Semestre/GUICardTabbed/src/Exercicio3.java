import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class Exercicio3 extends JFrame {
    // Chamar o ctor
    public Exercicio3() {
        super("Exercicio 3");
        //
        // ================================Card Principal============================
        // criar um Painel Principal -> CardLayout
        JPanel mainCard = new JPanel();
        CardLayout cl = new CardLayout();
        // Seta (Define) o mainCard como cl, ou seja, nesse caso, um CardLayout
        mainCard.setLayout(cl);
        // add painel principal (mainCard) ao frame
        this.add(mainCard);
        //
        // ================================Cards========================================
        // Criar os Cards da pilha principal mainCard
        JPanel cardInicio = new JPanel();
        JPanel cardLogin = new JPanel();
        JPanel cardCadastro = new JPanel();
        //
        // ====================Adicionar os cards ao mainCard=====================
        // Add os card a pilha principal de cards
        mainCard.add(cardInicio, "Card Inicio"); // add o card incio
        mainCard.add(cardLogin, "Card Login"); // add o card login
        mainCard.add(cardCadastro, "Card Cadastro"); // add o card cadastro
        //
        // ===================================Botões====================================
        // Foi necessário criar botões especifico para cada card, pois não é possivel
        // adicionar o mesmo botão a cards diferentes
        // ==========Criar os botões de navegação para o cardInicio==========
        JButton bLoginCardInicio = new JButton("Login"); // Botão Login
        JButton bCadastroCardInicio = new JButton("Cadastro"); // Botão Cadastro
        // ==========Criar os botões de navegação para o cardLogin==========
        JButton bInicioCardLogin = new JButton("Inicio"); // Botão Incio
        JButton bCadastroCardLogin = new JButton("Cadastro"); // Botão Cadastro
        // ==========Criar os botões de navegação para o cardCadastro==========
        JButton bInicioCardCadastro = new JButton("Inicio"); // Botão Incio
        JButton bLoginCardCadastro = new JButton("Login"); // Botão Login
        //
        // ====================Criar componentes dos cards==============================
        // Componentes do cardInicio
        JLabel TextoCardInicio = new JLabel("Tela Inicial - Seja Bem-Vindo"); // texto da pagina Inicio
        JLabel TextoCardLogin = new JLabel("Tela de Login - Faça seu Login"); // texto da pagina Login
        JLabel TextoCardCadastro = new JLabel("Tela de Cadastro - Faça seu cadastro"); // texto da pagina Cadastro
        // ====================Add componentes aos cards==============================
        // Adiciona os componentes dao card Inicio
        cardInicio.add(TextoCardInicio); // add ao Inicio
        cardLogin.add(TextoCardLogin); // add ao Login
        cardCadastro.add(TextoCardCadastro);// add ao Cadastro
        //
        //
        // ====================Adicionar botões aos cards===============================
        // Adiciona os botões do card Inicio
        cardInicio.add(bLoginCardInicio);
        cardInicio.add(bCadastroCardInicio);
        // Adiciona os botões do card Login
        cardLogin.add(bInicioCardLogin);
        cardLogin.add(bCadastroCardLogin);
        // Adiciona os botões do card Cadastro
        cardCadastro.add(bInicioCardCadastro);
        cardCadastro.add(bLoginCardCadastro);
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
        // ===========Botões do cardInicio===========
        // Botão leva ao inicio
        bLoginCardInicio.addActionListener(e -> {
            cl.show(mainCard, "Card Login");
        });
        // Botão leva ao cadastro
        bCadastroCardInicio.addActionListener(e -> {
            cl.show(mainCard, "Card Cadastro");
        });
        // ===========Botões do cardLogin===========
        // Botão leva ao Inicio
        bInicioCardLogin.addActionListener(e -> {
            cl.show(mainCard, "Card Inicio");
        });
        // Botão leva ao cadastro
        bCadastroCardLogin.addActionListener(e -> {
            cl.show(mainCard, "Card Cadastro");
        });
        // ===========Botões do cardCadastro===========
        // Botão leva ao inicio
        bInicioCardCadastro.addActionListener(e -> {
            cl.show(mainCard, "Card Inicio");
        });
        // Botão leva ao login
        bLoginCardCadastro.addActionListener(e -> {
            cl.show(mainCard, "Card Login");
        });
    }

}
