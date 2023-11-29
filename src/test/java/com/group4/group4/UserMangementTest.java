package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UserMangementTest 
{
    @Test
    public void addUserTest() {

        List<String> lists = new ArrayList<>();
        List<String> listsFake = new ArrayList<>();

        String user = "Johan";
        boolean userAdded = lists.add(user);
        //boolean userAdded = lists.remove(user);
        List<String> updatedList = UserMangement.addUser(lists, user);
        assertTrue(updatedList.contains(user));
        
        assertTrue(userAdded);
        assertTrue(listsFake.contains(user));
    }
    @Test
    public void removeUserTest() {

        List<String> lists = new ArrayList<>();

        String user = "Johan";
        boolean userRemoved = lists.remove(user);
        //boolean userRemoved = lists.add(user);
        List<String> updatedList = UserMangement.removeUser(lists, user);
        assertFalse(updatedList.contains(user));
        
        assertFalse(userRemoved);
        assertFalse(lists.contains(user));
    }
}
