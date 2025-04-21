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
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEntreprise;
    String nom;
    String adresse;

    @OneToMany(mappedBy = "entreprise")
    private List<Equipe> equipes = new ArrayList<Equipe>();
}
