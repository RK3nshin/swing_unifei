package Modulo_3.lista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PainelTabela  extends  JPanel{
    public PainelTabela() {
        String[][] dados = {
            {"1123", "Pendrive", "Pendrive 32 GB"},
            {"2323", "HD SSD", "258 GB"},
            {"3333", "Memoria RAM", "16GB"},
            {"4344", "CPU", "i7"}
        };

        String[] colunas = {"Código", "Produto", "Descrição"};

        DefaultTableModel modeloTabela = new DefaultTableModel(dados, colunas);

        // Criar a JTable com o modelo
        JTable tabela = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabela);

        this.setLayout(new BorderLayout());

        this.add(scrollPane, BorderLayout.CENTER);
     
}
}
