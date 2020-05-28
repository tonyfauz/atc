package com.ls.atc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TipoDomanda implements EnumClass<Integer> {

    RESIDENTE(10),
    NON_RESIDENTE(20);

    private Integer id;

    TipoDomanda(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TipoDomanda fromId(Integer id) {
        for (TipoDomanda at : TipoDomanda.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}