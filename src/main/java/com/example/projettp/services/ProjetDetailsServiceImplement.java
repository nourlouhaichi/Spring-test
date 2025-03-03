package com.example.projettp.services;

import com.example.projettp.entities.ProjetDetails;
import com.example.projettp.repository.ProjetDetailsRepository;
import com.example.projettp.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetDetailsServiceImplement implements IProjetDetailsService{

    @Autowired
    ProjetDetailsRepository projetDetailsRepository;

    @Override
    public ProjetDetails addProjetDetails(ProjetDetails projetDetails) {
        return projetDetailsRepository.save(projetDetails);
    }

    @Override
    public ProjetDetails updateProjetDetails(ProjetDetails projetDetails) {
        return projetDetailsRepository.save(projetDetails);
    }

    @Override
    public void deleteProjetDetails(long id) {
        projetDetailsRepository.deleteById(id);
    }

    @Override
    public List<ProjetDetails> retreiveAllProjetDetails() {
        return projetDetailsRepository.findAll();
    }

    @Override
    public ProjetDetails retreiveProjetDetails(long id) {
        return projetDetailsRepository.findById(id).get();
    }
}
