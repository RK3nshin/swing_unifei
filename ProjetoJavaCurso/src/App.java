import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class App  extends  JFrame{
   private Tabela[] Tabelas;
    private Formulario Formulario;

    public App() {
      
        Tabelas = new Tabela[] {
            new Tabela("Fazer"),
            new Tabela("Fazendo"),
            new Tabela("Finalizado")
        };

        
        Formulario = new Formulario(Tabelas);

        
        setTitle("Gestão de Tarefas");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

       
        JPanel TabelaPanel = new JPanel();
        TabelaPanel.setLayout(new GridLayout(1, 3));

        for (Tabela Tabela : Tabelas) {
            JPanel TabelaContainer = new JPanel();
            TabelaContainer.setLayout(new BorderLayout());
            TabelaContainer.add(new JScrollPane(Tabela.getTaskList()), BorderLayout.CENTER);
            TabelaContainer.add(new JLabel(Tabela.getTitle()), BorderLayout.NORTH);
            TabelaPanel.add(TabelaContainer);
        }

        add(Formulario, BorderLayout.NORTH);
        add(TabelaPanel, BorderLayout.CENTER);
        
    }

    public static void main(String[] args) {
        App mainFrame = new App();
        mainFrame.setVisible(true);
    }
}
