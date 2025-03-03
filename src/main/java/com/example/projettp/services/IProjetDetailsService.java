package com.example.projettp.services;

import com.example.projettp.entities.ProjetDetails;

import java.util.List;

public interface IProjetDetailsService {
    ProjetDetails addProjetDetails(ProjetDetails projetDetails);
    ProjetDetails updateProjetDetails(ProjetDetails projetDetails);
    void deleteProjetDetails(long id);
    List<ProjetDetails> retreiveAllProjetDetails();
    ProjetDetails retreiveProjetDetails(long id);
}
