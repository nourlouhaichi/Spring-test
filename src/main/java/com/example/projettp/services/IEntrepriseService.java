package com.example.projettp.services;

import com.example.projettp.entities.Domaine;
import com.example.projettp.entities.Entreprise;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEntrepriseService {

    List<Entreprise> retrieveByAdresse(@Param("adresse")String adresse);

    List<Entreprise> retreiveByDomaine(@Param("d") Domaine domaine);
    int updateEntreprise(String adresse, Long idEntreprise);
}
