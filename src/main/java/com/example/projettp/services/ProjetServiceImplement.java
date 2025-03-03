package com.example.projettp.services;

import com.example.projettp.entities.Equipe;
import com.example.projettp.entities.Projet;
import com.example.projettp.entities.ProjetDetails;
import com.example.projettp.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImplement implements IProjetService{
    @Autowired
    ProjetRepository projetRepository;

    @Override
    public Projet addProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public Projet updateProjet(Projet projet) {
        return projetRepository.save(projet);
    }

    @Override
    public void deleteProjet(long id) {
        projetRepository.deleteById(id);
    }

    @Override
    public List<Projet> retreiveAllProjets() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retreiveProjet(long id) {
        return projetRepository.findById(id).get();
    }
}
