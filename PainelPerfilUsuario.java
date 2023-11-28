package Cervejaria;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class PainelPerfilUsuario extends JPanel{

    public PainelPerfilUsuario(String nome, String funcao, String caminhoImagem) {
        setLayout(new BorderLayout());
        setBackground(Color.ORANGE);
        setPreferredSize(new Dimension(208, 130));

        // Adiciona a imagem do perfil
        ImageIcon imagemUsuario = new ImageIcon(caminhoImagem);
        JLabel imagemLabel = new JLabel(imagemUsuario);

        // Adiciona o nome e a função
        JPanel textoPanel = new JPanel(new GridLayout(2, 1));
        JLabel nomeLabel = new JLabel(nome);
        JLabel funcaoLabel = new JLabel(funcao);
        textoPanel.add(nomeLabel);
        textoPanel.add(funcaoLabel);

        add(imagemLabel);
        //add(textoPanel, BorderLayout.CENTER);
    }
}
