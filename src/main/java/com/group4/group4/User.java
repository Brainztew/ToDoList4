package com.group4.group4;

public class User {
    private String firstName;

    User() {
    }

    public User(String firstName) {
        this.firstName = firstName;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    } 
}