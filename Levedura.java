package CervejariaPOO;

public class Levedura extends Ingrediente {
	private String tipoFermentacao;

    public Levedura(String nome, double quantidadeEstoque, String unidade, String tipoFermentacao) {
        super(nome, quantidadeEstoque, unidade);
        this.tipoFermentacao = tipoFermentacao;
    }

    public String getTipoFermentacao() {
        return tipoFermentacao;
    }

    @Override
    public String toString() {
        return super.toString() + " - Tipo de Fermentação: " + tipoFermentacao;
    }
}
