package entities;

public class Infantil extends Menu {
    private String presenteSurpresa;
    private double custoAdicional;

    public Infantil() {
    }

    public Infantil(String pedido,
                    double precoBase,
                    String presenteSurpresa,
                    double custoAdicional) {
        super(pedido, precoBase);
        this.presenteSurpresa = presenteSurpresa;
        this.custoAdicional = custoAdicional;
    }

    @Override
    public String montarEmbalagem() {
        System.out.println("Pedido montado - Infantil");
        return pedido + presenteSurpresa;
    }

    @Override
    public double calcularPreco() {
        System.out.println("Preço calculado: " + (precoBase + custoAdicional));
        return precoBase + custoAdicional;
    }
}
