package Modulo_3.lista;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaPanel extends JPanel {
    private JTextArea textArea;

    public TextAreaPanel(int rows, int columns) {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        String label = "Faça resumo de suas atividades profissionais: ";
        JLabel labelDescricao = new JLabel(label);

        textArea = new JTextArea(rows, columns);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setPreferredSize(new java.awt.Dimension(columns * 10, rows * 20));  

        this.add(labelDescricao);
        this.add(new JScrollPane(textArea)); 
    }
}
