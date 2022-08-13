package entities;

public class Circulo implements Figura{
    private int raio;

    public Circulo() {
    }

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
