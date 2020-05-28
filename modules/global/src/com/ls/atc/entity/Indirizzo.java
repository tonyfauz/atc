package com.ls.atc.entity;

import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Table(name = "ATC_INDIRIZZO")
@Entity(name = "atc_Indirizzo")
public class Indirizzo extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -5694266633093631183L;
    @Column(name = "UUID")
    protected UUID uuid;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}