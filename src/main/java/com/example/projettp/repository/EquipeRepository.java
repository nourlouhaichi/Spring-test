package com.example.projettp.repository;

import com.example.projettp.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipeRepository  extends JpaRepository<Equipe, Long>{

    @Query("SELECT e FROM Equipe e join e.projets p WHERE p.projetDetails.technologie=:t AND p.projetDetails.dateDebut>current date")
    List<Equipe> retreiveByTechnologieAndDate(@Param("t") String technologie);

}

