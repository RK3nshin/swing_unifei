package lista.questao1b;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Screen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela da Questão 2a");
        frame.setSize(500,500);
        frame.add(new JButton("Norte"),BorderLayout.NORTH);
        frame.add(new JButton("Sul"),BorderLayout.SOUTH);
        frame.add(new JButton("Leste"),BorderLayout.EAST);
        frame.add(new JButton("Oeste"),BorderLayout.WEST);
        frame.add(new JButton("Centro"),BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
