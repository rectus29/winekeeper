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
    @Column(nullable = false)
    private UUID uniqueId = UUID.randomUUID();
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

    public Date getCreated() {
        return created;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public State getState() {
        return state;
    }

    public T setState(State state) {
        this.state = state;
        return (T) this;
    }
}
