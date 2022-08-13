package entities;

public class Vegetariano extends Menu {
    private String embalagemEspecial;
    private double sobretaxa;

    public Vegetariano() {
    }

    public Vegetariano(String pedido, double precoBase, String embalagemEspecial, double sobretaxa) {
        super(pedido, precoBase);
        this.embalagemEspecial = embalagemEspecial;
        this.sobretaxa = sobretaxa;
    }

    @Override
    public String montarEmbalagem() {
        System.out.println("Pedido montado - Vegetariano");
        return pedido + embalagemEspecial;
    }

    @Override
    public double calcularPreco() {
        System.out.println("Preço calculado: " + (precoBase + sobretaxa));
        sobretaxa = (0.01 * precoBase);
        return (precoBase + sobretaxa);
    }
}
