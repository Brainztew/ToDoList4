package com.group4.group4;

public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        setName(name);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPassword(String password) {
        this.password = password;
    }
}