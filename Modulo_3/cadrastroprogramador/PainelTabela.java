package Modulo_3.cadrastroprogramador;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PainelTabela  extends  JPanel{
    public PainelTabela() {
        String[][] dados = {
            {"Java Spring", "React"},
            {"Python Rest API", "Vue.js"},

        };

        String[] colunas = {"Back-end", "Front-end"};

        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);

        // Criar a JTable com o modelo
        JTable tabela = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabela);

        this.setLayout(new BorderLayout());

        this.add(scrollPane, BorderLayout.CENTER);
     
}
}
