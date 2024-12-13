import javax.swing.*;

public class Tabela extends JPanel {
    private String title;
    private DefaultListModel<Task> taskListModel;

    public Tabela(String title) {
        this.title = title;
        this.taskListModel = new DefaultListModel<>();
    }

    public void addTask(Task task) {
        taskListModel.addElement(task);
    }

    public JList<Task> getTaskList() {
        return new JList<>(taskListModel);
    }

    public String getTitle() {
        return title;
    }
}
