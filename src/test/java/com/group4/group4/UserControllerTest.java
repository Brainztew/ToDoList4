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

    public class UserTest {
        private String firstName;
        private List<ListInfo> lists;
}
}