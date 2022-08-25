package br.com.dh.aula23mesa.service;

import br.com.dh.aula23mesa.entities.Dentista;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DentistaService implements IDao<Dentista> {

    private static Map<Integer, Dentista> dentistas = new HashMap<>();

    @Override
    public Dentista salvar(Dentista dentista) {
        dentistas.put(dentista.getId(), dentista);
        return dentista;
    }

    @Override
    public List<Dentista> buscarTodos() {
        return new ArrayList<>(dentistas.values());
    }

    @Override
    public String excluir(Integer id) {
        dentistas.remove(id);
        return "O resgistro foi removido.";
    }
}
