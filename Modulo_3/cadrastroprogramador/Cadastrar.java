package Modulo_3.cadrastroprogramador;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cadastrar extends JFrame {
    public Cadastrar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        

        PainelTitulo painelTitulo = new PainelTitulo("Cadastro do Programador");
        TextName nome = new TextName("nome");
        TextName cpf =  new TextName("Cpf");
        PainelData data =  new PainelData();
        TextAreaPanel apresentacao = new TextAreaPanel(10, 5);
        PainelGenero sexo = new PainelGenero();
        PainelLinguagemPreferida linguagem  = new PainelLinguagemPreferida();
        PainelSlider slider = new PainelSlider();
        PainelTabela tabela  = new PainelTabela();
        PainelAreas areas = new PainelAreas();
        PainelBotaoEnviar painelBotaoEnviar = new PainelBotaoEnviar();

        // Adicionando os componentes ao painel principal
        painelPrincipal.add(painelTitulo);
        painelPrincipal.add(nome);
        painelPrincipal.add(cpf);
        painelPrincipal.add(data);
        painelPrincipal.add(apresentacao);
        painelPrincipal.add(sexo);
        painelPrincipal.add(linguagem);
        painelPrincipal.add(slider);
        painelPrincipal.add(tabela);
        painelPrincipal.add(areas);
        painelPrincipal.add(painelBotaoEnviar);


        this.add(painelPrincipal);

    }

    public static void main(String[] args) {
        Cadastrar janela = new Cadastrar();
        janela.setVisible(true);
    }
}
