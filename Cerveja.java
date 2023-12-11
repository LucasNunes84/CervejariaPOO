package CervejariaPOO;

import java.util.List;

public class Cerveja {
	private Receita receita;
    private List<Ingrediente> ingredientesAdicionais;
    private int quantidadeProduzida;

    public Cerveja(Receita receita, List<Ingrediente> ingredientesAdicionais, int quantidadeProduzida) {
        this.receita = receita;
        this.ingredientesAdicionais = ingredientesAdicionais;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public Receita getReceita() {
        return receita;
    }

    public List<Ingrediente> getIngredientesAdicionais() {
        return ingredientesAdicionais;
    }

    public int getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    @Override
    public String toString() {
        return "Cerveja produzida com a receita: " + receita.getNome() + " - Quantidade Produzida: " + quantidadeProduzida;
    }
}
