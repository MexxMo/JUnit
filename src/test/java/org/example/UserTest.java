package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserTest {

    public static final String VALID_LOGIN = "login";
    public static final String VALID_EMAIL = "email@mail.com";
    public static final String INVALID_EMAIL = "emailmail.com";
    public static final String DEF_LOGIN = "example";
    public static final String DEF_EMAIL = "example@example.com";
    private User out;

    @Test
    void shouldWhenParametersIsValid() {
        out = new User(VALID_LOGIN, VALID_EMAIL);
        assertEquals(VALID_LOGIN, out.getLogin());
        assertEquals(VALID_EMAIL, out.getEmail());
    }

    @Test
    void shouldUserWhenParametersIsNotExists() {
        out = new User();
        assertEquals(DEF_LOGIN, out.getLogin());
        assertEquals(DEF_EMAIL, out.getEmail());
    }

    @Test
    void shouldEmailIsNotCorrect() {
        assertThrows(IllegalArgumentException.class, () -> new User(VALID_LOGIN, INVALID_EMAIL));

    }

    @Test
    void shouldLoginAndEmailEquals() {
        assertThrows(IllegalArgumentException.class, () -> new User(VALID_EMAIL, VALID_EMAIL));
    }

}