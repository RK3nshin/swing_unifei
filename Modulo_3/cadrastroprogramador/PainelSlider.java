package Modulo_3.cadrastroprogramador;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class PainelSlider  extends JPanel{
    public PainelSlider() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        JSlider slider = new JSlider(0, 3, 0);
        slider.setMajorTickSpacing(1);  // Marca principal a cada 1
        slider.setMinorTickSpacing(1);  // Marca secundária a cada 1
        slider.setPaintTicks(true);     
        slider.setPaintLabels(true);   

        // Criação do JLabel para exibir o valor do JSlider
        JLabel label = new JLabel("Nivel de conhecimento em teste de software");

      
        this.add(label);
        this.add(slider);
        
    }
}
