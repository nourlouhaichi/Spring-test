package com.example.projettp.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEquipe;
    String nom;
    Domaine domaine;

    @ManyToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private List<Projet> projets = new ArrayList<Projet>();

}
