package Modulo_3.cadrastroprogramador;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelAreas extends JPanel {

    public PainelAreas() {
        String[] areas = {"Back-end", "Front-end"};
        JComboBox<String> comboBox = new JComboBox<>(areas);

        JLabel labelTipo = new JLabel("Tipo:");

        this.setLayout(new FlowLayout());

        this.add(labelTipo);
        this.add(comboBox);
    }
}
