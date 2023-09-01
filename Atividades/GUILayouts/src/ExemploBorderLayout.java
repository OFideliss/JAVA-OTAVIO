import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploBorderLayout {
    public ExemploBorderLayout() {
        super();
        JFrame janelaP = new JFrame("Janela Principal");
        // mudando o Layout do JFrame para BorderLayout
        BorderLayout border = new BorderLayout();
        janelaP.setLayout(border);
        janelaP.add(new JButton("West"), BorderLayout.WEST);
        janelaP.add(new JButton("East"), BorderLayout.EAST);
        janelaP.add(new JButton("Center"), BorderLayout.CENTER);
        janelaP.add(new JButton("North"), BorderLayout.NORTH);
        janelaP.add(new JButton("South"), BorderLayout.SOUTH);
        // Set JFrame
        janelaP.setDefaultCloseOperation(1);
        janelaP.pack();
        janelaP.setVisible(true);
    }
}
