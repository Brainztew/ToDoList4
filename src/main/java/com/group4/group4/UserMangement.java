package com.group4.group4;

import java.util.List;

public class UserMangement {
    

    public static List<String> addUser(List<String>list, String user) {
        list.add(user);
        return list;
        
    }

    public static boolean markToDoAsCompleted(List<String> list, String completedTask) {
        if (list.contains(completedTask)) {
            list.remove(completedTask);
            return true; 
        } else {
            return false;
        }
    }
     
}
