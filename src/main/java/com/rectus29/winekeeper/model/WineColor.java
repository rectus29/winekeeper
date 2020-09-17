package com.rectus29.winekeeper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "winecolor")
public class WineColor extends GenericEntity<WineColor> {

    @Column(nullable = false)
    private String name;

    @Column(length = 2048)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
