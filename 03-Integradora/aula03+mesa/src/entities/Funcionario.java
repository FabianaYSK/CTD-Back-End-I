package entities;

import java.util.ArrayList;

public class Funcionario extends Vendedor {
    private int anosAntiguidade;
    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario() {
    }

    // Não colocar lista no Construtor, pode colocar nos Gets e Sets

    // Consigo acessar o nome e pontos por venda pelo protected (classe vendedor)
    // Cada venda = 5 pontos
    public Funcionario(String nome, int anosAntiguidade) {
        super.nome = nome;
        super.pontosPorVenda = 5;
        super.tipo = "Vendedor";
        this.anosAntiguidade = anosAntiguidade;
    }

    // Método para agregar um afiliado ao funcionário e por sua vez soma pontos
    public void adicionarAfiliado (Vendedor afiliado) {
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " agora é afiliado de " + super.nome + ".");
    }

    // Implementação do método abstrado de Vendedor
    // Cada ano de antiguidade = 5 pontos
    // Cada afiliado = 10 pontos
    @Override
    public int calcularPontos() {
        return (this.afiliados.size() * 10) + (this.anosAntiguidade * 5) + (this.pontosPorVenda);
    }
}
