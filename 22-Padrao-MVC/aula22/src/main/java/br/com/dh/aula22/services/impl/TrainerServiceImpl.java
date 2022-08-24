package br.com.dh.aula22.services.impl;

import br.com.dh.aula22.entities.Trainer;
import br.com.dh.aula22.services.TrainerService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    @Override
    public List<Trainer> listTrainer() {
        return Arrays.asList(
                new Trainer("Ana"),
                new Trainer("Carla"),
                new Trainer("Leticia")
        );
    }

}