package com.group4.group4;

import java.util.List;

public class UserMangement {
    
    public static List<String> addUser(List<String>list, String user) {
        list.add(user);
        return list;
    }

    public static List<String> removeUser(List<String>list, String user) {
        list.remove(user);
        return list;
    }


    }
