package test;

import dao.config.ConfiguracaoJDBC;
import dao.impl.PacientesDaoH2;
import entities.Pacientes;
import org.junit.Test;
import service.PacientesService;

import java.time.LocalDate;

public class PacientesTest {
    private PacientesService pacientesService = new PacientesService(new PacientesDaoH2(new ConfiguracaoJDBC()));

    @Test
    public void cadastrarPaciente() {
        Pacientes paciente = new Pacientes("Maria", "Santos", "123456789", LocalDate.now(), "Rua do endereço, 123. Cidade do endereço - Bairro do endereço");
        Pacientes retorno = pacientesService.salvarPacientes(paciente);
        System.out.println(retorno);
    }

    @Test
    public void cadastrarPaciente2() {
        Pacientes paciente = new Pacientes("Laura", "Silva", "987654321", LocalDate.now(), "Rua do endereço, 789. Cidade do endereço - Bairro do endereço");
        Pacientes retorno = pacientesService.salvarPacientes(paciente);
        System.out.println(retorno);
    }

}
