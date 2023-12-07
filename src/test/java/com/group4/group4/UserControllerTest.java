package com.group4.group4;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

public class UserControllerTest {

    private UserController userController;
    private Model model;
    
    List<UserTest> listTest = new ArrayList<>();

    @Test
    public void testAddUser() {
        userController = new UserController();
        model = mock(Model.class);
        UserTest userTest = new UserTest();
        User userToAdd = new User();

        listTest.add(userTest);
        userToAdd.setFirstName("AddMePlease!");
        userController.addUser(userToAdd, model);

        assertTrue(listTest.contains(userTest));
        assertTrue(UserController.getUserList().contains(userToAdd));
    }

    @Test
    public void testRemoveUser() {
        userController = new UserController();
        UserTest userTest = new UserTest();
        User userToRemove = new User();

        listTest.add(userTest);
        userToRemove.setFirstName("RemoveMePlease");
        listTest.remove(userTest);
        UserController.getUserList().add(userToRemove);
        UserController.removeMember("RemoveMePlease");

        assertFalse(listTest.contains(userTest));
        assertFalse(UserController.getUserList().contains(userToRemove));
    }

     @Test
    public void testClearMember() {
       
        User userToClear1 = new User();
        User userToClear2 = new User();
        User userToClear3 = new User();

        
        userToClear1.setFirstName("userToClear1");
        userToClear2.setFirstName("userToClear2");
        userToClear2.setFirstName("userToClear3");
        

        UserController.getUserList().add(userToClear1);
        UserController.getUserList().add(userToClear2);
        UserController.getUserList().add(userToClear3);
        UserController.clearMember("userToClear");
        
        
        assertFalse(UserController.getUserList().contains(userToClear1));
        assertFalse(UserController.getUserList().contains(userToClear2));
        assertFalse(UserController.getUserList().contains(userToClear3));
        assertTrue(UserController.getUserList().isEmpty());


    }

    public class UserTest {
        private String firstName;
        private List<ListInfo> lists;
}
}