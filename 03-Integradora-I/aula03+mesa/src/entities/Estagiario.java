package entities;

public class Estagiario extends Vendedor {

    // Quem for afiliado e vender = 5 pontos
    public Estagiario (String nome) {
        super.nome = nome;
        super.pontosPorVenda = 5;
        super.tipo = "Estagiário";
    }

    @Override
    public int calcularPontos() {
        return this.vendas * this.pontosPorVenda;
    }

}
