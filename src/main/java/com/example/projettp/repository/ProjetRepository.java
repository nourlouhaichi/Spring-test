package com.example.projettp.repository;

import com.example.projettp.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {

    @Query("SELECT p from Projet p WHERE p.projetDetails.cout>:c AND p.projetDetails.technologie=:t")
    List<Projet> retreiveByCoutAndTechnologie (@Param("c") Long cout, @Param("t") String technologie);
}
