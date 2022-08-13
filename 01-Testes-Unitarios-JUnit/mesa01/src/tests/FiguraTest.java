package tests;

import entities.Circulo;
import entities.Figura;
import entities.Quadrado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiguraTest {
    Figura quadrado, circulo;

    @BeforeEach
    void doBefore() {
        quadrado = new Quadrado(5);
        circulo = new Circulo(5);
    }

    @Test
    void imprimir() {
        System.out.println(quadrado);
        System.out.println(circulo);
    }

    @Test
    void buscarPerimetro() {
        System.out.println(quadrado.calcularPerimetro());
        System.out.println(circulo.calcularPerimetro());

        Assertions.assertEquals(20, quadrado.calcularPerimetro());
        Assertions.assertEquals(31.41592653589793, circulo.calcularPerimetro());
    }

}
