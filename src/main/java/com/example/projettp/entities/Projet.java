package com.example.projettp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProjet;
    String sujet;

    @ManyToMany(mappedBy = "projets")
    List<Equipe> equipes;

    @OneToOne
    ProjetDetails projetDetails;

}