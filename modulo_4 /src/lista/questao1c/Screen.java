package lista.questao1c;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela da Questão 1c");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        for (int i = 0; i < 5; i++) {
            JButton button = new JButton("Botão" + 1);
            frame.add(button);
        }
        frame.setVisible(true);


    }
}
