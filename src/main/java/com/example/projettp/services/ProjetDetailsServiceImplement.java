package com.example.projettp.services;

import com.example.projettp.entities.ProjetDetails;
import com.example.projettp.repository.ProjetDetailsRepository;
import com.example.projettp.repository.ProjetRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
@Slf4j
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

    //@Scheduled(fixedRate = 15000) //15sec
    //@Scheduled(fixedDelay = 15000)
    @Scheduled(cron="*/15 * * * * *")
    @Override
    public List<ProjetDetails> retreiveAllProjetDetails() throws InterruptedException {
        //Thread.sleep(30000);
        log.info(projetDetailsRepository.findAll().toString());
        return projetDetailsRepository.findAll();
    }

    @Override
    public ProjetDetails retreiveProjetDetails(long id) {
        return projetDetailsRepository.findById(id).get();
    }
}
