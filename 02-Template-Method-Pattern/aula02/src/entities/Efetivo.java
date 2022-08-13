package entities;

public class Efetivo extends Funcionario {
    private double salarioBase;
    private double descontos;
    private double bonificacoes;

    // construtor padrão
    public Efetivo() {
    }

    public Efetivo(String nome, String sobrenome, String numConta, double salarioBase, double descontos, double bonificacoes) {
        super(nome, sobrenome, numConta);
        this.salarioBase = salarioBase;
        this.descontos = descontos;
        this.bonificacoes = bonificacoes;
    }

    // Funcionario é uma classe abstrata, por isso a classe Efetivo precisa implementar os métodos da primeira
    @Override
    public double calcularSaldo() {
        return salarioBase + bonificacoes - descontos;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Gerado um recibo - Funcionário Efetivo");
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Depositado uma quantia de " + quantia);
    }
}
