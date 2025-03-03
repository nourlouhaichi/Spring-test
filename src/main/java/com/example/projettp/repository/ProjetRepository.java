package com.example.projettp.repository;

import com.example.projettp.entities.Equipe;
import com.example.projettp.entities.Projet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
