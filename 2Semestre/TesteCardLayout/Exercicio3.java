import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Exercicio3 extends JFrame {
    // Chamar o ctor
    public Exercicio3() {
        super("Exercicio 3");
        //
        // add o painel principal
        JPanel painelPrincipal = new JPanel(new BorderLayout());
        this.add(painelPrincipal);
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
        JButton bLoginCardCadastro = new JButton("Login"); // Botão Cadastro
        //
        // ================================Card Principal===============================
        // Criar o card principal
        JPanel cardPrincipal = new JPanel(); // Card Principal onde ficara os outros cards
        CardLayout cl = new CardLayout();
        // Seta (Define) o cardPrincipal como cl, ou seja, nesse caso, um CardLayout
        cardPrincipal.setLayout(cl);
        //
        // ================================Cards========================================
        // Criar os Cards da pilha principal cardPrincipal
        JPanel cardInicio = new JPanel();
        JPanel cardLogin = new JPanel();
        JPanel cardCadastro = new JPanel();
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
        // ====================Adicionar os cards ao cardPrincipal=====================
        // Add os card a pilha principal de cards
        cardPrincipal.add(cardInicio, "Card Inicio"); // add o card incio
        cardPrincipal.add(cardLogin, "Card Login"); // add o card login
        cardPrincipal.add(cardCadastro, "Card Cadastro"); // add o card cadastro
        //
        // ==================Adicionar o cardPrincipal ao painelPrincipal===============
        // Add o cardPrincipal ao painel
        painelPrincipal.add(cardPrincipal);
        //
        // ==================================Set do Frame===============================
        //
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //
        // ============================Criar ações para os botões=======================
        //
        // ===========Botões do cardInicio===========
        // Botão leva ao inicio
        bLoginCardInicio.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Login");
        });
        // Botão leva ao cadastro
        bCadastroCardInicio.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Cadastro");
        });
        // ===========Botões do cardLogin===========
        // Botão leva ao Inicio
        bInicioCardLogin.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Inicio");
        });
        // Botão leva ao cadastro
        bCadastroCardLogin.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Cadastro");
        });
        // ===========Botões do cardCadastro===========
        // Botão leva ao inicio
        bInicioCardCadastro.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Inicio");
        });
        // Botão leva ao login
        bLoginCardCadastro.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Login");
        });
    }

}

