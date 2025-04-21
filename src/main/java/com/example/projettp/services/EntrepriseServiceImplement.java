package com.example.projettp.services;

import com.example.projettp.entities.Domaine;
import com.example.projettp.entities.Entreprise;
import com.example.projettp.repository.EntrepriseRepository;
import jakarta.transaction.Transactional;
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

    @Transactional
    @Override
    public int updateEntreprise(String adresse, Long idEntreprise) {
        return entrepriseRepository.updateEntreprise(adresse,idEntreprise);
    }
}
