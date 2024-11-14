package Modulo_3.cadrastroprogramador;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PainelGenero extends JPanel{
    private JRadioButton radioMasculino;
    private JRadioButton radioFeminino;
    private ButtonGroup grupoSexo;

    public PainelGenero() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        

        JLabel labelTitulo = new JLabel("Sexo:");

        radioMasculino = new JRadioButton("Masculino");
        radioFeminino = new JRadioButton("Feminino");

        grupoSexo = new ButtonGroup();
        grupoSexo.add(radioMasculino);
        grupoSexo.add(radioFeminino);

        this.add(labelTitulo);
        this.add(radioMasculino);
        this.add(radioFeminino);
    }
    
}
