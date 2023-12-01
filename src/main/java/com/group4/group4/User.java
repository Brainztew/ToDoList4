package com.group4.group4;

public class User {
    private String firstname;
    public User(){
        
    }
  

    public User(String firstname) {
        setName(firstname);
        
    }

    public String getName() {
        return firstname;
    }

    private void setName(String firstname) {
        this.firstname = firstname;
    }

    
}