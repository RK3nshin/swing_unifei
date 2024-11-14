package Modulo_3.lista;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame {
    public Principal(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        

        PainelTitulo painelTitulo = new PainelTitulo("Interface gráfica com Java Swing");
        TextName nomeCampo = new TextName();
        TextAreaPanel texto = new TextAreaPanel(10,10);
        PainelCorPreferida selecaoCor = new PainelCorPreferida();
        PainelGenero genero  = new PainelGenero();
        PainelBotoes botoes = new PainelBotoes();
        PainelNomeGeneroEnviar nomeGeneroEnviar = new PainelNomeGeneroEnviar();
        PainelTabela tabela  = new PainelTabela();
        PainelNumeros Numeros = new PainelNumeros();


        painelPrincipal.add(painelTitulo);
        painelPrincipal.add(nomeCampo);
        painelPrincipal.add(texto);
        painelPrincipal.add(selecaoCor);
        painelPrincipal.add(genero);
        painelPrincipal.add(botoes);
        painelPrincipal.add(nomeGeneroEnviar);
        painelPrincipal.add(tabela);
        painelPrincipal.add(Numeros);

        this.add(painelPrincipal);

    }

    public static void main(String[] args) {
        Principal janela = new Principal();
        janela.setVisible(true);
    }
}
