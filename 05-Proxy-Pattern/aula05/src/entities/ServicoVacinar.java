package entities;

import java.time.LocalDate;

// implements = interface (aceita implementações múltiplas)
// extends = herança
public class ServicoVacinar implements Vacinar {

    @Override
    public void vacinarPessoa(String rg, LocalDate dataVacina, String tipoVacina) {
        System.out.println("Usuário(a) " + rg + " vacinado(a) em " + dataVacina + " com sucesso.");
    }
}
