package CervejariaPOO;

import java.io.Serializable;

public class Malte extends Ingrediente implements Serializable{
	 private String cor;

	    public Malte(String nome, double quantidadeEstoque, String unidade, String cor) {
	        super(nome, quantidadeEstoque, unidade);
	        this.cor = cor;
	    }

	    public String getCor() {
	        return cor;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + " - Cor: " + cor;
	    }
}
