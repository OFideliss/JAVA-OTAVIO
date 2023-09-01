package GUIInicio.src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JButtonAndJLabel {

    // Adicione a variável para contar cliques // Atributos
    int cont = 0;

    public JButtonAndJLabel() {
        // Criar um JFrame - Janela Básica para uma aplicação
        JFrame janela = new JFrame("Janela Principal");
        JPanel painel = new JPanel(); // Painel(container)
        // Adicionar o painel ao frame
        janela.getContentPane().add(painel);

        // Criar Componentes
        JButton button = new JButton("Clique Aqui!!!");
        JLabel text = new JLabel("Esperando clicar"); // Inicializar o contador

        // Adicionar os componentes ao painel
        painel.add(button);
        painel.add(text);

        // Configurações da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack(); // Organizar o tamanho da janela
        janela.setVisible(true);

        // Adicionar um ouvinte de eventos ao botão //Ação para o botão
        button.addActionListener(e -> {
            // Incrementar o contador de cliques
            cont++;
            text.setText("Nº de cliques: " + cont); // Atualizar o texto do JLabel

            // Adicionar um novo Botão
            painel.add(new JButton("" + cont));
            janela.pack();
        });

    }
}
