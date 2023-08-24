package GUIInicio.src;

import javax.swing.JFrame;
import javax.swing.plaf.TreeUI;

public class SwingJFrameExemplo extends JFrame {
    // chamar "ctor"
    public SwingJFrameExemplo() {
        super("Minha primeira janela de Swing");
        this.setSize(400, 400); // medidas do objeto
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fechar meu programa quando fechar a janela
        this.setVisible(true); // torna visivel
    }
}
