package lista.questao2a;

import javax.swing.*;
import java.awt.*;

public class Screen {
    public static JPanel createLayout1() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setSize(400,600);
        String mensagem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the.";
        panel.add(new JButton("Titulo"), BorderLayout.NORTH);
        panel.add(new JButton("Rodapé"), BorderLayout.SOUTH);

        ImageIcon imageIcon = new ImageIcon("src/lista/questao2a/images.jpeg");
        Image image = imageIcon.getImage().getScaledInstance(100, 300, Image.SCALE_SMOOTH);
        ImageIcon imagemMenor = new ImageIcon(image);

        JLabel imageLabelEast = new JLabel(imagemMenor);
        panel.add(imageLabelEast, BorderLayout.EAST);
        panel.add(imageLabelEast, BorderLayout.WEST);

        JLabel labelMensagem = new JLabel("<html>" + mensagem.replaceAll("\n", "<br>") + "</html>");
        labelMensagem.setHorizontalAlignment(JLabel.CENTER);
        panel.add(labelMensagem, BorderLayout.CENTER);

        return panel;
    }

    public static JPanel createLayout2() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        panel.setSize(400,600);
        for (int i = 1; i <= 4; i++) {
            JPanel panelLine = new JPanel();
            panelLine.setLayout(new FlowLayout(FlowLayout.LEFT));
            JLabel labelNome = new JLabel("Campo " + i);
            JTextField textField = new JTextField(15);
        
            panelLine.add(labelNome);
            panelLine.add(textField);
        
            panel.add(panelLine);
        }
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton salvarButton = new JButton("Salvar");
        salvarButton.setPreferredSize(new Dimension(250, 150)); 
        buttonPanel.add(salvarButton);
        
        panel.add(buttonPanel);
        
        return panel;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Combinação de Layouts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2)); 
        mainPanel.add(createLayout2());
        mainPanel.add(createLayout1());
       

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
