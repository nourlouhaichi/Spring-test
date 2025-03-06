package com.example.projettp.repository;

import com.example.projettp.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository  extends JpaRepository<Equipe, Long>{
}

