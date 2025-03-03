package com.example.projettp.services;

import com.example.projettp.entities.Equipe;
import com.example.projettp.entities.Projet;

import java.util.List;

public interface IEquipeService {

    Equipe addEquipe (Equipe  projet);
    Equipe  updateEquipe (Equipe  projet);
    void deleteEquipe (long id);
    List<Equipe > retreiveAllEquipes();
    Equipe  retreiveEquipe (long id);
}
