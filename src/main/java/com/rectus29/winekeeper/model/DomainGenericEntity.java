package com.rectus29.winekeeper.model;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public abstract class DomainGenericEntity<T> {

    @Id
    private Long id;
    @Version
    @Type(type = "dbtimestamp")
    private Date updated;
    @Column
    private Date created = new Date();
    @Column(nullable = false, columnDefinition = "varchar(128)")
    private String uniqueId = UUID.randomUUID().toString();


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


}
