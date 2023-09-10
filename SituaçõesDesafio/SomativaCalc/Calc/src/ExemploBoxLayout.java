import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class ExemploBoxLayout extends JFrame { // SUPER SO FUNCIONA SE COLOCAR O EXTENDS DO JFRAME
    public ExemploBoxLayout() { // chamar "ctor"
        // Configgurando Layout do Frame
        super("Exemplo BoxLayout");
        BorderLayout border = new BorderLayout();
        this.setLayout(border); // border declarado na linha de cima
        // Criar dois paineis
        JPanel painel1 = new JPanel(); // painel 1 declarado
        JPanel painel2 = new JPanel(); // painel 2 declarado
        // Adicionar os paineis ao Frame
        this.add(painel1, BorderLayout.WEST); // Adiciona o painel1 no lado OESTE do BorderLayout border
        this.add(painel2, BorderLayout.SOUTH); // Adiciona o painel1 no lado SUL do BorderLayout border
        // setar layout dos Paineis
        painel1.setLayout(new BoxLayout(painel1, BoxLayout.Y_AXIS)); // Painel 1 set num BoxLayout eixo Y (Vertical)
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.X_AXIS)); // Painel 2 set num BoxLayout eixo X (Horizontal)
        // adicionar os Elementos aos Paineis
        for (int i = 0; i < 5; i++) {
            painel1.add(new JButton("" + (i + 1))); // adicionando 5 botoes painel1
            painel2.add(new JButton("" + (i + 1))); // adicionando 5 botoes painel2
        }
        // Set do Frame
        this.setDefaultCloseOperation(2);
        this.pack();
        this.setVisible(true);
    }
}
