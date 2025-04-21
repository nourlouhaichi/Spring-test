package com.example.projettp.repository;

import com.example.projettp.entities.Domaine;
import com.example.projettp.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    @Query("SELECT e from Entreprise e where e.adresse =:adresse ")
    List<Entreprise> retrieveByAdresse(@Param("adresse")String adresse);

    @Query(value = "SELECT * FROM entreprise e where e.adresse=:a",nativeQuery = true)
    List<Entreprise> retrieveByAdresseSQL(@Param("adresse")String adresse);

    @Query("SELECT e FROM Entreprise e JOIN  e.equipes equipe WHERE equipe.domaine=:d")
    List<Entreprise> retreiveByDomaine(@Param("d")Domaine domaine);

    @Query(value = "SELECT * FROM entreprise e JOIN equipe equipe ON e.id_entreprise=equipe.entreprise_id_entreprise WHERE equipe.domaine=:d", nativeQuery = true )
    List<Entreprise> retreiveByDomaineSQL(@Param("d")String domaine);

    @Modifying
    @Query("update Entreprise e SET e.adresse=:adresse WHERE e.idEntreprise=:idE")
    int updateEntreprise(@Param("adresse") String adresse, @Param("idE") Long idEntreprise);
}