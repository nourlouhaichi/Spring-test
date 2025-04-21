package com.example.projettp.services;

import com.example.projettp.entities.Domaine;
import com.example.projettp.entities.Entreprise;
import com.example.projettp.repository.EntrepriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrepriseServiceImplement implements IEntrepriseService{

    @Autowired
    EntrepriseRepository entrepriseRepository;

    @Override
    public List<Entreprise> retrieveByAdresse(String adresse) {
        return entrepriseRepository.retrieveByAdresse(adresse);
    }

    @Override
    public List<Entreprise> retreiveByDomaine(Domaine domaine) {
        return entrepriseRepository.retreiveByDomaine(domaine);
    }
}
