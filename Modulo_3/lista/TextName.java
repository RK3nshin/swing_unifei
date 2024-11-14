package Modulo_3.lista;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextName extends JPanel {

    private JTextField textField;

    public TextName() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel labelNome = new JLabel("Nome:");

        textField = new JTextField(15); 

        this.add(labelNome);
        this.add(textField);
    }

}

