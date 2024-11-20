package lista.questao2c;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Screen {
    public JPanel layout1() {
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout(10, 10)); 

        // Criando o título
        JLabel titulo = new JLabel("    Titulo do texto"); 
        painel.add(titulo, BorderLayout.NORTH);

        JTextArea areaMensagem = new JTextArea(10, 20);
       
        painel.add(new JScrollPane(areaMensagem), BorderLayout.CENTER); 

        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoCancelar = new JButton("Cancelar");
        JButton botaoVolta = new JButton("Volta");
        painelBotoes.add(botaoSalvar);
        painelBotoes.add(botaoCancelar);
        painelBotoes.add(botaoVolta);

        painel.add(painelBotoes, BorderLayout.SOUTH);

        return painel;
    }
    public static JPanel layout2() {
        JPanel central = new JPanel(new BorderLayout());
        central.add(new JButton("Autor"),BorderLayout.SOUTH);
        ImageIcon imageIcon = new ImageIcon("src/lista/questao2a/images.jpeg");
        Image image = imageIcon.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(image);

        JLabel imageLabel = new JLabel(resizedImageIcon);
        

        central.add(imageLabel,BorderLayout.CENTER);
      
        return central;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel mainPanel = new JPanel(new GridLayout(1, 2)); 
        Screen screen = new Screen();
        mainPanel.add(screen.layout1());
        mainPanel.add(screen.layout2());

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
