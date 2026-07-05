package projetoFinal.telas;

import javax.swing.*;
import java.awt.*;

public class MenuAluno extends JFrame {

    public MenuAluno(){

        setTitle("Menu Aluno");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton cadastrar = new JButton("Cadastrar");
        JButton consultar = new JButton("Consultar");
        JButton voltar = new JButton("Voltar");

        JPanel painel = new JPanel(new GridLayout(3,1,10,10));

        painel.add(cadastrar);
        painel.add(consultar);
        painel.add(voltar);

        add(painel);

        voltar.addActionListener(e->{
            new JanelaPrincipal();
            dispose();
        });

        setVisible(true);
    }

}