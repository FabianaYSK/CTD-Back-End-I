package entities;

public class Adulto extends Menu {

    public Adulto() {
    }

    public Adulto(String pedido, double precoBase) {
        super(pedido, precoBase);
    }

    @Override
    public String montarEmbalagem() {
        System.out.println("Pedido montado - Adulto");
        return null;
    }

    @Override
    public double calcularPreco() {
        System.out.println("Preço calculado: " + precoBase);
        return precoBase;
    }
}
