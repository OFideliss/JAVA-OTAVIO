import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio1 extends JFrame {
    //
    // chamar o construtor "ctor"
    public Exercicio1() {
        super();
        // add painel principal
        JPanel painelPrincipal = new JPanel();
        // Botão para trocar de card
        JButton botaoTrocar = new JButton("Próximo Card");
        // add o Botão ao painel principal
        painelPrincipal.add(botaoTrocar);
        //
        // Criar os cards
        JPanel cardPrincipal = new JPanel(); // Card Principal
        CardLayout cl = new CardLayout();
        // Seta (Define) o cardPrincipal como cl, ou seja, nesse caso, um CardLayout
        cardPrincipal.setLayout(cl);
        //
        // Criar os cards da pilha cardPrinciapl
        JPanel card1 = new JPanel(); // Primeiro Card
        // Add ao card1 um JLabel com um texto
        card1.add(new JLabel("Algum texto aleatorio ai não sei estou sem ideia"));
        JPanel card2 = new JPanel(); // Segundo Card
        // Add ao card2 um JButton com um texto
        card2.add(new JButton("Um botão sem importancia"));
        JPanel card3 = new JPanel(); // Terceiro Card
        // Add ao card3 um JTextField com um texto
        card3.add(new JTextField("Agora estou sem ideia", 20));
        //
        // Add os card a pilha principal de cards
        cardPrincipal.add(card1); // add o card1
        cardPrincipal.add(card2); // add o card2
        cardPrincipal.add(card3); // add o card3
        //
        // Add o cardPrincipal ao painel 
        painelPrincipal.add(cardPrincipal);
        this.add(painelPrincipal);
        //
        // Set do frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 300);
        this.setVisible(true);
        //
        //Criar a ação para o botão
        botaoTrocar.addActionListener(e -> { //Quando for um botão tem que ser um ActionListner
            cl.previous(cardPrincipal);
          });

    }
}
