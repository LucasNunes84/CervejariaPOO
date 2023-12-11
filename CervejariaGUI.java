package CervejariaPOO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CervejariaGUI extends JFrame {
    private CervejariaManager cervejariaManager;

    public CervejariaGUI() {
        this.cervejariaManager = new CervejariaManager();
        initComponents();
    }

    private void initComponents() {
        setTitle("Cervejaria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 1, 1));

        JLabel estoqueCervejasLabel = new JLabel("Estoque de Cervejas:");
        JLabel estoqueReceitasLabel = new JLabel("Estoque de Receitas:");
        JLabel estoqueIngredientesLabel = new JLabel("Estoque de Ingredientes:");

        JButton adicionarIngredienteButton = new JButton("Adicionar Ingrediente");
        JButton adicionarReceitaButton = new JButton("Adicionar Receita");
        JButton adicionarProducaoButton = new JButton("Adicionar Produção de Cerveja");

        JComboBox<String> receitasComboBox = new JComboBox<>();
        // Preencher o ComboBox com nomes de receitas disponíveis

        panel.add(estoqueCervejasLabel);
        panel.add(estoqueIngredientesLabel);
        panel.add(estoqueReceitasLabel);
        panel.add(adicionarReceitaButton);
        panel.add(adicionarIngredienteButton);
        panel.add(adicionarProducaoButton);
        panel.add(receitasComboBox);

        adicionarIngredienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para lidar com o botão de adicionar ingrediente
            	atualizarIngredientesTextArea();
            }
        });

        adicionarReceitaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para lidar com o botão de adicionar receita
            	atualizarReceitasTextArea();
            }
        });

        adicionarProducaoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para lidar com o botão de adicionar produção de cerveja
            	atualizarCervejasTextArea();
            }
        });

        add(panel);
        setVisible(true);
    }
    
    private void atualizarIngredientesTextArea() {
        // Lógica para atualizar a área de texto de ingredientes
        // ...
    }

    private void atualizarReceitasTextArea() {
        // Lógica para atualizar a área de texto de receitas
        // ...
    }

    private void atualizarCervejasTextArea() {
        // Lógica para atualizar a área de texto de cervejas
        // ...
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CervejariaGUI();
            }
        });
    }
}
