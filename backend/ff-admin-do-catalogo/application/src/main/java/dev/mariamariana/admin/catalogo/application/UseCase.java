package dev.mariamariana.admin.catalogo.application;

import dev.mariamariana.admin.catalogo.domain.category.Category;

public class UseCase {
    public Category execute() {
        return new Category();
    }
}