package service;

import dao.IDao;
import entities.Pacientes;

public class PacientesService {
    private IDao<Pacientes> pacientesDao;

    public PacientesService(IDao<Pacientes> pacientesIDao) {
        this.pacientesDao = pacientesIDao;
    }

    public Pacientes salvarPacientes(Pacientes pacientes) {
        return pacientesDao.salvar(pacientes);
    }
}
