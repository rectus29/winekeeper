package com.rectus29.winekeeper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "wine")
public class Wine extends GenericEntity<Wine>{

    @Column(nullable = false)
    private String name;

    @ManyToOne(optional = false)
    private Terroir terroir;

    @ManyToOne(optional = false)
    private GrapeVariety grapeVariety;

    @ManyToOne
    private Classification classification;

    @ManyToOne(optional = false)
    private WineColor wineColor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Terroir getTerroir() {
        return terroir;
    }

    public void setTerroir(Terroir terroir) {
        this.terroir = terroir;
    }

    public GrapeVariety getGrapeVariety() {
        return grapeVariety;
    }

    public void setGrapeVariety(GrapeVariety grapeVariety) {
        this.grapeVariety = grapeVariety;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public WineColor getWineColor() {
        return wineColor;
    }

    public void setWineColor(WineColor wineColor) {
        this.wineColor = wineColor;
    }
}
