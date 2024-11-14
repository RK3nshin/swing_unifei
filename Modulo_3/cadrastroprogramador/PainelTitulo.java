package Modulo_3.cadrastroprogramador;

import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelTitulo extends  JPanel {
     public PainelTitulo(String titulo) {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel labelTitulo = new JLabel(titulo);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 18)); 
        this.add(labelTitulo);
    }
}
