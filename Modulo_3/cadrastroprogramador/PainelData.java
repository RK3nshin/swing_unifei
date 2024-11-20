package Modulo_3.cadrastroprogramador;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;


public class PainelData  extends JPanel{
     public PainelData() {
        
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        // Spinner para o dia (números de 1 a 31)
        SpinnerNumberModel modelDia = new SpinnerNumberModel(1, 1, 31, 1);
        
        JSpinner spinnerDia = new JSpinner(modelDia);

        // Spinner para o mês (nomes dos meses)
        SpinnerListModel modelMes = new SpinnerListModel(
            new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", 
                        "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"});
        JSpinner spinnerMes = new JSpinner(modelMes);

        // Spinner para o ano (exemplo de anos de 2023 a 2030)
        SpinnerNumberModel modelAno = new SpinnerNumberModel(2023, 2023, 2030, 1);
        JSpinner spinnerAno = new JSpinner(modelAno);

        this.add(spinnerDia);
        this.add(spinnerMes);
        this.add(spinnerAno);
    }
}
