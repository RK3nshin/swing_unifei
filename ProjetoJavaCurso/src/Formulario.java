import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Formulario extends JPanel {

    JLabel titleName = new JLabel("Nome da Tarefa:");
    JTextField titleInput = new JTextField(20);

    JLabel descriptionName = new JLabel("Descrição da Tarefa:");
    JTextArea descriptionInput = new JTextArea(5, 20);

    JLabel optionTable = new JLabel("Selecione a Tabela:");
    JRadioButton table1 = new JRadioButton("Fazer");
    JRadioButton table2 = new JRadioButton("Fazendo");
    JRadioButton table3 = new JRadioButton("Finalizado");

    JLabel optionPriority = new JLabel("Selecione a Prioridade:");
    JRadioButton op1 = new JRadioButton("Alta");
    JRadioButton op2 = new JRadioButton("Média");
    JRadioButton op3 = new JRadioButton("Baixa");

    ButtonGroup tableGroup = new ButtonGroup();
    ButtonGroup priorityGroup = new ButtonGroup();

    JButton addButton = new JButton("Adicionar");
    

    private Tabela[] columns; // Array de colunas (tabelas)

    public Formulario(Tabela[] columns) {
        this.columns = columns;

        // Configurando o layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os componentes

        // Adicionando "Nome da Tarefa"
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(titleName, gbc);

        gbc.gridx = 1;
        add(titleInput, gbc);

        // Adicionando "Descrição da Tarefa"
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(descriptionName, gbc);

        gbc.gridx = 1;
        add(new JScrollPane(descriptionInput), gbc);

        // Adicionando "Selecione a Tabela"
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(optionTable, gbc);

        tableGroup.add(table1);
        tableGroup.add(table2);
        tableGroup.add(table3);

        JPanel tableBlock = new JPanel();
        tableBlock.setLayout(new FlowLayout());
        tableBlock.add(table1);
        tableBlock.add(table2);
        tableBlock.add(table3);

        gbc.gridx = 1;
        add(tableBlock, gbc);

        // Adicionando "Selecione a Prioridade"
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(optionPriority, gbc);

        priorityGroup.add(op3);
        priorityGroup.add(op2);
        priorityGroup.add(op1);

        JPanel priorityBlock = new JPanel();
        priorityBlock.setLayout(new FlowLayout());
        priorityBlock.add(op1);
        priorityBlock.add(op2);
        priorityBlock.add(op3);

        gbc.gridx = 1;
        add(priorityBlock, gbc);

        // Adicionando o botão de adicionar
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;

        
        addButton.setPreferredSize(new Dimension(150, 30));
        addButton.setBackground(Color.GREEN);
        add(addButton, gbc);

        // Ação do botão de adicionar
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Capturando os dados do formulário
                String titulo = titleInput.getText();
                String descricao = descriptionInput.getText();
                String prioridade = getPrioridadeSelecionada();
                String idLista = getTabelaSelecionada();

                // Criando a tarefa
                Task task = new Task(titulo, descricao, prioridade, idLista);

                // Adicionando a tarefa na coluna correta
                addTaskToColumn(task, idLista);

                // Limpar campos
                clearFields();
            }
        });
    }

    private String getPrioridadeSelecionada() {
        if (op1.isSelected())
            return "Alta";
        if (op2.isSelected())
            return "Média";
        if (op3.isSelected())
            return "Baixa";
        return "";
    }

    private String getTabelaSelecionada() {
        if (table1.isSelected())
            return "Fazer";
        if (table2.isSelected())
            return "Fazendo";
        if (table3.isSelected())
            return "Finalizado";
        return "";
    }

    private void clearFields() {
        titleInput.setText("");
        descriptionInput.setText("");
        tableGroup.clearSelection();
        priorityGroup.clearSelection();
    }

    private void addTaskToColumn(Task task, String idLista) {
        // Encontrar a coluna correspondente
        for (Tabela column : columns) {
            if (column.getTitle().equals(idLista)) {
                column.addTask(task);
        
                break;
            }
        }
    }

    public void editTask(Task task) {

        titleInput.setText(task.getTitulo());
        descriptionInput.setText(task.getDescricao());

        switch (task.getPrioridade()) {
            case "Alta":
                op1.setSelected(true);
                break;
            case "Média":
                op2.setSelected(true);
                break;
            case "Baixa":
                op3.setSelected(true);
                break;
            default:
                break;
        }

        switch (task.getId_lista()) {
            case "Fazer":
                table1.setSelected(true);
                break;
            case "Fazendo":
                table2.setSelected(true);
                break;
            case "Finalizado":
                table3.setSelected(true);
                break;
            default:
                break;
        }
    }

  
 
    }

