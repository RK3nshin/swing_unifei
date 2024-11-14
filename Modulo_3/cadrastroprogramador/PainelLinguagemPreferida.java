package Modulo_3.cadrastroprogramador;
import java.awt.*;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PainelLinguagemPreferida extends JPanel {

    private JCheckBox checkJava;
    private JCheckBox checkPython;
    private JCheckBox checkCplus;
    private JCheckBox checkOutras;

    public PainelLinguagemPreferida() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel labelTitulo = new JLabel("Linguagens:");

        checkJava = new JCheckBox("Java");
        checkPython = new JCheckBox("Python");
        checkCplus = new JCheckBox("C++");
        checkOutras = new JCheckBox("Outras");

        this.add(labelTitulo);
        this.add(checkJava);
        this.add(checkPython);
        this.add(checkCplus);
        this.add(checkOutras);

    }

    
}
