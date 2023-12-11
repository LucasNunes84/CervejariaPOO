package CervejariaPOO;

public class Adjunto extends Ingrediente {
	 private String descricao;

	    public Adjunto(String nome, double quantidadeEstoque, String unidade, String descricao) {
	        super(nome, quantidadeEstoque, unidade);
	        this.descricao = descricao;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + " - Descrição: " + descricao;
	    }
}
