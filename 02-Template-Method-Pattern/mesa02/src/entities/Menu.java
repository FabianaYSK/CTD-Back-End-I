package entities;

public abstract class Menu {
    protected String pedido;
    protected double precoBase;

    public Menu() {
    }

    public Menu(String pedido, double precoBase) {
        this.pedido = pedido;
        this.precoBase = precoBase;
    }

    public void prepararMenu() {
        double preco;
        montarEmbalagem();
        preco = calcularPreco();
    }

    public abstract String montarEmbalagem();

    public abstract double calcularPreco();

}
