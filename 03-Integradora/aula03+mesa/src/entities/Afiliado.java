package entities;

public class Afiliado extends Vendedor {

    // Quem for afiliado e vender = 15 pontos
    public Afiliado(String nome) {
        super.nome = nome;
        super.pontosPorVenda = 15;
        super.tipo = "Vendedor";
    }

    @Override
    public int calcularPontos() {
        return this.vendas * this.pontosPorVenda;
    }
}
