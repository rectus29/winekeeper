package com.rectus29.winekeeper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "slot")
public class Slot extends GenericEntity<Slot> {

    @Column
    private int positionX = 0;

    @Column
    private int positionY = 0;

    @ManyToOne
    private Bottle bottle;

    @ManyToOne
    private Cellar cellar;

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Bottle getBottle() {
        return bottle;
    }

    public void setBottle(Bottle bottle) {
        this.bottle = bottle;
    }
}
