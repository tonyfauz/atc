package com.ls.atc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TipoIndirizzo implements EnumClass<Integer> {

    RESIDENZA(10),
    DOMICILIO(20);

    private Integer id;

    TipoIndirizzo(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TipoIndirizzo fromId(Integer id) {
        for (TipoIndirizzo at : TipoIndirizzo.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}