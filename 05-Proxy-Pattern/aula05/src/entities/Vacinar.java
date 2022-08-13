package entities;

import java.time.LocalDate;

public interface Vacinar {
    void vacinarPessoa (String rg, LocalDate dataVacina, String tipoVacina);
}
