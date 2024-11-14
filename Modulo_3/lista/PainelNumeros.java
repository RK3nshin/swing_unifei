package Modulo_3.lista;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class PainelNumeros  extends  JPanel{

    public PainelNumeros(){
        String[] numerosPorExtenso = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"};

        JComboBox<String> comboBox = new JComboBox<>(numerosPorExtenso);

        this.setLayout(new FlowLayout());
    

        this.add(comboBox);
    }
       
}
