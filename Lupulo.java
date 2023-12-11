package CervejariaPOO;

public class Lupulo extends Ingrediente {
	 private double alfaAcido;

	    public Lupulo(String nome, double quantidadeEstoque, String unidade, double alfaAcido) {
	        super(nome, quantidadeEstoque, unidade);
	        this.alfaAcido = alfaAcido;
	    }

	    public double getAlfaAcido() {
	        return alfaAcido;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + " - Alfa-Ácido: " + alfaAcido;
	    }
}
