import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AgendaUsuario extends JPanel {
    private JTextField inputUsuario;
    private JTextField inputData;
    private JTextField inputHora;
    private JTextField inputDescricao;
    private DefaultTableModel tableModel;
    private JTable table;
    private List<Agenda> agendas = new ArrayList<>();
    private int linhaSelecionada = -1;

    public AgendaUsuario() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nome");
        tableModel.addColumn("Data");
        tableModel.addColumn("Hora");
        tableModel.addColumn("Descricao");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        inputUsuario = new JTextField(20);
        inputData = new JTextField(5);
        inputHora = new JTextField(5);
        inputDescricao = new JTextField(20);
        JButton agendarButton = new JButton("Agendar");
        JButton atualizarButton = new JButton("Atualizar");
        JButton apagarButton = new JButton("Apagar");
        JButton apagarTodosButton = new JButton("Apagar Todos");
        JButton salvarButton = new JButton("Salvar");

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Data:"));
        inputPanel.add(inputData);
        inputPanel.add(new JLabel("Hora:"));
        inputPanel.add(inputHora);
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(inputUsuario);
        inputPanel.add(new JLabel("Descriçao:"));
        inputPanel.add(inputDescricao);
        inputPanel.add(agendarButton);
        inputPanel.add(atualizarButton);
        inputPanel.add(apagarButton);
        inputPanel.add(apagarTodosButton);
        inputPanel.add(salvarButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        File arquivo = new File("dadosAgenda.txt");
        if (arquivo.exists()) {
            agendas = Serializacao.deserializar1("dadosAgenda.txt");
            atualizarTabela();
        }

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                linhaSelecionada = table.rowAtPoint(evt.getPoint());
                if (linhaSelecionada != -1) {
                    inputUsuario.setText((String) table.getValueAt(linhaSelecionada, 0));
                    inputData.setText(table.getValueAt(linhaSelecionada, 1).toString());
                }
            }
        });

        AgendaOperacoes operacoes = new AgendaOperacoes(agendas, tableModel, table);

        agendarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.agendarUsuario(inputUsuario.getText(), inputData.getText(), inputHora.getText(),
                        inputDescricao.getText());
                inputUsuario.setText("");
                inputData.setText("");
                inputHora.setText("");
                inputDescricao.setText("");
            }
        });

        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.atualizarAgenda(linhaSelecionada, inputUsuario.getText(), inputData.getText(),
                        inputHora.getText(), inputDescricao.getText());
            }
        });

        apagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarHorario(linhaSelecionada);
            }
        });

        apagarTodosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.apagarTodosHorarios();
            }
        });

        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operacoes.salvarHorario();
            }
        });
    }

    private void atualizarTabela() {
        tableModel.setRowCount(0);
        for (Agenda agendas : agendas) {
            tableModel.addRow(new Object[] { agendas.getUsuario(), agendas.getData(), agendas.getHora(),
                    agendas.getDescricao() });
        }
    }

}