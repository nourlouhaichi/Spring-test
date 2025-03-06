package com.example.projettp.repository;

import com.example.projettp.entities.ProjetDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetDetailsRepository extends JpaRepository<ProjetDetails, Long> {
}
