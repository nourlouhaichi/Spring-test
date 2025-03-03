package com.example.projettp.controllers;

import com.example.projettp.entities.ProjetDetails;
import com.example.projettp.services.IProjetDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetdetails")
public class ProjetDetailsController {

    @Autowired
    IProjetDetailsService projetDetailsService;

    @PostMapping("/addProjetDetails")
    ProjetDetails addProjetDetails(@RequestBody ProjetDetails projetDetails) {
        return projetDetailsService.addProjetDetails(projetDetails);
    }

    @PutMapping("/updateProjetDetails")
    ProjetDetails updateProjetDetails(@RequestBody ProjetDetails projetDetails) {
        return projetDetailsService.updateProjetDetails(projetDetails);
    }

    @GetMapping("/retreiveAllProjetDetails")
    List<ProjetDetails> retreiveAllProjetDetails() {
        return projetDetailsService.retreiveAllProjetDetails();
    }

    @GetMapping("/retreiveProjetDetails/{id}")
    ProjetDetails retreiveProjetDetails(@PathVariable long id) {
        return projetDetailsService.retreiveProjetDetails(id);
    }

    @DeleteMapping("/deleteProjetDetails/{id}")
    void deleteProjetDetails(@PathVariable long id){
        projetDetailsService.deleteProjetDetails(id);
    }
}
