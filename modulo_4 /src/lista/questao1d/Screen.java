package lista.questao1d;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Screen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela da Questão 1d");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        // Adicionar botões ao painel
        for (int i = 1; i <= 5; i++)  {
            JButton button = new JButton("Botão " + i);
            button.setAlignmentX(Component.CENTER_ALIGNMENT); 
            panel.add(button);
        }

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
