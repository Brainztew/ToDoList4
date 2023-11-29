package com.group4.group4;

import java.util.ArrayList;

public class UserList {

    private String userName;

    public static boolean checkUserList(String userName, ArrayList<String> userList) {
        
         
        if (userName == "Kalle"   && !userList.isEmpty()) {
            return true;
        }  
        
        return false;
    }

    ArrayList<UserList> users = new ArrayList<>();
    ArrayList<String> userList = new ArrayList<>();

    UserList(String userName, ArrayList<String> userList) {
        this.userName = userName;
        this.userList = userList;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addUser(String userName, ArrayList<String> userList) {
        users.add(new UserList(userName, userList));

    }

    public ArrayList<UserList> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<UserList> users) {
        this.users = users;
    }

    public ArrayList<String> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<String> userList) {
        this.userList = userList;
    }

    
}
