package com.example.projettp.services;

import com.example.projettp.entities.Equipe;
import com.example.projettp.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EquipeServiceImplement implements IEquipeService {
    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public Equipe addEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe updateEquipe(Equipe equipe) {
        return equipeRepository.save(equipe);
    }

    @Override
    public void deleteEquipe(long id) {
        equipeRepository.deleteById(id);
    }

    @Override
    public List<Equipe> retreiveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retreiveEquipe(long id) {
        return equipeRepository.findById(id).get();
    }

    @Override
    public List<Equipe> retreiveByTechnologieAndDate(String technologie, Date date) {
        return  equipeRepository.retreiveByTechnologieAndDate(technologie, date);
    }
}
