package GUIInicio.src;

import javax.swing.JOptionPane;

public class JOptionPaneExemplo extends JOptionPane {
    public JOptionPaneExemplo() {
        super();
        String informacao = "Minha janela Informação";
        this.showMessageDialog(getComponentPopupMenu(), informacao, informacao,3);
    }
}
