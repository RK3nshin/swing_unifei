package Modulo_3.lista;

import java.awt.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class PainelNomeGeneroEnviar extends JPanel {
    private JTextField textFieldNome;
    private JRadioButton radioMasculino, radioFeminino;
    private ButtonGroup grupoSexo;
    private JButton botaoEnviar;

    public PainelNomeGeneroEnviar() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        textFieldNome = new JTextField(15); 
        JLabel labelNome = new JLabel("Nome: ");
        
        radioMasculino = new JRadioButton("Masculino");
        radioFeminino = new JRadioButton("Feminino");

        grupoSexo = new ButtonGroup();
        grupoSexo.add(radioMasculino);
        grupoSexo.add(radioFeminino);

        botaoEnviar = new JButton("Enviar");

        this.add(labelNome);
        this.add(textFieldNome);
        this.add(radioMasculino);
        this.add(radioFeminino);
        this.add(botaoEnviar);
    }
}
