package dev.mariamariana.admin.catalogo.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UseCaseTest {

    @Test
    public void testCreateUserCase(){
       Assertions.assertNotNull(new UseCase());
       Assertions.assertNotNull(new UseCase().execute());
    }
}
