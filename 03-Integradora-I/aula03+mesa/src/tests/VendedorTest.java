package tests;

import entities.Afiliado;
import entities.Estagiario;
import entities.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VendedorTest {
    Funcionario f1;
    Funcionario f2;
    Afiliado a1;
    Afiliado a2;
    Estagiario e1;
    Estagiario e2;

    public VendedorTest() {
    }

    @BeforeEach
    void doBefore() {
        // Pedro = 1 venda * 5 pontos = 5 pontos
        // Pedro tem 1 ano de antiguidade = 5 pontos * 1 = 5 pontos
        // Pedro tem 2 afiliados = 10 pontos * 2 = 20 pontos
        // 30 pontos -> Vendedor(a) Aprendiz! (entre 20 e 30 pontos)
        this.f1 = new Funcionario("Pedro", 1);
        this.f1.vender(1);

        // Maria = 1 venda * 5 pontos = 5 pontos
        // Maria tem 1 ano de antiguidade = 5 pontos * 1 = 5 pontos
        // 10 pontos -> Vendedor(a) Novato(a) (menos de 20 pontos)
        this.f2 = new Funcionario("Maria", 2);
        this.f2.vender(1);

        // Ramon = 1 venda * 15 pontos = 15 pontos -> Vendedor(a) Novato(a) (menos de 20 pontos)
        this.a1 = new Afiliado("Ramon");
        this.a1.vender(1);

        // Paulo = 1 venda * 15 pontos = 15 pontos -> Vendedor(a) Novato(a) (menos de 20 pontos)
        this.a2 = new Afiliado("Paulo");
        this.a2.vender(1);

        // Agora, Ramon é afiliado de Pedro
        this.f1.adicionarAfiliado(this.a1);

        // Agora, Paulo é afiliado de Pedro
        this.f1.adicionarAfiliado(this.a2);

        // Samuel = 6 vendas * 5 pontos = 30 pontos -> Estagiário(a) Novato(a) (menos de 50 pontos)
        this.e1 = new Estagiario("Samuel");
        this.e1.vender(6);

        // Mitra = 18 vendas = * 5 pontos = 90 pontos -> Estagiário(a) Experiente (50 pontos ou mais)
        this.e2 = new Estagiario("Mitra");
        this.e2.vender(18);
    }

    @Test
    void tests() {
        System.out.println(this.f1.mostrarCategoria());
        System.out.println(this.f2.mostrarCategoria());
        System.out.println(this.a1.mostrarCategoria());
        System.out.println(this.a2.mostrarCategoria());
        System.out.println(this.e1.mostrarCategoria());
        System.out.println(this.e2.mostrarCategoria());
    }
}
