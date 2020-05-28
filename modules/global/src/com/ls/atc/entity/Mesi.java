package com.ls.atc.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Mesi implements EnumClass<Integer> {

    GENNAIO(1);

    private Integer id;

    Mesi(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Mesi fromId(Integer id) {
        for (Mesi at : Mesi.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}