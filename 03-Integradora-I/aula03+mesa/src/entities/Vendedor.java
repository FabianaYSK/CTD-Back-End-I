package entities;

public abstract class Vendedor {
    protected String nome;
    protected int vendas = 0;
    protected int pontosPorVenda;
    protected String tipo;

    // Sem construtor porque posso acessar via protected (acesso às subclasses de vendedor)

    public void vender(int qtdeVendas) {
        this.vendas = qtdeVendas;
        System.out.println(this.nome + " realizou " + qtdeVendas + " venda(s). ");
    }

    // Método abstrato para ser implantado nas classes filhas para calcular os pontos
    public abstract int calcularPontos();

    public String mostrarCategoria(){
        int pontosDoVendedor = calcularPontos();
        String var10000 = this.nome;
        return var10000 + " têm um total de " + pontosDoVendedor + " ponto(s) e está na categoria " + this.getNomeDaCategoria(pontosDoVendedor);    }

    // Método recebe os pontos e devolve a categoria do Vendedor
    private String getNomeDaCategoria(int pontos) {
        if (this.tipo.equalsIgnoreCase("Estagiário")) {
            return pontos < 50 ? "Estagiário(a) Novato(a)." : "Estagiário(a) Experiente.";
        } else if (pontos < 20) {
            return "Vendedor(a) Novato(a).";
        } else if (pontos < 31) {
            return "Vendedor(a) Aprendiz.";
        } else {
            return pontos < 41 ? "Vendedor(a) Bom(a)." : "Vendedor(a) Mestre.";
        }
    }
}

