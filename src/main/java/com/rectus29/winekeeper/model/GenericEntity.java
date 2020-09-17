package com.rectus29.winekeeper.model;

import com.rectus29.winekeeper.enums.State;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public abstract class GenericEntity<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Version
    @Type(type = "dbtimestamp")
    private Date updated;
    @Column
    private Date created = new Date();
    @Column(nullable = false, columnDefinition = "varchar(128)")
    private String uniqueId = UUID.randomUUID().toString();
    @Column
    private State state = State.ENABLE;


    public Long getId() {
        return id;
    }

    public T setId(Long id) {
        this.id = id;
        return (T) this;
    }

    public Date getUpdated() {
        return updated;
    }

    public T setUpdated(Date updated) {
        this.updated = updated;
        return (T) this;
    }

    public Date getCreated() {
        return created;
    }

    public T setCreated(Date created) {
        this.created = created;
        return (T) this;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public T setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
        return (T) this;
    }

    public State getState() {
        return state;
    }

    public T setState(State state) {
        this.state = state;
        return (T) this;
    }
}
