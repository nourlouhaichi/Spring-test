package com.example.projettp.services;

import com.example.projettp.entities.Equipe;
import com.example.projettp.entities.Projet;
import com.example.projettp.entities.ProjetDetails;
import com.example.projettp.repository.EquipeRepository;
import com.example.projettp.repository.ProjetDetailsRepository;
import com.example.projettp.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @AllArgsConstructor
public class ProjetServiceImplement implements IProjetService{
    @Autowired
    ProjetRepository projetRepository;

    @Autowired
    EquipeRepository equipeRepository;

    @Autowired
    ProjetDetailsRepository projetDetailsRepository;

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

    @Override
    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {return projetRepository.save(projet);}

    @Override
    public Projet assignProjetDetailToProjet(Long idProjet, Long idProjetDetail) {
        Projet projet = projetRepository.findById(idProjet).get();
        ProjetDetails projetDetail = projetDetailsRepository.findById(idProjetDetail).get();
        projet.setProjetDetails(projetDetail);
        return projetRepository.save(projet);
    }
    @Override
    public Equipe assignProjetToEquipe(Long idEquipe, Long idProjet){
        Projet projet = projetRepository.findById(idProjet).get();
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        equipe.getProjets().add(projet);
        return equipeRepository.save(equipe);
    }

    @Override
    public Equipe assignProjetsToEquipe(Long idEquipe, List<Long> idProjet) {
        List<Projet> projet = projetRepository.findAllById(idProjet);
        Equipe equipe = equipeRepository.findById(idEquipe).get();
        equipe.getProjets().addAll(projet);
        return equipeRepository.save(equipe);
    }

    @Override
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet,Long idProjetDetail) {
        ProjetDetails projetDetails =projetDetailsRepository.findById(idProjetDetail).get();
        projet.setProjetDetails(projetDetails);
        return projetRepository.save(projet);
    }

    @Override
    public Projet DesaffecterProjetDetailFromProjet(Long idProjet) {
        Projet projet= projetRepository.findById(idProjet).get();
        projet.setProjetDetails(null);
        return projetRepository.save(projet);
    }

    @Override
    public void desaffecterProjetFromEquipe(Long idProjet, Long idEquipe) {
        Projet projet= projetRepository.findById(idProjet).get();
        Equipe equipe= equipeRepository.findById(idEquipe).get();
        equipe.getProjets().remove(projet);
        equipeRepository.save(equipe);
    }
}
