package com.ls.atc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Sesso implements EnumClass<String> {

    MASCHIO("M"),
    FEMMINA("F");

    private String id;

    Sesso(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Sesso fromId(String id) {
        for (Sesso at : Sesso.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}