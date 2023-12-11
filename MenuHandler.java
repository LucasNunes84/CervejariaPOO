package trabalho_poo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuHandler {
	
	public static void adicionarIngredienteOpcoes(CervejariaManager cervejariaManager, Scanner scanner) {
        try {
            System.out.println("===== Opções de Ingrediente =====");
            System.out.println("1. Adicionar Malte");
            System.out.println("2. Adicionar Lúpulo");
            System.out.println("3. Adicionar Levedura");
            System.out.println("4. Adicionar Adjunto");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            switch (opcao) {
                case 1:
                    adicionarMalte(cervejariaManager, scanner);
                    break;
                case 2:
                    adicionarLupulo(cervejariaManager, scanner);
                    break;
                case 3:
                    adicionarLevedura(cervejariaManager, scanner);
                    break;
                case 4:
                    adicionarAdjunto(cervejariaManager, scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Certifique-se de inserir um número.");
            scanner.nextLine(); // Limpar o buffer do scanner
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }

    public static void adicionarAdjunto(CervejariaManager cervejariaManager, Scanner scanner) {
        try {
            System.out.print("Nome do Adjunto: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade em Estoque: ");
            double quantidadeEstoque = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            System.out.print("Unidade: ");
            String unidade = scanner.nextLine();

            System.out.print("Descrição do Adjunto: ");
            String descricao = scanner.nextLine();

            Adjunto adjunto = new Adjunto(nome, quantidadeEstoque, unidade, descricao);
            cervejariaManager.adicionarIngrediente(adjunto);
            System.out.println("Adjunto adicionado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Certifique-se de inserir valores válidos.");
            scanner.nextLine(); // Limpar o buffer do scanner
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }


    public static void adicionarMalte(CervejariaManager cervejariaManager, Scanner scanner) {
        try {
            System.out.print("Nome do Malte: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade em Estoque: ");
            double quantidadeEstoque = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            System.out.print("Unidade: ");
            String unidade = scanner.nextLine();

            System.out.print("Cor do Malte: ");
            String cor = scanner.nextLine();

            if (nome.isEmpty() || unidade.isEmpty() || cor.isEmpty() || quantidadeEstoque <= 0) {
                throw new IllegalArgumentException("Certifique-se de preencher todos os campos corretamente.");
            }

            Malte malte = new Malte(nome, quantidadeEstoque, unidade, cor);
            cervejariaManager.adicionarIngrediente(malte);
            System.out.println("Malte adicionado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Certifique-se de inserir valores válidos.");
            scanner.nextLine(); // Limpar o buffer do scanner
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }

    public static void adicionarLupulo(CervejariaManager cervejariaManager, Scanner scanner) {
        try {
            System.out.print("Nome do Lúpulo: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade em Estoque: ");
            double quantidadeEstoque = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            System.out.print("Unidade: ");
            String unidade = scanner.nextLine();

            System.out.print("Alfa-Ácido do Lúpulo: ");
            double alfaAcido = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            if (nome.isEmpty() || unidade.isEmpty() || quantidadeEstoque <= 0 || alfaAcido <= 0) {
                throw new IllegalArgumentException("Certifique-se de preencher todos os campos corretamente.");
            }

            Lupulo lupulo = new Lupulo(nome, quantidadeEstoque, unidade, alfaAcido);
            cervejariaManager.adicionarIngrediente(lupulo);
            System.out.println("Lúpulo adicionado com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Certifique-se de inserir valores válidos.");
            scanner.nextLine(); // Limpar o buffer do scanner
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }

    public static void adicionarLevedura(CervejariaManager cervejariaManager, Scanner scanner) {
        try {
            System.out.print("Nome da Levedura: ");
            String nome = scanner.nextLine();

            System.out.print("Quantidade em Estoque: ");
            double quantidadeEstoque = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            System.out.print("Unidade: ");
            String unidade = scanner.nextLine();

            System.out.print("Tipo de Fermentação: ");
            String tipoFermentacao = scanner.nextLine();

            if (nome.isEmpty() || unidade.isEmpty() || tipoFermentacao.isEmpty() || quantidadeEstoque <= 0) {
                throw new IllegalArgumentException("Certifique-se de preencher todos os campos corretamente.");
            }

            Levedura levedura = new Levedura(nome, quantidadeEstoque, unidade, tipoFermentacao);
            cervejariaManager.adicionarIngrediente(levedura);
            System.out.println("Levedura adicionada com sucesso!");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Certifique-se de inserir valores válidos.");
            scanner.nextLine(); // Limpar o buffer do scanner
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }

    public static void mostrarIngredientesNoEstoque(CervejariaManager cervejariaManager) {
        List<Ingrediente> ingredientes = cervejariaManager.getIngredientes();
        if (ingredientes.isEmpty()) {
            System.out.println("Não há ingredientes no estoque.");
        } else {
            System.out.println("===== Ingredientes no Estoque =====");
            for (Ingrediente ingrediente : ingredientes) {
                System.out.println(ingrediente);
            }
            System.out.println("============================");
        }
    }

    public static void adicionarReceita(CervejariaManager cervejariaManager, Scanner scanner) {
        System.out.print("Nome da Receita: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição da Receita: ");
        String descricao = scanner.nextLine();

        System.out.print("Ingredientes (separados por vírgula): ");
        String[] ingredientesArray = scanner.nextLine().split(",");
        List<Ingrediente> ingredientes = new ArrayList<>();
        for (String ingredienteNome : ingredientesArray) {
            Ingrediente ingrediente = cervejariaManager.encontrarIngrediente(ingredienteNome.trim());
            if (ingrediente != null) {
                ingredientes.add(ingrediente);
            } else {
                System.out.println("Ingrediente não encontrado: " + ingredienteNome);
            }
        }

        Receita receita = new Receita(nome, descricao, ingredientes);
        cervejariaManager.adicionarReceita(receita);
        System.out.println("Receita adicionada com sucesso!");
    }

    public static void encontrarReceita(CervejariaManager cervejariaManager, Scanner scanner) {
        System.out.print("Nome da Receita: ");
        String nomeReceita = scanner.nextLine();

        Receita receita = cervejariaManager.encontrarReceita(nomeReceita);
        if (receita != null) {
            System.out.println("Receita Encontrada: " + receita);
        } else {
            System.out.println("Receita não encontrada.");
        }
    }

    public static void mostrarTodasReceitas(CervejariaManager cervejariaManager) {
        List<Receita> receitas = cervejariaManager.getReceitas();
        if (receitas.isEmpty()) {
            System.out.println("Não há receitas cadastradas.");
        } else {
            System.out.println("===== Todas as Receitas =====");
            for (Receita receita : receitas) {
                System.out.println(receita);

                // Mostrar todos os ingredientes da receita
                System.out.println("Ingredientes:");
                for (Ingrediente ingrediente : receita.getIngredientes()) {
                    System.out.println("  " + ingrediente);
                }
                System.out.println("============================");
            }
        }
    }

    public static void adicionarProducaoCerveja(CervejariaManager cervejariaManager, Scanner scanner) {
        try {
            System.out.print("Nome da Receita para a Produção: ");
            String nomeReceita = scanner.nextLine();

            Receita receita = cervejariaManager.encontrarReceita(nomeReceita);
            if (receita != null) {
                    cervejariaManager.adicionarProducaoCerveja(receita, 1);
            } else {
                System.out.println("Receita não encontrada. Não é possível realizar a produção de cerveja.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada. Certifique-se de inserir um número válido.");
            scanner.nextLine(); // Limpar o buffer do scanner
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar o buffer do scanner
        }
    }

    public static void mostrarTodasCervejas(CervejariaManager cervejariaManager) {
        List<Cerveja> cervejas = cervejariaManager.getCervejas();
        if (cervejas.isEmpty()) {
            System.out.println("Não há cervejas cadastradas.");
        } else {
            System.out.println("===== Todas as Cervejas =====");
            for (Cerveja cerveja : cervejas) {
                System.out.println(cerveja);
            }
            System.out.println("============================");
        }
    }
}
