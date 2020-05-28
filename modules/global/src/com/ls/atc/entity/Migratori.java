package com.ls.atc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Migratori implements EnumClass<Integer> {

    BECCACCE(10),
    ALTRI(20);

    private Integer id;

    Migratori(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Migratori fromId(Integer id) {
        for (Migratori at : Migratori.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}