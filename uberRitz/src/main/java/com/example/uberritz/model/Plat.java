package com.example.uberritz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "plats")
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nom")
    private String nom;

    @Column(name="prix")
    private int prix;

    public int getPrix(){
        return this.prix;
    }

    public void setPrix(int newPrix){
        this.prix = newPrix;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String newName){
        this.nom = newName;
    }




}