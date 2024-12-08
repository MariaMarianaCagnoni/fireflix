package dev.mariamariana.admin.catalogo.domain.category;

import dev.mariamariana.admin.catalogo.domain.Identifier;

import java.util.UUID;

public class CategoryID extends Identifier {
    private final String value;

    private CategoryID(final String value) {
        this.value = value;
    }
    public static CategoryID unique(){
        return new CategoryID(UUID.randomUUID().toString().toLowerCase());
    }
}
