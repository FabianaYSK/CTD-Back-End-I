package br.com.dh.mesa22.controllers;

import br.com.dh.mesa22.entities.Veiculo;
import br.com.dh.mesa22.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listaveiculos")
public class VeiculoController {
    @Autowired
    private VeiculoService service;

    public VeiculoController(VeiculoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Veiculo> buscarTodosOsVeiculos() {
        return service.listVeiculo();
    }
}
