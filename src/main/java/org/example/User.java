package org.example;

public class User {

    private final String login;
    private final String email;


    public User() {
        this.login = "example";
        this.email = "example@example.com";
    }

    public User(String login, String email) {
        if (login.equals(email)) {
            throw new IllegalArgumentException();
        } else {
            this.login = login;
        }
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
