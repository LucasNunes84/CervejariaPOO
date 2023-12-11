package CervejariaPOO;

import java.util.ArrayList;
import java.util.List;

public class CervejariaManager {
	private List<Ingrediente> ingredientes;
    private List<Receita> receitas;
    private List<Cerveja> cervejas;

    public CervejariaManager() {
        this.ingredientes = new ArrayList<>();
        this.receitas = new ArrayList<>();
        this.cervejas = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void adicionarReceita(Receita receita) {
        receitas.add(receita);
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public Ingrediente encontrarIngrediente(String nome) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNome().equalsIgnoreCase(nome)) {
                return ingrediente;
            }
        }
        return null;
    }

    public Receita encontrarReceita(String nome) {
        for (Receita receita : receitas) {
            if (receita.getNome().equalsIgnoreCase(nome)) {
                return receita;
            }
        }
        return null;
    }

    public void adicionarProducaoCerveja(Receita receita, int quantidade) {
        // Verificar se há ingredientes suficientes em estoque
        if (!verificarIngredientesSuficientes(receita, quantidade)) {
            System.out.println("Quantidade insuficiente de ingredientes em estoque para a produção.");
            return;
        }

        List<Ingrediente> ingredientesProducao = new ArrayList<>(receita.getIngredientes());
        Cerveja cervejaProduzida = new Cerveja(receita, ingredientesProducao, quantidade);

        // Atualizar estoque de ingredientes
        for (Ingrediente ingredienteReceita : receita.getIngredientes()) {
            Ingrediente ingredienteEstoque = encontrarIngrediente(ingredienteReceita.getNome());
            if (ingredienteEstoque != null) {
                double novaQuantidadeEstoque = ingredienteEstoque.getQuantidadeEstoque() - 1;

                // Remover o ingrediente se a quantidade estiver zerada
                if (novaQuantidadeEstoque <= 0) {
                    ingredientes.remove(ingredienteEstoque);
                } else {
                    ingredienteEstoque.setQuantidadeEstoque(novaQuantidadeEstoque);
                }
            }
        }

        cervejas.add(cervejaProduzida);
        System.out.println("Produção de Cerveja adicionada com sucesso!");
    }

    public List<Cerveja> getCervejas() {
        return cervejas;
    }
    
    public boolean verificarIngredientesSuficientes(Receita receita, int quantidade) {
        for (Ingrediente ingredienteReceita : receita.getIngredientes()) {
            Ingrediente ingredienteEstoque = encontrarIngrediente(ingredienteReceita.getNome());
            if (ingredienteEstoque == null || ingredienteEstoque.getQuantidadeEstoque() < ingredienteReceita.getQuantidadeEstoque() * quantidade) {
                return false;
            }
        }
        return true;
    }
}
