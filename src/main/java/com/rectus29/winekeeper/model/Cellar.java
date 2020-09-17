package com.rectus29.winekeeper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cellar")
public class Cellar extends GenericEntity<Cellar> {

    @Column(nullable = false)
    private String libelle;

    @OneToMany(mappedBy = "cellar")
    private List<Slot> slotList = new ArrayList<>();

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Slot> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<Slot> slotList) {
        this.slotList = slotList;
    }
}
