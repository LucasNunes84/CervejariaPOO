package CervejariaPOO;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MenuHandler {
	
	public static void adicionarIngredienteOpcoes(CervejariaManager cervejariaManager) {
		try {
	        String opcaoStr = JOptionPane.showInputDialog(
	                "===== Opções de Ingrediente =====\n" +
	                        "1. Adicionar Malte\n" +
	                        "2. Adicionar Lúpulo\n" +
	                        "3. Adicionar Levedura\n" +
	                        "4. Adicionar Adjunto\n" +
	                        "Escolha uma opção:");
	        
	        if (opcaoStr == null) {
	            return;
	        }

	        int opcao = Integer.parseInt(opcaoStr);

	        switch (opcao) {
	            case 1:
	                adicionarMalteGUI(cervejariaManager);
	                break;
	            case 2:
	                adicionarLupuloGUI(cervejariaManager);
	                break;
	            case 3:
	                adicionarLeveduraGUI(cervejariaManager);
	                break;
	            case 4:
	                adicionarAdjuntoGUI(cervejariaManager);
	                break;
	            default:
	                JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Erro de entrada. Certifique-se de inserir um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	    }
    }

	public static void adicionarAdjuntoGUI(CervejariaManager cervejariaManager) {
	    try {
	        String nome = JOptionPane.showInputDialog("Nome do Adjunto:");
	        String quantidadeEstoqueStr = JOptionPane.showInputDialog("Quantidade em Estoque:");
	        double quantidadeEstoque = Double.parseDouble(quantidadeEstoqueStr);
	        String unidade = JOptionPane.showInputDialog("Unidade:");
	        String descricao = JOptionPane.showInputDialog("Descrição do Adjunto:");

	        if (nome.isEmpty() || unidade.isEmpty() || descricao.isEmpty() || quantidadeEstoque <= 0) {
	            throw new IllegalArgumentException("Certifique-se de preencher todos os campos corretamente.");
	        }

	        Adjunto adjunto = new Adjunto(nome, quantidadeEstoque, unidade, descricao);
	        cervejariaManager.adicionarIngrediente(adjunto);
	        JOptionPane.showMessageDialog(null, "Adjunto adicionado com sucesso!");
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Erro de entrada. Certifique-se de inserir valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
	    } catch (IllegalArgumentException e) {
	        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
	    }
	}


    public static void adicionarMalteGUI(CervejariaManager cervejariaManager) {
        try {
            String nome = JOptionPane.showInputDialog("Nome do Malte:");
            String quantidadeEstoqueStr = JOptionPane.showInputDialog("Quantidade em Estoque:");
            double quantidadeEstoque = Double.parseDouble(quantidadeEstoqueStr);
            String unidade = JOptionPane.showInputDialog("Unidade:");
            String cor = JOptionPane.showInputDialog("Cor do Malte:");

            if (nome.isEmpty() || unidade.isEmpty() || cor.isEmpty() || quantidadeEstoque <= 0) {
                throw new IllegalArgumentException("Certifique-se de preencher todos os campos corretamente.");
            }

            Malte malte = new Malte(nome, quantidadeEstoque, unidade, cor);
            cervejariaManager.adicionarIngrediente(malte);
            JOptionPane.showMessageDialog(null, "Malte adicionado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de entrada. Certifique-se de inserir valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void adicionarLupuloGUI(CervejariaManager cervejariaManager) {
        try {
            String nome = JOptionPane.showInputDialog("Nome do Lúpulo:");
            String quantidadeEstoqueStr = JOptionPane.showInputDialog("Quantidade em Estoque:");
            double quantidadeEstoque = Double.parseDouble(quantidadeEstoqueStr);
            String unidade = JOptionPane.showInputDialog("Unidade:");
            String alfaAcidoStr = JOptionPane.showInputDialog("Alfa-Ácido do Lúpulo:");
            double alfaAcido = Double.parseDouble(alfaAcidoStr);

            if (nome.isEmpty() || unidade.isEmpty() || quantidadeEstoque <= 0 || alfaAcido <= 0) {
                throw new IllegalArgumentException("Certifique-se de preencher todos os campos corretamente.");
            }

            Lupulo lupulo = new Lupulo(nome, quantidadeEstoque, unidade, alfaAcido);
            cervejariaManager.adicionarIngrediente(lupulo);
            JOptionPane.showMessageDialog(null, "Lúpulo adicionado com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de entrada. Certifique-se de inserir valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void adicionarLeveduraGUI(CervejariaManager cervejariaManager) {
        try {
            String nome = JOptionPane.showInputDialog("Nome da Levedura:");
            String quantidadeEstoqueStr = JOptionPane.showInputDialog("Quantidade em Estoque:");
            double quantidadeEstoque = Double.parseDouble(quantidadeEstoqueStr);
            String unidade = JOptionPane.showInputDialog("Unidade:");
            String tipoFermentacao = JOptionPane.showInputDialog("Tipo de Fermentação:");

            if (nome.isEmpty() || unidade.isEmpty() || tipoFermentacao.isEmpty() || quantidadeEstoque <= 0) {
                throw new IllegalArgumentException("Certifique-se de preencher todos os campos corretamente.");
            }

            Levedura levedura = new Levedura(nome, quantidadeEstoque, unidade, tipoFermentacao);
            cervejariaManager.adicionarIngrediente(levedura);
            JOptionPane.showMessageDialog(null, "Levedura adicionada com sucesso!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de entrada. Certifique-se de inserir valores válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void adicionarReceita(CervejariaManager cervejariaManager) {
        try {
            String nome = JOptionPane.showInputDialog("Nome da Receita:");
            String descricao = JOptionPane.showInputDialog("Descrição da Receita:");

            String ingredientesInput = JOptionPane.showInputDialog("Ingredientes (separados por vírgula):");
            String[] ingredientesArray = ingredientesInput.split(",");
            List<Ingrediente> ingredientes = new ArrayList<>();

            for (String ingredienteNome : ingredientesArray) {
                Ingrediente ingrediente = cervejariaManager.encontrarIngrediente(ingredienteNome.trim());
                if (ingrediente != null) {
                    ingredientes.add(ingrediente);
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrediente não encontrado: " + ingredienteNome, "Erro", JOptionPane.ERROR_MESSAGE);
                return;
                }
            }

            Receita receita = new Receita(nome, descricao, ingredientes);
            cervejariaManager.adicionarReceita(receita);
            JOptionPane.showMessageDialog(null, "Receita adicionada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void adicionarProducaoCerveja(CervejariaManager cervejariaManager) {
        try {
            String nomeReceita = JOptionPane.showInputDialog("Nome da Receita para a Produção:");
            Receita receita = cervejariaManager.encontrarReceita(nomeReceita);

            if (receita != null) {
                int quantidadeProducao = 1;
                if (cervejariaManager.verificarIngredientesSuficientes(receita, quantidadeProducao)) {
                    cervejariaManager.adicionarProducaoCerveja(receita, quantidadeProducao);
                    JOptionPane.showMessageDialog(null, "Produção de Cerveja adicionada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Ingredientes insuficientes para a produção da cerveja.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Receita não encontrada. Não é possível realizar a produção de cerveja.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro de entrada. Certifique-se de inserir um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
