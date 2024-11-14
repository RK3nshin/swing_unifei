package Modulo_3.cadrastroprogramador;

import java.awt.*;
import javax.swing.*;

public class PainelBotaoEnviar extends JPanel {
    public PainelBotaoEnviar() {
        JButton btnEnviar = new JButton("Enviar");

        btnEnviar.setIcon(UIManager.getIcon("FileView.fileIcon"));

        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.add(btnEnviar);
    }
}
