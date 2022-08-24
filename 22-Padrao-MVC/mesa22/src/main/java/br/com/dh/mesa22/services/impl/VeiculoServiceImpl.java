package br.com.dh.mesa22.services.impl;

import br.com.dh.mesa22.entities.Veiculo;
import br.com.dh.mesa22.services.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {

    @Override
    public List<Veiculo> listVeiculo() {
        return Arrays.asList(
                new Veiculo("Mini", "bege"),
                new Veiculo("Volvo", "azul"),
                new Veiculo("Toyota", "preto")
        );
    }

}