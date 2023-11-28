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
        // List<String> listsFake = new ArrayList<>();

        String user = "Johan";
        boolean userAdded = lists.add(user);
        //boolean userAdded = lists.remove(user);
        List<String> updatedList = UserMangement.addUser(lists, user);
        assertTrue(updatedList.contains(user));
        
        assertTrue(userAdded);
        assertTrue(lists.contains(user));
    }

    @Test
    public void markToDoAsCompletedTest() {
        List<String> tasks = new ArrayList<>();
        tasks.add("Uppgift som ska markeras som klar");
        
        boolean taskCompleted = UserMangement.markToDoAsCompleted(tasks, "Uppgift som ska markeras som klar");
        assertTrue(taskCompleted);
        assertFalse(tasks.contains("Uppgift som ska markeras som klar")); 
}

    

    
}

