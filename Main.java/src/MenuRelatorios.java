package projetoFinal.telas;

import javax.swing.*;
import java.awt.*;

public class MenuRelatorios extends JFrame {

    public MenuRelatorios(){

        setTitle("Relatórios");
        setSize(400,350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton aluno = new JButton("Relatório de Alunos");
        JButton professor = new JButton("Relatório de Professores");
        JButton curso = new JButton("Relatório de Cursos");
        JButton voltar = new JButton("Voltar");

        JPanel painel = new JPanel(new GridLayout(4,1,10,10));

        painel.add(aluno);
        painel.add(professor);
        painel.add(curso);
        painel.add(voltar);

        add(painel);

        voltar.addActionListener(e->{
            new JanelaPrincipal();
            dispose();
        });

        setVisible(true);
    }

}