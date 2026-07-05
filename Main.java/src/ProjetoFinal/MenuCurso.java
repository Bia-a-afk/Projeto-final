package ProjetoFinal;

import javax.swing.*;
import java.awt.*;

public class MenuCurso extends JFrame {

    public MenuCurso(){

        setTitle("Menu Curso");
        setSize(400,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton cadastrar = new JButton("Cadastrar");
        JButton consultar = new JButton("Consultar");
        JButton vinculacoes = new JButton("Vinculações");
        JButton voltar = new JButton("Voltar");

        JPanel painel = new JPanel(new GridLayout(4,1,10,10));

        painel.add(cadastrar);
        painel.add(consultar);
        painel.add(vinculacoes);
        painel.add(voltar);

        add(painel);

        voltar.addActionListener(e->{
            new JanelaPrincipal();
            dispose();
        });

        setVisible(true);
    }

}