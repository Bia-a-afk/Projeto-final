package ProjetoFinal;

import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame {

    public JanelaPrincipal() {

        setTitle("Sistema de Gerenciamento Estudantil");
        setSize(500,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel titulo = new JLabel("Sistema de Gerenciamento Estudantil");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        JButton aluno = new JButton("Aluno");
        JButton professor = new JButton("Professor");
        JButton curso = new JButton("Curso");
        JButton relatorios = new JButton("Relatórios");
        JButton sair = new JButton("Sair");

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5,1,10,10));
        painel.add(aluno);
        painel.add(professor);
        painel.add(curso);
        painel.add(relatorios);
        painel.add(sair);

        add(titulo, BorderLayout.NORTH);
        add(painel, BorderLayout.CENTER);

        aluno.addActionListener(e ->{
            new MenuAluno();
            dispose();
        });

        professor.addActionListener(e ->{
            new MenuProfessor();
            dispose();
        });

        curso.addActionListener(e ->{
            new MenuCurso();
            dispose();
        });

        relatorios.addActionListener(e ->{
            new MenuRelatorios();
            dispose();
        });

        sair.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

}