package dao;

import java.util.List;

public interface IDao<T> {
    T salvar(T t);

    // T listarPacientesPorId(Integer id);

    // List<T> listarPacientes();
}