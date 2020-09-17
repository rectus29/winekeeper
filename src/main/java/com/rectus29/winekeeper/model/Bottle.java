package com.rectus29.winekeeper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bottle")
public class Bottle extends GenericEntity<Bottle> {

    @Column(nullable = false, length = 2048)
    private String libelle;

    @Column
    private String description;

    @ManyToOne(optional = false)
    private Wine wine;

    @Column(nullable = false)
    private int millesime;

    @Column
    private String distributeur;

    public Wine getWine() {
        return wine;
    }

    public void setWine(Wine wine) {
        this.wine = wine;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMillesime() {
        return millesime;
    }

    public void setMillesime(int millesime) {
        this.millesime = millesime;
    }

    public String getDistributeur() {
        return distributeur;
    }

    public void setDistributeur(String distributeur) {
        this.distributeur = distributeur;
    }

}
