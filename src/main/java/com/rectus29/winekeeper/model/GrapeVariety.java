package com.rectus29.winekeeper.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "grapevariety")
public class GrapeVariety extends GenericEntity<GrapeVariety> {

    @Column
    private String name;

    @ManyToMany
    private List<Country> countries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }
}
