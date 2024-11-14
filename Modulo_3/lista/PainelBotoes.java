package Modulo_3.lista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelBotoes  extends JPanel {
     public PainelBotoes() {
        // Configura o layout para os botões serem alinhados horizontalmente
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        

        // Criação dos botões
        JButton botaoCancelar = new JButton("Cancelar");
        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoEnviar = new JButton("Enviar");

        // Adiciona os botões ao painel
        this.add(botaoCancelar);
        this.add(botaoSalvar);
        this.add(botaoEnviar);
    }
}
