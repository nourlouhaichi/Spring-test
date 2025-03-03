package com.example.projettp.controllers;

import com.example.projettp.entities.Projet;
import com.example.projettp.services.IProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projet")

public class ProjetController {
    @Autowired
    IProjetService projetService;

    @PostMapping("/addProjet")
    Projet addProjet(@RequestBody Projet projet) {
        return projetService.addProjet(projet);
    }

    @PutMapping("/updateProjet")
    Projet updateProjet(@RequestBody Projet projet) {
        return projetService.updateProjet(projet);
    }

    @GetMapping("/retreiveAllProjet")
    List<Projet> retreiveAllProjet() {
        return projetService.retreiveAllProjets();
    }

    @GetMapping("/retreiveProjet/{id}")
    Projet retreiveProjet(@PathVariable long id) {
        return projetService.retreiveProjet(id);
    }

    @DeleteMapping("/deleteProjet/{id}")
    void deleteProjet(@PathVariable long id){
        projetService.deleteProjet(id);
    }
}
