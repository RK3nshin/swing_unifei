package lista.questao1a;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



public class Screen{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela da Questão 1a");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        String nomes[] = {"Um","Dois","Três","Quatro"};
        for (String nome : nomes) {
            JButton button = new JButton(nome);
            frame.add(button);
        }
        frame.setVisible(true);
    }


}