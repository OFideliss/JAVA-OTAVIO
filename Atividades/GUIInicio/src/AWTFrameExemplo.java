package GUIInicio.src;

import java.awt.Frame; // chamar o awt frama

public class AWTFrameExemplo extends Frame {
    // chamar "ctor"
    public AWTFrameExemplo() {
        super("Minha Primeira Janela AWT");
        this.setSize(400, 400); // medidas do objeto da classe
        this.setVisible(true); // o objeto é visivel
    }
}
