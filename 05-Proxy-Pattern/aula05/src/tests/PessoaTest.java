package tests;

import entities.Pessoa;
import entities.SevicoVacinarProxy;
import entities.Vacinar;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {
    LocalDate diaDaVacinaAnterior, getDiaDaVacinaHoje;
    Pessoa p1, p2;

    @BeforeEach
    void doBefore() {
        diaDaVacinaAnterior = LocalDate.now().minusDays(4); // 2022-08-01
        getDiaDaVacinaHoje = LocalDate.now(); // 2022-08-04
        p1 = new Pessoa("Jõao", "Silva", "123456789", diaDaVacinaAnterior, "Coronavac");
        p2 = new Pessoa("Maria", "Santos", "987654321", getDiaDaVacinaHoje, "Pfizer");
    }

    @Test
    public void vac1() {
        Vacinar vacinar = new SevicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1);
        System.out.println("");
    }

    @Test
    public void vac2() {
        Vacinar vacinar = new SevicoVacinarProxy();
        vacinar.vacinarPessoa(p2.getRg(), p2.getDataVacina(), p2.getNomeVacina());
        System.out.println(p2);
    }
}
