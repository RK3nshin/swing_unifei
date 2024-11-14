package Modulo_3.lista;
import java.awt.*;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PainelCorPreferida extends JPanel {

    private JCheckBox checkAzul;
    private JCheckBox checkAmarelo;
    private JCheckBox checkVerde;

    public PainelCorPreferida() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel labelTitulo = new JLabel("Cor preferida:");

        checkAzul = new JCheckBox("Azul");
        checkAmarelo = new JCheckBox("Amarelo");
        checkVerde = new JCheckBox("Verde");

        this.add(labelTitulo);
        this.add(checkAzul);
        this.add(checkAmarelo);
        this.add(checkVerde);
    }

    
}
