package com.example.projettp.controllers;


import com.example.projettp.entities.Domaine;
import com.example.projettp.entities.Entreprise;
import com.example.projettp.entities.Equipe;
import com.example.projettp.entities.Projet;
import com.example.projettp.services.IEquipeService;
import com.example.projettp.services.IProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipe")
public class EquipeController {

    @Autowired
    IEquipeService equipeService;

    @PostMapping("/addEquipe")
    Equipe addEquipe(@RequestBody Equipe equipe) {
        return equipeService.addEquipe(equipe);
    }

    @PutMapping("/updateEquipe")
    Equipe updateEquipe(@RequestBody Equipe equipe) {
        return equipeService.updateEquipe(equipe);
    }

    @GetMapping("/retreiveAllEquipes")
    List<Equipe> retreiveAllEquipes() {
        return equipeService.retreiveAllEquipes();
    }

    @GetMapping("/retreiveEquipe/{id}")
    Equipe retreiveEquipe(@PathVariable long id) {
        return equipeService.retreiveEquipe(id);
    }

    @DeleteMapping("/deleteEquipe/{id}")
    void deleteEquipe(@PathVariable long id){
        equipeService.deleteEquipe(id);
    }

    @GetMapping("/retreiveByTechnologieAndDate/{technologie}")
    List<Equipe> retreiveByTechnologieAndDate(@PathVariable String technologie){
        return equipeService.retreiveByTechnologieAndDate(technologie);
    }
}
