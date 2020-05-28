package com.ls.atc.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "ATC_ANAGRAFICA")
@Entity(name = "atc_Anagrafica")
public class Anagrafica extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = -3425941830226023374L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "CF")
    protected String cf;

    @Column(name = "SESSO")
    protected String sesso;

    @Column(name = "TELEFONO")
    protected String telefono;

    @Column(name = "CELLULARE")
    protected String cellulare;

    @Column(name = "EMAIL")
    protected String email;

    @Composition
    @OnDeleteInverse(DeletePolicy.DENY)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INDIRIZZO_DOMICILIO_ID")
    protected Indirizzo indirizzoDomicilio;

    @Composition
    @OnDeleteInverse(DeletePolicy.DENY)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INDIRIZZO_RESIDENZA_ID")
    protected Indirizzo indirizzoResidenza;

    public Sesso getSesso() {
        return sesso == null ? null : Sesso.fromId(sesso);
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso == null ? null : sesso.getId();
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Indirizzo getIndirizzoResidenza() {
        return indirizzoResidenza;
    }

    public void setIndirizzoResidenza(Indirizzo indirizzoResidenza) {
        this.indirizzoResidenza = indirizzoResidenza;
    }

    public Indirizzo getIndirizzoDomicilio() {
        return indirizzoDomicilio;
    }

    public void setIndirizzoDomicilio(Indirizzo indirizzoDomicilio) {
        this.indirizzoDomicilio = indirizzoDomicilio;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}