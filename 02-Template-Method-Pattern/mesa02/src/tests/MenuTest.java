package tests;

import entities.Adulto;
import entities.Infantil;
import entities.Menu;
import entities.Vegetariano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MenuTest {
    Menu adulto1, infantil1, vegetariano1;

    @BeforeEach
    void doBefore() {
        adulto1 = new Adulto("Menu Adulto", 50.55);
        infantil1 = new Infantil("Menu Infantil", 20.0, "Brinquedo", 10.0);
        vegetariano1 = new Vegetariano("Menu Vegetariano", 40.0, "Caixa para tempero", 0.01 * 40.0);
    }

    @Test
    void tests() {
        adulto1.prepararMenu();
        infantil1.prepararMenu();
        vegetariano1.prepararMenu();
    }
}
