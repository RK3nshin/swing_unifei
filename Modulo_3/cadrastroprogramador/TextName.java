package Modulo_3.cadrastroprogramador;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextName extends JPanel {

    private JTextField textField;

    public TextName( String texto) {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel labelNome = new JLabel(texto);

        textField = new JTextField(15); 

        this.add(labelNome);
        this.add(textField);
    }

  

}

