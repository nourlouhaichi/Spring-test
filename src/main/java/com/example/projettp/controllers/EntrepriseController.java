package com.example.projettp.controllers;

import com.example.projettp.entities.Domaine;
import com.example.projettp.entities.Entreprise;
import com.example.projettp.services.EntrepriseServiceImplement;
import com.example.projettp.services.IEntrepriseService;
import com.example.projettp.services.IEquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entreprise")
public class EntrepriseController {

    @Autowired
    IEntrepriseService entrepriseService;

    @GetMapping("/retrieveByAdresse/{adresse}")
    List<Entreprise> retrieveByAdresse(@PathVariable String adresse){
        return entrepriseService.retrieveByAdresse(adresse);
    }

    @GetMapping("/retreiveByDomaine/{domaine}")
    List<Entreprise> retreiveByDomaine(@PathVariable Domaine domaine){
        return entrepriseService.retreiveByDomaine(domaine);
    }

    @PutMapping("/updateEntreprise/{adresse}/{idE}")
    public int updateEntreprise(String adresse, Long idEntreprise) {
        return entrepriseService.updateEntreprise(adresse, idEntreprise);
    }
}
