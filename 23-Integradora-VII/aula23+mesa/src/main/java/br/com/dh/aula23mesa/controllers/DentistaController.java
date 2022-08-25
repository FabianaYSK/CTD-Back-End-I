package br.com.dh.aula23mesa.controllers;

/* Requisições
http://localhost:8080/dentistas/?id=1&nome=Dentista1&email=dentista1@email.com&numMatricula=321654&atendeConvenio=FALSE
http://localhost:8080/dentistas/?id=2&nome=Dentista2&email=dentista2@email.com&numMatricula=987654&atendeConvenio=FALSE
http://localhost:8080/dentistas/?id=3&nome=Dentista3&email=dentista3@email.com&numMatricula=987654&atendeConvenio=FALSE
http://localhost:8080/dentistas/buscar
http://localhost:8080/dentistas/1
http://localhost:8080/dentistas/buscar
 */

import br.com.dh.aula23mesa.entities.Dentista;
import br.com.dh.aula23mesa.service.DentistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dentistas")
public class DentistaController {

    @Autowired
    private DentistaService service;

    @GetMapping
    public Dentista salvar(
            @RequestParam(value = "id") Integer idrec,
            @RequestParam(value = "nome") String nomerec,
            @RequestParam(value = "email") String emailrec,
            @RequestParam(value = "numMatricula") String numMatricularec,
            @RequestParam(value = "atendeConvenio") Boolean atendeConveniorec) {
        return service.salvar(new Dentista(idrec, nomerec, emailrec, numMatricularec, atendeConveniorec));
    }

    @GetMapping("/buscar")
    public List<Dentista> buscarTodos() {
        return service.buscarTodos();
    }

    @GetMapping("/{id}")
    public String excluir(@PathVariable Integer id) {
        return service.excluir(id);
    }

}
