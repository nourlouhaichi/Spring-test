package com.example.projettp.services;

import com.example.projettp.entities.Projet;

import java.util.List;

public interface IProjetService {
    Projet addProjet(Projet projet);
    Projet updateProjet(Projet projet);
    void deleteProjet(long id);
    List<Projet> retreiveAllProjets();
    Projet retreiveProjet(long id);
}
