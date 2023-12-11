package CervejariaPOO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CervejariaManager cervejariaManager = new CervejariaManager();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            try {
                System.out.println("===== Menu =====");
                System.out.println("1. Adicionar Ingrediente");
                System.out.println("2. Adicionar Receita");
                System.out.println("3. Encontrar Receita");
                System.out.println("4. Mostrar Todas as Receitas");
                System.out.println("5. Adicionar Produção de Cerveja");
                System.out.println("6. Mostrar Todas as Cervejas");
                System.out.println("7. Mostrar Todos os Ingredientes no Estoque");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

                switch (opcao) {
                    case 1:
                        MenuHandler.adicionarIngredienteOpcoes(cervejariaManager, scanner);
                        break;
                    case 2:
                    	MenuHandler.adicionarReceita(cervejariaManager, scanner);
                        break;
                    case 3:
                    	MenuHandler.encontrarReceita(cervejariaManager, scanner);
                        break;
                    case 4:
                    	MenuHandler.mostrarTodasReceitas(cervejariaManager);
                        break;
                    case 5:
                    	MenuHandler.adicionarProducaoCerveja(cervejariaManager, scanner);
                        break;
                    case 6:
                    	MenuHandler.mostrarTodasCervejas(cervejariaManager);
                        break;
                    case 7:
                    	MenuHandler.mostrarIngredientesNoEstoque(cervejariaManager);
                        break;
                    case 0:
                        System.out.println("Saindo do programa!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro de entrada. Certifique-se de inserir um número.");
                scanner.nextLine(); // Limpar o buffer do scanner
                opcao = -1; // Definindo opção como inválida para continuar no loop
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine(); // Limpar o buffer do scanner
                opcao = -1; // Definindo opção como inválida para continuar no loop
            }
        } while (opcao != 0);

        scanner.close();
    }
}
