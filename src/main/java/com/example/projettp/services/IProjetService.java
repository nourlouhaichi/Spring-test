package com.example.projettp.services;

import com.example.projettp.entities.Equipe;
import com.example.projettp.entities.Projet;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProjetService {
    Projet addProjet(Projet projet);
    Projet updateProjet(Projet projet);
    void deleteProjet(long id);
    List<Projet> retreiveAllProjets();
    Projet retreiveProjet(long id);
    public Projet addProjetAndProjetDetailAndAssign(Projet projet);
    public Projet assignProjetDetailToProjet(Long idProjet, Long idProjetDetail);
    public Equipe assignProjetToEquipe(Long idEquipe, Long idProjet);
    public Equipe assignProjetsToEquipe(Long idEquipe, List<Long> idProjet);
    public Projet addProjetAndAssignProjetToProjetDetail(Projet projet,Long idProjetDetail);
    public Projet DesaffecterProjetDetailFromProjet(Long idProjet);
    public void desaffecterProjetFromEquipe(Long idProjet, Long idEquipe);

    List<Projet> retreiveByCoutAndTechnologie (@Param("c") Long cout, @Param("t") String technologie);

}
