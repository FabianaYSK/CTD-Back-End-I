package test;

import dao.config.ConfigJDBC;
import dao.impl.PacienteDaoH2;
import entities.Paciente;
import org.junit.jupiter.api.Test;
import service.PacienteService;

import java.sql.Date;

public class PacienteTest {

    private PacienteService pacienteService = new PacienteService(
            new PacienteDaoH2(
                    new ConfigJDBC()));

    Paciente p1, p2, p3;
    Date dt = new Date(2022,8,18);

    @Test
    public void cadastrarPacientes() {

        p1 = pacienteService.salvar(new Paciente("Jonas", "Santos", "0000000000", dt, "Endereço do Jonas"));

        p2 = pacienteService.salvar(new Paciente("Jamile", "Silva", "0000000000", dt, "Endereço da Jamile"));

        p3 = pacienteService.salvar(new Paciente("Paula", "Pereira", "0000000000", dt, "Endereço da Paula"));

    }

    @Test
    public void buscarTodos() {
        System.out.println(pacienteService.buscarTodos());
    }

}