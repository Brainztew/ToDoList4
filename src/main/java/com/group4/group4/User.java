package com.group4.group4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private List<ListInfo> lists;

    public User() {
        this.lists = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<ListInfo> getLists() {
        return lists;
    }

    public void setLists(List<ListInfo> lists) {
        this.lists = lists;
    }

}