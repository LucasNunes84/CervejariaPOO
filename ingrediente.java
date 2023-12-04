public abstract class ingrediente {
    
    //Método para utilizar ingrediente em estoque;
    public abstract void use(double usedQuantity);

    //Método para incrementar quantidade em estoque;
    public abstract void addStock(double addQuantity);

    //Método para descartar material em estoque;
    public abstract void discardStock(double discardQuantity);

}
