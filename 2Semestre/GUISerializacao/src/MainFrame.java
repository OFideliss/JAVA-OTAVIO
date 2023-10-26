import java.awt.desktop.AppEvent;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("App");
        setDefaultCloseOperation(2);
        JTabbedPane abas = new JTabbedPane();
        abas.addTab("Casatro de Usuarios", new CadastroUsuarios());
        abas.addTab("Agendamento de Usuarios", new AgendaUsuario());
        add(abas);
    }

    public void run() {
        pack();
        setVisible(true);
    }
}
