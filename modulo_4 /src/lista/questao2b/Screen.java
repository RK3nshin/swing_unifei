package lista.questao2b;

import java.awt.*;
import javax.swing.*;

public class Screen {
    public static JPanel layoutInterno() {
        JPanel central = new JPanel(new BorderLayout());
        central.add(new JButton("Titulo"),BorderLayout.NORTH);
        central.add(new JButton("Autor"),BorderLayout.SOUTH);
        central.add(new JButton("Postagem"),BorderLayout.CENTER);
      
        return central;
    }

    public static JFrame createMainLayout() {
        JFrame frame = new JFrame("Tela da questão 2b");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        frame.setLayout(new BorderLayout());

        frame.add(new JButton("Título"), BorderLayout.NORTH);
        frame.add(new JButton("Rodapé"), BorderLayout.SOUTH);
        frame.add(new JButton("<html>Cliente<br>Produtos<br>Vendas<br>Arquivos</html>"), BorderLayout.EAST);
        frame.add(new JButton("Area para propaganda"), BorderLayout.WEST);

        JPanel centralPanel = new JPanel(new GridLayout(2, 2));

        for (int i = 0; i < 4; i++) {
            centralPanel.add(layoutInterno());
        }

        frame.add(centralPanel, BorderLayout.CENTER);

        frame.setVisible(true);
        return frame;
    }

    public static void main(String[] args) {
        createMainLayout();
    }
}
