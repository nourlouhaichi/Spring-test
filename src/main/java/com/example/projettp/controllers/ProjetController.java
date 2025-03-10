package com.example.projettp.controllers;

import com.example.projettp.entities.Equipe;
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

    @PostMapping("/addProjetAndProjetDetail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet p) {
        return projetService.addProjetAndProjetDetailAndAssign(p);
    }

    @PutMapping("/assignProjetDetailToProjet/{idProjet}/{idProjetdetail}")
    Projet assignProjetDetailToProjet(@PathVariable Long idProjet,@PathVariable Long idProjetdetail) {
        return projetService.assignProjetDetailToProjet(idProjet,idProjetdetail);
    }

    @PutMapping("/assignProjetToEquipe/{idEquipe}/{idProjet}")
    Equipe assignProjetToEquipe(@PathVariable Long idEquipe, @PathVariable Long idProjet) {
        return projetService.assignProjetToEquipe(idEquipe,idProjet);
    }

    @PutMapping("/assignProjetsToEquipe/{idProjet}/{idEquipe}")
    Equipe affectProjetsToEquipe (@PathVariable Long idEquipe, @PathVariable List <Long> idProjet) {
        return  projetService.assignProjetsToEquipe(idEquipe,idProjet);
    }

    @PostMapping("addProjetAndAssignProjetToProjetDetail/{idProjetdetail}")
    public Projet addProjetAndAssignProjetToProjetDetail(@RequestBody Projet projet,@PathVariable Long idProjetdetail) {
        return projetService.addProjetAndAssignProjetToProjetDetail(projet,idProjetdetail);
    }

    @PutMapping("DesaffecterProjetDetailFromProjet/{idProjet}")
    public Projet DesaffecterProjetDetailFromProjet(@PathVariable Long idProjet) {
        return projetService.DesaffecterProjetDetailFromProjet(idProjet);
    }

    @PutMapping("desaffecterProjetFromEquipe/{idProjet}/{idEquipe}")
    public void desaffecterProjetFromEquipe(@PathVariable Long idProjet, @PathVariable Long idEquipe) {
        projetService.desaffecterProjetFromEquipe(idProjet,idEquipe);
    }

}
