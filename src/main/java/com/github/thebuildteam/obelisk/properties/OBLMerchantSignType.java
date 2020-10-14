package com.github.thebuildteam.obelisk.properties;

import net.minecraft.util.StringIdentifiable;

public enum OBLMerchantSignType implements StringIdentifiable {
    BLANK("blank"),
    SMITH("smith"),
    TAVERN("tavern"),
    LIBRARY("library");

    private final String name;

    OBLMerchantSignType(String name) {
        this.name = name;
    }

    @Override
    public String asString() {
        return name;
    }
}
