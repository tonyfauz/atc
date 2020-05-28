package com.ls.atc.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;
import com.haulmont.cuba.core.entity.HasUuid;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.core.entity.annotation.OnDeleteInverse;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Table(name = "ATC_DOMANDA")
@Entity(name = "atc_Domanda")
public class Domanda extends BaseIntegerIdEntity implements HasUuid {
    private static final long serialVersionUID = 3057725014351396867L;

    @Column(name = "UUID")
    protected UUID uuid;

    @Column(name = "MIGRATORI")
    protected Integer migratori;

    @Composition
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANAGRAFICA_ID")
    protected Anagrafica anagrafica;

    @Column(name = "PORTO_DI_FUCILE_RINNOVO")
    protected Boolean portoDiFucileRinnovo;

    @Column(name = "TIPO")
    protected Integer tipo;

    @Column(name = "NUMERO_PF")
    protected String numeroPf;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMUNE_QUESTURA_CODICEISTAT")
    protected BaseComuni comuneQuestura;

    @Temporal(TemporalType.DATE)
    @Column(name = "RILASCIATO_IL")
    protected Date rilasciato;

    @Column(name = "PROPRIETARIO")
    protected Boolean proprietario;

    @Column(name = "MESE_UNO")
    protected Integer mese_uno;

    @Column(name = "MESE_DUE")
    protected Integer mese_due;

    @Temporal(TemporalType.DATE)
    @Column(name = "SETTIMANA_UNO")
    protected Date settimana_uno;

    @Temporal(TemporalType.DATE)
    @Column(name = "SETTIMANA_DUE")
    protected Date settimana_due;

    @Temporal(TemporalType.DATE)
    @Column(name = "SETTIMANA_TRE")
    protected Date settimana_tre;

    @Temporal(TemporalType.DATE)
    @Column(name = "SETTIMANA_QUATTRO")
    protected Date settimana_quattro;

    @Lookup(type = LookupType.DROPDOWN, actions = {})
    @OnDeleteInverse(DeletePolicy.DENY)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMUNE_PREVALENTE_CODICEISTAT")
    protected BaseComuni comunePrevalente;

    public BaseComuni getComunePrevalente() {
        return comunePrevalente;
    }

    public void setComunePrevalente(BaseComuni comunePrevalente) {
        this.comunePrevalente = comunePrevalente;
    }

    public Migratori getMigratori() {
        return migratori == null ? null : Migratori.fromId(migratori);
    }

    public void setMigratori(Migratori migratori) {
        this.migratori = migratori == null ? null : migratori.getId();
    }

    public Date getSettimana_quattro() {
        return settimana_quattro;
    }

    public void setSettimana_quattro(Date settimana_quattro) {
        this.settimana_quattro = settimana_quattro;
    }

    public Date getSettimana_tre() {
        return settimana_tre;
    }

    public void setSettimana_tre(Date settimana_tre) {
        this.settimana_tre = settimana_tre;
    }

    public Date getSettimana_due() {
        return settimana_due;
    }

    public void setSettimana_due(Date settimana_due) {
        this.settimana_due = settimana_due;
    }

    public Date getSettimana_uno() {
        return settimana_uno;
    }

    public void setSettimana_uno(Date settimana_uno) {
        this.settimana_uno = settimana_uno;
    }

    public Mesi getMese_due() {
        return mese_due == null ? null : Mesi.fromId(mese_due);
    }

    public void setMese_due(Mesi mese_due) {
        this.mese_due = mese_due == null ? null : mese_due.getId();
    }

    public Mesi getMese_uno() {
        return mese_uno == null ? null : Mesi.fromId(mese_uno);
    }

    public void setMese_uno(Mesi mese_uno) {
        this.mese_uno = mese_uno == null ? null : mese_uno.getId();
    }

    public Boolean getProprietario() {
        return proprietario;
    }

    public void setProprietario(Boolean proprietario) {
        this.proprietario = proprietario;
    }

    public TipoDomanda getTipo() {
        return tipo == null ? null : TipoDomanda.fromId(tipo);
    }

    public void setTipo(TipoDomanda tipo) {
        this.tipo = tipo == null ? null : tipo.getId();
    }

    public Date getRilasciato() {
        return rilasciato;
    }

    public void setRilasciato(Date rilasciato) {
        this.rilasciato = rilasciato;
    }

    public BaseComuni getComuneQuestura() {
        return comuneQuestura;
    }

    public void setComuneQuestura(BaseComuni comuneQuestura) {
        this.comuneQuestura = comuneQuestura;
    }

    public String getNumeroPf() {
        return numeroPf;
    }

    public void setNumeroPf(String numeroPf) {
        this.numeroPf = numeroPf;
    }

    public Boolean getPortoDiFucileRinnovo() {
        return portoDiFucileRinnovo;
    }

    public void setPortoDiFucileRinnovo(Boolean portoDiFucileRinnovo) {
        this.portoDiFucileRinnovo = portoDiFucileRinnovo;
    }

    public Anagrafica getAnagrafica() {
        return anagrafica;
    }

    public void setAnagrafica(Anagrafica anagrafica) {
        this.anagrafica = anagrafica;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}