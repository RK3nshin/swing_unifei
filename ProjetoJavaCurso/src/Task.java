
import javax.swing.JButton;

public class Task extends JButton {
    private  static  int cont = 0;
    private int id;
    private String titulo;
    private String descricao;
    private String prioridade;
    private String id_lista;

   
    public Task(String titulo, String descricao, String prioridade, String id_lista) {
        this.id = cont++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.id_lista = id_lista;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getId_lista() {
        return id_lista;
    }

    public void setId_lista(String id_lista) {
        this.id_lista = id_lista;
    }

   
    

    @Override
    public String toString() {
        return this.titulo;
    }
}
