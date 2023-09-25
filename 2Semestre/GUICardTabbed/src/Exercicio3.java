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
        JPanel painelPrincipal = new JPanel();
        this.add(painelPrincipal);
        //
        // ===================================Botões====================================
        // Criar os botões de navegação
        JButton bInicio = new JButton("Inicio"); // Botão Incio
        JButton bLogin = new JButton("Login"); // Botão Login
        JButton bCadastro = new JButton("Cadastro"); // Botão Cadastro
        //
        // ================================Card Principal===============================
        // Criar o card principal
        JPanel cardPrincipal = new JPanel(); // Card Principal onde ficara os outros cards
        CardLayout cl = new CardLayout();
        // Seta (Define) o cardPrincipal como cl, ou seja, nesse caso, um CardLayout
        cardPrincipal.setLayout(cl);
        //
        // ================================Cards========================================
        // Criar os Cards da pilha principal cardPrinciapal
        JPanel cardInicio = new JPanel();
        JPanel cardLogin = new JPanel();
        JPanel cardCadastro = new JPanel();
        //
        // ====================Adicionar botões aos cards===============================
        // Adiciona os botões do card Inicio
        cardInicio.add(bLogin);
        cardInicio.add(bCadastro);
        // Adiciona os botões do card Login
        cardLogin.add(bInicio);
        cardLogin.add(bCadastro);
        // Adiciona os botões do card Cadastro
        cardCadastro.add(bInicio);
        cardCadastro.add(bLogin);
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
        // Botão leva ao inciio
        bInicio.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Inicio");
        });
        // Botão leva ao login
        bLogin.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Login");
        });
        // Botão leva ao cadastro
        bCadastro.addActionListener(e -> {
            cl.show(cardPrincipal, "Card Cadastro");
        });
    }

}
