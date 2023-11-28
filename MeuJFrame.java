package Cervejaria;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeuJFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Exemplo de JFrame com Menu Lateral");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            // Cria um painel principal
            JPanel mainPanel = new JPanel(new BorderLayout());

            // Cria o menu lateral com botões
            JPanel menuPanel = new JPanel();
            menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
            menuPanel.setPreferredSize(new Dimension(208, 0));
            menuPanel.setBackground(Color.ORANGE);

            ImageIcon buttonConta = new ImageIcon("img/buttons/conta.png");
            JButton button1 = new JButton(buttonConta);
            button1.setBorder(null);
            
            ImageIcon buttonVendas = new ImageIcon("img/buttons/vender.png");
            JButton button2 = new JButton(buttonVendas);
            button2.setBorder(null);

            ImageIcon buttonProdutos = new ImageIcon("img/buttons/prod.png");
            JButton button3 = new JButton(buttonProdutos);
            button3.setBorder(null);

            JPanel perfilPanel = new PainelPerfilUsuario("Nome do Usuário", "Função do Usuário", "img/perfil/cara1.png");

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Ação do botão 1
                }
            });

            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Ação do botão 2
                }
            });

            button3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Ação do botão 3
                }
            });

            menuPanel.add(perfilPanel, BorderLayout.NORTH);
            menuPanel.add(button1);
            menuPanel.add(button2);
            menuPanel.add(button3);

            // Cria a lista de itens do outro lado
            JPanel itemListPanel = new JPanel();
            // Aqui você pode adicionar uma JList, JTable ou qualquer outro componente de lista

            mainPanel.add(menuPanel, BorderLayout.WEST);
            mainPanel.add(itemListPanel, BorderLayout.CENTER);

            frame.add(mainPanel);
            frame.setVisible(true);
        });
    }

    
}
