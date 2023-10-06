import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Exercicio2KeyEvent extends JFrame {
    // atributos
    private JPanel mainPanel;
    private JLabel letraDigitada;
    private JTextField caixaDigitacao;
    private JLabel textoDigitado;

    // Construtor ctor
    public Exercicio2KeyEvent() {
        super("Exercicio 2");
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 400, 450);
        //
        // Add painel principal -> GridLayout
        mainPanel = new JPanel(new GridLayout(4, 1));
        this.add(mainPanel);
        // Add Componentes
        letraDigitada = new JLabel(" A letra digitada é:");
        mainPanel.add(letraDigitada);
        mainPanel.add(new JLabel("Digite seu texto aqui:"));
        caixaDigitacao = new JTextField();
        mainPanel.add(caixaDigitacao);
        textoDigitado = new JLabel();
        mainPanel.add(textoDigitado);
        //
        // Setar Frame
        this.setVisible(true);
        //
        // Criar o tratamento de eventos - Handler
        Handler evt = new Handler();
        caixaDigitacao.addKeyListener(evt);
    }

    public class Handler implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            // não vou usar
        }

        @Override
        public void keyReleased(KeyEvent e) {
            textoDigitado.setText(caixaDigitacao.getText());
        }

        @Override
        public void keyTyped(KeyEvent e) {
            char teclaApertada = e.getKeyChar();
            letraDigitada.setText("A letra digitada é " + teclaApertada);
        }

    }
}
