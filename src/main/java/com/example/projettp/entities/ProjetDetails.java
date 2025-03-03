package com.example.projettp.entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProjetDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDetail;
    String description;
    String technologie;
    Long cout;
    Date dateDebut;

    @OneToOne(mappedBy = "projetDetails")
    Projet projet;
}
